/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.model.TipoOperacao;
import javax.swing.JOptionPane;

/**
 *
 * @author 22282112
 */
public class EspecialidadesPanel extends javax.swing.JPanel {

    private static int getSelectedRow() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * Creates new form EspecialidadesPanel
     */
    public EspecialidadesPanel() {
        criarTabelaEspecialidades();
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

        jLabel3 = new javax.swing.JLabel();
        scrollTableEspecialidades = new javax.swing.JScrollPane();
        tablePlanosDeSaude = new javax.swing.JTable();
        buttonExcluirEspecialidades = new javax.swing.JButton();
        buttonAlterarEspecialidades = new javax.swing.JButton();
        buttonAdicionarEspecialidades = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setLayout(null);

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel3.setText("Especialidades");
        add(jLabel3);
        jLabel3.setBounds(20, 10, 180, 20);

        tablePlanosDeSaude.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        scrollTableEspecialidades.setViewportView(tablePlanosDeSaude);

        add(scrollTableEspecialidades);
        scrollTableEspecialidades.setBounds(20, 40, 905, 240);

        buttonExcluirEspecialidades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/excluir_1.png"))); // NOI18N
        buttonExcluirEspecialidades.setToolTipText("Excluir plano de saúde selecionado");
        buttonExcluirEspecialidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirEspecialidadesActionPerformed(evt);
            }
        });
        add(buttonExcluirEspecialidades);
        buttonExcluirEspecialidades.setBounds(700, 294, 70, 60);

        buttonAlterarEspecialidades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/editar.png"))); // NOI18N
        buttonAlterarEspecialidades.setToolTipText("Editar plano de saúde selecionado");
        buttonAlterarEspecialidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAlterarEspecialidadesActionPerformed(evt);
            }
        });
        add(buttonAlterarEspecialidades);
        buttonAlterarEspecialidades.setBounds(780, 294, 70, 60);

        buttonAdicionarEspecialidades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/adicionar-botao.png"))); // NOI18N
        buttonAdicionarEspecialidades.setToolTipText("Adicionar plano de saúde");
        buttonAdicionarEspecialidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdicionarEspecialidadesActionPerformed(evt);
            }
        });
        add(buttonAdicionarEspecialidades);
        buttonAdicionarEspecialidades.setBounds(860, 294, 70, 60);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonExcluirEspecialidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirEspecialidadesActionPerformed
        // Obtemos o índice da linha selecionada na tabela
        int linha = EspecialidadesPanel.getSelectedRow();

        // Verificamos se a linha é diferente de -1
        //
        if (linha != -1) {
            excluir();
            // Excluir Especialidade

        } else {
            JOptionPane.showMessageDialog(
                this,
                "Por favor, selecione a Especialidade que deseja excluir!",
                "Especialidades",
                JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_buttonExcluirEspecialidadesActionPerformed

    private void buttonAlterarEspecialidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAlterarEspecialidadesActionPerformed

        int linha = EspecialidadesPanel.getSelectedRow();

        if (linha != -1) {
            editar();
        } else {
            JOptionPane.showMessageDialog(this,
                "Por Favor, selecione um plano de saúde para alterar.",
                "Planos de Saúde",
                JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_buttonAlterarEspecialidadesActionPerformed

    private void buttonAdicionarEspecialidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarEspecialidadesActionPerformed

        PlanosDeSaudeDialog planosDeSaudeDialog = new PlanosDeSaudeDialog(null, true, TipoOperacao.ADICIONAR, null);
        planosDeSaudeDialog.setVisible(true);

        criarTabelaEspecialidades();
    }//GEN-LAST:event_buttonAdicionarEspecialidadesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdicionarEspecialidades;
    private javax.swing.JButton buttonAlterarEspecialidades;
    private javax.swing.JButton buttonExcluirEspecialidades;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane scrollTableEspecialidades;
    private javax.swing.JTable tablePlanosDeSaude;
    // End of variables declaration//GEN-END:variables

    private void excluir() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void editar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void criarTabelaEspecialidades() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
