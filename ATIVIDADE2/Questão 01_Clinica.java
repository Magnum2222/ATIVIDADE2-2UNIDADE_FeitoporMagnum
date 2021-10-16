package ATIVIDADE2;
public class Questao01_Clinica {
    public  static void main(String[]){
        Questao01_Clinica Magnum= new Questao01_Clinica("Magnum Soares", 40, "23/09/1981", "Masculino", "Morango", "Nenhum", "A+");
        System.out.println("\ntipo sanguíneo: "+ Magnum.getTipoSanguineo());
        System.out.println("Codigo: "+Magnum.getCodigo());
        System.out.println("Nome: "+ Magnum.getNome());
        System.out.println("Data de Nascimento: "+ Magnum.getDataNascimento());
        System.out.println("Sexo: "+ Magnum.getSexo());
        System.out.println("Plano de Saude: "+ Magnum.getPlanoSaude());
        System.out.println("Alergia: "+ Magnum.getAlergia());

        Magnum.setNome("Marco Antonio");
        Magnum.setDatadeNascimento("23/03/1969");
        Magnum.setSexo("Masculino");
        Magnum.setTipoSanguineo("A+");
        Magnum.setAlergia("Nenhuma");
        Magnum.setPlanoSaude("Nenhum");
        Magnum.setCodigo(50);

        System.out.println("\nTipo Sanguineo: "+ Magnum.getTipoSanguineo());
        System.out.println("Codigo: "+Magnum.getCodigo());
        System.out.println("Nome: "+Magnum.getNome());
        System.out.println("Data de Nascimento: "+Magnum.getDataNascimento());
        System.out.println("Plano de Saude: "+ Magnum.getSexo());
        System.out.println("Alergia: "+Magnum.getAlergia());


    }
}