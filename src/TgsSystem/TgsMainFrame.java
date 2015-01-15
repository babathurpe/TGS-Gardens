/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * TgsMainFrame.java
 *
 * Created on 27-Sep-2012, 09:11:15
 */

package TgsSystem;

import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Babathurpe
 */
public class TgsMainFrame extends javax.swing.JFrame {

   
        Connection conn = null;
        ResultSet rs = null;
        PreparedStatement pst = null;
    /** Creates new form TgsMainFrame */
    public TgsMainFrame() {
        initComponents();
    }

    public void close(){
    WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
    Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
}
   

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LoginRadioBtn = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        adminBtn = new javax.swing.JButton();
        centerBtn = new javax.swing.JButton();
        adminLoginPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        usernameTxt = new javax.swing.JTextField();
        pswdTxt = new javax.swing.JPasswordField();
        AdminLoginBtn = new javax.swing.JButton();
        AdminClearBtn = new javax.swing.JButton();
        centerLoginPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        usernameClientTxt = new javax.swing.JTextField();
        pswdClientTxt = new javax.swing.JPasswordField();
        CenterLoginBtn = new javax.swing.JButton();
        CenterClearBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Timberland Garden Shed Login.");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Menu", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cambria", 1, 14))); // NOI18N
        jPanel1.setName("jPanel1"); // NOI18N

