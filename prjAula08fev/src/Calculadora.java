
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author danilo
 */
public class Calculadora {
    
    private float valor1;
    private float valor2;
    public int opcao;
    private int contador[] = new int[4];

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

    public int getOpcao() {
        return opcao;
    }

    public void setOpcao(int opcao) {
        this.opcao = opcao;
    }

    public int[] getContador() {
        return contador;
    }

    public void setContador(int[] contador) {
        this.contador = contador;
    }

   
    
    
    
    
    
    
    
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
        return valor2!=0;
    }
    
    
    public boolean isOpcaoValida(){
        return opcao>=1 && opcao<=4;
    }
    
    
    
   public String calcular(){
      
        String res ="";
       
        switch(opcao){
            case 1:
               res= String.valueOf(somar());
               contador[0] +=1;
               
                break;
            case 2:
                contador[1] +=1;
                res = String.valueOf(subtrair());
                break;
                
            case 3:
                if(isDivisorValido()){
                    contador[2] +=1;
                    res=String.valueOf(dividir());
                } else{
                    res="Não existe divisao por 0";
                }
                
                break;
            case 4:
                contador[3] +=1;
                res= String.valueOf(multiplicar());;
                break;
        }
        
        return res;
    }
    
   
   public String exibirResultados(){
       
       return "\n1 - Soma["+contador[0]+"]\n"
               +"\n2 - subtração["+contador[1]+"]\n"
               +"\n3 - Divisão ["+contador[2]+"]\n"
               +"\n4 - Multiplicação: ["+contador[3]+"]";
       
}

    public String resFinal(){
        
        return "operações efetuadas: "+String.valueOf((contador[0]+contador[1]+contador[2]+contador[3]));
    }
 
    
}
