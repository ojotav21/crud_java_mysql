/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.loja.telas;
    
import java.sql.*;
import br.com.loja.dal.ModuloConexao;
import javax.swing.JOptionPane;
/**
 *
 * @author usuario
 */
public class TelaUsuarios extends javax.swing.JInternalFrame {

        Connection conexao = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
    public TelaUsuarios() {
        initComponents();
        conexao = ModuloConexao.conector();
    }
    
    private void consultar(){
        String sql = "SELECT * FROM usuarios WHERE iduser=?";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1,txtId.getText());
            rs=pst.executeQuery();
            
            
            if(rs.next()){
            txtNome.setText(rs.getString(2));
            txtTelefone.setText(rs.getString(3));
            txtLogin.setText(rs.getString(4));
            txtSenha.setText(rs.getString(5));
            comboPerfil.setSelectedItem(rs.getString(6));
     
            }else{
                JOptionPane.showMessageDialog(null,"Usuário não cadastrado");
                txtNome.setText(null);
                txtSenha.setText(null);
                txtTelefone.setText(null);
                txtLogin.setText(null);
                
            
            }
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erro" + e);

        }
    
    
    }
    private void adicionar(){
        String sql = "INSERT INTO usuarios(iduser, usuario, fone, login, senha, perfil) VALUES(?, ?, ?, ?, ?, ?)";
        
        //        String sql2= "SELECT * usuarios WHERE login =?";

        //        try {
        //            pst= conexao.prepareStatement(sql2); //Prepara a consulta
        //            pst.setString(1, txtLogin.getText()); //Set os valores para as variaveis 
        //            rs = pst.executeQuery();//Executa a query
        //            
        //            if(rs == 1){
        //            
        //            }
        //        }catch(Exception e){
        //            JOptionPane.showMessageDialog(null,"Erro" + e);
        //        }

        try {
            pst=conexao.prepareStatement(sql);
            pst.setString(1, txtId.getText());
            pst.setString(2, txtNome.getText());
            pst.setString(3, txtTelefone.getText());
            pst.setString(4, txtLogin.getText());
            String captura = new String(txtSenha.getPassword());
            pst.setString(5, captura);
            pst.setString(6, comboPerfil.getSelectedItem().toString());
            
            if (txtId.getText().isEmpty() ||txtNome.getText().isEmpty() ||txtTelefone.getText().isEmpty() ||txtLogin.getText().isEmpty() || txtSenha.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos antes de fazer uma adição de usuário");
            } else {
                int result = pst.executeUpdate();
                if(result ==1){
                    JOptionPane.showMessageDialog(null, "Usuário adicionado com sucesso!");
                    txtNome.setText(null);
                    txtSenha.setText(null);
                    txtTelefone.setText(null);
                    txtLogin.setText(null);
                
                }
            }
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erro" + e);
        }
     
     
    }
    private void atualizar(){
        String sql = "UPDATE usuarios SET usuario=?, fone =?, login=?, senha=?, perfil=? WHERE iduser=? ";
        try {
            pst=conexao.prepareStatement(sql);
            pst.setString(1, txtNome.getText());
            pst.setString(2, txtTelefone.getText());
            pst.setString(3, txtLogin.getText());
            String captura = new String(txtSenha.getPassword());
            pst.setString(4, captura);
            pst.setString(5, comboPerfil.getSelectedItem().toString());
            pst.setString(6, txtId.getText());
            
            if (txtId.getText().isEmpty() ||txtNome.getText().isEmpty() ||txtTelefone.getText().isEmpty() ||txtLogin.getText().isEmpty() || txtSenha.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos antes de fazer uma alteração");
            } else {
                int result = pst.executeUpdate();
                if(result ==1){
                    JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!");
                    txtNome.setText(null);
                    txtSenha.setText(null);
                    txtTelefone.setText(null);
                    txtLogin.setText(null);
                
                }
            }
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erro" + e);
        }
     
     
    }
    private void deletar (){
        //Confirmação via JOptionPane
        int confirma = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja deletar?", "Atenção", JOptionPane.YES_NO_OPTION);
        if(confirma == JOptionPane.YES_NO_OPTION){
             String sql = "DELETE FROM usuarios WHERE iduser =?";
             try {
                pst = conexao.prepareStatement(sql);
                pst.setString(1, txtId.getText());
                int apagado = pst.executeUpdate();
                if(apagado >0){
                    JOptionPane.showMessageDialog(null, "Usuário apagado com sucesso!");
                    txtId.setText(null);
                    txtNome.setText(null);
                    txtSenha.setText(null);
                    txtTelefone.setText(null);
                    txtLogin.setText(null);
                }
                        
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "O Erro foi: "+ e);
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

        lblIdUser = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblTel = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        lblLogin = new javax.swing.JLabel();
        lblPerfil = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        txtTelefone = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtLogin = new javax.swing.JTextField();
        comboPerfil = new javax.swing.JComboBox<>();
        btnSelecionar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnApagar = new javax.swing.JButton();
        btnAdicionar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Cadastro de Usuários");
        setPreferredSize(new java.awt.Dimension(400, 400));

        lblIdUser.setText("ID Usuário");

        lblNome.setText("Nome");

        lblTel.setText("Telefone");

        lblSenha.setText("Senha");

        lblLogin.setText("Login");

        lblPerfil.setText("Perfil");

        comboPerfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "admin", "user" }));
        comboPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboPerfilActionPerformed(evt);
            }
        });

        btnSelecionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/loja/icones/read.png"))); // NOI18N
        btnSelecionar.setToolTipText("Selecionar");
        btnSelecionar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSelecionar.setPreferredSize(new java.awt.Dimension(80, 80));
        btnSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionarActionPerformed(evt);
            }
        });

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/loja/icones/update.png"))); // NOI18N
        btnAlterar.setToolTipText("Alterar");
        btnAlterar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAlterar.setPreferredSize(new java.awt.Dimension(80, 80));
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnApagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/loja/icones/delete.png"))); // NOI18N
        btnApagar.setToolTipText("Apagar");
        btnApagar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnApagar.setPreferredSize(new java.awt.Dimension(80, 80));
        btnApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApagarActionPerformed(evt);
            }
        });

        btnAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/loja/icones/create.png"))); // NOI18N
        btnAdicionar.setToolTipText("Adicionar");
        btnAdicionar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdicionar.setPreferredSize(new java.awt.Dimension(80, 80));
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIdUser)
                    .addComponent(lblSenha)
                    .addComponent(lblTel)
                    .addComponent(lblNome)
                    .addComponent(lblLogin)
                    .addComponent(lblPerfil))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSenha)
                    .addComponent(txtLogin)
                    .addComponent(txtNome)
                    .addComponent(txtTelefone)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(comboPerfil, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(75, 75, 75))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSelecionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnApagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdUser)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTel)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSenha)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLogin)
                    .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPerfil)
                    .addComponent(comboPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSelecionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnApagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboPerfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboPerfilActionPerformed

    private void btnSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionarActionPerformed
       consultar();
    }//GEN-LAST:event_btnSelecionarActionPerformed

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
       adicionar();
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
       atualizar();
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApagarActionPerformed
        deletar();
    }//GEN-LAST:event_btnApagarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnApagar;
    private javax.swing.JButton btnSelecionar;
    private javax.swing.JComboBox<String> comboPerfil;
    private javax.swing.JLabel lblIdUser;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPerfil;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblTel;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
