/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prjTime;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class JFrameTime extends javax.swing.JFrame {
    private final Time[] t;
    private int cont;
   
    public JFrameTime() {
        initComponents();
        t= new Time[6];
        cont=0;
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LblNome = new javax.swing.JLabel();
        TxtNome = new javax.swing.JTextField();
        LblVItorias = new javax.swing.JLabel();
        SpnVitorias = new javax.swing.JSpinner();
        LblEmpates = new javax.swing.JLabel();
        SpnEmpates = new javax.swing.JSpinner();
        LblDerrotas = new javax.swing.JLabel();
        SpnDerrotas = new javax.swing.JSpinner();
        BtnCadastrar = new javax.swing.JButton();
        BtnExibir = new javax.swing.JButton();
        BtnMelhorAproveitamento = new javax.swing.JButton();
        BtnFechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Time");

        LblNome.setText("Nome");

        TxtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNomeActionPerformed(evt);
            }
        });

        LblVItorias.setText("Vitórias");

        SpnVitorias.setModel(new javax.swing.SpinnerNumberModel());
        SpnVitorias.setToolTipText("");

        LblEmpates.setText("Empates");

        SpnEmpates.setModel(new javax.swing.SpinnerNumberModel());

        LblDerrotas.setText("Derrotas");

        SpnDerrotas.setModel(new javax.swing.SpinnerNumberModel());

        BtnCadastrar.setText("Cadastrar");
        BtnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCadastrarActionPerformed(evt);
            }
        });

        BtnExibir.setText("Exibir");
        BtnExibir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnExibirActionPerformed(evt);
            }
        });

        BtnMelhorAproveitamento.setText("Melhor Aproveitamento");
        BtnMelhorAproveitamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMelhorAproveitamentoActionPerformed(evt);
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
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(BtnCadastrar)
                        .addComponent(LblNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(LblVItorias, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnExibir)
                            .addComponent(SpnVitorias, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(LblEmpates, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(SpnEmpates, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(LblDerrotas, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SpnDerrotas, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BtnMelhorAproveitamento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BtnFechar)))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblVItorias, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SpnVitorias, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblEmpates, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SpnEmpates, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblDerrotas, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SpnDerrotas, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(116, 116, 116)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnCadastrar)
                    .addComponent(BtnExibir)
                    .addComponent(BtnMelhorAproveitamento)
                    .addComponent(BtnFechar))
                .addContainerGap(148, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TxtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNomeActionPerformed

    private void BtnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCadastrarActionPerformed
       if(cont < t.length){
           t[cont] =new Time();
           t[cont].cadastrar(
                   TxtNome.getText(), 
                   (int)SpnVitorias.getValue(), 
                   (int)SpnEmpates.getValue(),
                   (int)SpnDerrotas.getValue());
          JOptionPane.showMessageDialog(JFrameTime.this, "Time cadastrado com sucesso:");
          cont++;
       }else{
            JOptionPane.showMessageDialog(JFrameTime.this, "Não há mais espaço para cadastro"
                                            ,"ATENÇÃO", JOptionPane.WARNING_MESSAGE);
       }
       
       TxtNome.setText(" ");
       SpnVitorias.setValue((int)0);
       SpnEmpates.setValue((int)0);
       SpnDerrotas.setValue((int)0);
    }//GEN-LAST:event_BtnCadastrarActionPerformed

    private void BtnExibirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExibirActionPerformed
       String mostrar = "Escolha um time: \n";
       t[cont]=new Time();
       int aux, op=0;
       
       if(cont == 0){
           JOptionPane.showMessageDialog(JFrameTime.this, "Nenhum time cadastrado!!");  
       }else{
            for(aux=0; aux< cont; aux++){
                mostrar+=  +(aux+1) + "-" +
                        t[aux].getNome()+
                        "\n";
            }
            mostrar+="0 - Cancelar";
            do{
                try{
                op=Integer.valueOf(JOptionPane.showInputDialog(mostrar));
                }catch(NumberFormatException nfe){
                    JOptionPane.showMessageDialog(JFrameTime.this, "Informe um número valido");
                
                op= -1;
                }
          }while(op < 0 || op > cont);
            if(op > 0 && op <= cont){
            JOptionPane.showMessageDialog(JFrameTime.this, t[op-1].exibir());
        }
        }  
    }//GEN-LAST:event_BtnExibirActionPerformed

    private void BtnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnFecharActionPerformed
        dispose();
    }//GEN-LAST:event_BtnFecharActionPerformed

    private void BtnMelhorAproveitamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMelhorAproveitamentoActionPerformed
        t[cont]=new Time();
        int aux,  maior=0, menor=0;
        
        for(aux=0; aux<=cont; aux++){
               if(t[aux].calcularAproveitamento()>t[aux+1].calcularAproveitamento()){
                 maior=aux;           
                }else if(t[aux].calcularAproveitamento()<t[aux+1].calcularAproveitamento()){
                 menor=aux;   
                }else{
                        
                }        
    }//GEN-LAST:event_BtnMelhorAproveitamentoActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameTime.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameTime.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameTime.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameTime.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameTime().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCadastrar;
    private javax.swing.JButton BtnExibir;
    private javax.swing.JButton BtnFechar;
    private javax.swing.JButton BtnMelhorAproveitamento;
    private javax.swing.JLabel LblDerrotas;
    private javax.swing.JLabel LblEmpates;
    private javax.swing.JLabel LblNome;
    private javax.swing.JLabel LblVItorias;
    private javax.swing.JSpinner SpnDerrotas;
    private javax.swing.JSpinner SpnEmpates;
    private javax.swing.JSpinner SpnVitorias;
    private javax.swing.JTextField TxtNome;
    // End of variables declaration//GEN-END:variables
}
