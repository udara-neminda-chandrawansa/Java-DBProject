/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbproject;

// imports SQL DATABASE PACKAGE
import java.sql.*;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class Student_Details extends javax.swing.JFrame {

    public Student_Details() {
        initComponents();
    }

    // create main connection vars
    Connection con;
    Statement st;
    ResultSet rs;
    PreparedStatement ps;
    
    // other connection vars
    String sql, gen;
    
    // create connection method
    void conn(){
        // try catch error handler
        try{
            // class
            Class.forName("com.mysql.jdbc.Driver");
            // set connection
            con = DriverManager.getConnection("jdbc:mysql://localhost/Java_Student","root","");
        }
        catch(Exception ex){
            // catch error
            JOptionPane.showMessageDialog(this, "Connection Error! : " + ex.getMessage(), "Student Master Details", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    // create clear method
    void clearAll(){
        // clear all controls
        txtSID.setText("");
        txtName.setText("");
        txtAddress.setText("");
        txtTelNo.setText("");
        txtDOB.setText("");
        rbFemale.setSelected(false);
        rbMale.setSelected(false);
        //JOptionPane.showMessageDialog(this, "Controls Cleared!", "Student Master Details", JOptionPane.WARNING_MESSAGE);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rds = new javax.swing.ButtonGroup();
        lblSID = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblDOB = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        lblTelNo = new javax.swing.JLabel();
        lblFormDesc = new javax.swing.JLabel();
        txtSID = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtDOB = new javax.swing.JTextField();
        txtTelNo = new javax.swing.JTextField();
        rbMale = new javax.swing.JRadioButton();
        rbFemale = new javax.swing.JRadioButton();
        btnSearch = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        studTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(400, 150));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblSID.setText("Student ID");
        lblSID.setName("lblSID"); // NOI18N

        lblName.setText("Name");
        lblName.setName("lblName"); // NOI18N

        lblAddress.setText("Address");
        lblAddress.setName("lblAddress"); // NOI18N

        lblDOB.setText("Date of Birth");
        lblDOB.setName("lblDOB"); // NOI18N

        lblGender.setText("Gender");
        lblGender.setName("lblGender"); // NOI18N

        lblTelNo.setText("Telephone Number");
        lblTelNo.setName("lblTelNo"); // NOI18N
        lblTelNo.setRequestFocusEnabled(false);

        lblFormDesc.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblFormDesc.setText("Student Details");

        txtSID.setName("txtSID"); // NOI18N

        txtName.setName("txtName"); // NOI18N

        txtAddress.setName("txtAddress"); // NOI18N

        txtDOB.setName("txtDOB"); // NOI18N

        txtTelNo.setName("txtTelNo"); // NOI18N

        rds.add(rbMale);
        rbMale.setText("Male");
        rbMale.setName("rbMale"); // NOI18N
        rbMale.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbMaleItemStateChanged(evt);
            }
        });
        rbMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMaleActionPerformed(evt);
            }
        });

        rds.add(rbFemale);
        rbFemale.setText("Female");
        rbFemale.setName("rbFemale"); // NOI18N
        rbFemale.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbFemaleItemStateChanged(evt);
            }
        });
        rbFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFemaleActionPerformed(evt);
            }
        });

        btnSearch.setText("Search");
        btnSearch.setMaximumSize(new java.awt.Dimension(67, 23));
        btnSearch.setMinimumSize(new java.awt.Dimension(67, 23));
        btnSearch.setName("btnSearch"); // NOI18N
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnAdd.setText("Add");
        btnAdd.setMaximumSize(new java.awt.Dimension(67, 23));
        btnAdd.setMinimumSize(new java.awt.Dimension(67, 23));
        btnAdd.setName("btnAdd"); // NOI18N
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.setName("btnUpdate"); // NOI18N
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.setMaximumSize(new java.awt.Dimension(67, 23));
        btnDelete.setMinimumSize(new java.awt.Dimension(67, 23));
        btnDelete.setName("btnDelete"); // NOI18N
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnClear.setText("Clear All");
        btnClear.setName("btnClear"); // NOI18N
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnExit.setText("Exit");
        btnExit.setName("btnExit"); // NOI18N
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        studTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Address", "DOB", "Gender", "Tel No"
            }
        ));
        jScrollPane1.setViewportView(studTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblFormDesc)
                        .addGap(47, 47, 47))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTelNo)
                                .addGap(110, 110, 110)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rbMale)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(rbFemale))
                                    .addComponent(txtTelNo)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDOB)
                                    .addComponent(lblAddress)
                                    .addComponent(lblName)
                                    .addComponent(lblSID))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                                    .addComponent(txtAddress, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSID)
                                    .addComponent(txtDOB)))
                            .addComponent(lblGender, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblFormDesc)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSID)
                    .addComponent(txtSID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAddress)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDOB)
                    .addComponent(txtDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGender)
                    .addComponent(rbMale)
                    .addComponent(rbFemale))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelNo)
                    .addComponent(txtTelNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExit)
                    .addComponent(btnClear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMaleActionPerformed
        
    }//GEN-LAST:event_rbMaleActionPerformed

    private void rbFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbFemaleActionPerformed

    // load sql table to table control
    void loadTable(){
        try{
            conn();
            // sql query
            ps = con.prepareStatement("select * from stud;");
            // execute
            rs = ps.executeQuery();
            // result set obj
            ResultSetMetaData rsm = (ResultSetMetaData) rs.getMetaData();
            // get column count
            int colCount = rsm.getColumnCount();
            // create default table model obj
            DefaultTableModel tm = (DefaultTableModel) studTable.getModel();
            // clear tm
            tm.setRowCount(0);
            // while reading data
            while(rs.next()){
                // create vecotr obj (row)
                Vector obj = new Vector();
                // for loop to go through records
                for(int i = 1; i < colCount; i++){
                    // add cells to row
                    obj.add(rs.getString(1));
                    obj.add(rs.getString(2));
                    obj.add(rs.getString(3));
                    obj.add(rs.getString(4));
                    obj.add(rs.getString(5));
                    obj.add(rs.getString(6));
                }
                // add new row to default table model
                tm.addRow(obj);
            }
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Error! : " + ex.getMessage(), "Student Master Details", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // search method
        try{
            // open connection
            conn();
            sql = "select * from stud where STID = '" + txtSID.getText() + "';";
            // create statement
            st = con.createStatement();
            // read results
            rs = st.executeQuery(sql);
            rs.next();
            // assign values to controls
            txtName.setText(rs.getString(2));
            txtAddress.setText(rs.getString(3));
            txtTelNo.setText(rs.getString(6));
            txtDOB.setText(rs.getString(4));
            gen = rs.getString(5);
            // set gender
            if("Male".equals(gen)){
                rbMale.setSelected(true);
                rbFemale.setSelected(false);
            }else if("Female".equals(gen)){
                rbMale.setSelected(false);
                rbFemale.setSelected(true);
            }else{
                rbFemale.setSelected(false);
                rbMale.setSelected(false);
            }
            JOptionPane.showMessageDialog(this, "Item Found!", "Student Master Details", JOptionPane.WARNING_MESSAGE);
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Connection Error! : " + ex.getMessage(), "Student Master Details", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // call clearAll method
        clearAll();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // exit
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        try{
            // open connection
            conn();
            // query
            sql = "insert into Stud values('"+txtSID.getText()+"','"+txtName.getText()+"','"+txtAddress.getText()+"','"+txtDOB.getText()+"','"+gen+"','"+txtTelNo.getText()+"')";
            // statement
            st = con.createStatement();
            // update statement
            st.executeUpdate(sql);
            // close
            con.close();
            // clear all
            clearAll();
            // success
            JOptionPane.showMessageDialog(this, "Student Added!", "Student Master Details", JOptionPane.INFORMATION_MESSAGE);
            loadTable();
        }
        catch(Exception ex){
            // catch error
            JOptionPane.showMessageDialog(this, "Error! : " + ex.getMessage(), "Student Master Details", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        try{
            // open connection
            conn();
            // query
            sql = "update Stud set ST_Name = '"+txtName.getText()+"', ST_Address = '"+txtAddress.getText()+"', ST_DOB = '"+txtDOB.getText()+"', ST_Gender = '"+gen+"', ST_Tel = '"+txtTelNo.getText()+"' where STID = '"+txtSID.getText()+"'";
            // statement
            st = con.createStatement();
            // update statement
            st.executeUpdate(sql);
            // close
            con.close();
            // clear all
            clearAll();
            // success
            JOptionPane.showMessageDialog(this, "Student Updated!", "Student Master Details", JOptionPane.INFORMATION_MESSAGE);
            loadTable();
        }
        catch(Exception ex){
            // catch error
            JOptionPane.showMessageDialog(this, "Error! : " + ex.getMessage(), "Student Master Details", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void rbFemaleItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbFemaleItemStateChanged
        gen = "Female";
    }//GEN-LAST:event_rbFemaleItemStateChanged

    private void rbMaleItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbMaleItemStateChanged
        gen = "Male";
    }//GEN-LAST:event_rbMaleItemStateChanged

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try{
            // open connection
            conn();
            // query
            sql = "delete from stud where STID = '" + txtSID.getText() + "'";
            // statement
            st = con.createStatement();
            // update statement
            st.executeUpdate(sql);
            // close
            con.close();
            // clear all
            clearAll();
            // success
            JOptionPane.showMessageDialog(this, "Student Deleted!", "Student Master Details", JOptionPane.INFORMATION_MESSAGE);
            loadTable();
        }
        catch(Exception ex){
            // catch error
            JOptionPane.showMessageDialog(this, "Error! : " + ex.getMessage(), "Student Master Details", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        loadTable();
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(Student_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Student_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Student_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Student_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Student_Details().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblDOB;
    private javax.swing.JLabel lblFormDesc;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblSID;
    private javax.swing.JLabel lblTelNo;
    private javax.swing.JRadioButton rbFemale;
    private javax.swing.JRadioButton rbMale;
    private javax.swing.ButtonGroup rds;
    private javax.swing.JTable studTable;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtDOB;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSID;
    private javax.swing.JTextField txtTelNo;
    // End of variables declaration//GEN-END:variables
}
