/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * AdminPayroll.java
 *
 * Created on 30-Sep-2012, 09:41:06
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
public class AdminPayroll extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    /** Creates new form AdminPayroll */
    public AdminPayroll() {
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

        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        AddBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        EmpIdTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        SurnameTxt = new javax.swing.JTextField();
        FirstnameTxt = new javax.swing.JTextField();
        UpdateBtn = new javax.swing.JButton();
        salaryLbl1 = new javax.swing.JLabel();
        StaffTypeCombo = new javax.swing.JComboBox();
        jPanel5 = new javax.swing.JPanel();
        SearchTxt1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        SearchBtn = new javax.swing.JButton();
        salaryLbl = new javax.swing.JLabel();
        salaryTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        SalaryCombo = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        EmpTable = new javax.swing.JTable();
        LogOutBtn = new javax.swing.JButton();
        BackBtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Manager :: Employees Info / Payroll");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Employees", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Baskerville Old Face", 1, 24), new java.awt.Color(51, 0, 153))); // NOI18N
        jPanel2.setName("jPanel2"); // NOI18N

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Employee Info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Aparajita", 1, 18), new java.awt.Color(0, 102, 102))); // NOI18N
        jPanel4.setName("jPanel4"); // NOI18N

        AddBtn.setFont(new java.awt.Font("Tahoma", 1, 11));
        AddBtn.setText("Add/Save");
        AddBtn.setName("AddBtn"); // NOI18N
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });

        DeleteBtn.setFont(new java.awt.Font("Tahoma", 1, 11));
        DeleteBtn.setText("Delete");
        DeleteBtn.setName("DeleteBtn"); // NOI18N
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel3.setText("Surname:");
        jLabel3.setName("jLabel3"); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel5.setText("Employee ID:");
        jLabel5.setName("jLabel5"); // NOI18N

        EmpIdTxt.setName("EmpIdTxt"); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel4.setText("Firstname:");
        jLabel4.setName("jLabel4"); // NOI18N

        SurnameTxt.setName("SurnameTxt"); // NOI18N

        FirstnameTxt.setName("FirstnameTxt"); // NOI18N

        UpdateBtn.setFont(new java.awt.Font("Tahoma", 1, 11));
        UpdateBtn.setText("Update");
        UpdateBtn.setName("UpdateBtn"); // NOI18N
        UpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBtnActionPerformed(evt);
            }
        });

        salaryLbl1.setFont(new java.awt.Font("Tahoma", 1, 11));
        salaryLbl1.setText("Salary Paid:");
        salaryLbl1.setName("salaryLbl1"); // NOI18N

        StaffTypeCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Choose....", "Permanent", "Temporary" }));
        StaffTypeCombo.setName("StaffTypeCombo"); // NOI18N

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Aparajita", 1, 18), new java.awt.Color(0, 102, 102))); // NOI18N
        jPanel5.setName("jPanel5"); // NOI18N

        SearchTxt1.setName("SearchTxt1"); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 2, 11));
        jLabel8.setForeground(new java.awt.Color(255, 0, 51));
        jLabel8.setText("Search with Employee with Employee's ID Number.");
        jLabel8.setName("jLabel8"); // NOI18N

        SearchBtn.setFont(new java.awt.Font("Tahoma", 1, 11));
        SearchBtn.setText("Search");
        SearchBtn.setName("SearchBtn"); // NOI18N
        SearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(SearchTxt1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SearchBtn)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SearchTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addContainerGap())
        );

        salaryLbl.setFont(new java.awt.Font("Tahoma", 1, 11));
        salaryLbl.setText("Salary Paid:");
        salaryLbl.setName("salaryLbl"); // NOI18N

        salaryTxt.setEditable(false);
        salaryTxt.setName("salaryTxt"); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel6.setText("Staff Type:");
        jLabel6.setName("jLabel6"); // NOI18N

        SalaryCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Choose....", "Yes", "No" }));
        SalaryCombo.setName("SalaryCombo"); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(EmpIdTxt))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(FirstnameTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                                .addComponent(SurnameTxt, javax.swing.GroupLayout.Alignment.TRAILING))))
                    .addComponent(jLabel6)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                            .addComponent(salaryLbl)
                            .addGap(18, 18, 18)
                            .addComponent(salaryTxt))
                        .addComponent(salaryLbl1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                            .addGap(84, 84, 84)
                            .addComponent(SalaryCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addComponent(StaffTypeCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(AddBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(UpdateBtn)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DeleteBtn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(EmpIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(FirstnameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SurnameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(StaffTypeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salaryLbl1)
                    .addComponent(SalaryCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salaryTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salaryLbl))
                .addGap(11, 11, 11)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddBtn)
                    .addComponent(UpdateBtn)
                    .addComponent(DeleteBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane2.setName("jScrollPane2"); // NOI18N

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        EmpTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Employee ID", "Firstname", "Surname", "Salary paid", "Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        EmpTable.setName("EmpTable"); // NOI18N
        jScrollPane1.setViewportView(EmpTable);

        jScrollPane2.setViewportView(jScrollPane1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, 0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        LogOutBtn.setFont(new java.awt.Font("Tahoma", 1, 11));
        LogOutBtn.setText("Log Out");
        LogOutBtn.setName("LogOutBtn"); // NOI18N
        LogOutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutBtnActionPerformed(evt);
            }
        });

        BackBtn.setFont(new java.awt.Font("Tahoma", 1, 11));
        BackBtn.setText("Back");
        BackBtn.setName("BackBtn"); // NOI18N
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Modern No. 20", 1, 24));
        jLabel7.setForeground(new java.awt.Color(153, 0, 0));
        jLabel7.setText("TIMBERLAND GARDEN SHEDS ADMIN - EMPLOYEES PAYROLL.");
        jLabel7.setName("jLabel7"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(376, 376, 376)
                        .addComponent(BackBtn)
                        .addGap(41, 41, 41)
                        .addComponent(LogOutBtn)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BackBtn)
                    .addComponent(LogOutBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        // TODO add your handling code here:
        java.sql.Date sqlDate = new java.sql.Date(new java.util.Date().getTime());
        
        if (ValidateFname() && ValidateSname() && ValidateStaffType() && ValidateSalary())
        {
            String sql = "insert into employees (Employeeid,Firstname,Surname,Stafftype,Salary,Date) values (?,?,?,?,?,?)";
            try {
                pst = conn.prepareStatement(sql);
                pst.setString(1, EmpIdTxt.getText());
                pst.setString(2, FirstnameTxt.getText());
                pst.setString(3, SurnameTxt.getText());
                String staff = StaffTypeCombo.getSelectedItem().toString();
                pst.setString(4, staff);
                String value = SalaryCombo.getSelectedItem().toString();
                pst.setString(5, value);
                pst.setDate(6, sqlDate);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Employee Info added.");
                //clear text field and combo box to default null values after update.
                EmpIdTxt.setText(null);
                FirstnameTxt.setText(null);
                SurnameTxt.setText(null);
                StaffTypeCombo.setSelectedIndex(0);
                SalaryCombo.setSelectedIndex(0);
                SearchTxt1.setText(null);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Employee ID has to be a number.\nEmployee ID already exists."); //
            }
            UpdateFormTable();
        } else {
            JOptionPane.showMessageDialog(null, "The following errors occured:\nAll fields are required.\nSelect the appropriate options.\nEmployee ID has to be a number.");
        }
}//GEN-LAST:event_AddBtnActionPerformed

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        // TODO add your handling code here:
        close();
        AdminFrame home = new AdminFrame();
        home.setVisible(true);
    }//GEN-LAST:event_BackBtnActionPerformed

    private void LogOutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutBtnActionPerformed
        // TODO add your handling code here:
        close();
        TgsMainFrame main = new TgsMainFrame();
        main.setVisible(true);
    }//GEN-LAST:event_LogOutBtnActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        conn = mysqlconnect.ConnectDb();
        salaryTxt.setVisible(false);
        salaryLbl.setVisible(false);
        UpdateFormTable();
    }//GEN-LAST:event_formWindowOpened

    private void UpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBtnActionPerformed
        // TODO add your handling code here:
        if (ValidateFname() && ValidateSname() && ValidateStaffType() && ValidateSalary()){
        try {
            //get values from text fields to be edited.
            String EmpId = EmpIdTxt.getText();
            String Firstname = FirstnameTxt.getText();
            String Surname = SurnameTxt.getText();
            String Salary = StaffTypeCombo.getSelectedItem().toString();
            String Staff = StaffTypeCombo.getSelectedItem().toString();
            //sql statement to be executed
            String sql = "update employees set Employeeid = '" + EmpId + "',Firstname = '" + Firstname + "',Surname = '" + Surname + "', Stafftype = '" +Staff+"', Salary = '" + Salary + "' where Employeeid = '" + EmpId + "' ";
            pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Employee Info has been updated.");
            //clear text field and combo box to default null values after update.
            EmpIdTxt.setText(null);
            FirstnameTxt.setText(null);
            SurnameTxt.setText(null);
            StaffTypeCombo.setSelectedIndex(0);
            SalaryCombo.setSelectedIndex(0);
            SearchTxt1.setText(null);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "The following errors occured:\nAll fields are required.\nSelect the appropriate options.\nEmployee ID has to be a number.");
        }
        UpdateFormTable();
      }
    }//GEN-LAST:event_UpdateBtnActionPerformed

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        // TODO add your handling code here:
        int confirm = JOptionPane.showConfirmDialog(rootPane, "Are you sure?", "Delete", JOptionPane.YES_NO_OPTION);
        if (confirm == 0) {
            String sql = "delete from employees where EmployeeId = ? ";
            try {
                pst = conn.prepareStatement(sql);
                pst.setString(1, EmpIdTxt.getText());
                pst.execute();
                JOptionPane.showMessageDialog(null, "Center Info has been deleted.");
                // clear text field and combo box to default null values after delete.
                EmpIdTxt.setText(null);
                FirstnameTxt.setText(null);
                SurnameTxt.setText(null);
                StaffTypeCombo.setSelectedIndex(0);
                SearchTxt1.setText(null);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
            UpdateFormTable();
        }
    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void SearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBtnActionPerformed
        // TODO add your handling code here:
        try {
            salaryTxt.setVisible(true);
            salaryLbl.setVisible(true);
            //Select all information from table where center name matches
            String sql = "select * from employees where Employeeid=?";
            pst = conn.prepareStatement(sql);
            //Get text from Seacrh textbox
            pst.setString(1, SearchTxt1.getText());
            //Search table for center name
            rs = pst.executeQuery();
            //if center name is available
            if (rs.next()) {
                //Fetch and put available data from table into appropriate fields
                String setId = rs.getString("Employeeid");
                EmpIdTxt.setText(setId);
                String setFirstname = rs.getString("Firstname");
                FirstnameTxt.setText(setFirstname);
                String setSurname = rs.getString("Surname");
                SurnameTxt.setText(setSurname);
                String setStaff = rs.getString("Stafftype");
                StaffTypeCombo.setSelectedItem(setStaff);
                String setComboSal = rs.getString("Salary");
                SalaryCombo.setSelectedItem(setComboSal);
                String setSalary = rs.getString("Salary");
                salaryTxt.setText(setSalary);

            } else {
                UpdateFormTable();
                JOptionPane.showMessageDialog(null, "Sorry, No match found. Search again.");
                EmpIdTxt.setText(null);
                FirstnameTxt.setText(null);
                SurnameTxt.setText(null);
                StaffTypeCombo.setSelectedIndex(0);
                SalaryCombo.setSelectedIndex(0);
                SearchTxt1.setText(null);
                salaryTxt.setVisible(false);
                salaryLbl.setVisible(false);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
}//GEN-LAST:event_SearchBtnActionPerformed

    private void UpdateFormTable() {
        try {
            String sql = "select * from employees";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            EmpTable.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {
        }
    }


    public boolean ValidateFname(){
        boolean check = false;
        String name = FirstnameTxt.getText();
        if(name.length() == 0 || name == null){
            JOptionPane.showMessageDialog(null, "Firstname cannot be empty.");
            FirstnameTxt.requestFocusInWindow();
        } else{
            check = true;
        }
        return check;
      }

     public boolean ValidateSname(){
        boolean check = false;
        String name = SurnameTxt.getText();
        if(name.length() == 0 || name == null){
            JOptionPane.showMessageDialog(null, "Surname cannot be empty.");
            SurnameTxt.requestFocusInWindow();
        } else{
            check = true;
        }
        return check;
      }

      public boolean ValidateStaffType(){
        boolean check = false;
        int val = StaffTypeCombo.getSelectedIndex();
        if(val == 0){
            JOptionPane.showMessageDialog(null, "Please select the Staff Type.");
            StaffTypeCombo.requestFocusInWindow();
        } else{
            check = true;
        }
        return check;
      }

       public boolean ValidateSalary(){
         boolean check = false;
        int val = SalaryCombo.getSelectedIndex();
        if(val == 0){
            JOptionPane.showMessageDialog(null, "Please select the Salary Option.");
            SalaryCombo.requestFocusInWindow();
        } else{
            check = true;
        }
        return check;
      }



    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new AdminPayroll().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JButton BackBtn;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JTextField EmpIdTxt;
    private javax.swing.JTable EmpTable;
    private javax.swing.JTextField FirstnameTxt;
    private javax.swing.JButton LogOutBtn;
    private javax.swing.JComboBox SalaryCombo;
    private javax.swing.JButton SearchBtn;
    private javax.swing.JTextField SearchTxt1;
    private javax.swing.JComboBox StaffTypeCombo;
    private javax.swing.JTextField SurnameTxt;
    private javax.swing.JButton UpdateBtn;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel salaryLbl;
    private javax.swing.JLabel salaryLbl1;
    private javax.swing.JTextField salaryTxt;
    // End of variables declaration//GEN-END:variables
}
