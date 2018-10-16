/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lanchonete;

import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author victor
 */
public class IFrmExPizza extends javax.swing.JInternalFrame {
    private Pizza[] p;
    private int contP;
    private int atual;
    
    
    public void popularCombo(){
        DefaultComboBoxModel dcm = (DefaultComboBoxModel)cbxEscolhe.getModel();
        
        for(int aux=0; aux<contP;  aux++){
            dcm.addElement(p[aux].getNome());
            
        }
        
    }
    
    public IFrmExPizza() {
        initComponents();
        
    }
    
    public IFrmExPizza(Pizza[] p, int contP){
        this();
        this.p=p;
        this.contP=contP;
        
        pnlPizza.setVisible(false);
        
        popularCombo();
    }
    
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cbxEscolhe = new javax.swing.JComboBox<>();
        btnEscolhe = new javax.swing.JButton();
        pnlPizza = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        lblCobertPrinc = new javax.swing.JLabel();
        lblTipoQueijo = new javax.swing.JLabel();
        lblFatia = new javax.swing.JLabel();
        lblTemBorda = new javax.swing.JLabel();
        lblRecheioBorda = new javax.swing.JLabel();
        lblPeso = new javax.swing.JLabel();
        lblPreco = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Mostrar Pizza");

        jLabel1.setText("Escolha pizza");

        btnEscolhe.setText("Escolha");
        btnEscolhe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEscolheActionPerformed(evt);
            }
        });

        pnlPizza.setBorder(javax.swing.BorderFactory.createTitledBorder("Pizzas"));

        lblNome.setText("jLabel2");

        lblCobertPrinc.setText("jLabel2");

        lblTipoQueijo.setText("jLabel2");

        lblFatia.setText("jLabel2");

        lblTemBorda.setText("jLabel2");

        lblRecheioBorda.setText("jLabel2");

        lblPeso.setText("jLabel2");

        lblPreco.setText("jLabel2");

        javax.swing.GroupLayout pnlPizzaLayout = new javax.swing.GroupLayout(pnlPizza);
        pnlPizza.setLayout(pnlPizzaLayout);
        pnlPizzaLayout.setHorizontalGroup(
            pnlPizzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPizzaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPizzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNome)
                    .addComponent(lblCobertPrinc)
                    .addComponent(lblTipoQueijo)
                    .addComponent(lblFatia)
                    .addComponent(lblTemBorda)
                    .addComponent(lblRecheioBorda)
                    .addComponent(lblPeso)
                    .addComponent(lblPreco))
                .addContainerGap(372, Short.MAX_VALUE))
        );
        pnlPizzaLayout.setVerticalGroup(
            pnlPizzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPizzaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNome)
                .addGap(18, 18, 18)
                .addComponent(lblCobertPrinc)
                .addGap(18, 18, 18)
                .addComponent(lblTipoQueijo)
                .addGap(18, 18, 18)
                .addComponent(lblFatia)
                .addGap(18, 18, 18)
                .addComponent(lblTemBorda)
                .addGap(18, 18, 18)
                .addComponent(lblRecheioBorda)
                .addGap(18, 18, 18)
                .addComponent(lblPeso)
                .addGap(18, 18, 18)
                .addComponent(lblPreco)
                .addContainerGap(124, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlPizza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(cbxEscolhe, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEscolhe)
                        .addGap(32, 32, 32))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbxEscolhe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEscolhe))
                .addGap(30, 30, 30)
                .addComponent(pnlPizza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void carregarPizzas(){
        String temBorda = p[atual].isBordaRecheada()?"Sim":"Não";
        
        
        lblNome.setText(p[atual].getNome());
        lblCobertPrinc.setText(p[atual].getCoberturaPrincipal());
        lblTipoQueijo.setText(p[atual].getTipoDeQueijo());
        lblFatia.setText(String.valueOf(p[atual].getFatia()));
        lblTemBorda.setText(temBorda);
        lblRecheioBorda.setText(p[atual].getRecheioBorda());
        lblPeso.setText(String.valueOf(p[atual].getPeso())+"K/g");
        lblPreco.setText(String.valueOf("R$"+p[atual].getPreco()));
        
    }
    
    private void btnEscolheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEscolheActionPerformed
      
        atual = cbxEscolhe.getSelectedIndex();
        
        carregarPizzas();
        
        
        if(!pnlPizza.isVisible()){
            pnlPizza.setVisible(true);
            
        }
        
    }//GEN-LAST:event_btnEscolheActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEscolhe;
    private javax.swing.JComboBox<String> cbxEscolhe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCobertPrinc;
    private javax.swing.JLabel lblFatia;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPeso;
    private javax.swing.JLabel lblPreco;
    private javax.swing.JLabel lblRecheioBorda;
    private javax.swing.JLabel lblTemBorda;
    private javax.swing.JLabel lblTipoQueijo;
    private javax.swing.JPanel pnlPizza;
    // End of variables declaration//GEN-END:variables
}
