/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.projetoagendajpa;

import app.telasCadastro.CadastroContato;
import app.telasCadastro.CadastroTelefone;
import entidade.Contato;
import entidade.Telefone;

/**
 *
 * @author andre
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
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

        jPanel1 = new javax.swing.JPanel();
        jContato = new javax.swing.JButton();
        jTelefone = new javax.swing.JButton();
        jSair = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jMonthChooser1 = new com.toedter.calendar.JMonthChooser();
        jLocaleChooser1 = new com.toedter.components.JLocaleChooser();
        jLocaleChooser2 = new com.toedter.components.JLocaleChooser();
        jSpinField1 = new com.toedter.components.JSpinField();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jYearChooser1 = new com.toedter.calendar.JYearChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));

        jPanel1.setMinimumSize(new java.awt.Dimension(405, 50));
        jPanel1.setPreferredSize(new java.awt.Dimension(857, 50));
        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        jContato.setText("Novo Contato");
        jContato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jContatoActionPerformed(evt);
            }
        });
        jPanel1.add(jContato);

        jTelefone.setText("Novo Telefone");
        jTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTelefoneActionPerformed(evt);
            }
        });
        jPanel1.add(jTelefone);

        jSair.setText("Sair");
        jSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSairActionPerformed(evt);
            }
        });
        jPanel1.add(jSair);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.add(jCalendar1);
        jPanel2.add(jDateChooser1);
        jPanel2.add(jMonthChooser1);
        jPanel2.add(jLocaleChooser1);
        jPanel2.add(jLocaleChooser2);
        jPanel2.add(jSpinField1);

        jFormattedTextField1.setText("jFormattedTextField1");
        jPanel2.add(jFormattedTextField1);
        jPanel2.add(jYearChooser1);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSairActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jSairActionPerformed

    private void jContatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jContatoActionPerformed
        // TODO add your handling code here:
        new Listagem(Contato.class,new CadastroContato()).setVisible(true);
        
    }//GEN-LAST:event_jContatoActionPerformed

    private void jTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTelefoneActionPerformed
        // TODO add your handling code here:
        new Listagem(Telefone.class, new CadastroTelefone()).setVisible(true);
    }//GEN-LAST:event_jTelefoneActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JButton jContato;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private com.toedter.components.JLocaleChooser jLocaleChooser1;
    private com.toedter.components.JLocaleChooser jLocaleChooser2;
    private com.toedter.calendar.JMonthChooser jMonthChooser1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jSair;
    private com.toedter.components.JSpinField jSpinField1;
    private javax.swing.JButton jTelefone;
    private com.toedter.calendar.JYearChooser jYearChooser1;
    // End of variables declaration//GEN-END:variables
}
