package Date;
public class DateExample {
    public static void main (String args[])
    {
        Date date1 = new Date();

        date1.initializeDate();

        date1.setDate(30,11,2002);

        date1.printDate();

        System.out.println();

        date1.printDateExtense();
    }

}
