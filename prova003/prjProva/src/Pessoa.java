/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class Pessoa {
    private String nome;
    private int idade;
    
    public void cadastrar(String nome, int idade){
        setIdade(idade);
        setNome(nome);
    }
    
    public boolean isMaior(){
        return idade > 17;
    }
    
    public String exibir(){
        String maior = isMaior()?"Sim":"Não";
        
        return "Nome: "+nome+
               "\nIdade: "+idade+
               "\nÉ maior: "+maior;
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
    
}
