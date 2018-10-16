/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
import javax.swing.JOptionPane;
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int menu = 0;
        
        Calculadora c = new Calculadora();
        
        do{
            menu = Integer.valueOf(JOptionPane.showInputDialog(
                    "1-SOMAR\n"
                   +"2-SUBTRAIR\n"
                   +"3-MULTIPLICAR\n"
                   +"4-Dividir\n"
                   +"0-SAIR")
            );
            
            if(c.isOperacaoCorreta(menu)){
                c.setValor1(Float.valueOf(JOptionPane.showInputDialog("Digite o 1º valor: ")));
                
                c.setValor2(Float.valueOf(JOptionPane.showInputDialog("Digite o 2º valor")));
                
                JOptionPane.showMessageDialog(null, c.exibir(menu));
                
            }else if(menu != 0 ){
                JOptionPane.showMessageDialog(null, "Operação incorreta");
            }
            
        }while(menu != 0);
    }
    
}
