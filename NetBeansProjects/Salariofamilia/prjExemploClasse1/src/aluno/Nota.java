
package aluno;



public class Nota {
    public String nome;
    public int idade;
    public float nota1;
    public float nota2;

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

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }
    
    public boolean isMaiorIdade(){
        
        return idade>=18;
    }

    public float mediaAritmetica(){
        return (nota1+nota2)/2;
    }
    
   public String exibir(){
         String nota = String.format("%.2f", mediaAritmetica());
         String maior = isMaiorIdade()?"Sim":"Não";
         
         String exib = "Nome do aluno:"+nome+
                       "\nIdade do aluno:"+idade+
                        "\nNota do aluno:"+nota+
                        "\nAluno é maior de idade ?"+maior;    
         
         return exib;
   }
    
}
