public class TimeAsInt {
    private int value;

    private boolean validateTime(int timeValue){
        return ((timeValue>0) && (timeValue<86401));//SegundosEmUmDia = 24*60*60 = 86400 
    }

    private int TimeToSeconds(int hora, int min, int sec){
        return hora*3600 + min*60 + sec;
    }

    private String SecondsToTime(){
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

    public void setTime(int hora, int min, int seg){
        int value = this.TimeToSeconds(hora, min, seg);
        if (validateTime(value)) {
            this.value = value;
        }
        else{
            this.value = 0;
        }
    }

    public String getTime(){
        String res = SecondsToTime();
        return res;
    }

    public void prnTime(){
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

    public void addSeconds(int secs)
    {
        this.value=this.value+secs;
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
    
    public static void main (String args[])
    {
        System.out.println("Hora como enteiro:");
        TimeAsInt time2 = new TimeAsInt();
        TimeAsInt time3 = new TimeAsInt();
        time3.setTime(12,10,10);
        //time2.prnTime();
        time2.setTime(12, 10, 20);
        //time2.prnTime();
        System.out.println(time2.cron(time3));
        //time2.addSeconds(30);
        //time2.prnTime();

        System.out.println(time2.isAm());
    }
}