public class DataWithConstructor {
    private int day;
    private int month;
    private int year;
    

    public DataWithConstructor(int day, int month, int year)
    {
        this.day=day;
        this.month=month;
        this.year=year;
    }

    public DataWithConstructor()
    {
        this.day=1;
        this.month=1;
        this.year=1970;
    }

    public DataWithConstructor(DataWithConstructor outraData)
    {
        this.day=outraData.day;
        this.month=outraData.month;
        this.year=outraData.year;
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
        if ((validateDay(day))&&(validateMonth(month))&&(validateYear(year))){
            this.day=day;
            this.month=month;
            this.year=year;
        }
        else{
            this.day=0;
            this.month=0;
            this.year=0;
        }
    }

    //inicializei com um valor padrão
    public void initializeDate()
    {
        this.day=0;
        this.month=0;
        this.year=0;
    }

    public void printDate()
    {
        System.out.format("%d/%d/%d", getDay(),getMonth(), getYear());
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

    public int howManyDays(DataWithConstructor outraData)
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

    public int howManyDays(int day, int month,int year)
    {
        
        DataWithConstructor dataAux =  new DataWithConstructor();
        int differenceInDays;
        int differenceInMonths;
        int differenceInYear;

        if(isPrevious(dataAux))
        {
            return -1;
        }

        differenceInDays = dataAux.day - this.day;

        if(dataAux.year==this.year)
        {
            if(dataAux.month==this.month)
            {
                return differenceInDays;
            }
            else
            {
                differenceInMonths = dataAux.month - this.month;
                return differenceInDays + (differenceInMonths * 30);
            }
        }

        else 
        {
            differenceInYear = dataAux.year - this.year;
            if(dataAux.month==this.month)
            {
                return differenceInDays + (differenceInYear*360);
            }
            else
            {
                differenceInMonths = dataAux.month - this.month;
                return  differenceInDays + (differenceInMonths * 30) +(differenceInYear*360);
            }

        }
    }
}
