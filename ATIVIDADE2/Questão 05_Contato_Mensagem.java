package ATIVIDADE2;
public class Questao05_Contato_Mensagem{
    public static void main(String[]args){
        Questao05_Contato_Mensagem SBT = new Questao05_Contato_Mensagem(40028922,"YUDI" );
        SBT.Enviar_Mensagem("Yudi, Playstation");
        SBT.getMensNL();
        SBT.Recebidas("Olaa, Qual seu nome? ");
        SBT.Recebidas("O que você quer ganhar ?");
        SBT.Recebidas("Me diga qual brinquedo você quer ?");
        SBT.Recebidas("A escolha é sua!!!");
        SBT.Recebidas("Estou Esperando alguma resposta");
        SBT.getMensNL();
        SBT.MensagensNL();
        SBT.getMensNL();
        
    }
}