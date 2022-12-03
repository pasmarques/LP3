public class Teste{

    public static void main(String[] args){
        Agendamento[] consultaMedica = new Agendamento[2];
        consultaMedica[0] = new Agendamento(30, 11, 2022, 7, 15, 45, "Pedro Affonso Silva Marques", "pedroja2010@hotmail.com", "73981191894", 17, 3, 2002);
        consultaMedica[1] = new Agendamento(30, 11, 2022, 9, 10, 25, "Anna Cecilia Silva Marques", "luonedias@hotmail.com", "7381087919", 11, 9, 2006);

        System.out.println(consultaMedica[0].toString());
        System.out.println(consultaMedica[1].toString());

        System.out.println(consultaMedica[1].isEqualHora(consultaMedica[0]));
        
    }
}