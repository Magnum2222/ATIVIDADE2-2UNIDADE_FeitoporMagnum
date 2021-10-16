package ATIVIDADE2;
public class Questao05_Contato{
    private int Numero, Recebidas, MenNL, MeneEV;
    private String NomedoContato;
    String[] MensagensNL = new String[1000]; String[] mensagem_enviada = new String[1000];
    public Questao05_Contato(int Numero, String Nome){
        this.NomedoContato = Nome;
        this.Numero = Numero;
    }
    public void Enviar_Mensagem(String Mensagem){
        this.mensagem_enviada[Foramenviadas] = Mensagem;
        this.Foramenviadas++;
    }
    public void recebidas(String Mensagem){
        this.MensagensNL[this.Recebidas] = Mensagem;
        this.Recebidas++;
    }
    public void getMensNL(){
        System.out.println("Quantidade de Mensagens que não foram lidas; "+ this.Recebidas);
    }
    public void MensagensNL(){
        System.out.println("Mensagens que ainda não foram lidas: ");
        while(this.Recebidas>0){
            System.out.println(this.MensagensNL[this.MenNL]);
            this.MenNL++;
            this.Recebidas--;
            
        }
    }
}