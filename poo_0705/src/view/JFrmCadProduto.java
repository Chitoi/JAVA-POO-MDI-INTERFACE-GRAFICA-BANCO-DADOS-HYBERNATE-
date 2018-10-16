/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import org.hibernate.Session;
import dao.DAO;
import model.Produto;

import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class JFrmCadProduto extends javax.swing.JFrame {
    private Produto p;
    private Session sessao;
    private List <Produto> lista;
    private DefaultTableModel dtm;
    private int id;
    private int item;
    /**
     * Creates new form JFrmCadProduto
     */
    public JFrmCadProduto() {
        initComponents();
        
        id = 0;
        
        sessao = DAO.getSessionFactory().openSession();
        lista = new ArrayList<Produto>();
        dtm = (DefaultTableModel)tblProduto.getModel();
        
        popularTabela();
        
    }
    
    private void attTabela(Produto p, int lin){
        
        dtm = (DefaultTableModel)tblProduto.getModel();
        
        dtm.setValueAt(p.getNome(), lin, 1);
        dtm.setValueAt(p.getMarca(), lin, 2);
        dtm.setValueAt(p.getPrecoCompra(), lin, 3);
        dtm.setValueAt(p.getMargemLucro(), lin, 4);
        dtm.setValueAt(p.getEstoque(), lin, 5);
        dtm.setValueAt(p.precoDeVenda(), lin, 6);
        dtm.setValueAt(p.precoDeEstoque(), lin, 7);
        
    }

    private void selecionar(){
        int x = tblProduto.getSelectedRow();
        
        Produto p;
        if(tblProduto.getRowCount() == lista.size()){
            
            if(x >=0 ){
            
            p = lista.get(x);
            item = x;
            
            txtMarca.setText(p.getMarca());
            txtNome.setText(p.getNome());
            spnEstoque.setValue(p.getEstoque());
            spnMargem.setValue(p.getMargemLucro());
            spnPreco.setValue(p.getPrecoCompra());
            
            id = p.getId();
            
        }
            
        }else{ 
            
            dtm = (DefaultTableModel)tblProduto.getModel();
            
            id = Integer.valueOf(dtm.getValueAt(x, 0).toString());
            
            txtNome.setText(dtm.getValueAt(x, 1).toString());
            
            txtMarca.setText(dtm.getValueAt(x, 2).toString());
            
            int fim = dtm.getValueAt(x, 3).toString().length();
            
            spnPreco.setValue(Float.valueOf(dtm.getValueAt(x, 3).toString().substring(2, fim).replace(',', '.')));
            
            fim = dtm.getValueAt(x, 4).toString().length() - 2;
            
            spnMargem.setValue(Float.valueOf(dtm.getValueAt(x, 4).toString().substring(0, fim).replace(',', '.')));
            
            spnEstoque.setValue(Integer.valueOf(dtm.getValueAt(x, 5).toString()));
            
            
            
            for(int aux = 0; aux<lista.size(); aux++){
                Produto ptemp  = lista.get(aux);
                
                if(ptemp.getId() == id){
                    item=aux;
                    break;
                }
            }
            
            
        }
        
        
    }
    
    private void filtrarMarca(String marca){
        
        List<Produto> temp = new ArrayList();
        
        temp = sessao.createQuery("from Produto where marca = '"+marca+"'").list();
        
        if(temp.size() == 0){
            
            JOptionPane.showMessageDialog(JFrmCadProduto.this, "Não há produtos da marca"+marca+" cadastrados");
            
        }else{
            
            dtm.setRowCount(0);
            
            for(int aux=0; aux<temp.size(); aux++){
                
                Produto p = temp.get(aux);
                
                dtm.addRow(p.toLinha());
        
            }   
        }
    }
    
    
    
    private void atualizarTabela(int i){
        if(i == -1){
        
        int aux = lista.size() - 1;
        Produto p = lista.get(aux);
       
        dtm.addRow(p.toLinha());
        
        }else{
            if(tblProduto.getRowCount() == lista.size()){
                Produto p = lista.get(i);
                
                dtm.removeRow(i);
                
                dtm.insertRow(i, p.toLinha());
            }else{
                popularTabela();
            }
        }
    }
     
     private void popularTabela(){
       int aux;
       
       if(lista.size() == 0){
       lista = sessao.createQuery("from Produto").list();
       }
     
       if(lista.size() > 0){
                   
           dtm.setRowCount(0);
           
           for(aux = 0; aux<lista.size(); aux++){
               
               Produto p = lista.get(aux);
     
               dtm.addRow(p.toLinha());
           }
       }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblProduto = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        spnPreco = new javax.swing.JSpinner();
        spnMargem = new javax.swing.JSpinner();
        spnEstoque = new javax.swing.JSpinner();
        btnSalvar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSelecionar = new javax.swing.JButton();
        btnFiltrarMarca = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Produto");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        tblProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Marca", "Preço de compra", "Margem de lucro", "Estoque", "Preço de venda", "Preço de estoque"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProdutoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProduto);

        jLabel1.setText("Nome");

        jLabel2.setText("Preço de compra");

        jLabel3.setText("Marca");

        jLabel4.setText("Margem de lucro");

        jLabel5.setText("Estoque");

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        spnPreco.setModel(new javax.swing.SpinnerNumberModel(0.0f, 0.0f, null, 0.1f));

        spnMargem.setModel(new javax.swing.SpinnerNumberModel(0.0f, 0.0f, null, 0.1f));

        spnEstoque.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnSelecionar.setText("Selecionar");
        btnSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionarActionPerformed(evt);
            }
        });

        btnFiltrarMarca.setText("Filtrar marca");
        btnFiltrarMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarMarcaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 926, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSalvar)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluir)))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(btnSelecionar)
                        .addGap(45, 45, 45)
                        .addComponent(btnFiltrarMarca))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtNome)
                        .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(spnPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnMargem, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(360, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spnPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spnMargem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spnEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnExcluir)
                    .addComponent(btnSelecionar)
                    .addComponent(btnFiltrarMarca))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        setSize(new java.awt.Dimension(960, 560));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        sessao.getSessionFactory().close();
    }//GEN-LAST:event_formWindowClosing

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

        salvarTabela();
       
    }//GEN-LAST:event_btnSalvarActionPerformed
    
    
    
    public void salvarTabela(){
        p = new Produto(txtNome.getText(), 
                        txtMarca.getText(), 
                        (float)spnPreco.getValue(), 
                        (float)spnMargem.getValue(), 
                        (int)spnEstoque.getValue());
        
        

        if(id == 0){
            
            try{
                sessao.beginTransaction();
                sessao.save(p);
                sessao.getTransaction().commit();
                lista.add(p);
           
                atualizarTabela(item);
           
                limpar();
            }catch(Exception ex){
                ex.printStackTrace();
            }
            
            
        }else{
            
            p.setId(id);
            
        
            
            try{
                sessao.beginTransaction();
                sessao.merge(p);
                sessao.getTransaction().commit();

            
                JOptionPane.showMessageDialog(JFrmCadProduto.this, "Produto alterado com sucesso!");
            
                atualizarTabela(item);
                //attTabela(p, item);
                
                limpar();
            
                id=0;
            
            }catch(Exception ex){
                ex.printStackTrace();
            }   
        }
        
    }
    
    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
     
        int i = tblProduto.getSelectedRow();
        
        if(tblProduto.getSelectedRow() != -1){

                    Produto p = lista.get(i);
                           
                    try{
                        sessao.beginTransaction();
                        sessao.delete(p);
                        sessao.getTransaction().commit();
                        lista.remove(p); 
                        
                    }catch(Exception ex){
                        ex.printStackTrace();
                    }
        
        dtm = (DefaultTableModel) tblProduto.getModel();
        dtm.removeRow(tblProduto.getSelectedRow());             
                    
        }else{
            JOptionPane.showMessageDialog(null, "Selecione um produto para excluir!!!");
        }
        
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void tblProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProdutoMouseClicked
        
       /*  if(tblProduto.getSelectedRow() != -1){
             
             txtNome.setText(tblProduto.getValueAt(tblProduto.getSelectedRow(), 1).toString());
             txtMarca.setText(tblProduto.getValueAt(tblProduto.getSelectedRow(), 2).toString());
             spnPreco.setValue(tblProduto.getValueAt(tblProduto.getSelectedRow(), 3));
             spnMargem.setValue(tblProduto.getValueAt(tblProduto.getSelectedRow(), 4));
             spnEstoque.setValue(tblProduto.getValueAt(tblProduto.getSelectedRow(), 5));
             
         }else{
           JOptionPane.showMessageDialog(null, "Selecione um produto para excluir!!!");
       }
        */
    }//GEN-LAST:event_tblProdutoMouseClicked
    
    
    private void limpar(){
        txtMarca.setText("");
        txtNome.setText("");
        spnEstoque.setValue((int)0);
        spnMargem.setValue((float)0);
        spnPreco.setValue((float)0);
        txtNome.requestFocus();
    }
    
    
    private void btnSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionarActionPerformed
        
        selecionar();

    }//GEN-LAST:event_btnSelecionarActionPerformed

    private void btnFiltrarMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarMarcaActionPerformed

        String marca;
        
        marca = JOptionPane.showInputDialog(JFrmCadProduto.this, "Informe a marca que deseja");
        
        filtrarMarca(marca);
        
    }//GEN-LAST:event_btnFiltrarMarcaActionPerformed

  /*  public void excluir(){
        
        int lin = tblProduto.getSelectedRow();
        
        if(lin >= 0){
            
            
            Produto p = new Produto("", "", 0, 0, 0);
            
            System.out.println(p.getId()+ p.getNome());
            
            if(JOptionPane.showConfirmDialog(JFrmCadProduto.this, "Deseja realmente excluir o produto"+p.getNome()+"?",
                                            "Confirma a exclusão", JOptionPane.YES_NO_OPTION)==0){
 
                sessao.beginTransaction();
                sessao.delete(p);
                sessao.getTransaction().commit();
                
                JOptionPane.showMessageDialog(JFrmCadProduto.this, "Produto excluído com sucesso");
                
                dtm.removeRow(lin);
                lista.remove(lin);
            }
        }
    
    }*/
    
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
            java.util.logging.Logger.getLogger(JFrmCadProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrmCadProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrmCadProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrmCadProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrmCadProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnFiltrarMarca;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnSelecionar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner spnEstoque;
    private javax.swing.JSpinner spnMargem;
    private javax.swing.JSpinner spnPreco;
    private javax.swing.JTable tblProduto;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
