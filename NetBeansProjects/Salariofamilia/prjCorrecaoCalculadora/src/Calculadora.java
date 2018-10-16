/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class Calculadora {
    private float valor1;
    private float valor2;
    

    
    
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
    
    
    public String exibir(int operacao){
        String resp = "";
        
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
    
    public int incrementar(int operacao){
        int resp = 0;
        int n1 = 0, n2 = 0, n3 = 0, n4 = 0;
        switch(operacao){
            case 1:
                resp = n1++;
            break;
            case 2:
                resp = n2++;
            break;
            case 3:
                resp = n3++;
            break;
            case 4://divisao
                if(isDivisorValido()){
                    resp = n4++;      
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
