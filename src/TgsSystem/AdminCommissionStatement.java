/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * AdminCommissionStatement.java
 *
 * Created on 21-Oct-2012, 14:26:45
 */

package TgsSystem;

import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Babathurpe
 */
public class AdminCommissionStatement extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;

    /** Creates new form AdminCommissionStatement */
    public AdminCommissionStatement() {
        initComponents();
    }

    public void close() {
        WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
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

        jLabel7 = new javax.swing.JLabel();
        LogOutBtn = new javax.swing.JButton();
        BackBtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        SearchTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        SearchBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        CommTable = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        ComTxt = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        DepositTxt = new javax.swing.JTextField();
        SubtotalTxt = new javax.swing.JTextField();
        BtnCalComm = new javax.swing.JButton();
        CommTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        BtnPrintComm = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Manager :: Center Commission Statement");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Modern No. 20", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 0, 0));
        jLabel7.setText("TIMBERLAND GARDEN SHEDS MANAGER - Commission Statement .");
        jLabel7.setName("jLabel7"); // NOI18N

        LogOutBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        LogOutBtn.setText("Log Out");
        LogOutBtn.setName("LogOutBtn"); // NOI18N
        LogOutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutBtnActionPerformed(evt);
            }
        });

        BackBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BackBtn.setText("Back");
        BackBtn.setName("BackBtn"); // NOI18N
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Aparajita", 1, 18), new java.awt.Color(0, 102, 102))); // NOI18N
        jPanel3.setName("jPanel3"); // NOI18N

        SearchTxt.setName("SearchTxt"); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 51));
        jLabel2.setText("Search by Center Name.");
        jLabel2.setName("jLabel2"); // NOI18N

        SearchBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        SearchBtn.setText("Search");
        SearchBtn.setName("SearchBtn"); // NOI18N
        SearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(SearchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SearchBtn)
                        .addGap(12, 12, 12))
                    .addComponent(jLabel2))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SearchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jLabel2))
        );

        jScrollPane2.setName("jScrollPane2"); // NOI18N

        CommTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Order ID", "Deposit", "Subtotal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        CommTable.setName("CommTable"); // NOI18N
        jScrollPane2.setViewportView(CommTable);

        jScrollPane3.setName("jScrollPane3"); // NOI18N

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        ComTxt.setColumns(20);
        ComTxt.setEditable(false);
        ComTxt.setRows(5);
        ComTxt.setName("ComTxt"); // NOI18N
        jScrollPane1.setViewportView(ComTxt);

        jScrollPane3.setViewportView(jScrollPane1);

        jLabel1.setText("Total Deposit:");
        jLabel1.setName("jLabel1"); // NOI18N

        jLabel3.setText("Total Subtotal:");
        jLabel3.setName("jLabel3"); // NOI18N

        DepositTxt.setEditable(false);
        DepositTxt.setName("DepositTxt"); // NOI18N

        SubtotalTxt.setEditable(false);
        SubtotalTxt.setName("SubtotalTxt"); // NOI18N

        BtnCalComm.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BtnCalComm.setText("Calculate Commission");
        BtnCalComm.setName("BtnCalComm"); // NOI18N
        BtnCalComm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCalCommActionPerformed(evt);
            }
        });

        CommTxt.setEditable(false);
        CommTxt.setName("CommTxt"); // NOI18N

        jLabel4.setText("Total Commission:");
        jLabel4.setName("jLabel4"); // NOI18N

        BtnPrintComm.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BtnPrintComm.setForeground(new java.awt.Color(204, 153, 0));
        BtnPrintComm.setText("Print Commission Statement");
        BtnPrintComm.setName("BtnPrintComm"); // NOI18N
        BtnPrintComm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPrintCommActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CommTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(SubtotalTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DepositTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnCalComm, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(BtnPrintComm, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(84, 84, 84))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(275, 275, 275)
                .addComponent(BackBtn)
                .addGap(41, 41, 41)
                .addComponent(LogOutBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnCalComm)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(DepositTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(SubtotalTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CommTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(BtnPrintComm, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BackBtn)
                    .addComponent(LogOutBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogOutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutBtnActionPerformed
        // TODO add your handling code here:
        close();
        TgsMainFrame main = new TgsMainFrame();
        main.setVisible(true);
}//GEN-LAST:event_LogOutBtnActionPerformed

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        // TODO add your handling code here:
        close();
        AdminFrame home = new AdminFrame();
        home.setVisible(true);
}//GEN-LAST:event_BackBtnActionPerformed

    private void SearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBtnActionPerformed
        // TODO add your handling code here:
       try{
            //Select all information from table where center name matches
            String sql = "select gardencentername from tgscustomerform where gardencentername=?";
            pst = conn.prepareStatement(sql);
            //Get text from Seacrh textbox
            pst.setString(1, SearchTxt.getText());
            //Search table for center name
            rs = pst.executeQuery();
            //if center name is available
            if(rs.next()){
                //Fetch and put available data from table into appropriate fields
                UpdateFormTable();
            }else{
                UpdateFormTable();
                JOptionPane.showMessageDialog(null, "Sorry, No match found. Search again.");
                DepositTxt.setText(null);
                SubtotalTxt.setText(null);
                ComTxt.setText(null);
                CommTxt.setText(null);
            }
        } catch(Exception e){

        }
           
}//GEN-LAST:event_SearchBtnActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        conn = mysqlconnect.ConnectDb();
        UpdateFormTable();
    }//GEN-LAST:event_formWindowOpened

     //RoundUp Values for Prices
     public static double Round1(double Rval, int Rpl) {
        double p = (double)Math.pow(10,Rpl);
        Rval = Rval * p;
        double tmp = Math.round(Rval);
        return (double)tmp/p;
     }


    private void BtnCalCommActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCalCommActionPerformed
        // TODO add your handling code here:
        String center = SearchTxt.getText().toUpperCase();
         try{
            //Sum up the info available from table where center name matches
            String sql1 = "Select sum(deposit) from tgscustomerform where gardencentername=?";
            pst = conn.prepareStatement(sql1);
            //Get text from Seacrh textbox
            pst.setString(1, SearchTxt.getText());
            //Execute query in sql1
            rs = pst.executeQuery();
            //if center name is available
            if(rs.next()){
                //Fetch and put available data from table into appropriate fields
                String SumDeposit = rs.getString("sum(deposit)");
                DepositTxt.setText(SumDeposit);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Sorry, No match found. Search again.");
        }
        try{
            //Sum up the info available from table where center name matches
            String sql2 = "Select sum(subtotal) from tgscustomerform where gardencentername=?";
            pst = conn.prepareStatement(sql2);
            //Get text from Seacrh textbox
            pst.setString(1, SearchTxt.getText());
            //Search table for center name
            rs = pst.executeQuery();
            //if center name is available
            if(rs.next()){
                //Fetch and put available data from table into appropriate fields
                String SumSubtotal = rs.getString("sum(subtotal)");
                SubtotalTxt.setText(SumSubtotal);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Sorry, No match found. Search again.");
        }
          //Set Sum of Prices from database to textfields
         double sumSub = Float.valueOf(SubtotalTxt.getText());
         double sumDep = Float.valueOf(DepositTxt.getText());
         double roundSub = Round1(sumSub,2);
         double roundDep = Round1(sumDep,2);
         double total = (sumSub + sumDep);
         double roundTotal = Round1(total,2);
         double comm = 0.09 * roundTotal;
         double roundCom = Round1(comm,2);
         String ValCom = String.valueOf(roundCom);
         CommTxt.setText(ValCom);
         
         //Append Commission Information to textarea
         ComTxt.append("\t  TGS CENTER COMMISSION FORM \n" +
                        "\t______________________________\n\n");

                ComTxt.append("    This is the Commision Statement for " + center + ".\n\n");
                //Fetch and put available data from database and append to text area.
                ComTxt.append("    Total Deposit:\t" + roundDep +" Pounds\n");
                ComTxt.append("    Total Subtotal: \t" + roundSub + " Pounds\n");
                ComTxt.append("    Total Commission: \t" + roundCom + " Pounds\n");
               // ComTxt.append("                            _______________\n");
               // ComTxt.append("    Order Number: \t" + orderId + "\n");
   
    }//GEN-LAST:event_BtnCalCommActionPerformed

    private void BtnPrintCommActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPrintCommActionPerformed
        // TODO add your handling code here:
        String check = ComTxt.getText();
        if( check.length() == 0){
            JOptionPane.showMessageDialog(null, "You can not print a blank field.\nSearch for a Center and Calculate the Commission then you can print the Invoice.");
        }
        else{
            try{
                ComTxt.print();
            }catch(Exception e){

            }
        }
    }//GEN-LAST:event_BtnPrintCommActionPerformed

    private void UpdateFormTable(){
        try{
            String sql = "select orderid,deposit,subtotal, gardencentername from tgscustomerform";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            CommTable.setModel(DbUtils.resultSetToTableModel(rs));

        } catch(Exception e){

        }
    }
    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminCommissionStatement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JButton BtnCalComm;
    private javax.swing.JButton BtnPrintComm;
    private javax.swing.JTextArea ComTxt;
    private javax.swing.JTable CommTable;
    private javax.swing.JTextField CommTxt;
    private javax.swing.JTextField DepositTxt;
    private javax.swing.JButton LogOutBtn;
    private javax.swing.JButton SearchBtn;
    private javax.swing.JTextField SearchTxt;
    private javax.swing.JTextField SubtotalTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables

}
