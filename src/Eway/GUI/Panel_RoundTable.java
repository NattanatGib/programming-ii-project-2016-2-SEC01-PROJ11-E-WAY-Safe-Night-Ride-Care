/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Eway.GUI;

import Eway.model.Booking;
import Eway.model.ConnectionBuilder;
import Eway.model.Person;
import java.awt.Color;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */

public class Panel_RoundTable extends java.awt.Panel {
    Person person;
    /**
     * Creates new form BookingHomepage
     */
    public void setPerson(Person person){
        this.person=person;
    }
    public Panel_RoundTable() {
        initComponents();
        //panel_top.setBackground(new Color(51,58,72));
        //panel_center.setBackground(new Color(25,95,25,10));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_top = new javax.swing.JPanel();
        roundTable = new javax.swing.JLabel();
        panel_center = new javax.swing.JPanel();
        btn_booking = new javax.swing.JButton();
        cbbox_send = new javax.swing.JComboBox<>();
        cbbox_pickup = new javax.swing.JComboBox<>();
        txt_etctime = new javax.swing.JTextField();
        logoPickup = new javax.swing.JLabel();
        cbbox_time = new javax.swing.JComboBox<>();
        logoPhone = new javax.swing.JLabel();
        txt_phone = new javax.swing.JTextField();
        logoTime = new javax.swing.JLabel();
        logoSend = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        pickupPlace = new javax.swing.JLabel();
        sendPlace = new javax.swing.JLabel();
        phoneNum = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setMinimumSize(new java.awt.Dimension(576, 441));
        setPreferredSize(new java.awt.Dimension(576, 441));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_top.setBackground(new java.awt.Color(0, 58, 72));
        panel_top.setForeground(new java.awt.Color(51, 0, 51));
        panel_top.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        roundTable.setFont(new java.awt.Font("OCR A Std", 0, 24)); // NOI18N
        roundTable.setForeground(new java.awt.Color(204, 204, 204));
        roundTable.setText("Round Table");
        panel_top.add(roundTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 190, 50));

