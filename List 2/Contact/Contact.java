package Contact;
import Date.Date;
public class Contact {
    private String name;
    private String cellPhone;
    private String email;
    private Date bornDate = new Date();

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

    public void initializeContact()
    {
        this.name="Pedro";
        this.cellPhone="73981191894";
        this.email= "pedroja2010@hotmail.com";
    }

    public void setContact(String name, String cellPhone, String email)
    {
        this.name=name;
        this.cellPhone=cellPhone;
        this.email= email;
    }

    public void printContact()
    {
        System.out.print(getName() + " " + getEmail() + " " + getCellPhone() + " ");
        bornDate.printDate();
    }

    public void setBornDate(int day, int month, int year)
    {
        bornDate.setDate(day,month,year);
    }

    public static final int CURRENTYEAR = 2022;

    public int calcularIdade()
    {
        if(bornDate.getYear()<=11) //pegando o mes atual, podia ser diretamente do sistema também
        {
            return (CURRENTYEAR - bornDate.getYear());
        }

       return ((CURRENTYEAR - bornDate.getYear())-1);   
    }
    
}
