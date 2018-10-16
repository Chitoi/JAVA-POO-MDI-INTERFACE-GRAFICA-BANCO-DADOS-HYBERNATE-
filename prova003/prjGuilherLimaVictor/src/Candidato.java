/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class Candidato extends Pessoa {
    private int especificos;
    private int gerais;
    
    public void cadastrar(int especificos, int gerais){
        setEspecificos(especificos);
        setGerais(gerais);
    }
    
    public void cadastrar(String nome, int idade, int especificos, int gerais){
        super.cadastrar(nome, idade);
        this.cadastrar(especificos, gerais);
    }
    
    public double percAcertoEspeci(int espec){
        double especi = 0;
        
        especi = espec/100;
        especi = especificos*especi;
        
        return especi;
    }
   
    public double percAcertoGeral(int geral){
        double ger=0;
        
        ger = geral /100;
        ger = gerais*ger;
        
        return ger;
    }
    
   
    public boolean isAprovado(int espec, int geral){
        double especi=0, ger=0, total=0;
        
        especi = espec/100;
        especi = especificos*especi;
        
        ger = geral /100;
        ger = gerais*ger;
        
        total=especi+ger;
        
        if(especi>=50 && ger>=20){
            return true;
        }else if(total>=85){
            return true;
        }else{
            return false;
        }    
    }
    
   
    
    
    
    
    public String exibir(int espec, int geral){
        return super.exibir()+"\n"+
               "\nEspecificos: "+especificos+
               "\nGerais: "+gerais+
               "\nSituação: "+(isAprovado(espec,geral)?"APROVADO":"REPROVADO");      
    }
    

    public int getEspecificos() {
        return especificos;
    }

    public void setEspecificos(int especificos) {
        this.especificos = especificos;
    }

    public int getGerais() {
        return gerais;
    }

    public void setGerais(int gerais) {
        this.gerais = gerais;
    }
    
  
}
