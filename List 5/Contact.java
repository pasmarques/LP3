public class Contact {
    private String name;
    private String cellPhone;
    private String email;
    private DataWithConstructor bornDate = new DataWithConstructor();
    private static int countContacts=0;


    public Contact(String name, String email, String cellPhone, int day, int month,int year){
        
        if(validateName()&&validateEmail()&&validateCellPhone())
        {
          this.name = name;
          this.email = email;
          this.cellPhone = cellPhone;
          bornDate.setDate(day, month, year);
          countContacts+=1;
        }
        else
        {
            initializeContact();
        }
        
      }
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

    public void printContact()
    {
        System.out.print(getName() + " " + getEmail() + " " + getCellPhone() + " ");
        bornDate.dayToPrintShort();
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
    
    private boolean validateName()
    {
        if(getName().length()<3)
        {
            return false;
        }

        return true;
    }

    private boolean validateEmail()
    {
        getEmail().toLowerCase();
        if(getEmail().contains("@hotmail.com")) //considerando isso como dominio de email aceito
        {
            return true;
        }

        return false;
    }

    private boolean validateCellPhone()
    {
        final char flag[] = getCellPhone().toCharArray();
        final char flag2 [] = {'0','1', '2', '3', '4', '5', '6', '7', '8', '9'}; //para garantir que so entre caracteres numericos
        int i,j;

        boolean isReallyNumber=false ;

        do
        {   
            for(i=0;i<flag.length;i++)
            {
                for(j=0;j<flag2.length; j++)
                {
                    if(flag[i] == flag[j])
                    {
                    isReallyNumber = true; //faz dois for pra verificar se todos os caracteres do atributo cellPhone sao realmente um numero
                    break;
                    }
                }
                if (!isReallyNumber) 
                return false;
            }

        }while(isReallyNumber);

        return true; // por default
    }

    public static int howManyContacts()
    {
        return countContacts;
    }
}
