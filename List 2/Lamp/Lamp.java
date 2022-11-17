package Lamp;
public class Lamp{
    private boolean lampStatus=false;//lampada desligada por padrao

    public boolean getLamp()
    {
        return lampStatus;
    }

    public void ligthUp()
    {
        this.lampStatus=true;
    }

    public void turnOff()
    {
        this.lampStatus=false;
    }

    public void printStatus()
    {
        if(getLamp())
        {
            System.out.println("Lamp is on");
        }
        else
        {
            System.out.println("Lamp is off");
        }
    }

}