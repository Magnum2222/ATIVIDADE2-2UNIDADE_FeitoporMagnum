package ATIVIDADE2;
public class Questao04_Amazon{
    public static void maind(String[]args){
    Questao04_Produto_Amazon Produto1 = new Questao04_Produto_Amazon("Feijoada",10,50.00);
    System.out.println("Produto: "+Produto1.getNomedoProduto());

    System.out.println("Valor do produto: "+Produto1.getValorproduto());
    Produto1.Comprarproduto(1);
    System.out.println("Quantidade Reserva: "+Produto1.getQuantidadedoProduto());
    Produto1.Comprarproduto(1);
    System.out.println("Quantidade Reserva: "+Produto1.getQuantidadedoProduto());
    Produto1.Comprarproduto(9);
    System.out.println("Quantidade Reserva: "+Produto1.getQuantidadedoProduto);



    
    }
}