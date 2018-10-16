
package AlunoGui;

public class Aluno {
    private String nome;
    private int idade;
    private String curso;
    private  double nota1;
    private double nota2;

   
    
    public void cadastrar(String nome, int idade, String curso, double nota1, double nota2){
        setNome(nome);
        setIdade(idade);
        setCurso(curso);
        setNota1(nota1);
        setNota2(nota2);
    
    }

    public Aluno(String nome, int idade, String curso, double nota1, double nota2) {
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public Aluno() {
    }
    
    
    
    public double calcularMedia(){
        return (nota1 + nota2)/2;
    }
    
    public boolean isAprovado(){
        return calcularMedia() >= 7;
    }
    
    public String exibir(){
       
        
        
        return "Nome: "  +nome+
               "\nCurso: "+curso+
                "\nIdade: "+idade+
                "\nNota1: "+nota1+
                "\nNota2: "+nota2+
                "\nMedia: "+calcularMedia()+
                "\nAluno: "+(isAprovado()?"aprovado":"reprovado");
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
    
    
}
