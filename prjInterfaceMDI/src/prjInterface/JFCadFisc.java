/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prjInterface;

/**
 *
 * @author nome
 */
public class JFCadFisc extends javax.swing.JInternalFrame {
    private Fiscal[] fiscal;
    private int  contCand;
    
    
    public JFCadFisc() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTituloFisc = new javax.swing.JLabel();
        lblNomeFisc = new javax.swing.JLabel();
        lblIdadeFisc = new javax.swing.JLabel();
        lblSexoFisc = new javax.swing.JLabel();
        lblSalarioFisc = new javax.swing.JLabel();
        txtNomeFisc = new javax.swing.JTextField();
        txtIdadeFisc = new javax.swing.JTextField();
        jcbSexoFisc = new javax.swing.JComboBox<>();
        btnCadFisc = new javax.swing.JButton();
        lblTextoFiscCad = new javax.swing.JLabel();
        lblTotalCadFisc = new javax.swing.JLabel();
        lblMaxCadFisc = new javax.swing.JLabel();
        spnSalarioFisc = new javax.swing.JSpinner();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        lblTituloFisc.setText("CADASTRAR FISCAL ");

        lblNomeFisc.setText("Nome");

        lblIdadeFisc.setText("Idade");

        lblSexoFisc.setText("Sexo");

        lblSalarioFisc.setText("Salário ");

        jcbSexoFisc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Masculino", "Feminino", " " }));

        btnCadFisc.setText("Cadastrar");

        lblTextoFiscCad.setText("Fiscal cadastrado:  ");

        lblTotalCadFisc.setText("0");

        lblMaxCadFisc.setText("/ 10");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(76, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcbSexoFisc, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSexoFisc, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnSalarioFisc, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSalarioFisc, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIdadeFisc, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblTextoFiscCad)
                            .addGap(55, 55, 55)
                            .addComponent(lblTotalCadFisc, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(lblMaxCadFisc)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCadFisc))
                        .addComponent(txtIdadeFisc, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNomeFisc, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNomeFisc, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(lblTituloFisc, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(lblTituloFisc, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblNomeFisc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomeFisc, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(lblIdadeFisc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIdadeFisc, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(lblSalarioFisc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spnSalarioFisc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblSexoFisc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbSexoFisc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTextoFiscCad)
                    .addComponent(lblMaxCadFisc)
                    .addComponent(lblTotalCadFisc)
                    .addComponent(btnCadFisc))
                .addContainerGap(127, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleDescription("Cadastro Fiscal");

        setBounds(0, 0, 540, 525);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadFisc;
    private javax.swing.JComboBox<String> jcbSexoFisc;
    private javax.swing.JLabel lblIdadeFisc;
    private javax.swing.JLabel lblMaxCadFisc;
    private javax.swing.JLabel lblNomeFisc;
    private javax.swing.JLabel lblSalarioFisc;
    private javax.swing.JLabel lblSexoFisc;
    private javax.swing.JLabel lblTextoFiscCad;
    private javax.swing.JLabel lblTituloFisc;
    private javax.swing.JLabel lblTotalCadFisc;
    private javax.swing.JSpinner spnSalarioFisc;
    private javax.swing.JTextField txtIdadeFisc;
    private javax.swing.JTextField txtNomeFisc;
    // End of variables declaration//GEN-END:variables
}
