package ATIVIDADE2;
public class Questao03_Simulador_02{
    public static void maind(String[]args){
        Questao03_Simulador_02 Aviao1 = new  Questao03_Simulador_02(900,10);
        System.out.println("Velocidade: "+Aviao1.getVelocidade()+"Kilometros por Hora");
        System.out.println("Altitude: "+Aviao1.getAltitude()+"Kilometros\n");
        Aviao1.menosAltitude(1);
        Aviao1.menosVelocidade(100);
        System.out.println("Velocidade: "+Aviao1.getVelocidade()+"Kilometros por Hora");
        System.out.println("Altitude: "+Aviao1.getAltitude()+"Kilometros");
        
    }
}