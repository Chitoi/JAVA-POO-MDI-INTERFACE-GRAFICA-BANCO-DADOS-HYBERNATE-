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

public class FrmProva extends javax.swing.JFrame {
    
    private int qtdEsp;
    private int qtdGer;
    private Candidato[] c;
    private Fiscal[] f;
    private int contC;
    private int contF;
    private final int TAMANHO = 5;
    /**
     * Creates new form FrmProva
     */
    
    //metodo construtor
    public FrmProva() {
        do{
            qtdEsp = Integer.valueOf(
                            JOptionPane.showInputDialog(
                            "Informe a quantidade de questões especificas"));
            
            if(qtdEsp <= 0){
                JOptionPane.showMessageDialog(null,
                        "Quantidade inválida!",
                        "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        }while(qtdEsp <= 0);
        
        qtdGer = Integer.valueOf(JOptionPane.showInputDialog(
                                "Informe a quantidade de questões de"+
                                 " conhecimento geral"));
        
        contC = contF = 0;
        
        c = new Candidato[TAMANHO];
        f = new Fiscal[TAMANHO];
        initComponents();
        
        atualizarCand();
        atualizarFisc();
        atualizarFisc();
        atualizarSexo();
    }
    
    private void atualizarCand(){
        lblCand.setText("Candidatos cadastrados: "+contC+
                        " de "+c.length);
    }
    
    private void atualizarFisc(){
        lblFisc.setText("Fiscais cadastrados: "+contF+
                        " de "+f.length);
    }
    
    private void atualizarCusto(){
        
        String r = "Custos com os fiscais: R$ 0,00";

        if(contF > 0){      
           r = Fiscal.totalizarCusto(f);
        }
        lblCusto.setText(r);
    }
    
    private void atualizarSexo(){
        String r = "Fiscais  por sexo -> Masculino: 0"+
                    " (0 %) | Feminino: 0 (0 %)";
        
        if(contF > 0){
            r = Fiscal.participacaoPorSexo(f);
        }
        lblSexo.setText(r);
    }
    
    private void cadastrar(int tipo){
        
        //Tipo 1 - Candidato
        //Tipo 2 - Fiscal
        
        switch(tipo){
            case 1:
            {
                if(contC < c.length){
                    c[contC] = new Candidato();
                    
                    String nome;
                    int idade, especifica, geral;
                    
                    nome = JOptionPane.showInputDialog(
                            FrmProva.this, "Nome do candidato");
                    
                    idade = Integer.valueOf(JOptionPane.showInputDialog(
                            FrmProva.this, "Idade do candidato"));
                    
                    especifica = Integer.valueOf(JOptionPane.showInputDialog(
                            FrmProva.this, "Acertos c. específico"));
                    
                    geral = Integer.valueOf(JOptionPane.showInputDialog(
                            FrmProva.this, "Acertos c. geral:"));
                    
                    c[contC].cadastrar(nome, idade);
                    c[contC].cadastrar(especifica, geral);
                    
                    contC++;
                    atualizarCand();
                    JOptionPane.showMessageDialog(FrmProva.this,"Candidato cadastrado com sucesso");
                }
            }
            break;
            case 2:
                if(contF< f.length)
                {
                    f[contF] = new Fiscal();
                    
                    String nome;
                    int idade;
                    double valor;
                    char sexo;
                    
                    nome = JOptionPane.showInputDialog(FrmProva.this, "Informe o nome do fiscal");
                    idade = Integer.valueOf(JOptionPane.showInputDialog(FrmProva.this, "Informe a idade do fiscal"));
                    valor = Double.valueOf(JOptionPane.showInputDialog(FrmProva.this,"Informe o valor pago ao fiscal"));
                    sexo = JOptionPane.showInputDialog(FrmProva.this, "Informe o sexo do fiscal: "+"M - Masculino\n"+"F - Feminino").toUpperCase().charAt(0);
                    
                    f[contF].Cadastrar(nome, idade, sexo, valor);
                    contF++;
                    atualizarCusto();
                    atualizarFisc();
                    atualizarSexo();
                    
                    JOptionPane.showMessageDialog(FrmProva.this,"Fiscal cadastrado com sucesso");
                }
            break;
        }
    }
    
    private int submenu(int tipo)
    {
        //tipo 1 -cadidato
        //tipo 2 -fiscal
        int escolha = 0, aux;
        String pessoas = "";
        
        switch(tipo)
        {
            case 1:
                pessoas = "Escolha um candidato\n\n";
                
                for(aux = 0; aux<contC; aux++)
                {
                    pessoas +=(aux+1)+"-"+c[aux].getNome()+"\n";
                }
                
                pessoas += "0 - Voltar";
                
                do{
                    escolha = Integer.valueOf(JOptionPane.showInputDialog(FrmProva.this, pessoas));
                }while(escolha < 0 || escolha > contC);
            break;
            
            case 2:
               pessoas = "Escolha um fiscal\n\n";
                
                for(aux = 0; aux<contF; aux++)
                {
                    pessoas +=(aux+1)+"-"+f[aux].getNome()+"\n";
                }
                
                pessoas += "0 - Voltar";
                
                do{
                    escolha = Integer.valueOf(JOptionPane.showInputDialog(FrmProva.this, pessoas));
                }while(escolha < 0 || escolha > contF);
              
            break;
        }
     return escolha-1;   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCand = new javax.swing.JLabel();
        lblFisc = new javax.swing.JLabel();
        lblSexo = new javax.swing.JLabel();
        lblCusto = new javax.swing.JLabel();
        btnCadCand = new javax.swing.JButton();
        btnExibCand = new javax.swing.JButton();
        btnCadFisc = new javax.swing.JButton();
        btnExibRank = new javax.swing.JButton();
        btnExibFisc = new javax.swing.JButton();
        bntFechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro do Concurso");
        setResizable(false);

        lblCand.setText("Candidatos cadastrados: 7 de 10");

        lblFisc.setText("Fiscais cadastrados");

        lblSexo.setText("jLabel1");

        lblCusto.setText("Custos com os fiscais: R$ 0,00");

        btnCadCand.setText("Cadastrar Candidato");
        btnCadCand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadCandActionPerformed(evt);
            }
        });

        btnExibCand.setText("Exibir Candidato");
        btnExibCand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExibCandActionPerformed(evt);
            }
        });

        btnCadFisc.setText("Cadastrar Fiscal");
        btnCadFisc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadFiscActionPerformed(evt);
            }
        });

        btnExibRank.setText("Ranking de Candidatos");
        btnExibRank.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExibRankActionPerformed(evt);
            }
        });

        btnExibFisc.setText("Exibir Fiscal");
        btnExibFisc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExibFiscActionPerformed(evt);
            }
        });

        bntFechar.setText("Fechar");
        bntFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntFecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCusto)
                    .addComponent(lblFisc)
                    .addComponent(lblCand)
                    .addComponent(lblSexo)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCadCand, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnExibCand))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCadFisc, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnExibFisc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnExibRank, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bntFechar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadCand)
                    .addComponent(btnExibCand)
                    .addComponent(btnExibRank))
                .addGap(18, 18, 18)
                .addComponent(lblCand)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadFisc)
                    .addComponent(btnExibFisc)
                    .addComponent(bntFechar))
                .addGap(28, 28, 28)
                .addComponent(lblFisc)
                .addGap(18, 18, 18)
                .addComponent(lblCusto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblSexo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExibRankActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExibRankActionPerformed
      if(contC > 0){
          String r = Candidato.exibirRanking(c, qtdEsp, qtdGer);
          JOptionPane.showMessageDialog(FrmProva.this, r);
      }
    }//GEN-LAST:event_btnExibRankActionPerformed

    private void btnCadCandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadCandActionPerformed
        // TODO add your handling code here:
        cadastrar(1);
    }//GEN-LAST:event_btnCadCandActionPerformed

    private void btnCadFiscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadFiscActionPerformed
        // TODO add your handling code here:
        cadastrar(2);
    }//GEN-LAST:event_btnCadFiscActionPerformed

    private void btnExibCandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExibCandActionPerformed
        // TODO add your handling code here:
        if(contC > 0){
        int cand = submenu(1);
        
        if(cand > 0){
            JOptionPane.showMessageDialog(FrmProva.this, c[cand].exibir());
        }
        }
    }//GEN-LAST:event_btnExibCandActionPerformed

    private void btnExibFiscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExibFiscActionPerformed
        // TODO add your handling code here:
        if(contF > 0){
            int fisc = submenu(2);
            
            if(fisc >= 0)
            {
                JOptionPane.showMessageDialog(FrmProva.this, f[fisc].exibir());
            }
        }
    }//GEN-LAST:event_btnExibFiscActionPerformed

    private void bntFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntFecharActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_bntFecharActionPerformed
  
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
            java.util.logging.Logger.getLogger(FrmProva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmProva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmProva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmProva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmProva().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntFechar;
    private javax.swing.JButton btnCadCand;
    private javax.swing.JButton btnCadFisc;
    private javax.swing.JButton btnExibCand;
    private javax.swing.JButton btnExibFisc;
    private javax.swing.JButton btnExibRank;
    private javax.swing.JLabel lblCand;
    private javax.swing.JLabel lblCusto;
    private javax.swing.JLabel lblFisc;
    private javax.swing.JLabel lblSexo;
    // End of variables declaration//GEN-END:variables
}
