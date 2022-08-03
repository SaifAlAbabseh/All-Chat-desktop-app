/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package all_chat;

import java.awt.Color;
import java.awt.Desktop;
import java.sql.Statement;
import java.net.URI;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;

/**
 *
 * @author sabab
 */
public class loginScreen extends javax.swing.JFrame {

    /**
     * Creates new form loginScreen
     */
	private void setIcon() {
		setIconImage(new ImageIcon(getClass().getResource("icon.png")).getImage());
	}
    int tempFocused1 = 1;
    int tempFocused2 = 1;
    int tempLastText1 = 1;
    int tempLastText2 = 1;

    public loginScreen() {
        initComponents();
        setLocationRelativeTo(null);
        setIcon();
        jPasswordField1.setEchoChar('\u0000');
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
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 3));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setMaximumSize(new java.awt.Dimension(643, 60));
        jPanel2.setMinimumSize(new java.awt.Dimension(643, 60));
        jPanel2.setPreferredSize(new java.awt.Dimension(643, 60));

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        jLabel5.setBackground(new java.awt.Color(102, 102, 102));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("_");
        jLabel5.setToolTipText("");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.setOpaque(true);
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimize(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                hoverOnTopLabels(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitOnTopLabels(evt);
            }
        });
        jPanel3.add(jLabel5);

        jLabel6.setBackground(new java.awt.Color(102, 102, 102));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("X");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.setOpaque(true);
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exit(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                hoverOnTopLabels(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitOnTopLabels(evt);
            }
        });
        jPanel3.add(jLabel6);

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                goToLink(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                hoverEffectOnLink(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                outEffectOnLink(evt);
            }
        });
        jPanel4.setLayout(new java.awt.GridLayout(1, 0));

        jLabel3.setFont(new java.awt.Font("Pristina", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("All");
        jPanel4.add(jLabel3);

        jLabel1.setFont(new java.awt.Font("Pristina", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Chat");
        jPanel4.add(jLabel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 377, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextField1.setForeground(java.awt.Color.blue);
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Username");
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.blue, 2));
        jTextField1.setFocusable(false);
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fieldFocus(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                lostFocusField(evt);
            }
        });
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                enterField(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fieldTyped(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("LOGIN");
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusable(false);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginButtonHover(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginButtonOut(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login(evt);
            }
        });

        jPasswordField1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPasswordField1.setForeground(java.awt.Color.blue);
        jPasswordField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPasswordField1.setText("Password");
        jPasswordField1.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.blue, 2));
        jPasswordField1.setFocusable(false);
        jPasswordField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fieldFocus(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                lostFocusField(evt);
            }
        });
        jPasswordField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                enterField(evt);
            }
        });
        jPasswordField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fieldTyped(evt);
            }
        });

        jCheckBox1.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jCheckBox1.setForeground(java.awt.Color.red);
        jCheckBox1.setText("Show");
        jCheckBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox1.setFocusable(false);
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPassword(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(java.awt.Color.gray);
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Don't have an account?");

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setForeground(java.awt.Color.red);
        jButton2.setText("<html><u>Sign Up</u></html>");
        jButton2.setBorder(null);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                linkToSUHover(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                linkToSUExit(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goToSU(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 658, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPasswordField1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(140, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void goToLink(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goToLink
        try {
            Desktop.getDesktop().browse(new URI("http://allchat.lovestoblog.com/"));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "" + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_goToLink

    private void hoverEffectOnLink(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hoverEffectOnLink
        // TODO add your handling code here:
        jPanel4.setBackground(Color.white);
    }//GEN-LAST:event_hoverEffectOnLink

    private void outEffectOnLink(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_outEffectOnLink
        // TODO add your handling code here:
        jPanel4.setBackground(new Color(51, 51, 51));
    }//GEN-LAST:event_outEffectOnLink

    private void hoverOnTopLabels(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hoverOnTopLabels
        // TODO add your handling code here:
        JLabel temp = (JLabel) evt.getSource();
        temp.setBackground(Color.red);
    }//GEN-LAST:event_hoverOnTopLabels

    private void exitOnTopLabels(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitOnTopLabels
        // TODO add your handling code here:
        JLabel temp = (JLabel) evt.getSource();
        temp.setBackground(new Color(102, 102, 102));
    }//GEN-LAST:event_exitOnTopLabels

    private void exit(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exit

    private void minimize(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimize
        // TODO add your handling code here:
        setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimize

    private void loginButtonHover(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonHover
        // TODO add your handling code here:
        jButton1.setBackground(Color.BLUE);
    }//GEN-LAST:event_loginButtonHover

    private void loginButtonOut(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonOut
        // TODO add your handling code here:
        jButton1.setBackground(Color.RED);
    }//GEN-LAST:event_loginButtonOut

    private void fieldFocus(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldFocus
        // TODO add your handling code here:
        if (evt.getSource() == jTextField1) {
            jTextField1.setBorder(new LineBorder(Color.blue, 5));
            if (jTextField1.getText().trim().equals("") || tempFocused1 == 1 || tempLastText1 == 1) {
                jTextField1.setText("");
                jTextField1.setForeground(Color.black);
            }
        } else if (evt.getSource() == jPasswordField1) {
            jPasswordField1.setBorder(new LineBorder(Color.blue, 5));
            if (jPasswordField1.getText().trim().equals("") || tempFocused2 == 1 || tempLastText2 == 1) {
                jPasswordField1.setText("");
                jPasswordField1.setForeground(Color.black);
                jPasswordField1.setEchoChar('\u2022');
            }
        }
    }//GEN-LAST:event_fieldFocus

    private void lostFocusField(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lostFocusField
        // TODO add your handling code here:
        if (evt.getSource() == jTextField1) {
            jTextField1.setBorder(new LineBorder(Color.blue, 2));
            if (jTextField1.getText().trim().equals("")) {
                jTextField1.setText("Username");
                jTextField1.setForeground(Color.BLUE);
                tempLastText1 = 1;
            }
        } else if (evt.getSource() == jPasswordField1) {
            jPasswordField1.setBorder(new LineBorder(Color.blue, 2));
            if (jPasswordField1.getText().trim().equals("")) {
                jPasswordField1.setText("Password");
                jPasswordField1.setForeground(Color.BLUE);
                tempLastText2 = 1;
                jPasswordField1.setEchoChar('\u0000');
            }
        }
    }//GEN-LAST:event_lostFocusField

    private void enterField(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enterField
        // TODO add your handling code here:
        if (evt.getSource() == jTextField1) {
            jTextField1.setFocusable(true);

        } else if (evt.getSource() == jPasswordField1) {
            jPasswordField1.setFocusable(true);

        }
    }//GEN-LAST:event_enterField

    private void fieldTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldTyped
        // TODO add your handling code here:
        if (evt.getSource() == jTextField1) {
            tempFocused1 = 0;
            tempLastText1 = 0;
        } else if (evt.getSource() == jPasswordField1) {
            tempFocused2 = 0;
            tempLastText2 = 0;
        }
    }//GEN-LAST:event_fieldTyped

    private void showPassword(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPassword
        // TODO add your handling code here:
        if (jCheckBox1.isSelected()) {
            if (jPasswordField1.getForeground() == Color.black) {
                jPasswordField1.setEchoChar('\u0000');
            }
        } else {
            if (jPasswordField1.getForeground() == Color.black) {
                jPasswordField1.setEchoChar('\u2022');
            }
        }
    }//GEN-LAST:event_showPassword

    private void linkToSUHover(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_linkToSUHover
        // TODO add your handling code here:
        jButton2.setForeground(Color.BLUE);
    }//GEN-LAST:event_linkToSUHover

    private void linkToSUExit(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_linkToSUExit
        // TODO add your handling code here:
        jButton2.setForeground(Color.RED);
    }//GEN-LAST:event_linkToSUExit

    private void goToSU(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goToSU
        // TODO add your handling code here:
        dispose();
        new createAccountScreen().setVisible(true);
    }//GEN-LAST:event_goToSU

    private boolean checkIfNotEmpty(String username, String password) {
        boolean temp=false;
        if (!(username.trim().equals("") || password.trim().equals(""))) {
            if(jTextField1.getForeground()==Color.black && jPasswordField1.getForeground()==Color.black){
                return true;
            }
        }
        return temp;
    }
    private void login(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login
        // TODO add your handling code here:

        String username = jTextField1.getText();
        String password = jPasswordField1.getText();
        if (checkIfNotEmpty(username, password)) {
            try {
                Connection conn = DriverManager.getConnection(DBInfo.db, DBInfo.user, DBInfo.pass);
                Statement stmt = conn.createStatement();
                String query = "SELECT * FROM users WHERE BINARY username='" + username + "' AND password='" + password + "'";
                ResultSet result=stmt.executeQuery(query);
                if(result.next()){
                    dispose();
                    String query2="UPDATE users SET available='1' WHERE BINARY username='"+username+"'";
                    stmt.executeUpdate(query2);
                    new mainScreen(username,password).setVisible(true);
                }
                else{
                    JOptionPane.showMessageDialog(null,"Username Or Password is incorrect.","Invalid",JOptionPane.ERROR_MESSAGE);
                }
                stmt.close();
                conn.close();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ""+ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"Fields cannot be empty.","Invalid Inputs",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_login

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
            java.util.logging.Logger.getLogger(loginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
