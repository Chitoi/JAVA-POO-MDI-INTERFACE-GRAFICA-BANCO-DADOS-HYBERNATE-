
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class IFrmExProfessor extends javax.swing.JInternalFrame {
    private Professor[] p;
    private int aux;
    /**
     * Creates new form IFrmExProfessor
     */
    public IFrmExProfessor() {
        initComponents();
        pnlDados.setVisible(false);
    }
    
    public IFrmExProfessor(Professor[] p, int aux) {
        
        this();
        this.p=p;
        this.aux=aux;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        spnCodigo = new javax.swing.JSpinner();
        btnBuscar = new javax.swing.JButton();
        pnlDados = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        lblIdade = new javax.swing.JLabel();
        lblSexo = new javax.swing.JLabel();
        lblCargaHoraria = new javax.swing.JLabel();
        lblValorHora = new javax.swing.JLabel();
        lblSalario = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Pesquisa de professores");

        jLabel1.setText("Escolha o código do Professor");

        spnCodigo.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        spnCodigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                spnCodigoFocusGained(evt);
            }
        });
        spnCodigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                spnCodigoMousePressed(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                spnCodigoMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                spnCodigoMouseExited(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                btnBuscarFocusLost(evt);
            }
        });
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        pnlDados.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Professor"));

        lblNome.setText("jLabel2");

        lblIdade.setText("jLabel2");

        lblSexo.setText("jLabel2");

        lblCargaHoraria.setText("jLabel2");

        lblValorHora.setText("jLabel2");

        lblSalario.setText("Salario");

        javax.swing.GroupLayout pnlDadosLayout = new javax.swing.GroupLayout(pnlDados);
        pnlDados.setLayout(pnlDadosLayout);
        pnlDadosLayout.setHorizontalGroup(
            pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSalario)
                    .addComponent(lblValorHora)
                    .addComponent(lblCargaHoraria)
                    .addComponent(lblSexo)
                    .addComponent(lblIdade)
                    .addComponent(lblNome))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlDadosLayout.setVerticalGroup(
            pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblIdade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblSexo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblCargaHoraria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblValorHora)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(128, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spnCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(spnCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(pnlDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        int codigo = (int)spnCodigo.getValue();
        
        if(codigo < aux){
            lblCargaHoraria.setText(String.valueOf(p[codigo].getCargaHoraria()));
            
            lblIdade.setText(String.valueOf(p[codigo].getIdade()));
            
            lblNome.setText(p[codigo].getNome());
            
            lblSalario.setText(String.valueOf(p[codigo].calcularSalario()));
            
            lblValorHora.setText(String.valueOf(p[codigo].getValorHora()));
            
            lblSexo.setText(String.valueOf(p[codigo].getSexo()));
            
            pnlDados.setVisible(true);
            
        }else{
            JOptionPane.showMessageDialog(IFrmExProfessor.this, "Nenhum professor cadastrado!!");
        }
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void spnCodigoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_spnCodigoFocusGained

        
        
    }//GEN-LAST:event_spnCodigoFocusGained

    private void spnCodigoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_spnCodigoMouseClicked

       

    }//GEN-LAST:event_spnCodigoMouseClicked

    private void spnCodigoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_spnCodigoMouseExited
       
    }//GEN-LAST:event_spnCodigoMouseExited

    private void spnCodigoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_spnCodigoMousePressed
        
        pnlDados.setVisible(false);
    }//GEN-LAST:event_spnCodigoMousePressed

    private void btnBuscarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnBuscarFocusLost

        
        pnlDados.setVisible(false);

    }//GEN-LAST:event_btnBuscarFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCargaHoraria;
    private javax.swing.JLabel lblIdade;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSalario;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblValorHora;
    private javax.swing.JPanel pnlDados;
    private javax.swing.JSpinner spnCodigo;
    // End of variables declaration//GEN-END:variables
}
