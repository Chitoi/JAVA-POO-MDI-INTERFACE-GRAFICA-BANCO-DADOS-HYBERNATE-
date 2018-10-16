/*

    ------------------------
    |    Calculadora        |
    ------------------------
    | -valor1: float
    | -valor2 float
    | -contador4]: int
    | ----------------------
    | + getters e setters
    | +somar(): float
    | +subtrair(): float
    | +dividir(): float
    | +multiplicar() float
    | +isDivisorValido(): boolean
    | +exibir(): String


/**
 *
 * @author danilo
 */

import javax.swing.JOptionPane;

public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Calculadora c = new Calculadora();
        
        
        do {      
            
            
            
            c.setOpcao(Integer.valueOf(JOptionPane.showInputDialog(c.exibirResultados())));
            if (c.isOpcaoValida()) {
                
                c.setValor1(Float.valueOf(JOptionPane.showInputDialog("Informe 1º valor:")));
                c.setValor2(Float.valueOf(JOptionPane.showInputDialog("Informe 2º valor:")));
                
               JOptionPane.showMessageDialog(null, c.calcular());
               
            } else if(c.opcao!=0){
                JOptionPane.showMessageDialog(null, "Informe uma opção valida!");
            } else{
                JOptionPane.showMessageDialog(null, "Saindo!!!");
            }
            
        } while (c.opcao!=0);
        
        
        JOptionPane.showMessageDialog(null, c.resFinal());
        
        
    } 
    
}
