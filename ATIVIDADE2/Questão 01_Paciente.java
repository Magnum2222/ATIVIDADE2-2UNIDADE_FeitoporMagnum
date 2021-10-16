package ATIVIDADE2;
public class Questao01_Paciente{
    private int codigo;
    private String Nome, DataNascimento, Sexo, PlanoSaude, Alergia, TipoSanguineo;
    public Questao01_Paciente(String Nome, int Codigo, String DataNascimento, String Sexo, String Alergia, String Saude, String TipoSanguineo){
        this.codigo = Codigo;
        this.PlanoSaude = Saude;
        this.Alergia = Alergia;
        this.Nome = Nome;
        this.DataNascimento = DataNascimento;
        this.TipoSanguineo = TipoSanguineo;
        this.Sexo = Sexo;
}
public void setNome (String nome){
    this.Nome = nome;
}
public String getNome (){
    return this.nome;
}
public void serDataNascimento(String Data){
    this.dataNascimento = Data;
}
public String getDataaNascimento (){
    return this.DataNascimento;
}
public void getSexo (String Sexo){
    this.Sexo = Sexo;
}
public String getSexo (){
    return this.Sexo;
}
public void getPlanoSaude(String Plano){
    this.PlanoSaude = Plano;
}
public String getPlanoSaude (){
    return this.PlanoSaude;
}
public void setAlergia (String Alergia){
    this.PlanoSaude = Plano;
}
public String getAlergia (){
    return this.Alergia;
}
public void setTipoSanguineo(String Sangue){
    this.TipoSanguineo = Sangue;
}
public String getTipoSanguineo(){
    return this.TipoSanguineo;
}
public void setCodigo(int Codigo){
    this.Codigo = Codigo;
}
public int getCodigo(){
    return this.Codigo;
}