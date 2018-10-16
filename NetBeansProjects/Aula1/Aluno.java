/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula1;

public class Aluno{
  
  private int id;  
  private String nome;
  private int idade;
  private float nota1;
  private float nota2;
  
  
    public boolean isMaiorIdade(){
        return idade>=18;
    }
    
    public float mediaAritmetica(){
        return (nota1+nota2)/2;
    }
    
    public String  exibir(){
        float media=mediaAritmetica();
        String aluno = "";
        if(isMaiorIdade()){
            aluno="sim";
        }else{
            aluno="não";
        }
        return "Nome do aluno: "+nome+
               "\nIdade do aluno: "+idade+
               "\nNota do aluno: "+media+
               "\nAluno é maior de idade: "+aluno;
        
    }

    public Aluno(int id, String nome, int idade, float nota1, float nota2) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public Aluno(String nome, int idade, float nota1, float nota2) {
        this.nome = nome;
        this.idade = idade;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public Aluno() {
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
  
  
}
