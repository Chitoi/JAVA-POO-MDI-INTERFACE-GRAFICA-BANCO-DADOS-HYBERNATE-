/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class Fiscal extends Pessoa{
    private char sexo;
    private double valor;
    
    public void cadastrar(char sexo, double valor){
        setSexo(sexo);
        setValor(valor);
    }
    
    public void cadastrar(String nome, int idade, char sexo, double valor){
        super.cadastrar(nome, idade);
        this.cadastrar(sexo, valor);
    }
    
    
    public String sexoPorExtenso(){
        
        if(sexo=='m'){
            return "Masculino";
            
        }else{
            return "Feminino";
        }
    
    }
    
    public static String totalizarCusto(Fiscal[] fiscs){
        int aux;
        double total=0;
        
        
        for(aux=0; aux<fiscs.length && fiscs[aux]!= null; aux++){
            total = total+fiscs[aux].valor;
        }
        
        return  "R$ "+String.format("%.2f", total);
    }
    
    public static String participacaoPorSexo(Fiscal[] fiscs){
        int aux, cont=0, cont2=0;
        double m=0, f=0;
        
        for(aux=0; aux<fiscs.length && fiscs[aux]!=null; aux++){
            if(fiscs[aux].sexo=='m'){
                cont++;
            }else{
                cont2++;
            }  
        }
        
        m=cont*(aux/100);
        f=cont2*(aux/100);
        
        return "Masculino "+cont+String.format("%.2f", m)+"%"+" |"
                                + " "+"Feminino "+cont2+String.format("%.2f", f)+"%";
    }
    
    
    @Override
    public String exibir(){
        return super.exibir()+"\n"+
                "\nSexo: "+sexo+
                "\nValor: "+valor;
    }
    
    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
    
    
    
}
