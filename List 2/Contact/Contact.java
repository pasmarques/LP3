package Contact;
import Date.Date;

public class Contact {
    private String name;
    private String cellPhone;
    private String email;
    private Date bornDate;

    public String getName()
    {
        return name;
    }

    public String getCellPhone()
    {
        return cellPhone;
    }

    public String getEmail()
    {
        return email;
    }

    public Date getBornDate()
    {
        return bornDate;
    }

    public void initializeContact()
    {
        this.name="Pedro";
        this.cellPhone="73981191894";
        this.email= "pedroja2010@hotmail.com";
        this.bornDate=null;
    }

    public void setContact(String name, String cellPhone, String email, Date dataNas)
    {
        this.name=name;
        this.cellPhone=cellPhone;
        this.email= email;
        this.bornDate=dataNas;
    }

    public void printContact()
    {
        System.out.print(getName() + " " + getEmail() + " " + getCellPhone() + " ");
        bornDate.printDate();
    }

    
}
