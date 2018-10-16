
package Aula1;


import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args){

    Aluno a = new Aluno();

        a.setNome(String.valueOf(JOptionPane.showInputDialog("Digite o nome do aluno")));
        a.setIdade(Integer.valueOf(JOptionPane.showInputDialog("Digite o idade do aluno")));
        a.setNota1(Float.valueOf(JOptionPane.showInputDialog("Digite o primeira nota do aluno")));
        a.setNota2(Float.valueOf(JOptionPane.showInputDialog("Digite o segunda nota do aluno")));
        JOptionPane.showMessageDialog(null, a.exibir());
        ConectBD.save(a);
    }    
}
