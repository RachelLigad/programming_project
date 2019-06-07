/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comprog;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.Timer;
import javax.swing.event.TableColumnModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import utils.DB;

/**
 *
 * @author Rachel Ann Ligad
 */
public class StudentProf extends javax.swing.JFrame {

    /**
     * Creates new form StudentProf
     */
    public StudentProf() {

        initComponents();
        setActivityTable();
        setLocationRelativeTo(null);
        showDate();
        showTime();

    }

    void showDate() {
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        deyt.setText(sdf.format(d));
    }

    void showTime() {
        new Timer(0, new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                Date d = new Date();
                SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss a");
                time.setText(sdf.format(d));

            }
        }
        ).start();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblIDnum = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfIDNum = new javax.swing.JTextField();
        deyt = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblCourse = new javax.swing.JLabel();
        tfName = new javax.swing.JTextField();
        tfCourse = new javax.swing.JTextField();
        tfDate = new javax.swing.JTextField();
        tfTimeIn = new javax.swing.JTextField();
        tfTimeOut = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblStudent = new javax.swing.JTable();
        jScrollBar1 = new javax.swing.JScrollBar();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        tfSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnLogOut = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/comprog/Images/dost.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 10, 103, 100);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 0));
        jLabel2.setText("Student Log Management System");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(140, 40, 611, 44);

        jPanel4.setBackground(new java.awt.Color(153, 0, 0));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        lblIDnum.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblIDnum.setForeground(new java.awt.Color(255, 255, 255));
        lblIDnum.setText("ID Number");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Date");

        tfIDNum.setBackground(new java.awt.Color(0, 0, 0));
        tfIDNum.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tfIDNum.setForeground(new java.awt.Color(255, 255, 255));
        tfIDNum.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        tfIDNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfIDNumActionPerformed(evt);
            }
        });

        deyt.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        deyt.setForeground(new java.awt.Color(255, 255, 255));
        deyt.setText("Date");

        time.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        time.setForeground(new java.awt.Color(255, 255, 255));
        time.setText("Time");

        btnSave.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/comprog/Images/Save_48px.png"))); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/comprog/Images/Refresh_52px.png"))); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/comprog/Images/Trash_52px.png"))); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/comprog/Images/Broom_50px.png"))); // NOI18N
        jButton1.setText("Clear Data");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Time In");

        lblName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblName.setForeground(new java.awt.Color(255, 255, 255));
        lblName.setText("Name");

        lblCourse.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCourse.setForeground(new java.awt.Color(255, 255, 255));
        lblCourse.setText("Course");

        tfName.setBackground(new java.awt.Color(0, 0, 0));
        tfName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tfName.setForeground(new java.awt.Color(255, 255, 255));
        tfName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        tfCourse.setBackground(new java.awt.Color(0, 0, 0));
        tfCourse.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tfCourse.setForeground(new java.awt.Color(255, 255, 255));
        tfCourse.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        tfDate.setBackground(new java.awt.Color(0, 0, 0));
        tfDate.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tfDate.setForeground(new java.awt.Color(255, 255, 255));
        tfDate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        tfTimeIn.setBackground(new java.awt.Color(0, 0, 0));
        tfTimeIn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tfTimeIn.setForeground(new java.awt.Color(255, 255, 255));
        tfTimeIn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        tfTimeOut.setBackground(new java.awt.Color(0, 0, 0));
        tfTimeOut.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tfTimeOut.setForeground(new java.awt.Color(255, 255, 255));
        tfTimeOut.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Time Out");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnUpdate)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIDnum)
                    .addComponent(lblName)
                    .addComponent(lblCourse)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(lblID, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfName)
                    .addComponent(tfCourse)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(deyt)
                            .addComponent(tfIDNum, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfDate, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfTimeIn, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfTimeOut, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(time))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(37, 37, 37))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfIDNum, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIDnum))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCourse))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfDate, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(6, 6, 6)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfTimeIn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfTimeOut, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(12, 12, 12)
                .addComponent(deyt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(time)
                    .addComponent(lblID, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnDelete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(jButton1))
                .addGap(21, 21, 21))
        );

        jPanel1.add(jPanel4);
        jPanel4.setBounds(10, 120, 320, 390);

        tblStudent.setAutoCreateRowSorter(true);
        tblStudent.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tblStudent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "ID NUMBER", "STUDENT", "COURSE", "DATE", "TIME IN", "TIME OUT"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblStudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblStudentMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblStudent);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(350, 120, 550, 320);
        jPanel1.add(jScrollBar1);
        jScrollBar1.setBounds(790, 250, 17, 48);

        jPanel3.setBackground(new java.awt.Color(153, 0, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("SEARCH DATE");

        tfSearch.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        tfSearch.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tfSearchPropertyChange(evt);
            }
        });
        tfSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfSearchKeyPressed(evt);
            }
        });

        btnSearch.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/comprog/Images/Search_52px.png"))); // NOI18N
        btnSearch.setText("SEARCH");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        btnSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnSearchKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(tfSearch, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnSearch, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(350, 450, 550, 60);

        btnLogOut.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnLogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/comprog/Images/Logout Rounded Left_48px.png"))); // NOI18N
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogOut);
        btnLogOut.setBounds(840, 20, 57, 40);

        jPanel2.setBackground(new java.awt.Color(153, 0, 0));
        jPanel2.setLayout(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 922, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        if (!tfName.getText().equals("")) {
            addActivity();
        } else {
            JOptionPane.showMessageDialog(null, "INVALID!", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed

        if (tfIDNum.getText().trim().isEmpty() || tfName.getText().trim().isEmpty() || tfCourse.getText().trim().isEmpty()
                || tfDate.getText().trim().isEmpty() || tfTimeIn.getText().trim().isEmpty() || tfTimeOut.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please fill all the empty fields!", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            if (lblID.getText().equals("")) {
                addActivity();
            } else {
                int id = Integer.parseInt(lblID.getText());
                updateActivity(id);
                clearFields();
            }
        }
    }//GEN-LAST:event_btnUpdateActionPerformed


    private void tblStudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblStudentMouseClicked

        int id = tblStudent.getSelectedRow();
        lblID.setText(tblStudent.getValueAt(id, 0).toString());
        tfIDNum.setText(tblStudent.getValueAt(id, 1).toString());
        tfName.setText(tblStudent.getValueAt(id, 2).toString());
        tfCourse.setText(tblStudent.getValueAt(id, 3).toString());
        tfDate.setText(tblStudent.getValueAt(id, 4).toString());
        tfTimeIn.setText(tblStudent.getValueAt(id, 5).toString());
        tfTimeOut.setText(tblStudent.getValueAt(id, 6).toString());
        lblID.setVisible(false);

    }//GEN-LAST:event_tblStudentMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int id = Integer.parseInt(lblID.getText());
        deleteActivity(id);
        clearFields();
        setActivityTable();

    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tfIDNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfIDNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfIDNumActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        clearFields();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        setActivityTable();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void tfSearchPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tfSearchPropertyChange
        setActivityTable();
        System.out.println("Error!");
    }//GEN-LAST:event_tfSearchPropertyChange

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        int tubag = JOptionPane.showConfirmDialog(null, "Are you sure you want to log out?", "Log Out", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (tubag == JOptionPane.YES_OPTION) {
            Welcome w = new Welcome();
            w.setVisible(true);
            dispose();
        } else if (tubag == JOptionPane.NO_OPTION) {

        }
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void btnSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSearchKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearchKeyPressed

    private void tfSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSearchKeyPressed
       if(evt.getKeyCode() == KeyEvent.VK_ENTER){
           setActivityTable();
       }
    }//GEN-LAST:event_tfSearchKeyPressed

