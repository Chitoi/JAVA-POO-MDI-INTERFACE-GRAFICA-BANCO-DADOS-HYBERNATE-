
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
public class JFConcurso extends javax.swing.JFrame {
    private Candidato[] candidato;
    private Fiscal[] fiscal;
    private int espec, gerals, contCand, contFisc;
   
    
  
    
    public JFConcurso(){
        do{
            try{
                espec=Integer.valueOf(JOptionPane.showInputDialog("Quantidade perguntas especificas:"));
            }catch(NumberFormatException nfe){
                JOptionPane.showMessageDialog(JFConcurso.this, "Informe um número valido e maior que zero ");
            }
        }while(espec == 0);
        
        do{
            try{
                gerals=Integer.valueOf(JOptionPane.showInputDialog("Quantidade perguntas gerais:"));     
            }catch(NumberFormatException nfe){
                JOptionPane.showMessageDialog(JFConcurso.this, "Informe um número valido e maior que zero ");
            }
        }while(gerals == 0);
        
        initComponents();
        candidato=new Candidato[5];
        fiscal=new Fiscal[5];
        contCand=0;
        contFisc=0;
        lblTotalEspc.setText(""+espec);
        lblTotalGerais.setText(""+gerals);       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCadCand = new javax.swing.JButton();
        btnExibCand = new javax.swing.JButton();
        btnRanking = new javax.swing.JButton();
        btnCadFisc = new javax.swing.JButton();
        btnExibFiscal = new javax.swing.JButton();
        lblCandCadastro = new javax.swing.JLabel();
        lblContCadCand = new javax.swing.JLabel();
        lblMaxCadCand = new javax.swing.JLabel();
        lblFiscCadastro = new javax.swing.JLabel();
        lblContCadFisc = new javax.swing.JLabel();
        lblMaxCadFisc = new javax.swing.JLabel();
        lblCustoFisc = new javax.swing.JLabel();
        lblCustoTotalFisc = new javax.swing.JLabel();
        lblFiscPorSexo = new javax.swing.JLabel();
        lblFiscSexoMascFem = new javax.swing.JLabel();
        btnFechar = new javax.swing.JButton();
        lblPerguntas = new javax.swing.JLabel();
        lblEspc = new javax.swing.JLabel();
        lblTotalEspc = new javax.swing.JLabel();
        lblGerais = new javax.swing.JLabel();
        lblTotalGerais = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro");

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

        btnRanking.setText("Ranking de Candidatos");
        btnRanking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRankingActionPerformed(evt);
            }
        });

        btnCadFisc.setText("Cadastrar Fiscal");
        btnCadFisc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadFiscActionPerformed(evt);
            }
        });

        btnExibFiscal.setText("Exibir Fiscal");
        btnExibFiscal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExibFiscalActionPerformed(evt);
            }
        });

        lblCandCadastro.setText("Candidatos cadastrados");

        lblContCadCand.setText("0");

        lblMaxCadCand.setText("de 10");

        lblFiscCadastro.setText("Fiscais cadastrados");

        lblContCadFisc.setText("0");

        lblMaxCadFisc.setText("de 10");

        lblCustoFisc.setText("Custos com os fiscais");

        lblCustoTotalFisc.setText("R$ 0");

        lblFiscPorSexo.setText("Fiscais por sexo ->");

        lblFiscSexoMascFem.setText("M:0 | F: 0");

        btnFechar.setText("Fechar");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        lblPerguntas.setText("Total de perguntas do concurso:");

        lblEspc.setText("especificas - ");

        lblTotalEspc.setText("0");

        lblGerais.setText("gerais - ");

        lblTotalGerais.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCustoFisc)
                                .addGap(18, 18, 18)
                                .addComponent(lblCustoTotalFisc))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnCadCand)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnExibCand))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblFiscCadastro)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblContCadFisc)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblMaxCadFisc))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(btnCadFisc)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnExibFiscal))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(lblCandCadastro)
                                            .addGap(28, 28, 28)
                                            .addComponent(lblContCadCand)
                                            .addGap(18, 18, 18)
                                            .addComponent(lblMaxCadCand))))
                                .addGap(18, 18, 18)
                                .addComponent(btnRanking))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblPerguntas, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblEspc)
                                .addGap(18, 18, 18)
                                .addComponent(lblTotalEspc, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(90, 90, 90)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblFiscPorSexo)
                        .addGap(18, 18, 18)
                        .addComponent(lblFiscSexoMascFem, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 252, Short.MAX_VALUE)
                        .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblGerais)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTotalGerais, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(151, 151, 151)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadCand)
                    .addComponent(btnExibCand)
                    .addComponent(btnRanking))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCandCadastro)
                            .addComponent(lblContCadCand)
                            .addComponent(lblMaxCadCand))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblEspc)
                                .addComponent(lblTotalEspc))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblGerais)
                                .addComponent(lblTotalGerais))
                            .addComponent(lblPerguntas))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCadFisc)
                            .addComponent(btnExibFiscal))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFiscCadastro)
                            .addComponent(lblContCadFisc)
                            .addComponent(lblMaxCadFisc))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCustoFisc)
                            .addComponent(lblCustoTotalFisc))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFiscPorSexo)
                            .addComponent(lblFiscSexoMascFem))
                        .addContainerGap(43, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnFechar)
                        .addContainerGap())))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadCandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadCandActionPerformed
        String nome = " ";
        int idade = 0;
        int especificos=0;
        int gerais=0;
        int flag;
        boolean valido;

        
        if(contCand<candidato.length){
            candidato[contCand]=new Candidato(); 
           
            do{   
                nome = JOptionPane.showInputDialog("Digite seu nome");
                valido=nome.matches("[A-Z][a-z]{2,}");
                if(!nome.isEmpty() && nome.trim().length()>0 && valido){
                    flag = 1;
                }else{
                    flag = 0;
                }
   
            }while(flag == 0);
           
           
            do{
                try{
                    idade = Integer.valueOf(JOptionPane.showInputDialog("Digite sua idade: "));
                }catch(NumberFormatException nfe){
                    JOptionPane.showMessageDialog(JFConcurso.this, "Informe um número valido e maior que zero ");
                } 
            }while(idade == 0);    
           
            do{   
                try{    
                    especificos=Integer.valueOf(JOptionPane.showInputDialog("Digite total de acerto conhecimento: especificos"));
                    gerais=Integer.valueOf(JOptionPane.showInputDialog("Digite total de acerto conhecimento: gerais"));
                }catch(NumberFormatException nfe){
                    JOptionPane.showMessageDialog(JFConcurso.this, "Informe um número valido!!!");
                }
           
                if(especificos>espec || gerais>gerals){
                    JOptionPane.showMessageDialog(null, "Quantidade de acerto exede o número de questões!!\n"+"Informe numero valido" );
                }
           
            }while(especificos>espec || gerais>gerals);
           
            candidato[contCand].cadastrar(nome, idade, especificos, gerais);
            contCand++; 
           
           JOptionPane.showMessageDialog(JFConcurso.this, "Candidato cadastrado com sucesso: ");
        }else{
            JOptionPane.showMessageDialog(JFConcurso.this, "Cadastro cheio!", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
        }
        
        lblContCadCand.setText(""+contCand);
    }//GEN-LAST:event_btnCadCandActionPerformed

    private void btnCadFiscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadFiscActionPerformed
       String nome = " ";
       int idade = 0;
       char sexo;
       double valor=0;
       int flag;
       boolean valido;
       
        if(contFisc<fiscal.length){ 
            fiscal[contFisc]=new Fiscal();
            
            do{
                nome = JOptionPane.showInputDialog("Digite seu nome");
                valido=nome.matches("[A-Z][a-z]{2,}");
                
               // if(!nome.isEmpty() && nome.trim().length()>0 && valido){
               //     flag = 1;
               // }else{
               //     flag = 0;
               // }
                
            //}while(flag == 0);
            }while(valido != true);
            
            do{
                try{
                    idade = Integer.valueOf(JOptionPane.showInputDialog("Digite sua idade: "));
                }catch(NumberFormatException nfe){
                    JOptionPane.showMessageDialog(JFConcurso.this, "Informe um número valido e maior que zero ");
                }    
            }while(idade == 0);
            
            do{
                sexo = JOptionPane.showInputDialog("sexo").charAt(0);
                
            }while(sexo != 'm' && sexo != 'M' && sexo != 'f' && sexo != 'F');    
            
            do{
                try{
                    valor = Double.valueOf(JOptionPane.showInputDialog("Informe o salario"));
                }catch(NumberFormatException nfe){
                    JOptionPane.showMessageDialog(JFConcurso.this, "Informe um número valido!!");
                }    
            }while(valor < 0);
            
            fiscal[contFisc].cadastrar(nome, idade, sexo, valor);
            contFisc++;
          
        }else{
            JOptionPane.showMessageDialog(JFConcurso.this, "Cadastro cheio!", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
        }
       
        lblContCadFisc.setText(""+contFisc);
        lblCustoTotalFisc.setText(""+Fiscal.totalizarCusto(fiscal));
        lblFiscSexoMascFem.setText(""+Fiscal.participacaoPorSexo(fiscal));
    }//GEN-LAST:event_btnCadFiscActionPerformed

    private void btnExibCandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExibCandActionPerformed
        String mostrar = " Escolha um candidato \n"; 
       
        int aux, op=0;
        
        if(contCand == 0){
           JOptionPane.showMessageDialog(JFConcurso.this, "Nenhum candidato cadastrado!!");  
       }else{
           
            for(aux=0; aux<contCand; aux++){
                mostrar+= +(aux+1) + "-" +
                        candidato[aux].getNome()+
                        "\n";
            }
            mostrar+="0 - Cancelar";
            do{
                try{
                op=Integer.valueOf(JOptionPane.showInputDialog(mostrar));
                }catch(NumberFormatException nfe){
                    JOptionPane.showMessageDialog(JFConcurso.this, "Informe um número valido");
                
                op=-1;
                }
         }while(op < 0 || op > contCand);
            if(op > 0 && op <=contCand){
                JOptionPane.showMessageDialog(JFConcurso.this, candidato[op-1].exibir(espec, gerals));
              }
         }
       
       
       
    }//GEN-LAST:event_btnExibCandActionPerformed

    private void btnExibFiscalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExibFiscalActionPerformed
        String mostrar = " Escolha um fiscal \n"; 
       
        int aux, op=0;
        
        if(contFisc == 0){
           JOptionPane.showMessageDialog(JFConcurso.this, "Nenhum fiscal cadastrado!!");  
       }else{
           
            for(aux=0; aux<contFisc; aux++){
                mostrar+=  +(aux+1) + "-" +
                        fiscal[aux].getNome()+
                        "\n";
            }
            mostrar+="0 - Cancelar";
            do{
                try{
                op=Integer.valueOf(JOptionPane.showInputDialog(mostrar));
                }catch(NumberFormatException nfe){  
                    if(!nfe.getMessage().equals("null")){
                        JOptionPane.showMessageDialog(JFConcurso.this, 
                            "informe um numero valido");
                    }
                    else
                    {
                        op = 0;
                    }
                }
            }while(op < 0 || op > contFisc);
            if(op > 0 && op <=contFisc){
                JOptionPane.showMessageDialog(JFConcurso.this, fiscal[op-1].exibir());
            }
        }
        
            
    }//GEN-LAST:event_btnExibFiscalActionPerformed

    private void btnRankingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRankingActionPerformed
        if(contCand==0){
            JOptionPane.showMessageDialog(JFConcurso.this, "Nenhum candidato cadastrado!!");
        }else{
        String r = Candidato.ranking(candidato, espec, gerals);
        JOptionPane.showMessageDialog(null, r);
        }
    }//GEN-LAST:event_btnRankingActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        dispose();
    }//GEN-LAST:event_btnFecharActionPerformed

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
            java.util.logging.Logger.getLogger(JFConcurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFConcurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFConcurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFConcurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFConcurso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadCand;
    private javax.swing.JButton btnCadFisc;
    private javax.swing.JButton btnExibCand;
    private javax.swing.JButton btnExibFiscal;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnRanking;
    private javax.swing.JLabel lblCandCadastro;
    private javax.swing.JLabel lblContCadCand;
    private javax.swing.JLabel lblContCadFisc;
    private javax.swing.JLabel lblCustoFisc;
    private javax.swing.JLabel lblCustoTotalFisc;
    private javax.swing.JLabel lblEspc;
    private javax.swing.JLabel lblFiscCadastro;
    private javax.swing.JLabel lblFiscPorSexo;
    private javax.swing.JLabel lblFiscSexoMascFem;
    private javax.swing.JLabel lblGerais;
    private javax.swing.JLabel lblMaxCadCand;
    private javax.swing.JLabel lblMaxCadFisc;
    private javax.swing.JLabel lblPerguntas;
    private javax.swing.JLabel lblTotalEspc;
    private javax.swing.JLabel lblTotalGerais;
    // End of variables declaration//GEN-END:variables
}
