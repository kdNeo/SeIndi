/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import VALIDATE.Validation;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Kaveesha Nadun
 */
public class logss extends javax.swing.JFrame {
     int count = 0;

    /**
     * Creates new form log
     */
    public logss() {
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
        jPanel2 = new javax.swing.JPanel();
        un = new javax.swing.JTextField();
        pw = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton7 = new javax.swing.JButton();
        jLabel_inven1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel23 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(21, 25, 28));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        un.setBackground(new java.awt.Color(31, 36, 42));
        un.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        un.setForeground(new java.awt.Color(255, 255, 255));
        un.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 224, 49)));
        un.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                unMouseMoved(evt);
            }
        });
        un.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                unKeyTyped(evt);
            }
        });
        jPanel2.add(un, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 260, 40));

        pw.setBackground(new java.awt.Color(31, 36, 42));
        pw.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        pw.setForeground(new java.awt.Color(255, 255, 255));
        pw.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 224, 49)));
        pw.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pwKeyTyped(evt);
            }
        });
        jPanel2.add(pw, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 305, 260, 40));
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, -1, -1));

        jButton2.setToolTipText("Twitter");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, 28));

        jButton3.setToolTipText("Facebook");
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 11, -1, 28));

        jButton4.setToolTipText("Instagram");
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 11, -1, 28));

        jButton5.setToolTipText("Email");
        jButton5.setBorder(null);
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 11, -1, 28));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(169, 224, 49));
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, 45));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(169, 224, 49));
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, 45));

        jLabel19.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(169, 224, 49));
        jLabel19.setText("Username");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 70, -1));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 172, 150, 0));

        jButton7.setBackground(new java.awt.Color(152, 201, 45));
        jButton7.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(21, 25, 28));
        jButton7.setText("Reset");
        jButton7.setBorder(null);
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.setFocusPainted(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 480, 110, 40));

        jLabel_inven1.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel_inven1.setForeground(new java.awt.Color(169, 224, 49));
        jLabel_inven1.setText("Connect with us on");
        jPanel2.add(jLabel_inven1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 120, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_User_Shield_100px.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 90, 90));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_Facebook_32px_2.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 30, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_Instagram_32px.png"))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 30, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_YouTube_32px.png"))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_Twitter_32px.png"))); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 30, 30));
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 20, 30));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_Minus_32px_1.png"))); // NOI18N
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 30, 30));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_Cancel_32px.png"))); // NOI18N
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 30, 30));

        jLabel22.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(169, 224, 49));
        jLabel22.setText("Forgot Password?");
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, -1, -1));

        jButton8.setBackground(new java.awt.Color(152, 201, 45));
        jButton8.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jButton8.setForeground(new java.awt.Color(21, 25, 28));
        jButton8.setText("Sign In");
        jButton8.setBorder(null);
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton8.setFocusPainted(false);
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 420, 110, 40));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_Secured_Letter_32px.png"))); // NOI18N
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, 30));

        jCheckBox1.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, 20, 20));

        jLabel23.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(169, 224, 49));
        jLabel23.setText("Password");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 70, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 550));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void unMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_unMouseMoved

    }//GEN-LAST:event_unMouseMoved

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
            un.setText(null);
            pw.setText(null);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        this.setState(ICONIFIED);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if (jCheckBox1.isSelected()) {
           pw.setEchoChar((char) 0);
        } else {
            pw.setEchoChar('*');

        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void unKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_unKeyTyped
    
        Validation.checkLength(evt,un.getText(),15);
    }//GEN-LAST:event_unKeyTyped

    private void pwKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pwKeyTyped
     
        Validation.checkLength(evt,pw.getText(),15);
    }//GEN-LAST:event_pwKeyTyped

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
       String username = un.getText();
        String password = pw.getText();
        //String type = (String) typ.getSelectedItem();
        JOptionPane jp = new JOptionPane();
        try {
            ResultSet rs = DB.DB.search("SELECT * FROM login WHERE username = '" + username + "' AND password='" + password + "'");
            if (rs.next()) {
                if (username.equals(rs.getString("username")) && password.equals(rs.getString("password"))) {
                     jp.showMessageDialog(this, "Loged in");
                    this.dispose();
                    
                    MenuForm f=new MenuForm();
                    f.setVisible(true);
                    this.dispose();
                   
                   // forgot_password fw = new forgot_password();
                    //fw.setVisible(true);
                   
                }
            } else {

                jp.showMessageDialog(this, "Login Fail");
                System.out.println("");
                count = count + 1;
                if (count == 3) {
                    jp.showMessageDialog(this, "You Are Lockedout");
                    un.setEditable(false);
                    pw.setEditable(false);
                    //typ.setEnabled(false);
                    count = 0;

                    int YesOrNo = JOptionPane.showConfirmDialog(null, "Do You Want To Reset?", "Done", JOptionPane.YES_NO_OPTION);
                    if (YesOrNo == 0) {
                        un.setEditable(true);
                        pw.setEditable(true);
                       // typ.setEnabled(true);
                    } else {
                        this.dispose();
                    }

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton8MouseClicked

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
       Forgot_password fs=new Forgot_password();
       fs.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jLabel22MouseClicked

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
            java.util.logging.Logger.getLogger(log.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(log.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(log.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(log.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new logss().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_inven1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPasswordField pw;
    private javax.swing.JTextField un;
    // End of variables declaration//GEN-END:variables
}