        adminBtn.setText("Admin Login");
        adminBtn.setName("adminBtn"); // NOI18N
        adminBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminBtnActionPerformed(evt);
            }
        });

        centerBtn.setText("Center Login");
        centerBtn.setName("centerBtn"); // NOI18N
        centerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                centerBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(adminBtn)
                    .addComponent(centerBtn))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(adminBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(centerBtn)
                .addContainerGap(263, Short.MAX_VALUE))
        );

        adminLoginPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Admin Login", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Gisha", 1, 12), new java.awt.Color(255, 0, 51))); // NOI18N
        adminLoginPanel.setName("adminLoginPanel"); // NOI18N

        jLabel1.setText("Username:");
        jLabel1.setName("jLabel1"); // NOI18N

        jLabel2.setText("Password:");
        jLabel2.setName("jLabel2"); // NOI18N

        usernameTxt.setName("usernameTxt"); // NOI18N

        pswdTxt.setName("pswdTxt"); // NOI18N

        AdminLoginBtn.setText("Login");
        AdminLoginBtn.setName("AdminLoginBtn"); // NOI18N
        AdminLoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminLoginBtnActionPerformed(evt);
            }
        });

        AdminClearBtn.setText("Clear");
        AdminClearBtn.setName("AdminClearBtn"); // NOI18N
        AdminClearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminClearBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout adminLoginPanelLayout = new javax.swing.GroupLayout(adminLoginPanel);
        adminLoginPanel.setLayout(adminLoginPanelLayout);
        adminLoginPanelLayout.setHorizontalGroup(
            adminLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminLoginPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(adminLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(adminLoginPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(usernameTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE))
                    .addGroup(adminLoginPanelLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(pswdTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)))
                .addGap(80, 80, 80))
            .addGroup(adminLoginPanelLayout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(AdminLoginBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AdminClearBtn)
                .addContainerGap(125, Short.MAX_VALUE))
        );
        adminLoginPanelLayout.setVerticalGroup(
            adminLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminLoginPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(adminLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(usernameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(adminLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(pswdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(adminLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AdminClearBtn)
                    .addComponent(AdminLoginBtn))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        centerLoginPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Center Login", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Gisha", 1, 12), new java.awt.Color(255, 0, 51))); // NOI18N
        centerLoginPanel.setName("centerLoginPanel"); // NOI18N

        jLabel3.setText("Username:");
        jLabel3.setName("jLabel3"); // NOI18N

        jLabel4.setText("Password:");
        jLabel4.setName("jLabel4"); // NOI18N

        usernameClientTxt.setName("usernameClientTxt"); // NOI18N

        pswdClientTxt.setName("pswdClientTxt"); // NOI18N

        CenterLoginBtn.setText("Login");
        CenterLoginBtn.setName("CenterLoginBtn"); // NOI18N
        CenterLoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CenterLoginBtnActionPerformed(evt);
            }
        });

        CenterClearBtn.setText("Clear");
        CenterClearBtn.setName("CenterClearBtn"); // NOI18N

        javax.swing.GroupLayout centerLoginPanelLayout = new javax.swing.GroupLayout(centerLoginPanel);
        centerLoginPanel.setLayout(centerLoginPanelLayout);
        centerLoginPanelLayout.setHorizontalGroup(
            centerLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(centerLoginPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(centerLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(centerLoginPanelLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(usernameClientTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE))
                    .addGroup(centerLoginPanelLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(pswdClientTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)))
                .addGap(80, 80, 80))
            .addGroup(centerLoginPanelLayout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(CenterLoginBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CenterClearBtn)
                .addContainerGap(124, Short.MAX_VALUE))
        );
        centerLoginPanelLayout.setVerticalGroup(
            centerLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(centerLoginPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(centerLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(usernameClientTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(centerLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(pswdClientTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(centerLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CenterClearBtn)
                    .addComponent(CenterLoginBtn))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Modern No. 20", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 0, 0));
        jLabel5.setText("WELCOME TO TIMBERLAND GARDEN SHEDS.");
        jLabel5.setName("jLabel5"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(adminLoginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(centerLoginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(adminLoginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(centerLoginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adminBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminBtnActionPerformed
        // TODO add your handling code here:
        adminLoginPanel.setVisible(true);
        centerLoginPanel.setVisible(false);
    }//GEN-LAST:event_adminBtnActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        conn = mysqlconnect.ConnectDb();
        adminLoginPanel.setVisible(false);
        centerLoginPanel.setVisible(false);
    }//GEN-LAST:event_formWindowOpened

    private void centerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_centerBtnActionPerformed
        // TODO add your handling code here:
        adminLoginPanel.setVisible(false);
        centerLoginPanel.setVisible(true);
    }//GEN-LAST:event_centerBtnActionPerformed

    private void AdminLoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminLoginBtnActionPerformed
        // TODO add your handling code here:\
        String sql = "select * from adminlogindetails where username=? and password=?";
        try{
            pst = conn.prepareStatement(sql);
            pst.setString(1, usernameTxt.getText());
            pst.setString(2, pswdTxt.getText());
            rs = pst.executeQuery();
            if(rs.next()){
                
               // JOptionPane.showMessageDialog(null, "Username and password are correct.");
                close();
                AdminFrame admin = new AdminFrame();
                admin.setVisible(true);


                 }  else {
                JOptionPane.showMessageDialog(null, "Your login details do not exist or incorrect. \nPlease try again.");
                }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_AdminLoginBtnActionPerformed

    private void CenterLoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CenterLoginBtnActionPerformed
        
        // TODO add your handling code here:
String sql = "select * from centerlogindetails where username=? and password=?";
        try{
            pst = conn.prepareStatement(sql);
            pst.setString(1, usernameClientTxt.getText());
            pst.setString(2, pswdClientTxt.getText());
            rs = pst.executeQuery();
            if(rs.next()){
               
                //JOptionPane.showMessageDialog(null, "Username and password are correct.");
                close();
                CenterHomeFrame center = new CenterHomeFrame();
                center.setVisible(true);  
                
                //closes all connection and query to database since all the required information has been retrieved.
               // rs.close();
               // pst.close();
               // conn.close();
                

            }  else{
                JOptionPane.showMessageDialog(null, "Your login details do not exist or incorrect. \nPlease try again.");
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_CenterLoginBtnActionPerformed

    private void AdminClearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminClearBtnActionPerformed
        // TODO add your handling code here:
        usernameTxt.setText(null);
        pswdTxt.setText(null);
    }//GEN-LAST:event_AdminClearBtnActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TgsMainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdminClearBtn;
    private javax.swing.JButton AdminLoginBtn;
    private javax.swing.JButton CenterClearBtn;
    private javax.swing.JButton CenterLoginBtn;
    private javax.swing.ButtonGroup LoginRadioBtn;
    private javax.swing.JButton adminBtn;
    private javax.swing.JPanel adminLoginPanel;
    private javax.swing.JButton centerBtn;
    private javax.swing.JPanel centerLoginPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField pswdClientTxt;
    private javax.swing.JPasswordField pswdTxt;
    private javax.swing.JTextField usernameClientTxt;
    private javax.swing.JTextField usernameTxt;
    // End of variables declaration//GEN-END:variables

}
