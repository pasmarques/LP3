package Date;

public class Date {
    private int day;
    private int month;
    private int year;

    public int getDay()
    {
        return day;
    }

    public int getMonth()
    {
        return month;
    }
    public int getYear()
    {
        return year;
    }

    private boolean validateDay(int day)
    {
        if(day<=0||day>31)
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    private boolean validateMonth(int month)
    {
        if(month<=0||month>12)
        {
            return false;
        }
        else
        {
            return true;
        }
    } 
    
    //considerei um intervalo arbitrário pro ano
    private boolean validateYear(int year)
    {
        if(year>=1900||year<=2022)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    /*
     para verificar a data eu fiz a verificação de cada atributo,
     no set,  se os 3 retornarem verdade, eu atribuo os valores
     aos atributos da classe.
     */

    public void setDate(int day, int month, int year) {
        if ((validateDay(day))&&(validateMonth(month))&&(validateYear(year))){
            this.day=day;
            this.month=month;
            this.year=year;
        }
        else{
            this.day=1;
            this.month=1;
            this.year=1900;
        }
    }

    //inicializei com um valor padrão
    public void initializeDate()
    {
        this.day=1;
        this.month=1;
        this.year=1900;
    }

    public void printDate()
    {
        System.out.format("%d/%d/%d", getDay(),getMonth(), getYear());
        System.out.println();
    }

    public void printDateExtense()
    {   
        String month;

        switch(getMonth())
        {
            case 1:
                month ="janeiro";
                break;
            case 2:
                month ="fevereiro";
                break;
            case 3:
                month ="marco";
                break;
            case 4:
                month ="abril";
                break;
            case 5:
                month ="maio";
                break;
            case 6:
                month ="junho";
                break;
            case 7:
                month ="julho";
                break;
            case 8:
                month ="agosto";
                break;
            case 9:
                month ="setembro";
                break;
            case 10:
                month ="outubro";
                break;
            case 11:
                month ="novembro";
                break;
            case 12:
                month ="dezembro";
                break;
            default:
                month ="nao existe esse mes";
                break;        
        }

        System.out.println(getDay()+ " de " + month + " de " + getYear());
    }
}