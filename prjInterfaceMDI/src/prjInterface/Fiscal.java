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
public class Fiscal extends Pessoa{
    private char sexo;
    private double valor;
    

    
    public void cadastrar(String nome, int idade, char sexo, double valor){
        super.cadastrar(nome, idade);
        setSexo(sexo);
        setValor(valor);
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
            if(fiscs[aux].sexo=='m' || fiscs[aux].sexo=='M'){
                cont++;
            }
            if(fiscs[aux].sexo=='f' || fiscs[aux].sexo=='F'){
                cont2++;
            }  
        }
        
        if(cont>0){
        m=(cont*100)/(cont+cont2);

        }
        
        if(cont2>0){
        f=(cont2*100)/(cont+cont2);
        }
        
        return "Masculino "+m+"%"+" |"
                                + " "+"Feminino "+f+"%";
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
