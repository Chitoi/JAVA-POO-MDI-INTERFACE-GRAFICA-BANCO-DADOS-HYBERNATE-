package prjInterface;

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
    
    
    public void cadastrar(String nome, int idade, int especificos, int gerais){
        super.cadastrar(nome, idade);
        setEspecificos(especificos);
        setGerais(gerais);
    }
    
    public float percAcertoEspeci(int espec){

        return especificos*100/espec;
    }
   
    public float percAcertoGeral(int geral){
        
        return gerais*100/geral;
    }
    
   
    public boolean isAprovado(int espec, int geral){
        float total = percAcertoEspeci(espec)+percAcertoGeral(geral);
        
        if(percAcertoEspeci(espec)>=50 && percAcertoGeral(geral)>=20){
            return true;
        }else if(total>=85){
            return true;
        }else{
            return false;
        }
      
    }
    
      public String exibir(int espec, int geral){
        return super.exibir()+
               "\nEspecificos: "+especificos+
               "\nGerais: "+gerais+
               "\nSituação: "+(isAprovado(espec,geral)?"APROVADO":"REPROVADO")+
               "\n  Percentual: "+percAcertoEspeci(espec)+
               "\n Perc: "+percAcertoGeral(geral);
    }
    
    public static String ranking(Candidato[] cand, int espec, int geral){
        int aux, aux2;
        String resp="Lista \n";
        
        
                
                //Aluno al[]; 
        Candidato temp = new Candidato();
        //al = new Aluno[5];

        for(aux=0; aux<cand.length && cand[aux]!=null; aux++){
             for(aux2=aux+1; aux2<cand.length && cand[aux2]!=null; aux2++ ){
             
                 if(cand[aux2].percAcertoEspeci(espec)>cand[aux].percAcertoEspeci(espec)){
                     temp=cand[aux];
                     cand[aux]=cand[aux2];
                     cand[aux2]=temp;            
                }
            }           
        
        }
        
        for(aux=0; aux<cand.length && cand[aux]!=null; aux++){
                resp+=cand[aux].exibir()+
                      "\nAcerto especificos: "+cand[aux].especificos+
                      "\nPercentual acertos especificos: -"+cand[aux].percAcertoEspeci(espec)+"%"+
                      "\nAcerto geral - "+cand[aux].gerais+
                      "\nPercentual acertos gerais: - "+cand[aux].percAcertoGeral(geral)+"%"+
                      "\n---------------------------\n";
            }
        return resp; 
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