//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(StudentProf.class
//                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
//
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(StudentProf.class
//                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
//
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(StudentProf.class
//                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
//
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(StudentProf.class
//                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new StudentProf().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel deyt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCourse;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblIDnum;
    private javax.swing.JLabel lblName;
    private javax.swing.JTable tblStudent;
    private javax.swing.JTextField tfCourse;
    private javax.swing.JTextField tfDate;
    private javax.swing.JTextField tfIDNum;
    private javax.swing.JTextField tfName;
    private javax.swing.JTextField tfSearch;
    private javax.swing.JTextField tfTimeIn;
    private javax.swing.JTextField tfTimeOut;
    private javax.swing.JLabel time;
    // End of variables declaration//GEN-END:variables

    private void setActivityTable() {
        try {
            String s = tfSearch.getText();
            String[][] data = Student.arraylistTo2dArray(Student.getStudentThruIdnum(s));
            String[] columnNames = {"ID", "ID number", "Name", "Course", "Date", "Time In", "Time Out"};

            DefaultTableModel dtm = new DefaultTableModel(data, columnNames);
            tblStudent.setModel(dtm);
            TableColumnModel col = tblStudent.getColumnModel();
            tblStudent.setColumnModel(col);
        } catch (SQLException ex) {
            Logger.getLogger(StudentProf.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void addActivity() {

        String id_number = tfIDNum.getText();
        String student = tfName.getText();
        String course = tfCourse.getText();
        String date = tfDate.getText();
        String time_in = tfTimeIn.getText();
        String time_out = tfTimeOut.getText();

        String q = "INSERT INTO `student_info` (`id`, `id_number`, `student`, `course`, `date`, `time_in`, `time_out`)"
                + " VALUES (NULL, '%s', '%s', '%s', '%s', '%s', '%s')";

        q = String.format(q, id_number, student, course, date, time_in, time_out);

        try {
            DB.query(q, true);
            JOptionPane.showMessageDialog(null, "Student successfully added!");
        } catch (SQLException ex) {
            Logger.getLogger(StudentProf.class.getName()).log(Level.SEVERE, null, ex);
        }
        setActivityTable();
        clearFields();
    }

    public void clearFields() {
        tfIDNum.setText("");
        tfName.setText("");
        tfCourse.setText("");
        tfDate.setText("");
        tfTimeIn.setText("");
        tfTimeOut.setText("");
    }

    public void updateActivity(int id) {
        String id_number = tfIDNum.getText();
        String student = tfName.getText();
        String course = tfCourse.getText();
        String date = tfDate.getText();
        String time_in = tfTimeIn.getText();
        String time_out = tfTimeOut.getText();

        String q = "UPDATE `student_info` SET `id_number` = '%s', `student` = '%s', `course` = '%s', `date` = '%s', `time_in` = '%s', `time_out` = '%s'"
                + " WHERE `student_info`.`id` = '%d'";

        q = String.format(q, id_number, student, course, date, time_in, time_out, id);

        try {
            DB.query(q, true);
            JOptionPane.showMessageDialog(null, "Student successfully updated!");
        } catch (SQLException ex) {
            Logger.getLogger(StudentProf.class.getName()).log(Level.SEVERE, null, ex);
        }
        setActivityTable();
        clearFields();
    }

    public void deleteActivity(int id) {

        String q = "DELETE FROM `student_info` WHERE `student_info`.`id` = %d";

        q = String.format(q, id);

        try {
            DB.query(q, true);
            JOptionPane.showMessageDialog(null, "Student successfully deleted!");
        } catch (SQLException ex) {
            Logger.getLogger(StudentProf.class.getName()).log(Level.SEVERE, null, ex);
        }
        setActivityTable();
        clearFields();
    }

    public void Empty() {
        if (tfName.getText().trim().isEmpty() || tfDate.getText().trim().isEmpty() || tfIDNum.getText().trim().isEmpty()
                || tfCourse.getText().trim().isEmpty() || tfTimeIn.getText().isEmpty() || tfTimeOut.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "There are fields that is EMPTY!", "Error!", JOptionPane.ERROR_MESSAGE);
        } else {
            DefaultTableModel model = (DefaultTableModel) tblStudent.getModel();
            if (!tfName.getText().trim().equals("")) {
                model.addRow(new Object[]{tfIDNum.getText(), tfName.getText(), tfCourse.getText(), tfDate.getText(),
                    tfTimeIn.getText(), tfTimeOut.getText()});
            }
        }

    }
}
