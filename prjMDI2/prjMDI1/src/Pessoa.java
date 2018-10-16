
public class Pessoa {
    private String nome;
    private String sexo;
    private int idade;
    
    public void cadastrar(String nome, String sexo, int idade)
    {
        setIdade(idade);
        setNome(nome);
        setSexo(sexo);
        
    }
    
    public boolean isMaior()
    {
        return idade > 17;
    }
    
    public String exibir()
    {
       String maior = isMaior()?"sim":"nao";
       
       return "nome: "+ nome+
               "\nidade: "+idade+
               "\né maior: "+maior+
               "\nsexo: "+sexo; 
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    
}
