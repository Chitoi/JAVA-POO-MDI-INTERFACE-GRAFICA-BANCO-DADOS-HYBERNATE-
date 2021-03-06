/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prjInterface;

import javax.swing.JOptionPane;

/**
 *
 * @author nome
 */
public class JFCadCand extends javax.swing.JInternalFrame {
    private Candidato[] candidato;
    JFCadPerguntas cadPer = new JFCadPerguntas();
    private int contCand,  lb1, lb2;

    
    public JFCadCand() {
        
        initComponents();
        candidato = new Candidato[5];
        lb1=cadPer.espe;
        lb2=cadPer.gerais;
        jLabel1.setText(""+lb1+ "  --- "+lb2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTituloCand = new javax.swing.JLabel();
        lblNomeCand = new javax.swing.JLabel();
        lblIdadeCand = new javax.swing.JLabel();
        btnCadCand = new javax.swing.JButton();
        lblTextoCandCad = new javax.swing.JLabel();
        lblTotalCadCand = new javax.swing.JLabel();
        lblTextEspec = new javax.swing.JLabel();
        lblMaxCandCad = new javax.swing.JLabel();
        txtNomeCand = new javax.swing.JTextField();
        spnAcertEspeci = new javax.swing.JSpinner();
        lblTextGerais = new javax.swing.JLabel();
        spnAcertGerais = new javax.swing.JSpinner();
        spnIdadeCand = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        lblTituloCand.setText("CADASTRAR CANDIDATO ");

        lblNomeCand.setText("Nome");

        lblIdadeCand.setText("Idade");

        btnCadCand.setText("Cadastrar");
        btnCadCand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadCandActionPerformed(evt);
            }
        });

        lblTextoCandCad.setText("Candidatos cadastrados:  ");

        lblTotalCadCand.setText("0");

        lblTextEspec.setText("Acertos conhecimentos especificos:");

        lblMaxCandCad.setText("/ 10");

        spnAcertEspeci.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        lblTextGerais.setText("Acertos conhecimentos gerais:");

        spnAcertGerais.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        spnIdadeCand.setModel(new javax.swing.SpinnerNumberModel(10, 10, 60, 1));

        jLabel1.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(lblTituloCand, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblIdadeCand, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblNomeCand, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblTextoCandCad, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblTotalCadCand, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(lblMaxCandCad, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(lblTextGerais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblTextEspec, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(spnAcertEspeci, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(spnAcertGerais, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnCadCand, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addComponent(txtNomeCand))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(spnIdadeCand, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(122, 122, 122)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTituloCand, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(lblNomeCand)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomeCand, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblIdadeCand)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(spnIdadeCand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTextEspec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblTextGerais, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spnAcertGerais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblTextoCandCad)
                                    .addComponent(lblTotalCadCand)
                                    .addComponent(lblMaxCandCad)
                                    .addComponent(btnCadCand)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(spnAcertEspeci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(66, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        setBounds(0, 0, 547, 512);
    }// </editor-fold>//GEN-END:initComponents

    
   
    
    
    private void btnCadCandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadCandActionPerformed
               
        boolean nomeValido = txtNomeCand.getText().matches("[A-Z][a-z]{2,}");
        boolean notaValida = (int)spnAcertEspeci.getValue()<=cadPer.espe && (int)spnAcertGerais.getValue()<=cadPer.gerais;
        
         if(contCand<candidato.length && nomeValido && notaValida){
            candidato[contCand]=new Candidato(); 
            candidato[contCand].cadastrar(txtNomeCand.getText(), 
                                         (int)spnIdadeCand.getValue(), 
                                         (int)spnAcertEspeci.getValue(), 
                                         (int)spnAcertGerais.getValue());
            
          JOptionPane.showMessageDialog(JFCadCand.this, "Candidato cadastrado com sucesso!!!!");
          contCand++;  
         }else if(!nomeValido==false){
                JOptionPane.showMessageDialog(JFCadCand.this, "Nome invalido!!!");
         }else if(!notaValida==false){
            JOptionPane.showMessageDialog(JFCadCand.this, "Acertos invalidos!!!");

        }else{
            JOptionPane.showMessageDialog(JFCadCand.this, "Cadastro completo!!!"); 
         } 
         limpar();
    }//GEN-LAST:event_btnCadCandActionPerformed
    
    private void limpar(){
                                          txtNomeCand.setText(" "); 
                                          spnIdadeCand.setValue((int)10); 
                                          spnAcertEspeci.setValue((int)0);
                                          spnAcertGerais.setValue((int)0);
                                          txtNomeCand.requestFocus();
    }
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadCand;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblIdadeCand;
    private javax.swing.JLabel lblMaxCandCad;
    private javax.swing.JLabel lblNomeCand;
    private javax.swing.JLabel lblTextEspec;
    private javax.swing.JLabel lblTextGerais;
    private javax.swing.JLabel lblTextoCandCad;
    private javax.swing.JLabel lblTituloCand;
    private javax.swing.JLabel lblTotalCadCand;
    private javax.swing.JSpinner spnAcertEspeci;
    private javax.swing.JSpinner spnAcertGerais;
    private javax.swing.JSpinner spnIdadeCand;
    private javax.swing.JTextField txtNomeCand;
    // End of variables declaration//GEN-END:variables
}
