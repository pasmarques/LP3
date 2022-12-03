package DataHora;
public class DataWithConstructor {
    private int day;
    private int month;
    private int year;
    
    public DataWithConstructor(int day, int month, int year)
    {
        if ((validateDay(day))&&(validateMonth(month))&&(validateYear(year)))
        {
            this.day=day;
            this.month=month;
            this.year=year;
        }
        else
        {
            initializeDate();
        }
    }

    public DataWithConstructor()
    {
        this(1,1,1970);
    }

    public DataWithConstructor(DataWithConstructor outraData)
    {
        this(outraData.day,outraData.month,outraData.year);
    }

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

    //todo mes eh considerado com 30 dias
    private boolean validateDay(int day)
    {
        if(day<=0||day>30)
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
        if(year>=1970||year<=2022)
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
        if ((validateDay(day))&&(validateMonth(month))&&(validateYear(year)))
        {
            this.day=day;
            this.month=month;
            this.year=year;
        }
        else
        {
           initializeDate();
        }
    }

    //inicializei com um valor padrão
    public void initializeDate()
    {
        this.day=1;
        this.month=1;
        this.year=1970;
    }

    public String dayToPrintShort()
    {
        String res =getDay()+"/"+getMonth()+"/"+getYear();
        return res;
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
                month = null;
                break;        
        }

        System.out.println(getDay()+ " de " + month + " de " + getYear());
    }

    boolean isPrevious(DataWithConstructor outraData)
    {
        if(outraData.year>this.year)
        {
            return false;
        }
        else if(outraData.year<this.year)
        {
            return true;
        }

        else if(outraData.year==this.year)
        {
            if(outraData.month==this.month)
            {
                if(outraData.day<this.day)
                {
                    return true;
                }
                else
                {
                    return false;
                }
            }
            else 
            {
                if(outraData.month>this.month)
                {
                    return false;
                }
                else 
                {
                    return true;
                }
            }
        }
        return false;
    }

    public int differenceinDays(DataWithConstructor outraData)
    {
        int differenceInDays;
        int differenceInMonths;
        int differenceInYear;

        if(isPrevious(outraData))
        {
            return -1;
        }

        differenceInDays = outraData.day - this.day;

        if(outraData.year==this.year)
        {
            if(outraData.month==this.month)
            {
                return differenceInDays;
            }
            else
            {
                differenceInMonths = outraData.month - this.month;
                return differenceInDays + (differenceInMonths * 30);
            }
        }

        else 
        {
            differenceInYear = outraData.year - this.year;
            if(outraData.month==this.month)
            {
                return differenceInDays + (differenceInYear*360);
            }
            else
            {
                differenceInMonths = outraData.month - this.month;
                return  differenceInDays + (differenceInMonths * 30) +(differenceInYear*360);
            }

        }
    }

    public int howManyDays(DataWithConstructor outraData)
    {
            return differenceinDays(outraData);
    }

    public int howManyDays(int day, int month,int year)
    {
            DataWithConstructor dataAux = new DataWithConstructor(day, month,year);
            return differenceinDays(dataAux);
    }

    public static int howManyDaysUntilEndYear(DataWithConstructor d)
    {
        int i;
        int countDays=0;
        for(i=d.getMonth();i<=12;i++)
        {
            countDays+=i;
        }

        return (countDays*30) - d.day;
    }


    public static int howManyDaysUntilNextMonth(DataWithConstructor d)
    {
        int i;
        int countDays=0;

        for(i=d.getDay();i<=30;i++)
        {
             countDays+=i;
        }

        return countDays - d.day;
    }

}
