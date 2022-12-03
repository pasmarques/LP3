package Contact;
public class ContactExample {
    public static void main (String args[])
    {
        Contact contact1=new Contact();
        contact1.initializeContact();
        contact1.setBornDate(30,12,2002);
        contact1.setContact("Pedro", "73981191894", "pedroja2010@hotmail.com");
        contact1.printContact();
        int result = contact1.calcularIdade();
        System.out.println(result);
    }
}
