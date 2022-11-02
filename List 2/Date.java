public class Date {
    int day;
    int month;
    int year;

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
        return month;
    }

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

    public void setDay(int day) {
        if (validateDay(day)){
            day = ;
        }
        else{
            System.out.println("Invalid age!!!");
            age = 0;
        }
    }


}