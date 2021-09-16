/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.loja.telas;

import java.text.DateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
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

        Desktop = new javax.swing.JDesktopPane();
        lblUsuario = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        Menu = new javax.swing.JMenuBar();
        MenuCadastro = new javax.swing.JMenu();
        MenuCadastroCliente = new javax.swing.JMenuItem();
        MenuCadastroOS = new javax.swing.JMenuItem();
        MenuCadastroUsuarios = new javax.swing.JMenuItem();
        MenuRelatorio = new javax.swing.JMenu();
        MenuRelatorioServicos = new javax.swing.JMenuItem();
        MenuAjuda = new javax.swing.JMenu();
        MenuAjudaSobre = new javax.swing.JMenuItem();
        MenuOpcoes = new javax.swing.JMenu();
        MenuOpcoesSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        Desktop.setPreferredSize(new java.awt.Dimension(420, 420));

        javax.swing.GroupLayout DesktopLayout = new javax.swing.GroupLayout(Desktop);
        Desktop.setLayout(DesktopLayout);
        DesktopLayout.setHorizontalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );
        DesktopLayout.setVerticalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );

        lblUsuario.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        lblUsuario.setText("Usuário");

        lblData.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        lblData.setText("Data");

        MenuCadastro.setText("Cadastro");

        MenuCadastroCliente.setText("Cliente");
        MenuCadastro.add(MenuCadastroCliente);

        MenuCadastroOS.setText("OS");
        MenuCadastroOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCadastroOSActionPerformed(evt);
            }
        });
        MenuCadastro.add(MenuCadastroOS);

        MenuCadastroUsuarios.setText("Usuários");
        MenuCadastroUsuarios.setEnabled(false);
        MenuCadastroUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCadastroUsuariosActionPerformed(evt);
            }
        });
        MenuCadastro.add(MenuCadastroUsuarios);

        Menu.add(MenuCadastro);

        MenuRelatorio.setText("Relatório");
        MenuRelatorio.setEnabled(false);

        MenuRelatorioServicos.setText("Serviços");
        MenuRelatorio.add(MenuRelatorioServicos);

        Menu.add(MenuRelatorio);

        MenuAjuda.setText("Ajuda");

        MenuAjudaSobre.setText("Sobre");
        MenuAjudaSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAjudaSobreActionPerformed(evt);
            }
        });
        MenuAjuda.add(MenuAjudaSobre);

        Menu.add(MenuAjuda);

        MenuOpcoes.setText("Opções");

        MenuOpcoesSair.setText("Sair");
        MenuOpcoesSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuOpcoesSairActionPerformed(evt);
            }
        });
        MenuOpcoes.add(MenuOpcoesSair);

        Menu.add(MenuOpcoes);

        setJMenuBar(Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Desktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUsuario)
                    .addComponent(lblData))
                .addGap(0, 160, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lblUsuario)
                .addGap(18, 18, 18)
                .addComponent(lblData)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(Desktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MenuCadastroOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCadastroOSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuCadastroOSActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        Date data = new Date();
        DateFormat formatador = DateFormat.getDateInstance(DateFormat.SHORT);
        lblData.setText(formatador.format(data));
        
    }//GEN-LAST:event_formWindowActivated

    private void MenuOpcoesSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuOpcoesSairActionPerformed
        int sair = JOptionPane.showConfirmDialog(null, "Tem certeza qe deseja sair?","Atenção",JOptionPane.YES_NO_OPTION);
        if (sair ==JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_MenuOpcoesSairActionPerformed

    private void MenuAjudaSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAjudaSobreActionPerformed
        TelaSobre sobre = new TelaSobre();
        sobre.setVisible(true);
        
    }//GEN-LAST:event_MenuAjudaSobreActionPerformed

    private void MenuCadastroUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCadastroUsuariosActionPerformed
        TelaUsuarios usuarios = new TelaUsuarios();
        usuarios.setVisible(true);
        Desktop.add(usuarios);
        
    }//GEN-LAST:event_MenuCadastroUsuariosActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Desktop;
    private javax.swing.JMenuBar Menu;
    private javax.swing.JMenu MenuAjuda;
    private javax.swing.JMenuItem MenuAjudaSobre;
    private javax.swing.JMenu MenuCadastro;
    private javax.swing.JMenuItem MenuCadastroCliente;
    private javax.swing.JMenuItem MenuCadastroOS;
    public static javax.swing.JMenuItem MenuCadastroUsuarios;
    private javax.swing.JMenu MenuOpcoes;
    private javax.swing.JMenuItem MenuOpcoesSair;
    public static javax.swing.JMenu MenuRelatorio;
    private javax.swing.JMenuItem MenuRelatorioServicos;
    private javax.swing.JLabel lblData;
    public static javax.swing.JLabel lblUsuario;
    // End of variables declaration//GEN-END:variables
}
