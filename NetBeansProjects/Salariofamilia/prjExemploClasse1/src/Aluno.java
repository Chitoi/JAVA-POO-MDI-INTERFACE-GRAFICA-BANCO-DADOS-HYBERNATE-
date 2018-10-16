/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class Aluno {
    //criação dos atributos
    private String nome;
    private int idade;
    private float nota1;
    private float nota2;
    
    //implemetação dos getter e setters
    public void setNome(String nome){
          this.nome = nome;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
    public void setNota1(float nota1){
        this.nota1 = nota1;
    }
    public void setNota2(float nota2){
        this.nota2 = nota2;
    }
    
    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }
    public float getNota1(){
        return nota1;
    }
    public float getNota2(){
        return nota2;
    }
    //Implementação dos metados complementares
    
    public float calcularMedia(){
        return (nota1+nota2)/2;
    }
    public int calcularAnoNascimento(){
        return 2017 - idade;
    }
    
    public boolean isAprovado(float mediaAprovacao){
        float m = calcularMedia();
        return m >= mediaAprovacao;
    }
    public String exibirSituacao(float mediaAprovacao){
        boolean aprovado = isAprovado(mediaAprovacao);
        String situacao = (aprovado?"sim":"nao");
        return situacao;
    }
    
    public void cadastrar(String nome,int idade, float nota1,float nota2){
        setIdade(idade);
        setNome(nome);
        setNota1(nota1);
        setNota2(nota2);
    }
    public String exibir(float mediaAprovacao)
    {
        String retorno = "nome"+nome+
                "\nIdade: "+idade+
                "\nnota1: "+nota1+
                "\nnota2: "+nota2+
                "\nMédia: "+calcularMedia()+
                "\naprovado? "+
                exibirSituacao(mediaAprovacao);
        
        return retorno;
        
    }

}
