
import java.util.Calendar;
import java.util.GregorianCalendar;

public class TimeAsInt 
{
    private int value;//hora em segundos

    public int getValue()
    {
        return value;
    }
    
    public TimeAsInt(int hora, int min, int seg)
    {
        int value = TimeToSeconds(hora, min, seg);
        if (validateTime(value)) {
            this.value = value;
        }
        else{
            this.value = 0;
        }
    }

    public TimeAsInt()
    {
        this(0,0,0);
    }

    public TimeAsInt(int hora)
    {
        this(hora,0,0);
    }

    public TimeAsInt(int hora, int min)
    {
        this(hora,min,0);
    }

    public TimeAsInt(TimeAsInt outraHora)
    {
        this(0,0,outraHora.value);
    }

    private boolean validateTime(int timeValue)
    {
        return ((timeValue>0) && (timeValue<86401));//SegundosEmUmDia = 24*60*60 = 86400 
    }

    private int TimeToSeconds(int hora, int min, int sec)
    {
        return hora*3600 + min*60 + sec;
    }

    private String SecondsToTime()
    {
        String result = "";
        int hora;
        int min;
        int sec;

        hora = value/3600;
        min = (value % 3600)/60;
        sec = (value % 3600)%60;

        result = Integer.toString(hora) + ":"
               + Integer.toString(min) + ":"
               + Integer.toString(sec);

        return result;
    }

    public void setTime(int hora, int min, int seg)
    {
        int value = this.TimeToSeconds(hora, min, seg);
        if (validateTime(value)) {
            this.value = value;
        }
        else{
            this.value = 0;
        }
    }

    public String getTime()
    {
        String res = SecondsToTime();
        return res;
    }

    public void prnTime()
    {
        System.out.println(getTime());
    }

    public void addTime(int sec)
    {
        this.value+=+sec;
    }

    public void addTime (int min, int sec)
    {
        this.value+=min*60 + sec;
    }

    public void addTime(int hora, int min, int sec)
    {
        this.value+=TimeToSeconds(hora, min, sec);
    }

    public void addTime(TimeAsInt outraHora)
    {
        this.value+=outraHora.value; //ja ta em segundos;
    }

    public int cron(TimeAsInt outraHora)
    {
        if(outraHora.value<this.value)
        {
            outraHora.value+=86400;
            return (outraHora.value-this.value);
        }
        return (outraHora.value-this.value);
    }

    public static boolean isAm(TimeAsInt t)
    {
        return (t.value<43200);
    }

    public static boolean isPm(TimeAsInt t)
    {
        return (t.value>43200);
    }

    public static int diffTime(TimeAsInt t1, TimeAsInt t2)
    {
        int aux;
        if(t2.value<t1.value){
            aux = t1.value;
            t1.value = t2.value;
            t2.value = aux;
        }
        return(t2.value-t1.value); //diferenca em segundos
    }

    // a cada chamada a hora do pc ja mudou
    private static TimeAsInt constructValueComputer(){
        GregorianCalendar horaPC= new GregorianCalendar();

        TimeAsInt horaInstancia = new TimeAsInt(horaPC.get(Calendar.HOUR), horaPC.get(Calendar.MINUTE), horaPC.get(Calendar.SECOND));

        return horaInstancia;
    }

    public static int diffTime(TimeAsInt t)
    {
       TimeAsInt tComputador = constructValueComputer();
       return diffTime(tComputador,t); //diferenca em segundos
    }

    public String toString()
    {
        String result = "";
        int hora;
        int min;
        int sec;

        hora = value/3600;
        min = (value % 3600)/60;
        sec = (value % 3600)%60;

        result = Integer.toString(hora) + ":"
               + Integer.toString(min) + ":"
               + Integer.toString(sec);

        return result;
    }

}