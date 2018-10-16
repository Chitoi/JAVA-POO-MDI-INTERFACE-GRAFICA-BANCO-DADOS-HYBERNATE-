/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prjtime;


public class Time {
    private String nome;
    private int vitorias;
    private int empates;
    private int derrotas;
    
    
    public static String BtnMelhorAproveitamentoActionPerformed(Time[] t) {                                                        
        int aux, melhor=0;
        double aprovAtual, aprovMelhor;
        String resp= "Melhor aproveitamento\n";
       
        aprovMelhor = t[melhor].calcularAproveitamento();
        
        resp += t[melhor].exibir()+"\n--------------------\n";
        
        for(aux=1; aux<t.length && t[aux] != null; aux++){
            aprovAtual = t[aux].calcularAproveitamento();
            if(aprovAtual > aprovMelhor){
            aprovMelhor = aprovAtual;
            resp="Melhor aproveitamento\n"+t[aux].exibir();
            }else if(aprovAtual == aprovMelhor){
                resp+=t[aux].exibir()+
                        "-------------\n";
            }       
        }
        return resp; 
    } 
    
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
