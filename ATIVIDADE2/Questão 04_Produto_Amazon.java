package ATIVIDADE2;
public class Questao04__Produto_Amazon{
    private int QuandidadeReserva;
    private String NomeProduto;
    private Double ValorProduto;
    public Questao04__Produto_Amazon(String Nome, int Quantidade, Double Valor){
        this.NomeProduto = Nome;
        this.QuandidadeReserva = Quantidade;
        this.ValorProduto = Valor;
    }
    public void Comprarproduto(int Quantidade){
        this.QuandidadeReserva -= Quantidade;
    }
    public String getNomeproduto(){
        return this.NomeProduto;
    }
    public int getQuantidadeProduto(){
        if(this.QuandidadeReserva >=0){
            return this.QuandidadeReserva;
        }else{
            return0;
        }
    }
    public doouble getValorProduto(){
        return this.ValorProduto;
        
    }

}