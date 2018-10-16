/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlunoGui;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class JFrameAluno extends javax.swing.JFrame {
    private final Aluno[] a;
    private int cont;
    
    public JFrameAluno() {
        initComponents();
        
        a = new Aluno[5];
        cont=0;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LblNome = new javax.swing.JLabel();
        LblCurso = new javax.swing.JLabel();
        LblIdade = new javax.swing.JLabel();
        LblNota1 = new javax.swing.JLabel();
        LblNota2 = new javax.swing.JLabel();
        TxtNome = new javax.swing.JTextField();
        TxtCurso = new javax.swing.JTextField();
        SpnIdade = new javax.swing.JSpinner();
        SpnNota1 = new javax.swing.JSpinner();
        SpnNota2 = new javax.swing.JSpinner();
        BtnCad = new javax.swing.JButton();
        BtnLimp = new javax.swing.JButton();
        BtnExib = new javax.swing.JButton();
        BtnFechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Aluno");

        LblNome.setText("Nome");

        LblCurso.setText("Curso");

        LblIdade.setText("idade");

        LblNota1.setText("Nota 1");

        LblNota2.setText("Nota 2");

        TxtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNomeActionPerformed(evt);
            }
        });

        TxtCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCursoActionPerformed(evt);
            }
        });

        SpnIdade.setModel(new javax.swing.SpinnerNumberModel(17, 17, 50, 1));

        SpnNota1.setModel(new javax.swing.SpinnerNumberModel(5.0d, 0.0d, 10.0d, 0.25d));

        SpnNota2.setModel(new javax.swing.SpinnerNumberModel(5.0d, 0.0d, 10.0d, 0.25d));

        BtnCad.setText("Cadastrar");
        BtnCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCadActionPerformed(evt);
            }
        });

        BtnLimp.setText("Limpar");
        BtnLimp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimpActionPerformed(evt);
            }
        });

        BtnExib.setText("Exibir");
        BtnExib.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnExibActionPerformed(evt);
            }
        });

        BtnFechar.setText("Fechar");
        BtnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnFecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(LblCurso)
                                .addComponent(LblNome))
                            .addComponent(LblIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SpnIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(LblNota2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(SpnNota2))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(LblNota1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(SpnNota1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnCad, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnLimp, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnExib, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblNome))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblCurso)
                    .addComponent(TxtCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LblIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SpnIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblNota1)
                    .addComponent(SpnNota1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblNota2)
                    .addComponent(SpnNota2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnCad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnLimp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnExib, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(85, 85, 85))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TxtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNomeActionPerformed

    private void BtnCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCadActionPerformed
        if(cont < 5){
            a[cont] = new Aluno();
            a[cont].cadastrar(
                TxtNome.getText(), 
                (int)SpnIdade.getValue(), 
                TxtCurso.getText(), 
                (double)SpnNota1.getValue(), 
                (double)SpnNota2.getValue());
            JOptionPane.showMessageDialog(JFrameAluno.this, "Aluno cadastrado com sucesso:");
            BtnLimpActionPerformed(null);
            cont++;
            }else{
            JOptionPane.showMessageDialog(JFrameAluno.this, "Não há mais espaço para cadastro"
                                            ,"ATENÇÃO", JOptionPane.WARNING_MESSAGE);
           
        }
    }//GEN-LAST:event_BtnCadActionPerformed

    private void BtnExibActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExibActionPerformed
       String menu="Escolha um aluno \n";
        a[cont]=new Aluno();
        int aux, op=0;
        
        if(cont==0){
            JOptionPane.showMessageDialog(JFrameAluno.this, "NÃO há, alunos cadastrados.");
        }else{
            for(aux=0; aux< cont; aux++){
                menu+=  +(aux+1) + "-" +
                        a[aux].getNome()+
                        "\n";
            }
            menu+="0 - Cancelar";
            do{
                try{
                op=Integer.valueOf(JOptionPane.showInputDialog(menu));
                }catch(NumberFormatException nfe){
                    JOptionPane.showMessageDialog(JFrameAluno.this, "Informe um número valido");
                
                op= -1;
                }
            }while(op < 0 || op > cont);
            if(op > 0 && op <= cont){
            JOptionPane.showMessageDialog(JFrameAluno.this, a[op-1].exibir());
        }
        }        
       
    }//GEN-LAST:event_BtnExibActionPerformed

    private void BtnLimpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimpActionPerformed
        TxtCurso.setText(" ");
        TxtNome.setText(" ");
        SpnIdade.setValue((int)19);
        SpnNota1.setValue((double)5);
        SpnNota2.setValue((double)5);
    }//GEN-LAST:event_BtnLimpActionPerformed

    private void BtnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnFecharActionPerformed
        dispose();
    }//GEN-LAST:event_BtnFecharActionPerformed

    private void TxtCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCursoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrameAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JFrameAluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCad;
    private javax.swing.JButton BtnExib;
    private javax.swing.JButton BtnFechar;
    private javax.swing.JButton BtnLimp;
    private javax.swing.JLabel LblCurso;
    private javax.swing.JLabel LblIdade;
    private javax.swing.JLabel LblNome;
    private javax.swing.JLabel LblNota1;
    private javax.swing.JLabel LblNota2;
    private javax.swing.JSpinner SpnIdade;
    private javax.swing.JSpinner SpnNota1;
    private javax.swing.JSpinner SpnNota2;
    private javax.swing.JTextField TxtCurso;
    private javax.swing.JTextField TxtNome;
    // End of variables declaration//GEN-END:variables
}
