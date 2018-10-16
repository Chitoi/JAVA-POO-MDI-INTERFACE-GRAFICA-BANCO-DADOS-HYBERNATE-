/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.JOptionPane;
/**
 *
 * @author aluno
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calculadoraa calc = new Calculadoraa();
        
        do
        {
         calc.setOperacao(Integer.valueOf(JOptionPane.showInputDialog(calc.exibirMenu())));
         if(calc.ehOperacaoValida())
         {
             calc.setNum1(Double.valueOf(JOptionPane.showInputDialog("Informe o 1ºnumero: ")));
             calc.setNum2(Double.valueOf(JOptionPane.showInputDialog("Informe o 2º numero: ")));
         }
         
         JOptionPane.showMessageDialog(null, calc.calcular());
         
        }while(calc.ehPraRepetir());
    }
    
}
