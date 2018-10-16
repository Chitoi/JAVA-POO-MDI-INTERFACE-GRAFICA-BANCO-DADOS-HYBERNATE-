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
        // TODO code application logic here
        Aluno a = new Aluno();
        String nome;
        int idade;
        float n1, n2, mediaAprovacao;
        
        nome = JOptionPane.showInputDialog("Digite seu nome");
        
        idade = Integer.valueOf(JOptionPane.showInputDialog("Digite sua idade"));
        
        n1 = Float.valueOf(JOptionPane.showInputDialog("Digite a 1ºnota"));
        
        n2 = Float.valueOf(JOptionPane.showInputDialog("Digite a 2ºnota"));
        
        mediaAprovacao = Float.valueOf(JOptionPane.showInputDialog("Digite a media de aprovacao"));
        
        a.cadastrar(nome, idade, n1, n2);
       
    
        
        
        JOptionPane.showMessageDialog(null,a.exibir(mediaAprovacao));
    }
    
}
