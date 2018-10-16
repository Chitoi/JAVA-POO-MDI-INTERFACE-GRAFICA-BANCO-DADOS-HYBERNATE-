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
    private int idade ;
    private char sexo;
    private String email;
    
    public void cadastrar(String nome, int idade, char sexo, String email){
        setEmail(email);
        setIdade(idade);
        setNome(nome);
        setSexo(sexo);
    }
    
    public String exibir(){
        return "nome: "+nome+
               "\nidade: "+idade+
               "\nsexo: "+sexo+
               "\nemail: "+email;
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

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
