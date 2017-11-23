/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import Hospital.formHospital;
import Hospital.formHospitalDAO;
import javax.swing.JOptionPane;

/**
 *
 * @author Brenno
 */
public class FormHospital extends javax.swing.JFrame {

    formHospital fh = new formHospital();
    formHospitalDAO hospDAO = new formHospitalDAO();
    
    public FormHospital() {
        initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        setTitle("Cadastro do Hospital");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        tfcod_muni = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        tfCnes = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        tfmotivo_Saida = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        tfHospital = new javax.swing.JTextField();
        tfrecurso = new javax.swing.JTextField();
        tfmuni_Atendimento = new javax.swing.JTextField();
        tfProf_Responsavel = new javax.swing.JTextField();
        tfcpf_Responsavel = new javax.swing.JFormattedTextField();
        tfsaida = new javax.swing.JFormattedTextField();
        tfinternacao = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        tfnome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfnum_Autorizacao = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfemissao = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tfidade = new javax.swing.JTextField();
        tfsexo = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tfmuni_Residencia = new javax.swing.JTextField();
        tfprontuario = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tfnum_Sus = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        tfdt_Nascimento = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 204));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel12.setText("Recurso");

        jLabel13.setText("Cod. Mun. At");

        tfcod_muni.setBackground(new java.awt.Color(204, 204, 204));

        jLabel14.setText("Município de atendimento");

        jLabel15.setText("Internação");

        jLabel16.setText("Saída");

        jLabel17.setText("Cnes");

        tfCnes.setBackground(new java.awt.Color(204, 204, 204));

        jLabel18.setText("Hospital");

        jLabel19.setText("Motivo da saída");

        tfmotivo_Saida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Melhoras", "Morte", "Transferido", " " }));

        jLabel20.setText("CPF Resp.");

        jLabel21.setText("Profissional responsável");

        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Voltar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        tfHospital.setBackground(new java.awt.Color(204, 204, 204));

        tfrecurso.setBackground(new java.awt.Color(204, 204, 204));

        tfmuni_Atendimento.setBackground(new java.awt.Color(204, 204, 204));

        tfProf_Responsavel.setBackground(new java.awt.Color(204, 204, 204));

        tfcpf_Responsavel.setBackground(new java.awt.Color(204, 204, 204));
        try {
            tfcpf_Responsavel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        tfsaida.setBackground(new java.awt.Color(204, 204, 204));
        try {
            tfsaida.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        tfinternacao.setBackground(new java.awt.Color(204, 204, 204));
        try {
            tfinternacao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel16)
                                        .addComponent(jLabel13)
                                        .addComponent(jLabel17))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addComponent(jLabel15)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tfCnes, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfcod_muni, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfsaida)
                                    .addComponent(tfinternacao, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfcpf_Responsavel, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(73, 73, 73)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfHospital, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel19))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfProf_Responsavel)
                                    .addComponent(tfrecurso, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                    .addComponent(tfmuni_Atendimento)
                                    .addComponent(tfmotivo_Saida, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel17)
                        .addComponent(tfCnes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfHospital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel18)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(tfcod_muni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfrecurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel14)
                    .addComponent(tfmuni_Atendimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfsaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(tfProf_Responsavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(tfinternacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel19)
                    .addComponent(tfmotivo_Saida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfcpf_Responsavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Atendimento", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setText("Nome");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 50, 20));

        tfnome.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.add(tfnome, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 460, 30));

        jLabel2.setText("N° Autorização (AIH)");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 110, -1));

        tfnum_Autorizacao.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.add(tfnum_Autorizacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, 120, -1));

        jLabel7.setText("Data de Nascimento");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 120, -1));

        jLabel3.setText("Emissão");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 50, 30));

        tfemissao.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.add(tfemissao, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 110, 30));

        jLabel8.setText("Idade");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 40, 30));

        tfidade.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.add(tfidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 110, 30));

        tfsexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino" }));
        jPanel2.add(tfsexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 110, 30));

        jLabel9.setText("Sexo");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 40, 30));

        jLabel10.setText("Município de residência");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 140, -1));

        tfmuni_Residencia.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.add(tfmuni_Residencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 120, -1));

        tfprontuario.setBackground(new java.awt.Color(204, 204, 204));
        tfprontuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfprontuarioActionPerformed(evt);
            }
        });
        jPanel2.add(tfprontuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, 120, -1));

        jLabel5.setText("Prontuário");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 60, 20));

        jLabel11.setText("Cartão SUS");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, -1, 30));

        tfnum_Sus.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.add(tfnum_Sus, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 100, 30));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel1.setText("Dados Pessoais");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, -1));

        tfdt_Nascimento.setBackground(new java.awt.Color(204, 204, 204));
        try {
            tfdt_Nascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel2.add(tfdt_Nascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, 120, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        fh.setCPF_Resp(tfcpf_Responsavel.getText());
       
        fh.setCartao_sus(Integer.parseInt(tfnum_Sus.getText()));
        fh.setCnes(tfCnes.getText());
        fh.setCod_Municipio(Integer.parseInt(tfcod_muni.getText()));
        fh.setDt_Nascimento(tfdt_Nascimento.getText());
        fh.setEmicao(tfemissao.getText());
        fh.setHospital(tfHospital.getText());
        fh.setIdade(Integer.parseInt(tfidade.getText()));
        fh.setInternacao(tfinternacao.getText());
        fh.setMotivo_Saida(tfmotivo_Saida.getSelectedItem().toString());
        fh.setMuni_Atendimento(tfmuni_Atendimento.getText());
        fh.setMuni_Residencia(tfmuni_Residencia.getText());
        fh.setNome(tfnome.getText());
        fh.setNum_Autorizacao(Integer.parseInt(tfnum_Autorizacao.getText()));
        fh.setProf_Responsavel(tfProf_Responsavel.getText());
        fh.setProntuario(tfprontuario.getText());
        fh.setRecurso(tfrecurso.getText());
        fh.setSaida(tfsaida.getText());
        fh.setSexo(tfsexo.getSelectedItem().toString());
        
        hospDAO.salvar(fh);
        JOptionPane.showMessageDialog(null, "Cadastro Realizado com Sucesso!");
        limparCampos();
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    public void limparCampos(){
    
        tfnum_Sus.setText("");
        tfCnes.setText("");
        tfcod_muni.setText("");
        tfdt_Nascimento.setText("");
        tfemissao.setText("");
        tfHospital.setText("");
        tfidade.setText("");
        tfinternacao.setText("");
        tfmuni_Atendimento.setText("");
        tfmuni_Residencia.setText("");
        tfnome.setText("");
        tfnum_Autorizacao.setText("");
        tfProf_Responsavel.setText("");
        tfprontuario.setText("");
        tfrecurso.setText("");
        tfsaida.setText("");
        
    
    }
    
    private void tfprontuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfprontuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfprontuarioActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(FormHospital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormHospital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormHospital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormHospital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormHospital().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField tfCnes;
    private javax.swing.JTextField tfHospital;
    private javax.swing.JTextField tfProf_Responsavel;
    private javax.swing.JTextField tfcod_muni;
    private javax.swing.JFormattedTextField tfcpf_Responsavel;
    private javax.swing.JFormattedTextField tfdt_Nascimento;
    private javax.swing.JTextField tfemissao;
    private javax.swing.JTextField tfidade;
    private javax.swing.JFormattedTextField tfinternacao;
    private javax.swing.JComboBox<String> tfmotivo_Saida;
    private javax.swing.JTextField tfmuni_Atendimento;
    private javax.swing.JTextField tfmuni_Residencia;
    private javax.swing.JTextField tfnome;
    private javax.swing.JTextField tfnum_Autorizacao;
    private javax.swing.JTextField tfnum_Sus;
    private javax.swing.JTextField tfprontuario;
    private javax.swing.JTextField tfrecurso;
    private javax.swing.JFormattedTextField tfsaida;
    private javax.swing.JComboBox<String> tfsexo;
    // End of variables declaration//GEN-END:variables
}
