

package lanchonete;
/**
 *
 * @author victor
 */
public class JFrmTelaPrincipal extends javax.swing.JFrame {
    private Lanche[] l;
    private Pizza[] p;
    
    private int contL;
    private int contP;
    
    private float mediaL;
    private float mediaP;
    
    private IFrmCadLanche  cadL;
    private IFrmCadPizza cadP;
    
   // private IFrmCadLanche exL;
    private IFrmExPizza exP;
    
    private final int TAM_PIZZA = 10;
    private final int TAM_LANCH = 10;
   
    public JFrmTelaPrincipal() {
        initComponents();
        
        l = new Lanche[TAM_LANCH];
        contL = 0;
        mediaL = 0;
        cadL  = null;
       // exL = null;
        
        p = new Pizza[TAM_PIZZA];
        contP = 0;
        mediaP = 0;
        cadP = null;
        exP = null;
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesckPrincipal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mniCadLanche = new javax.swing.JMenuItem();
        mniCadPizza = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        mniExPizza = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro Lanchonete");

        jMenu1.setText("Cadastro");

        mniCadLanche.setText("Lanche");
        mniCadLanche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniCadLancheActionPerformed(evt);
            }
        });
        jMenu1.add(mniCadLanche);

        mniCadPizza.setText("Pizza");
        mniCadPizza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniCadPizzaActionPerformed(evt);
            }
        });
        jMenu1.add(mniCadPizza);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Exibir");

        jMenuItem3.setText("Lanche");
        jMenu2.add(jMenuItem3);

        mniExPizza.setText("Pizza");
        mniExPizza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniExPizzaActionPerformed(evt);
            }
        });
        jMenu2.add(mniExPizza);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesckPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 816, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesckPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 557, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(826, 612));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mniCadLancheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniCadLancheActionPerformed
        
        mediaL = Lanche.calcularPrecoMedio(l);
        
        l[contL] = new Lanche();
        
        cadL = new IFrmCadLanche(l[contL], mediaL);
        jDesckPrincipal.add(cadL);
        cadL.setVisible(true);
        
        contL++;
        
    }//GEN-LAST:event_mniCadLancheActionPerformed

    private void mniCadPizzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniCadPizzaActionPerformed
        
        mediaP = Pizza.calcularPrecoMedio(p);
        
        p[contP] = new Pizza();
        
        cadP = new IFrmCadPizza(p[contP], mediaP);
        jDesckPrincipal.add(cadP);
        cadP.setVisible(true);
        
        contP++;
        
    }//GEN-LAST:event_mniCadPizzaActionPerformed

    private void mniExPizzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniExPizzaActionPerformed
       
        exP = new IFrmExPizza(p, contP);
        jDesckPrincipal.add(exP);
        exP.setVisible(true);
    
    }//GEN-LAST:event_mniExPizzaActionPerformed

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
            java.util.logging.Logger.getLogger(JFrmTelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrmTelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrmTelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrmTelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrmTelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesckPrincipal;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem mniCadLanche;
    private javax.swing.JMenuItem mniCadPizza;
    private javax.swing.JMenuItem mniExPizza;
    // End of variables declaration//GEN-END:variables
}
