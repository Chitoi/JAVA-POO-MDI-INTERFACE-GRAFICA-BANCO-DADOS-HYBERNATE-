
package aluno;

import javax.swing.JOptionPane;


public class Principal {
    public static void main(String[] args){
        Nota n = new Nota();
        
        n.setNome(JOptionPane.showInputDialog("Digite o nome do aluno"));
        n.setIdade(Integer.valueOf(JOptionPane.showInputDialog("Digite a idade")));
        n.setNota1(Float.valueOf(JOptionPane.showInputDialog("Digite a 1º nota")));
        n.setNota2(Float.valueOf(JOptionPane.showInputDialog("Digite a 2º nota")));
        JOptionPane.showMessageDialog(null, n.exibir());
        
    }
}
