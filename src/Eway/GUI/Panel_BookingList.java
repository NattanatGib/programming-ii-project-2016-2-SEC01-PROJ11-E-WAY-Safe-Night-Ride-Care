/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Eway.GUI;

import Eway.model.ConnectionBuilder;
import Eway.model.Person;
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hp
 */
public class Panel_BookingList extends javax.swing.JPanel {
    private Person person;
    /**
     * Creates new form Panel_BookingList
     */
    public void setPerson(Person person){
       this.person=person;
    }
    public Panel_BookingList() {
        initComponents();
        
        pn_editDetail.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialog_save = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        dialog_del = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        panel_top = new javax.swing.JPanel();
        bookingList = new javax.swing.JLabel();
        logoRefresh = new javax.swing.JLabel();
        panel_center = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        pn_del = new javax.swing.JPanel();
        lb_del = new javax.swing.JLabel();
        pn_editDetail = new javax.swing.JPanel();
        logoTime = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        logoPickup = new javax.swing.JLabel();
        pickupPlace = new javax.swing.JLabel();
        logoSend = new javax.swing.JLabel();
        sendPlace = new javax.swing.JLabel();
        logoPhone = new javax.swing.JLabel();
        phoneNum = new javax.swing.JLabel();
        cbbox_pickup = new javax.swing.JComboBox<>();
        cbbox_send = new javax.swing.JComboBox<>();
        txt_phone = new javax.swing.JTextField();
        lb_edit1 = new javax.swing.JLabel();
        txt_time = new javax.swing.JTextField();
        btn_save = new javax.swing.JButton();
        btn_cancel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        BookingList = new javax.swing.JTable();
        logoEdit = new javax.swing.JLabel();
        pn_edit = new javax.swing.JPanel();
        lb_edit = new javax.swing.JLabel();
        logoBin = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(247, 247, 247));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator2.setForeground(new java.awt.Color(153, 153, 153));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 319, 20));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("Confirmation");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 130, 21));

        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("Make sure that you want to change ...");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 65, 215, 21));

        jButton1.setText("Cancel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, -1, -1));

        jButton2.setText("OK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 60, -1));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, -1));

        javax.swing.GroupLayout dialog_saveLayout = new javax.swing.GroupLayout(dialog_save.getContentPane());
        dialog_save.getContentPane().setLayout(dialog_saveLayout);
        dialog_saveLayout.setHorizontalGroup(
            dialog_saveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        dialog_saveLayout.setVerticalGroup(
            dialog_saveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(247, 247, 247));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator3.setForeground(new java.awt.Color(153, 153, 153));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 319, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setText("Confirmation");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 130, 21));

        jLabel5.setForeground(new java.awt.Color(0, 153, 153));
        jLabel5.setText("Make sure that you Will delete data ...");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 65, 215, 21));

        jButton3.setText("Cancel");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, -1, -1));

        jButton4.setText("OK");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 60, -1));
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, -1));

        javax.swing.GroupLayout dialog_delLayout = new javax.swing.GroupLayout(dialog_del.getContentPane());
        dialog_del.getContentPane().setLayout(dialog_delLayout);
        dialog_delLayout.setHorizontalGroup(
            dialog_delLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        dialog_delLayout.setVerticalGroup(
            dialog_delLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
        );

        setMinimumSize(new java.awt.Dimension(567, 441));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_top.setBackground(new java.awt.Color(0, 58, 72));
        panel_top.setForeground(new java.awt.Color(51, 0, 51));
        panel_top.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bookingList.setFont(new java.awt.Font("OCR A Std", 0, 24)); // NOI18N
        bookingList.setForeground(new java.awt.Color(204, 204, 204));
        bookingList.setText("Booking List");
        panel_top.add(bookingList, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 220, 50));

        logoRefresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoRefreshMouseClicked(evt);
            }
        });
        panel_top.add(logoRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, -1, -1));

        add(panel_top, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 70));

        panel_center.setBackground(new java.awt.Color(0, 58, 72));
        panel_center.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panel_center.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 528, 10));

        pn_del.setBackground(new java.awt.Color(204, 204, 204));

        lb_del.setFont(new java.awt.Font("TH Sarabun New", 0, 20)); // NOI18N
        lb_del.setForeground(new java.awt.Color(255, 255, 255));
        lb_del.setText("Delete");

        javax.swing.GroupLayout pn_delLayout = new javax.swing.GroupLayout(pn_del);
        pn_del.setLayout(pn_delLayout);
        pn_delLayout.setHorizontalGroup(
            pn_delLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_delLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lb_del)
                .addContainerGap())
        );
        pn_delLayout.setVerticalGroup(
            pn_delLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb_del, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, Short.MAX_VALUE)
        );

        panel_center.add(pn_del, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 40, -1, 20));

        pn_editDetail.setBackground(new java.awt.Color(0, 153, 153));

        time.setBackground(new java.awt.Color(255, 255, 255));
        time.setFont(new java.awt.Font("TH Sarabun New", 1, 24)); // NOI18N
        time.setForeground(new java.awt.Color(240, 240, 240));
        time.setText("Time");

        pickupPlace.setBackground(new java.awt.Color(255, 255, 255));
        pickupPlace.setFont(new java.awt.Font("TH Sarabun New", 1, 24)); // NOI18N
        pickupPlace.setForeground(new java.awt.Color(240, 240, 240));
        pickupPlace.setText("Pickup Place");

        sendPlace.setBackground(new java.awt.Color(255, 255, 255));
        sendPlace.setFont(new java.awt.Font("TH Sarabun New", 1, 24)); // NOI18N
        sendPlace.setForeground(new java.awt.Color(240, 240, 240));
        sendPlace.setText("Send Place");

        phoneNum.setBackground(new java.awt.Color(255, 255, 255));
        phoneNum.setFont(new java.awt.Font("TH Sarabun New", 1, 24)); // NOI18N
        phoneNum.setForeground(new java.awt.Color(240, 240, 240));
        phoneNum.setText("Phone Number");

        cbbox_pickup.setBackground(new java.awt.Color(103, 197, 233));
        cbbox_pickup.setFont(new java.awt.Font("TH Sarabun New", 0, 22)); // NOI18N
        cbbox_pickup.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SIT", "ตึกอธิการ", "ตึก14ชั้น", "หอหญิง", "หน้า7-11วิศวะ", "ตึกแดง", "หน้าKFC", "FIBO", "หน้าตึกphysic", "หน้าตึกอธิการ", "LNG", "หน้าตึกวิศวะเคมี", "CB3", "CB4", "CB5(GMI)", "ตึกอธิการ", "Learning Space" }));

        cbbox_send.setBackground(new java.awt.Color(103, 197, 233));
        cbbox_send.setFont(new java.awt.Font("TH Sarabun New", 0, 22)); // NOI18N
        cbbox_send.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "หอพัก myplace", "หอพัก myplace2", "คอนโดบ้านสวนธน", "หอพักธนบุญ", "the parque", "คอสโม เรสซิเดนซ์", "Residence", "หอพักรัชสิทธิ์", "TN modern place", "Library houze", "สวนธนปาร์ค" }));
        cbbox_send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbox_sendActionPerformed(evt);
            }
        });

        txt_phone.setBackground(new java.awt.Color(240, 240, 240));
        txt_phone.setFont(new java.awt.Font("TH Sarabun New", 0, 22)); // NOI18N
        txt_phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_phoneActionPerformed(evt);
            }
        });

        lb_edit1.setFont(new java.awt.Font("TH Sarabun New", 1, 28)); // NOI18N
        lb_edit1.setForeground(new java.awt.Color(255, 255, 255));
        lb_edit1.setText("Edit");

        txt_time.setBackground(new java.awt.Color(240, 240, 240));
        txt_time.setFont(new java.awt.Font("TH Sarabun New", 0, 22)); // NOI18N
        txt_time.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_timeActionPerformed(evt);
            }
        });

        btn_save.setBackground(new java.awt.Color(0, 58, 72));
        btn_save.setFont(new java.awt.Font("TH Sarabun New", 1, 20)); // NOI18N
        btn_save.setForeground(new java.awt.Color(255, 255, 255));
        btn_save.setText("SAVE");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        btn_cancel.setBackground(new java.awt.Color(0, 58, 72));
        btn_cancel.setFont(new java.awt.Font("TH Sarabun New", 1, 20)); // NOI18N
        btn_cancel.setForeground(new java.awt.Color(255, 255, 255));
        btn_cancel.setText("CANCLE");
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn_editDetailLayout = new javax.swing.GroupLayout(pn_editDetail);
        pn_editDetail.setLayout(pn_editDetailLayout);
        pn_editDetailLayout.setHorizontalGroup(
            pn_editDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_editDetailLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_editDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_edit1)
                    .addGroup(pn_editDetailLayout.createSequentialGroup()
                        .addGroup(pn_editDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pn_editDetailLayout.createSequentialGroup()
                                .addGroup(pn_editDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(logoTime)
                                    .addComponent(logoSend))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pn_editDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sendPlace)
                                    .addComponent(time)))
                            .addGroup(pn_editDetailLayout.createSequentialGroup()
                                .addComponent(logoPickup)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pickupPlace, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(26, 26, 26)
                        .addGroup(pn_editDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbbox_send, 0, 1, Short.MAX_VALUE)
                            .addComponent(cbbox_pickup, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_time)))
                    .addGroup(pn_editDetailLayout.createSequentialGroup()
                        .addComponent(logoPhone)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(phoneNum)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_editDetailLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_cancel)
                .addGap(72, 72, 72))
        );
        pn_editDetailLayout.setVerticalGroup(
            pn_editDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_editDetailLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(pn_editDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pn_editDetailLayout.createSequentialGroup()
                        .addComponent(lb_edit1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pn_editDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(logoTime))
                        .addGap(11, 11, 11)
                        .addGroup(pn_editDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(logoPickup)
                            .addComponent(pickupPlace, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pn_editDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pn_editDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(sendPlace, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbbox_send, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(logoSend)))
                    .addGroup(pn_editDetailLayout.createSequentialGroup()
                        .addComponent(txt_time, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbbox_pickup, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)))
                .addGap(11, 11, 11)
                .addGroup(pn_editDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pn_editDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(phoneNum, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(logoPhone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(pn_editDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panel_center.add(pn_editDetail, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 320, 220));

        BookingList.setModel(new javax.swing.table.DefaultTableModel(
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
        BookingList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BookingListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(BookingList);

        panel_center.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 420, 60));

        logoEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoEditMouseClicked(evt);
            }
        });
        panel_center.add(logoEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, -1, -1));

        pn_edit.setBackground(new java.awt.Color(204, 204, 204));

        lb_edit.setFont(new java.awt.Font("TH Sarabun New", 0, 20)); // NOI18N
        lb_edit.setForeground(new java.awt.Color(255, 255, 255));
        lb_edit.setText("Edit");

        javax.swing.GroupLayout pn_editLayout = new javax.swing.GroupLayout(pn_edit);
        pn_edit.setLayout(pn_editLayout);
        pn_editLayout.setHorizontalGroup(
            pn_editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_editLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lb_edit)
                .addContainerGap())
        );
        pn_editLayout.setVerticalGroup(
            pn_editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb_edit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, Short.MAX_VALUE)
        );

        panel_center.add(pn_edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 40, -1, 20));

        logoBin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoBinMouseClicked(evt);
            }
        });
        panel_center.add(logoBin, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, -1, -1));

        add(panel_center, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 570, 380));
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        pn_editDetail.setVisible(false);
    }//GEN-LAST:event_btn_cancelActionPerformed

    private void cbbox_sendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbox_sendActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbox_sendActionPerformed

    private void txt_phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_phoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_phoneActionPerformed

    private void txt_timeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_timeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_timeActionPerformed

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        dialog_save.setVisible(true);
        dialog_save.pack();
        dialog_save.setLocationRelativeTo(null);//setให้GUIแสดงตรงกลางจอคอม
    }//GEN-LAST:event_btn_saveActionPerformed

    private void logoRefreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoRefreshMouseClicked
        pn_editDetail.setVisible(false);
        System.out.println("Mouse is Clicked");
        callList("Select * from BOOKING where Person_Id=" + this.person.getPersonId());
    }//GEN-LAST:event_logoRefreshMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dialog_save.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dialog_save.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        dialog_del.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dialog_del.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void logoEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoEditMouseClicked
        pn_editDetail.setVisible(true);
    }//GEN-LAST:event_logoEditMouseClicked

    private void logoBinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoBinMouseClicked
                
        ResultSet table=Eway.model.Booking.findBookingById(person.getPersonId());
        
            try{
                if(table.last()){
                    Eway.model.Booking.cancelBooking(table.getInt("Booking_ID"));
                    System.out.println("Success" + table.getInt("Booking_ID")+table.getInt("Person_Id"));
                }else{
                    System.out.println("Pang");
                }    
            }catch(SQLException e){
                System.out.println(e);
            }
        dialog_del.setVisible(true);
        dialog_del.pack();
        dialog_del.setLocationRelativeTo(null);//setให้GUIแสดงตรงกลางจอคอม
    }//GEN-LAST:event_logoBinMouseClicked

    private void BookingListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BookingListMouseClicked
        int row = BookingList.getSelectedRow();
        System.out.println(BookingList.getValueAt(row, 1));
    }//GEN-LAST:event_BookingListMouseClicked

     public void callList(String ds){
        //clear table
        BookingList.setModel(new DefaultTableModel());
        
        //Model for Table
        DefaultTableModel model=(DefaultTableModel)BookingList.getModel();
        model.addColumn("NO.");
        model.addColumn("Date");
        model.addColumn("Time");
        model.addColumn("Pickup Place");
        model.addColumn("Send Place");
       
        
        
        Connection con=ConnectionBuilder.getConnection();
        Statement st=null;
        
        try{
            st=con.createStatement();
            
            
            //"select * from Booking order by  Booking_Date desc"
            String sql=ds;
            
            ResultSet rec=st.executeQuery(sql);
            int row=0;
            while((rec!=null)&&rec.next()){
                model.addRow(new Object[0]);
                model.setValueAt(rec.getInt("Booking_Id"),row,0);
                model.setValueAt(rec.getString("Booking_Date"),row,1);
                model.setValueAt(rec.getString("Booking_Round"),row,2);
                model.setValueAt(rec.getString(4),row,3);
                model.setValueAt(rec.getString(5),row,4);
                row++;
            }
        }catch(SQLException  e){
            System.out.println(e);
        }
        
    }

    public JTable getBookingList() {
        return BookingList;
    }
    
     
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable BookingList;
    private javax.swing.JLabel bookingList;
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_save;
    private javax.swing.JComboBox<String> cbbox_pickup;
    private javax.swing.JComboBox<String> cbbox_send;
    private javax.swing.JDialog dialog_del;
    private javax.swing.JDialog dialog_save;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lb_del;
    private javax.swing.JLabel lb_edit;
    private javax.swing.JLabel lb_edit1;
    private javax.swing.JLabel logoBin;
    private javax.swing.JLabel logoEdit;
    private javax.swing.JLabel logoPhone;
    private javax.swing.JLabel logoPickup;
    private javax.swing.JLabel logoRefresh;
    private javax.swing.JLabel logoSend;
    private javax.swing.JLabel logoTime;
    private javax.swing.JPanel panel_center;
    private javax.swing.JPanel panel_top;
    private javax.swing.JLabel phoneNum;
    private javax.swing.JLabel pickupPlace;
    private javax.swing.JPanel pn_del;
    private javax.swing.JPanel pn_edit;
    private javax.swing.JPanel pn_editDetail;
    private javax.swing.JLabel sendPlace;
    private javax.swing.JLabel time;
    private javax.swing.JTextField txt_phone;
    private javax.swing.JTextField txt_time;
    // End of variables declaration//GEN-END:variables
}
