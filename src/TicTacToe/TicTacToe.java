/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TicTacToe;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Mr.Lucky
 */

public class TicTacToe extends javax.swing.JFrame {
    private String startGame = "X";
    private int xCount = 0;
    private int oCount = 0;
    boolean checker;
    /**
     * Creates new form TicTacToe
     */
    public TicTacToe() {
        initComponents();
    }
    
    private void scoreUpdate(){
        jLblPlayerXScore.setText(String.valueOf(xCount));
        jLblPlayerOScore.setText(String.valueOf(oCount));
    }
    private void choosePlayer(){
        if(startGame.equalsIgnoreCase("X")){
            startGame = "O";
        }else{
            startGame = "X";
        }
    }
    private void winningGame(){
        String jBtnTic1Value = jBtnTic1.getText();
        String jBtnTic2Value = jBtnTic2.getText();
        String jBtnTic3Value = jBtnTic3.getText();
        String jBtnTic4Value = jBtnTic4.getText();
        String jBtnTic5Value = jBtnTic5.getText();
        String jBtnTic6Value = jBtnTic6.getText();
        String jBtnTic7Value = jBtnTic7.getText();
        String jBtnTic8Value = jBtnTic8.getText();
        String jBtnTic9Value = jBtnTic9.getText();
        //Horizontal Conditions
        if(jBtnTic1Value.equals("X") && jBtnTic2Value.equals("X") && jBtnTic3Value.equals("X")){
            
            jBtnTic1.setBackground(Color.ORANGE);
            jBtnTic2.setBackground(Color.ORANGE);
            jBtnTic3.setBackground(Color.ORANGE);
            JOptionPane.showMessageDialog(this,"Player X Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE );
            xCount++;
            scoreUpdate();
        }
        if(jBtnTic4Value.equals("X") && jBtnTic5Value.equals("X") && jBtnTic6Value.equals("X")){
            
            jBtnTic4.setBackground(Color.ORANGE);
            jBtnTic5.setBackground(Color.ORANGE);
            jBtnTic6.setBackground(Color.ORANGE);
            JOptionPane.showMessageDialog(this,"Player X Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE );
            xCount++;
            scoreUpdate();
        }
        if(jBtnTic7Value.equals("X") && jBtnTic8Value.equals("X") && jBtnTic9Value.equals("X")){
            
            jBtnTic7.setBackground(Color.ORANGE);
            jBtnTic8.setBackground(Color.ORANGE);
            jBtnTic9.setBackground(Color.ORANGE);
            JOptionPane.showMessageDialog(this,"Player X Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE );
            xCount++;
            scoreUpdate();
        }
        //Vertical Conditions
        if(jBtnTic1Value.equals("X") && jBtnTic4Value.equals("X") && jBtnTic7Value.equals("X")){
            
            jBtnTic1.setBackground(Color.ORANGE);
            jBtnTic4.setBackground(Color.ORANGE);
            jBtnTic7.setBackground(Color.ORANGE);
            JOptionPane.showMessageDialog(this,"Player X Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE );
            xCount++;
            scoreUpdate();
        }
        if(jBtnTic2Value.equals("X") && jBtnTic5Value.equals("X") && jBtnTic8Value.equals("X")){
            
            jBtnTic2.setBackground(Color.ORANGE);
            jBtnTic5.setBackground(Color.ORANGE);
            jBtnTic8.setBackground(Color.ORANGE);
            xCount++;
            scoreUpdate();
        }
        if(jBtnTic3Value.equals("X") && jBtnTic6Value.equals("X") && jBtnTic9Value.equals("X")){
            JOptionPane.showMessageDialog(this,"Player X Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE );
            jBtnTic3.setBackground(Color.ORANGE);
            jBtnTic6.setBackground(Color.ORANGE);
            jBtnTic9.setBackground(Color.ORANGE);
            JOptionPane.showMessageDialog(this,"Player X Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE );
            xCount++;
            scoreUpdate();
        }
        //Diagonal Conditions
        if(jBtnTic1Value.equals("X") && jBtnTic5Value.equals("X") && jBtnTic9Value.equals("X")){
            
            jBtnTic1.setBackground(Color.ORANGE);
            jBtnTic5.setBackground(Color.ORANGE);
            jBtnTic9.setBackground(Color.ORANGE);
            JOptionPane.showMessageDialog(this,"Player X Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE );
            xCount++;
            scoreUpdate();
        }
        if(jBtnTic3Value.equals("X") && jBtnTic5Value.equals("X") && jBtnTic7Value.equals("X")){
            
            jBtnTic3.setBackground(Color.ORANGE);
            jBtnTic5.setBackground(Color.ORANGE);
            jBtnTic7.setBackground(Color.ORANGE);
            JOptionPane.showMessageDialog(this,"Player X Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE );
            xCount++;
            scoreUpdate();
        }
        
        if(jBtnTic1Value.equals("O") && jBtnTic2Value.equals("O") && jBtnTic3Value.equals("O")){
            
            jBtnTic1.setBackground(Color.CYAN);
            jBtnTic2.setBackground(Color.CYAN);
            jBtnTic3.setBackground(Color.CYAN);
            JOptionPane.showMessageDialog(this,"Player O Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE );
            oCount++;
            scoreUpdate();
        }
        if(jBtnTic4Value.equals("O") && jBtnTic5Value.equals("O") && jBtnTic6Value.equals("O")){
            
            jBtnTic4.setBackground(Color.CYAN);
            jBtnTic5.setBackground(Color.CYAN);
            jBtnTic6.setBackground(Color.CYAN);
            JOptionPane.showMessageDialog(this,"Player O Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE );
            oCount++;
            scoreUpdate();
        }
        if(jBtnTic7Value.equals("O") && jBtnTic8Value.equals("O") && jBtnTic9Value.equals("O")){
            
            jBtnTic7.setBackground(Color.CYAN);
            jBtnTic8.setBackground(Color.CYAN);
            jBtnTic9.setBackground(Color.CYAN);
            JOptionPane.showMessageDialog(this,"Player O Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE );
            oCount++;
            scoreUpdate();
        }
        //Vertical Conditions
        if(jBtnTic1Value.equals("O") && jBtnTic4Value.equals("O") && jBtnTic7Value.equals("O")){
            
            jBtnTic1.setBackground(Color.CYAN);
            jBtnTic4.setBackground(Color.CYAN);
            jBtnTic7.setBackground(Color.CYAN);
            JOptionPane.showMessageDialog(this,"Player X Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE );
            oCount++;
            scoreUpdate();
        }
        if(jBtnTic2Value.equals("O") && jBtnTic5Value.equals("O") && jBtnTic8Value.equals("O")){
           
            jBtnTic2.setBackground(Color.CYAN);
            jBtnTic5.setBackground(Color.CYAN);
            jBtnTic8.setBackground(Color.CYAN);
            JOptionPane.showMessageDialog(this,"Player X Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE );
            oCount++;
            scoreUpdate();
        }
        if(jBtnTic3Value.equals("O") && jBtnTic6Value.equals("O") && jBtnTic9Value.equals("O")){
            
            jBtnTic3.setBackground(Color.CYAN);
            jBtnTic6.setBackground(Color.CYAN);
            jBtnTic9.setBackground(Color.CYAN);
            JOptionPane.showMessageDialog(this,"Player X Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE );
            oCount++;
            scoreUpdate();
        }
        //Diagonal Conditions
        if(jBtnTic1Value.equals("O") && jBtnTic5Value.equals("O") && jBtnTic9Value.equals("O")){
            
            jBtnTic1.setBackground(Color.CYAN);
            jBtnTic5.setBackground(Color.CYAN);
            jBtnTic9.setBackground(Color.CYAN);
            JOptionPane.showMessageDialog(this,"Player X Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE );
            oCount++;
            scoreUpdate();
        }
        if(jBtnTic3Value.equals("O") && jBtnTic5Value.equals("O") && jBtnTic7Value.equals("O")){
            
            jBtnTic3.setBackground(Color.CYAN);
            jBtnTic5.setBackground(Color.CYAN);
            jBtnTic7.setBackground(Color.CYAN);
            JOptionPane.showMessageDialog(this,"Player X Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE );
            oCount++;
            scoreUpdate();
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
        jPanel3 = new javax.swing.JPanel();
        jBtnTic3 = new javax.swing.JButton();
        jBtnTic1 = new javax.swing.JButton();
        jBtnTic2 = new javax.swing.JButton();
        jBtnTic6 = new javax.swing.JButton();
        jBtnTic5 = new javax.swing.JButton();
        jBtnTic4 = new javax.swing.JButton();
        jBtnTic8 = new javax.swing.JButton();
        jBtnTic7 = new javax.swing.JButton();
        jBtnTic9 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jBtnNewGame = new javax.swing.JButton();
        jBtnResetGame = new javax.swing.JButton();
        jBtnExitGame = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLblPlayerO = new javax.swing.JLabel();
        jLblPlayerOScore = new javax.swing.JLabel();
        jLblPlayerXScore = new javax.swing.JLabel();
        jLblPlayerX = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(95, 158, 160));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(95, 158, 160));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBtnTic3.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jBtnTic3.setMaximumSize(new java.awt.Dimension(200, 158));
        jBtnTic3.setMinimumSize(new java.awt.Dimension(200, 158));
        jBtnTic3.setPreferredSize(new java.awt.Dimension(200, 158));
        jBtnTic3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnTic3ActionPerformed(evt);
            }
        });
        jPanel3.add(jBtnTic3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, -1, -1));

        jBtnTic1.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jBtnTic1.setMaximumSize(new java.awt.Dimension(200, 158));
        jBtnTic1.setMinimumSize(new java.awt.Dimension(200, 158));
        jBtnTic1.setPreferredSize(new java.awt.Dimension(200, 158));
        jBtnTic1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnTic1ActionPerformed(evt);
            }
        });
        jPanel3.add(jBtnTic1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jBtnTic2.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jBtnTic2.setMaximumSize(new java.awt.Dimension(200, 158));
        jBtnTic2.setMinimumSize(new java.awt.Dimension(200, 158));
        jBtnTic2.setPreferredSize(new java.awt.Dimension(200, 158));
        jBtnTic2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnTic2ActionPerformed(evt);
            }
        });
        jPanel3.add(jBtnTic2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, -1));

        jBtnTic6.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jBtnTic6.setMaximumSize(new java.awt.Dimension(200, 158));
        jBtnTic6.setMinimumSize(new java.awt.Dimension(200, 158));
        jBtnTic6.setPreferredSize(new java.awt.Dimension(200, 158));
        jBtnTic6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnTic6ActionPerformed(evt);
            }
        });
        jPanel3.add(jBtnTic6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, -1, -1));

        jBtnTic5.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jBtnTic5.setMaximumSize(new java.awt.Dimension(200, 158));
        jBtnTic5.setMinimumSize(new java.awt.Dimension(200, 158));
        jBtnTic5.setPreferredSize(new java.awt.Dimension(200, 158));
        jBtnTic5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnTic5ActionPerformed(evt);
            }
        });
        jPanel3.add(jBtnTic5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, -1, -1));

        jBtnTic4.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jBtnTic4.setMaximumSize(new java.awt.Dimension(200, 158));
        jBtnTic4.setMinimumSize(new java.awt.Dimension(200, 158));
        jBtnTic4.setPreferredSize(new java.awt.Dimension(200, 158));
        jBtnTic4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnTic4ActionPerformed(evt);
            }
        });
        jPanel3.add(jBtnTic4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jBtnTic8.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jBtnTic8.setMaximumSize(new java.awt.Dimension(200, 158));
        jBtnTic8.setMinimumSize(new java.awt.Dimension(200, 158));
        jBtnTic8.setPreferredSize(new java.awt.Dimension(200, 158));
        jBtnTic8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnTic8ActionPerformed(evt);
            }
        });
        jPanel3.add(jBtnTic8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, -1, -1));

        jBtnTic7.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jBtnTic7.setMaximumSize(new java.awt.Dimension(200, 158));
        jBtnTic7.setMinimumSize(new java.awt.Dimension(200, 158));
        jBtnTic7.setPreferredSize(new java.awt.Dimension(200, 158));
        jBtnTic7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnTic7ActionPerformed(evt);
            }
        });
        jPanel3.add(jBtnTic7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        jBtnTic9.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jBtnTic9.setMaximumSize(new java.awt.Dimension(200, 158));
        jBtnTic9.setMinimumSize(new java.awt.Dimension(200, 158));
        jBtnTic9.setPreferredSize(new java.awt.Dimension(200, 158));
        jBtnTic9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnTic9ActionPerformed(evt);
            }
        });
        jPanel3.add(jBtnTic9, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 350, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 660, 520));

        jPanel5.setBackground(new java.awt.Color(95, 158, 160));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(95, 158, 160));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 10, 660, 600));

        jPanel2.setBackground(new java.awt.Color(95, 158, 160));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(95, 158, 160));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 10, 660, 600));

        jBtnNewGame.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jBtnNewGame.setText("New Game");
        jBtnNewGame.setMaximumSize(new java.awt.Dimension(200, 158));
        jBtnNewGame.setMinimumSize(new java.awt.Dimension(200, 158));
        jBtnNewGame.setPreferredSize(new java.awt.Dimension(200, 158));
        jBtnNewGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnNewGameActionPerformed(evt);
            }
        });
        jPanel2.add(jBtnNewGame, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 600, 90));

        jBtnResetGame.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jBtnResetGame.setText("Reset");
        jBtnResetGame.setMaximumSize(new java.awt.Dimension(200, 158));
        jBtnResetGame.setMinimumSize(new java.awt.Dimension(200, 158));
        jBtnResetGame.setPreferredSize(new java.awt.Dimension(200, 158));
        jBtnResetGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnResetGameActionPerformed(evt);
            }
        });
        jPanel2.add(jBtnResetGame, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 320, 90));

        jBtnExitGame.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jBtnExitGame.setText("Exit");
        jBtnExitGame.setMaximumSize(new java.awt.Dimension(200, 158));
        jBtnExitGame.setMinimumSize(new java.awt.Dimension(200, 158));
        jBtnExitGame.setPreferredSize(new java.awt.Dimension(200, 158));
        jBtnExitGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExitGameActionPerformed(evt);
            }
        });
        jPanel2.add(jBtnExitGame, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 270, 90));

        jPanel5.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 620, 210));

        jPanel7.setBackground(new java.awt.Color(95, 158, 160));
        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(95, 158, 160));
        jPanel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel7.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 10, 660, 600));

        jLblPlayerO.setFont(new java.awt.Font("Tahoma", 1, 66)); // NOI18N
        jLblPlayerO.setText("Player O:");
        jPanel7.add(jLblPlayerO, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jLblPlayerOScore.setFont(new java.awt.Font("Tahoma", 1, 66)); // NOI18N
        jLblPlayerOScore.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLblPlayerOScore.setText("0");
        jLblPlayerOScore.setToolTipText("");
        jLblPlayerOScore.setOpaque(true);
        jPanel7.add(jLblPlayerOScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 300, 80));

        jLblPlayerXScore.setFont(new java.awt.Font("Tahoma", 1, 66)); // NOI18N
        jLblPlayerXScore.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLblPlayerXScore.setText("0");
        jLblPlayerXScore.setOpaque(true);
        jPanel7.add(jLblPlayerXScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 300, 80));

        jLblPlayerX.setFont(new java.awt.Font("Tahoma", 1, 66)); // NOI18N
        jLblPlayerX.setText("Player X:");
        jPanel7.add(jLblPlayerX, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel5.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 620, 230));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 90, 660, 520));

        jPanel9.setBackground(new java.awt.Color(95, 158, 160));
        jPanel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 66)); // NOI18N
        jLabel3.setText("Tic Tac Toe");
        jPanel9.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, -1, 60));

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 1360, 80));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1400, 800));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private JFrame frame;
    private void jBtnExitGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExitGameActionPerformed
        // TODO add your handling code here:
        frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame,"Do you want to Exit?","Tic Tac Toe",
                JOptionPane.YES_NO_OPTION )== JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_jBtnExitGameActionPerformed

    private void jBtnResetGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnResetGameActionPerformed
        // TODO add your handling code here:
        jBtnTic1.setEnabled(true);
        jBtnTic2.setEnabled(true);
        jBtnTic3.setEnabled(true);
        jBtnTic4.setEnabled(true);
        jBtnTic5.setEnabled(true);
        jBtnTic6.setEnabled(true);
        jBtnTic7.setEnabled(true);
        jBtnTic8.setEnabled(true);
        jBtnTic9.setEnabled(true);
        
        jBtnTic1.setText("");
        jBtnTic2.setText("");
        jBtnTic3.setText("");
        jBtnTic4.setText("");
        jBtnTic5.setText("");
        jBtnTic6.setText("");
        jBtnTic7.setText("");
        jBtnTic8.setText("");
        jBtnTic9.setText("");
        
        jBtnTic1.setBackground(Color.LIGHT_GRAY);
        jBtnTic2.setBackground(Color.LIGHT_GRAY);
        jBtnTic3.setBackground(Color.LIGHT_GRAY);
        jBtnTic4.setBackground(Color.LIGHT_GRAY);
        jBtnTic5.setBackground(Color.LIGHT_GRAY);
        jBtnTic6.setBackground(Color.LIGHT_GRAY);
        jBtnTic7.setBackground(Color.LIGHT_GRAY);
        jBtnTic8.setBackground(Color.LIGHT_GRAY);
        jBtnTic9.setBackground(Color.LIGHT_GRAY);
        
    }//GEN-LAST:event_jBtnResetGameActionPerformed

    private void jBtnTic3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnTic3ActionPerformed
        // TODO add your handling code here:
        jBtnTic3.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
            checker = false;
        }else{
            checker = true;
        }
        choosePlayer();
        winningGame();
    }//GEN-LAST:event_jBtnTic3ActionPerformed

    private void jBtnNewGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnNewGameActionPerformed
        // TODO add your handling code here:
        jBtnTic1.setEnabled(true);
        jBtnTic2.setEnabled(true);
        jBtnTic3.setEnabled(true);
        jBtnTic4.setEnabled(true);
        jBtnTic5.setEnabled(true);
        jBtnTic6.setEnabled(true);
        jBtnTic7.setEnabled(true);
        jBtnTic8.setEnabled(true);
        jBtnTic9.setEnabled(true);
        
        jBtnTic1.setText("");
        jBtnTic2.setText("");
        jBtnTic3.setText("");
        jBtnTic4.setText("");
        jBtnTic5.setText("");
        jBtnTic6.setText("");
        jBtnTic7.setText("");
        jBtnTic8.setText("");
        jBtnTic9.setText("");
        
        jBtnTic1.setBackground(Color.LIGHT_GRAY);
        jBtnTic2.setBackground(Color.LIGHT_GRAY);
        jBtnTic3.setBackground(Color.LIGHT_GRAY);
        jBtnTic4.setBackground(Color.LIGHT_GRAY);
        jBtnTic5.setBackground(Color.LIGHT_GRAY);
        jBtnTic6.setBackground(Color.LIGHT_GRAY);
        jBtnTic7.setBackground(Color.LIGHT_GRAY);
        jBtnTic8.setBackground(Color.LIGHT_GRAY);
        jBtnTic9.setBackground(Color.LIGHT_GRAY);
        
        jLblPlayerXScore.setText("0");
        jLblPlayerOScore.setText("0");
    }//GEN-LAST:event_jBtnNewGameActionPerformed

    private void jBtnTic1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnTic1ActionPerformed
        // TODO add your handling code here:
        jBtnTic1.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
            checker = false;
        }else{
            checker = true;
        }
        choosePlayer();
        winningGame();
    }//GEN-LAST:event_jBtnTic1ActionPerformed

    private void jBtnTic2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnTic2ActionPerformed
        // TODO add your handling code here:
        jBtnTic2.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
            checker = false;
        }else{
            checker = true;
        }
        choosePlayer();
        winningGame();
    }//GEN-LAST:event_jBtnTic2ActionPerformed

    private void jBtnTic4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnTic4ActionPerformed
        // TODO add your handling code here:
        jBtnTic4.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
            checker = false;
        }else{
            checker = true;
        }
        choosePlayer();
        winningGame();
    }//GEN-LAST:event_jBtnTic4ActionPerformed

    private void jBtnTic5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnTic5ActionPerformed
        // TODO add your handling code here:
        jBtnTic5.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
            checker = false;
        }else{
            checker = true;
        }
        choosePlayer();
        winningGame();
    }//GEN-LAST:event_jBtnTic5ActionPerformed

    private void jBtnTic6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnTic6ActionPerformed
        // TODO add your handling code here:
        jBtnTic6.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
            checker = false;
        }else{
            checker = true;
        }
        choosePlayer();
        winningGame();
    }//GEN-LAST:event_jBtnTic6ActionPerformed

    private void jBtnTic7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnTic7ActionPerformed
        // TODO add your handling code here:
        jBtnTic7.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
            checker = false;
        }else{
            checker = true;
        }
        choosePlayer();
        winningGame();
    }//GEN-LAST:event_jBtnTic7ActionPerformed

    private void jBtnTic8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnTic8ActionPerformed
        // TODO add your handling code here:
        jBtnTic8.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
            checker = false;
        }else{
            checker = true;
        }
        choosePlayer();
        winningGame();
    }//GEN-LAST:event_jBtnTic8ActionPerformed

    private void jBtnTic9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnTic9ActionPerformed
        // TODO add your handling code here:
        jBtnTic9.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
            checker = false;
        }else{
            checker = true;
        }
        choosePlayer();
        winningGame();
    }//GEN-LAST:event_jBtnTic9ActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TicTacToe().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnExitGame;
    private javax.swing.JButton jBtnNewGame;
    private javax.swing.JButton jBtnResetGame;
    private javax.swing.JButton jBtnTic1;
    private javax.swing.JButton jBtnTic2;
    private javax.swing.JButton jBtnTic3;
    private javax.swing.JButton jBtnTic4;
    private javax.swing.JButton jBtnTic5;
    private javax.swing.JButton jBtnTic6;
    private javax.swing.JButton jBtnTic7;
    private javax.swing.JButton jBtnTic8;
    private javax.swing.JButton jBtnTic9;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLblPlayerO;
    private javax.swing.JLabel jLblPlayerOScore;
    private javax.swing.JLabel jLblPlayerX;
    private javax.swing.JLabel jLblPlayerXScore;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    // End of variables declaration//GEN-END:variables
}
