/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import Usuario.Usuario;

/**
 *
 * @author jonat
 */
public class MenuPrincipal extends javax.swing.JFrame {

    Usuario usuario = new Usuario();
    CadastroUsuario cdu = new CadastroUsuario();

    /**
     * Creates new form caps
     */
    public MenuPrincipal(Usuario usuario) {
        initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        setTitle("Menu Principal");
        setSize(635, 595);
        
        this.usuario = usuario;
        jlUsuario.setText("Bem vindo " + usuario.getNome() + "!!");
        btAtendimento.setEnabled(false);
        btHospital.setEnabled(false);
        btCadUsuario.setEnabled(false);
        permissoes();

    }

    public void permissoes() {
        if (usuario.getFuncao().equals("Hospital")) {
            
            btHospital.setEnabled(true);

        } else if (usuario.getFuncao().equals("Caps")) {

            btAtendimento.setEnabled(true);
        }
        
        
        else if(usuario.getFuncao().equals("Administrador")){
          btCadUsuario.setEnabled(true);
          btGeral.setEnabled(true);
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

        jPanel1 = new javax.swing.JPanel();
        jlUsuario = new javax.swing.JLabel();
        btHospital = new javax.swing.JButton();
        btCadUsuario = new javax.swing.JButton();
        btGeral = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btAtendimento = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlUsuario.setBackground(new java.awt.Color(0, 0, 0));
        jlUsuario.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jlUsuario.setText("??");
        jPanel1.add(jlUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 590, 26));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 620, 30);

        btHospital.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/img/Hospital.jpg"))); // NOI18N
        btHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHospitalActionPerformed(evt);
            }
        });
        getContentPane().add(btHospital);
        btHospital.setBounds(470, 200, 90, 100);

        btCadUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/img/Cadastrar.jpg"))); // NOI18N
        btCadUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(btCadUsuario);
        btCadUsuario.setBounds(180, 40, 80, 90);

        btGeral.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/img/formGeral.jpg"))); // NOI18N
        btGeral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGeralActionPerformed(evt);
            }
        });
        getContentPane().add(btGeral);
        btGeral.setBounds(380, 40, 70, 80);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/img/pesquisar.jpg"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(60, 210, 100, 80);

        btAtendimento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/img/caps.jpg"))); // NOI18N
        btAtendimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtendimentoActionPerformed(evt);
            }
        });
        getContentPane().add(btAtendimento);
        btAtendimento.setBounds(400, 420, 100, 60);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/img/Sair.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(180, 420, 90, 80);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/img/menu.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 30, 620, 500);
        getContentPane().add(jPanel2);
        jPanel2.setBounds(50, -10, 10, 10);

        jMenu1.setText("Sobre");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ajuda");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btGeralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGeralActionPerformed

        FormGeral fp = new FormGeral();
        fp.setVisible(true);
    }//GEN-LAST:event_btGeralActionPerformed

    private void btAtendimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtendimentoActionPerformed

        FormCaps caps = new FormCaps();
        caps.setVisible(true);
    }//GEN-LAST:event_btAtendimentoActionPerformed

    private void btHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHospitalActionPerformed
        
        FormHospital fh = new FormHospital();
        fh.setVisible(true);
    }//GEN-LAST:event_btHospitalActionPerformed

    private void btCadUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadUsuarioActionPerformed
        
        CadastroUsuario cdu = new CadastroUsuario();
        
        cdu.setVisible(true);
        
    }//GEN-LAST:event_btCadUsuarioActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Login lg = new Login();
        lg.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       ConsultarCasos cc = new ConsultarCasos();
       cc.setVisible(true);
      
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAtendimento;
    private javax.swing.JButton btCadUsuario;
    private javax.swing.JButton btGeral;
    private javax.swing.JButton btHospital;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jlUsuario;
    // End of variables declaration//GEN-END:variables
}