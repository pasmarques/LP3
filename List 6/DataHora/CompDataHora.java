package DataHora;
public class CompDataHora
{
    private DataWithConstructor data;
    private TimeAsInt hora;

    public CompDataHora(int day,int month,int year, int hour, int min, int seg)
    {
        data = new DataWithConstructor(day,month,year);
        hora= new TimeAsInt(hour,min,seg);
    }

    public String toString()
    { 
       return "hora: " + hora.getTime() + " " + "data: " + data.dayToPrintShort();
    }

    public int getDay(){
        return data.getDay();
    }

    public int getMonth(){
        return data.getMonth();
    }

    public int getYear(){
        return data.getYear();
    }

    public int getValue()
    {
        return hora.getValue();
    }
   
    public boolean isEqual(CompDataHora outroObjeto)
    {
        if((outroObjeto.getDay()==getDay())&&(outroObjeto.getMonth()==getMonth())&&(outroObjeto.getYear()==getYear()))
        {
            if(outroObjeto.getValue()==getValue())
            {
                return true;
            }
            return false;
        }
        return false;
    }
    public boolean isGreather(CompDataHora outroObjeto)
    {
        if(data.isPrevious(outroObjeto.getDate()))
        {
            return false;
        }
        else
        {
            if(outroObjeto.getValue()>getValue())
            {
               return true;
            }
        }

        return false;
    }

    public boolean isLower(CompDataHora outroObjeto)
    {
        if(isGreather(outroObjeto))
        {
            return false;
        }
        return true;
    }

    public DataWithConstructor getDate()
    {
        data.setDate(getDay(), getMonth(), getYear());
        return data;
    }
   
}