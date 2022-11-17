package Contact;
import Date.Date;

public class ContactExample {
    
    public static void main (String args[])
    {
        Date dataNas1= new Date();
        Contact contact1=new Contact();
        
        contact1.initializeContact();
        
        dataNas1.setDate(30,11,2002);
        
        contact1.setContact("Pedro", "73981191894","pedroja2010@hotmail.com", dataNas1);

        contact1.printContact();
    }

}
