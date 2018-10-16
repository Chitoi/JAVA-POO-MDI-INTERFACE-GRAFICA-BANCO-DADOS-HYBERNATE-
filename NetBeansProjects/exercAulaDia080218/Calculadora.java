/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercAulaDia080218;

public class Calculadora {
    private float valor1;
    private float valor2;
    int n1=0, n2=0, n3=0, n4=0, t=0;
    
    public float somar(){
    
        return valor1+valor2;  
    }
    
    public float subtrair(){
      
        return valor1-valor2;
    }
    
    public float multiplicar(){
       
        return valor1*valor2;
    }
    
    public float dividir(){
       
        return valor1/valor2;
    }
    
    public boolean isDivisorValido(){
        return valor2 !=0;
    }
    
    public boolean isOperacaoCorreta(int operacao){
        return operacao >=1 && operacao <=4;
    }
    
     public String increment(int operacao){
        String num = "";
       
        switch(operacao){
            case 1:
                n1++;
            break;
            case 2:
               n2++;
            break;
            case 3:
                n3++;
            break;
            case 4:
                if(isDivisorValido()){
                   n4++;
                   }
            break;
        }
        t=n1+n2+n3+n4;
       return num="1-SOMAR\t  "   +n1+"\n"+
                   "2-SUBTRAIR\t  "   +n2+"\n"+     
                   "3-MULTIPLICAR\t  "   +n3+"\n"+
                   "4-Dividir\t  "   +n4+"\n"+
                   "0-SAIR\t  "   +t;
      
    }
    
    
    public String exibir(int operacao){
        String resp = " ";
        
        switch(operacao){
            case 1://soma
                resp = String.valueOf(somar());
            break;
            case 2://subtracao
                resp = String.valueOf(subtrair());
            break;
            case 3://multiplicacao
                resp = String.valueOf(multiplicar());
             break;
            case 4://divisao
                if(isDivisorValido()){
                    resp = String.valueOf(dividir());
                }else{
                    resp = "Não existe divisão por 0";
                }
               break;
        }
       return resp;
    }
    
    
    
    public float getValor1() {
        return valor1;
    }

    public void setValor1(float valor1) {
        this.valor1 = valor1;
    }

    public float getValor2() {
        return valor2;
    }

    public void setValor2(float valor2) {
        this.valor2 = valor2;
    }
    
}
