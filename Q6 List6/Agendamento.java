public class Agendamento
{
    private TimeAsInt horaAgendada;
    private DataWithConstructor dataAgendada;
    private Contact contatoAgendado;

    public Agendamento(int day, int month, int year, int hora, int min, int seg, String name, String cellPhone, String email, int dayBorn, int monthBorn, int yearBorn){
        this.dataAgendada = new DataWithConstructor(day, month, year);
        this.horaAgendada = new TimeAsInt(hora, min, seg);
        this.contatoAgendado = new Contact(name, cellPhone, email, dayBorn, monthBorn, yearBorn);
    }

    /*ideia era usar uma lista encadeada,pra nao fixar tamanho mas nao consegui, 
     * no Teste.java utilizo um vetor e comparo se uma posicao
     * tem o hoarrio igual a outra antes de inserir
     */
    public boolean isEqualHora(Agendamento outraHora)
    {
        if(outraHora.horaAgendada.getValue()==this.horaAgendada.getValue())
        {
            return true;
        }

        return false;
    }

    public String toString(){
        String res;
        res ="Agendamento=" + "Data: " + dataAgendada.dayToPrintShort() + "Hora: " + horaAgendada.toString() + "Contato: " + contatoAgendado.toString();
        return res;
    }
}