        add(panel_top, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 70));

        panel_center.setBackground(new java.awt.Color(0, 58, 72));
        panel_center.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_booking.setBackground(new java.awt.Color(103, 197, 233));
        btn_booking.setFont(new java.awt.Font("TH Sarabun New", 1, 24)); // NOI18N
        btn_booking.setForeground(new java.awt.Color(255, 255, 255));
        btn_booking.setText("BOOKING");
        btn_booking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bookingActionPerformed(evt);
            }
        });
        panel_center.add(btn_booking, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 110, 40));

        cbbox_send.setBackground(new java.awt.Color(103, 197, 233));
        cbbox_send.setFont(new java.awt.Font("TH Sarabun New", 0, 22)); // NOI18N
        cbbox_send.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "หอพัก myplace", "หอพัก myplace2", "คอนโดบ้านสวนธน", "หอพักธนบุญ", "the parque", "คอสโม เรสซิเดนซ์", "Residence", "หอพักรัชสิทธิ์", "TN modern place", "Library houze", "สวนธนปาร์ค" }));
        cbbox_send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbox_sendActionPerformed(evt);
            }
        });
        panel_center.add(cbbox_send, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, 170, 30));

        cbbox_pickup.setBackground(new java.awt.Color(103, 197, 233));
        cbbox_pickup.setFont(new java.awt.Font("TH Sarabun New", 0, 22)); // NOI18N
        cbbox_pickup.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SIT", "ตึกอธิการ", "ตึก14ชั้น", "หอหญิง", "หน้า7-11วิศวะ", "ตึกแดง", "หน้าKFC", "FIBO", "หน้าตึกphysicLNG", "หน้าตึกวิศวะเคมี", "CB3", "CB4", "CB5(GMI)", "Learning Space" }));
        cbbox_pickup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbox_pickupActionPerformed(evt);
            }
        });
        panel_center.add(cbbox_pickup, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 170, 30));

        txt_etctime.setBackground(new java.awt.Color(204, 204, 204));
        txt_etctime.setFont(new java.awt.Font("TH Sarabun New", 0, 22)); // NOI18N
        txt_etctime.setForeground(new java.awt.Color(153, 153, 153));
        txt_etctime.setText("etc.");
        txt_etctime.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_etctimeFocusGained(evt);
            }
        });
        txt_etctime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_etctimeActionPerformed(evt);
            }
        });
        panel_center.add(txt_etctime, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 170, 30));

        logoPickup.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Desktop\\gib\\IT\\ปี1 เทอม2\\INT105 java\\Project\\E-way-project\\icon\\busstop_pointer.png")); // NOI18N
        panel_center.add(logoPickup, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        cbbox_time.setBackground(new java.awt.Color(103, 197, 233));
        cbbox_time.setFont(new java.awt.Font("TH Sarabun New", 0, 22)); // NOI18N
        cbbox_time.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "23.00 pm.", "00.00 pm.", "01.00 am.", "Etc." }));
        cbbox_time.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbox_timeActionPerformed(evt);
            }
        });
        panel_center.add(cbbox_time, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 170, 30));

        logoPhone.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Desktop\\gib\\IT\\ปี1 เทอม2\\INT105 java\\Project\\E-way-project\\icon\\telephone.png")); // NOI18N
        panel_center.add(logoPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, -1, -1));

        txt_phone.setBackground(new java.awt.Color(204, 204, 204));
        txt_phone.setFont(new java.awt.Font("TH Sarabun New", 0, 22)); // NOI18N
        txt_phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_phoneActionPerformed(evt);
            }
        });
        panel_center.add(txt_phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, 170, 30));

        logoTime.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Desktop\\gib\\IT\\ปี1 เทอม2\\INT105 java\\Project\\E-way-project\\icon\\clock.png")); // NOI18N
        panel_center.add(logoTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, -1));

        logoSend.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Desktop\\gib\\IT\\ปี1 เทอม2\\INT105 java\\Project\\E-way-project\\icon\\sent-mail.png")); // NOI18N
        panel_center.add(logoSend, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, -1, -1));

        time.setBackground(new java.awt.Color(255, 255, 255));
        time.setFont(new java.awt.Font("TH Sarabun New", 1, 28)); // NOI18N
        time.setForeground(new java.awt.Color(240, 240, 240));
        time.setText("Time");
        panel_center.add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 140, 50));

        pickupPlace.setBackground(new java.awt.Color(255, 255, 255));
        pickupPlace.setFont(new java.awt.Font("TH Sarabun New", 1, 28)); // NOI18N
        pickupPlace.setForeground(new java.awt.Color(240, 240, 240));
        pickupPlace.setText("Pickup Place");
        panel_center.add(pickupPlace, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 200, 50));

        sendPlace.setBackground(new java.awt.Color(255, 255, 255));
        sendPlace.setFont(new java.awt.Font("TH Sarabun New", 1, 28)); // NOI18N
        sendPlace.setForeground(new java.awt.Color(240, 240, 240));
        sendPlace.setText("Send Place");
        panel_center.add(sendPlace, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 210, 50));

        phoneNum.setBackground(new java.awt.Color(255, 255, 255));
        phoneNum.setFont(new java.awt.Font("TH Sarabun New", 1, 28)); // NOI18N
        phoneNum.setForeground(new java.awt.Color(240, 240, 240));
        phoneNum.setText("Phone Number");
        panel_center.add(phoneNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 230, 50));
        panel_center.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 528, 10));

        add(panel_center, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 570, 380));
    }// </editor-fold>//GEN-END:initComponents

    private void btn_bookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bookingActionPerformed
        System.out.println(person);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date dt = new Date();
        String date = format.format(dt);
        String time = "";
        //--------------------------------Time----------------------------//
        int cbboxTime = cbbox_time.getSelectedIndex()+1;
        if(cbboxTime==1){//กรณีเลือกเวลา23.00
            time = " 23:00:00";
        }
        else if(cbboxTime==2){//กรณีเลือกเวลา23.00
            time = " 24:00:00";
        }
        else if(cbboxTime==3){//กรณีเลือกเวลา23.00
            time = " 01:00:00";
        }
        else{//กรณีเลือกเวลา23.00
            String showTime = txt_etctime.getText();
            CharSequence notAllowChar= "abcdefghijlmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*()_+-/";
            if(!showTime.contains(notAllowChar)){
                String showHr = showTime.substring(0,2);//ตัดชั่วโมง
                String showMin = showTime.substring(3,5);//ตัดนาที
                time =" " +showHr+":"+showMin+":"+"00";//เก็บเวลาลงtimestamp
            }else{
                JOptionPane.showMessageDialog(null,"Enter Again please ");
                txt_etctime.requestFocus();
            }    
        }
        //----------------------------------------------------------------//
        Person std = this.person;
        int receiveId = cbbox_pickup.getSelectedIndex()+1;
        int sendId = cbbox_send.getSelectedIndex()+11;
        //เก็บข้อมูลลงdb BOOKING
        
        ResultSet rs=null;
        try{
            String sql ="Select * From BOOKING Where Booking_DATE = CURDATE() AND Person_Id = ? ";
            Connection con = ConnectionBuilder.getConnection(); 
            PreparedStatement st=con.prepareStatement(sql); 
            st.setInt(1,person.getPersonId());
            rs=st.executeQuery();
            con.close();
        }catch(SQLException e){
            System.out.println(e);
        }   
        
        //------check that user enter all information--------
     
        CharSequence notAllowChar= "abcdefghijlmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*()_+-/";
        try {
            if(!rs.next()){
                if((txt_phone.getText().length()==0||(txt_phone.getText()).length()==10)&&!txt_phone.getText().contains(notAllowChar)){
                    if(cbbox_time.getSelectedIndex()==3){
                        if((txt_etctime.getText()).equals("")){
                            JOptionPane.showMessageDialog(this,"Please enter time booking");
                            txt_etctime.requestFocus();
                        }else
                            new Booking(time, date, std, receiveId, sendId,std.getTel());
                    }
                    else if(cbbox_time.getSelectedIndex()!=3 &&!(txt_etctime.getText()).equals("etc.")){
                        JOptionPane.showMessageDialog(this,"Choose time again!");
                        txt_etctime.setText("etc.");
                    }
                    else{
                        if(txt_phone.getText().equals("")){
                            Booking book = new Booking(time, date, std, receiveId, sendId,std.getTel());
                        }else{
                            Booking book = new Booking(time, date, std, receiveId, sendId,txt_phone.getText());
                            JOptionPane.showMessageDialog(this,"You can see your booking in Booking List");
                        }
                    }
                }else{
                    JOptionPane.showMessageDialog(this,"Please check your phone number again");
                    txt_phone.requestFocus();
                }
            }else
                JOptionPane.showMessageDialog(this,"You've book already kub");
            
        } catch (SQLException ex) {
            System.out.println(ex);;
        }
        
    }//GEN-LAST:event_btn_bookingActionPerformed

    private void cbbox_sendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbox_sendActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbox_sendActionPerformed

    private void txt_etctimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_etctimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_etctimeActionPerformed

    private void cbbox_timeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbox_timeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbox_timeActionPerformed

    private void txt_phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_phoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_phoneActionPerformed

    private void txt_etctimeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_etctimeFocusGained
        txt_etctime.setText("");
        txt_etctime.setForeground(Color.black);
    }//GEN-LAST:event_txt_etctimeFocusGained

    private void cbbox_pickupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbox_pickupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbox_pickupActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_booking;
    private javax.swing.JComboBox<String> cbbox_pickup;
    private javax.swing.JComboBox<String> cbbox_send;
    private javax.swing.JComboBox<String> cbbox_time;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel logoPhone;
    private javax.swing.JLabel logoPickup;
    private javax.swing.JLabel logoSend;
    private javax.swing.JLabel logoTime;
    private javax.swing.JPanel panel_center;
    private javax.swing.JPanel panel_top;
    private javax.swing.JLabel phoneNum;
    private javax.swing.JLabel pickupPlace;
    private javax.swing.JLabel roundTable;
    private javax.swing.JLabel sendPlace;
    private javax.swing.JLabel time;
    private javax.swing.JTextField txt_etctime;
    private javax.swing.JTextField txt_phone;
    // End of variables declaration//GEN-END:variables
}
