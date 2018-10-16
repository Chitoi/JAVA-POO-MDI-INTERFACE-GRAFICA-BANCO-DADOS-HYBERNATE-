/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prjTime;


public class Time {
    private String nome;
    private int vitorias;
    private int empates;
    private int derrotas;
    
    public void cadastrar(String nome, int vitorias, int empates, int derrotas){
        setNome(nome);
        setVitorias(vitorias);
        setEmpates(empates);
        setDerrotas(derrotas);
    }
    
    public int totalizarJogos(){
        return vitorias+empates+derrotas;
    }
    
    public int totalizarPontos(){
        return  empates+(vitorias*3);

    }
    
    public double calcularAproveitamento(){
        int total=0;
        total=totalizarJogos()*3;
        
       return   (totalizarPontos()*100)/total; 
       
    }
    
    public String exibir(){
        
        return "Nome do Time: "+nome+
               "\nVitórias: "+vitorias+
               "\nEmpates: "+empates+
               "\nDerrotas: "+derrotas+
               "\nTotal de pontos: "+totalizarPontos(); 
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }
    
    
}
