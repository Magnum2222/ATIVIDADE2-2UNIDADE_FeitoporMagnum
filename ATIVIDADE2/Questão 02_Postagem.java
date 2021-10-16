package ATIVIDADE2;
public class Questao02_Postagem{
    private String Texto, Links;
    private int NumerodeCurtidas, Numerodecompartilhamentos;
    public Questao02_Postagem(String Texto, String Links){
        this.Texto = Texto;
        this.Links = Links;
    }
    public void curtidaspost(){
        this.NumerodeCurtidas+=1;
    }
    public int getNumerodecurtidas(){
        return this.NumerodeCurtidas;
    }
    public void Compartilharpost(){
        this.Numerodecompartilhamentos;
    }
    public int getNumerodecompartilhamentos(){
        return this.Numerodecompartilhamentos;
        
    }
}