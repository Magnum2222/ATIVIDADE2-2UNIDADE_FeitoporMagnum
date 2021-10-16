package ATIVIDADE2;
public class Questao03_Simulador{
    private int Velocidade, Altitude;
    public Questao03_Simulador(int Velocidade, int Altitude){
        this.Velocidade = Velocidade;
        this..Altitude = Altitude;
    }
    public void Maisvelocidade(int Aumentar){
        this.Velocidade += Aumentar;
    }
    public void Menosvelocidade(int Diminuir){
        this.Velocidade -= Diminuir;
    }
    public int getVelocidade(){
        return this.Velocidade;
    }
    public void Maisaltitude(int Mais){
        this.Altitude += Maisaltitude;
    }
    public void Menosaltitude(int Menos){
        this.Altitude -= Menosaltitude;
    }
    public int getaltitude(){
        return this.Altitude;
    }
}