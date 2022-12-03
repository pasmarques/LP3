public class TimeAsInt 
{
    private int value;

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

    public boolean isAm()
    {
        if(this.value<43200)
        {
            return true;
        }
        return false;
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
    
}