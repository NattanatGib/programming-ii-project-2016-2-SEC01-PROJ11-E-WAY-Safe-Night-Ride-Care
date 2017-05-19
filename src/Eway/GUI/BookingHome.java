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
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hp
 */
public class BookingHome extends javax.swing.JFrame {

    Person person;
    GridBagLayout layout = new GridBagLayout();
    Panel_RoundTable p1;
    Panel_BookingList p2;
    Panel_EditProfile p3;
    String name = "";

    /**
     * Creates new form BookingHome
     */
    public void setPerson(Person person) {
        this.person = person;

    }

    public BookingHome(Person person) {
        initComponents();
        //panel_btn.setBackground(new Color(255, 255, 255, 0));
        btn_roundTable.setBackground(new Color(255, 255, 255, 0));
        btn_bookingList.setBackground(new Color(255, 255, 255, 0));
        btn_editProfile.setBackground(new Color(255, 255, 255, 0));
        btn_logout.setBackground(new Color(255, 255, 255, 0));

        p1 = new Panel_RoundTable();
        p2 = new Panel_BookingList();
        p3 = new Panel_EditProfile(person);
        DynamicPanel.setLayout(layout);
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        DynamicPanel.add(p1, c);
        c.gridx = 0;
        c.gridy = 0;
        DynamicPanel.add(p2, c);
        c.gridx = 0;
        c.gridy = 0;
        DynamicPanel.add(p3, c);
        p1.setVisible(true);
        p2.setVisible(false);
        p3.setVisible(false);

        this.setLocationRelativeTo(null);//setให้GUIแสดงตรงกลางจอคอม
        this.person = person;
        this.name = this.person.getStuName();
        showName.setText(name);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_wallpp = new javax.swing.JPanel();
        panel_top = new javax.swing.JPanel();
        eway = new javax.swing.JLabel();
        showName = new javax.swing.JLabel();
        logoUser = new javax.swing.JLabel();
        btn_logout = new javax.swing.JButton();
        panel_btn = new javax.swing.JPanel();
        btn_roundTable = new javax.swing.JButton();
        btn_bookingList = new javax.swing.JButton();
        btn_editProfile = new javax.swing.JButton();
        logoBus = new javax.swing.JLabel();
        DynamicPanel = new javax.swing.JPanel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_wallpp.setBackground(new java.awt.Color(0, 58, 72));
        panel_wallpp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_top.setBackground(new java.awt.Color(103, 197, 233));
        panel_top.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        eway.setFont(new java.awt.Font("FreesiaUPC", 1, 28)); // NOI18N
        eway.setForeground(new java.awt.Color(255, 255, 255));
        eway.setText("E-WAYS");
        panel_top.add(eway, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 20));

        showName.setBackground(new java.awt.Color(204, 204, 204));
        showName.setFont(new java.awt.Font("TH Sarabun New", 1, 20)); // NOI18N
        showName.setForeground(new java.awt.Color(255, 255, 255));
        showName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        showName.setText(name);
        panel_top.add(showName, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 190, 20));

        logoUser.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Desktop\\gib\\IT\\ปี1 เทอม2\\INT105 java\\Project\\E-way-project\\icon\\user (1).png")); // NOI18N
        panel_top.add(logoUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, -1, -1));

        btn_logout.setBackground(new java.awt.Color(255, 255, 255));
        btn_logout.setFont(new java.awt.Font("TH Sarabun New", 1, 20)); // NOI18N
        btn_logout.setForeground(new java.awt.Color(255, 255, 255));
        btn_logout.setText("logout");
        btn_logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_logoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_logoutMouseExited(evt);
            }
        });
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });
        panel_top.add(btn_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, -1, 20));

        panel_wallpp.add(panel_top, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 750, 42));

        panel_btn.setBackground(new java.awt.Color(103, 196, 233));
        panel_btn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_roundTable.setFont(new java.awt.Font("FreesiaUPC", 1, 26)); // NOI18N
        btn_roundTable.setForeground(new java.awt.Color(255, 255, 255));
        btn_roundTable.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Desktop\\gib\\IT\\ปี1 เทอม2\\INT105 java\\Project\\E-way-project\\icon\\table-grid24x24.png")); // NOI18N
        btn_roundTable.setText(" Round Table");
        btn_roundTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_roundTableMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_roundTableMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_roundTableMouseExited(evt);
            }
        });
        btn_roundTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_roundTableActionPerformed(evt);
            }
        });
        panel_btn.add(btn_roundTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        btn_bookingList.setBackground(new java.awt.Color(255, 255, 255));
        btn_bookingList.setFont(new java.awt.Font("FreesiaUPC", 1, 26)); // NOI18N
        btn_bookingList.setForeground(new java.awt.Color(255, 255, 255));
        btn_bookingList.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Desktop\\gib\\IT\\ปี1 เทอม2\\INT105 java\\Project\\E-way-project\\icon\\notebook24x24.png")); // NOI18N
        btn_bookingList.setText(" Booking List");
        btn_bookingList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_bookingListMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_bookingListMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_bookingListMouseExited(evt);
            }
        });
        btn_bookingList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bookingListActionPerformed(evt);
            }
        });
        panel_btn.add(btn_bookingList, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        btn_editProfile.setBackground(new java.awt.Color(255, 255, 255));
        btn_editProfile.setFont(new java.awt.Font("FreesiaUPC", 1, 26)); // NOI18N
        btn_editProfile.setForeground(new java.awt.Color(255, 255, 255));
        btn_editProfile.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Desktop\\gib\\IT\\ปี1 เทอม2\\INT105 java\\Project\\E-way-project\\icon\\editprofile24x24.png")); // NOI18N
        btn_editProfile.setText(" Edit Profile");
        btn_editProfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_editProfileMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_editProfileMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_editProfileMouseExited(evt);
            }
        });
        btn_editProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editProfileActionPerformed(evt);
            }
        });
        panel_btn.add(btn_editProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        logoBus.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Desktop\\gib\\IT\\ปี1 เทอม2\\INT105 java\\Project\\E-way-project\\icon\\bus128px.png")); // NOI18N
        panel_btn.add(logoBus, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 130, 130));

        panel_wallpp.add(panel_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 48, 177, 441));
        panel_wallpp.add(DynamicPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 48, 567, 440));

        bg.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Desktop\\gib\\IT\\ปี1 เทอม2\\INT105 java\\Project\\E-way-project\\icon\\night-city-road-wallpaper.png")); // NOI18N
        panel_wallpp.add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 540));

        getContentPane().add(panel_wallpp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_roundTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_roundTableActionPerformed
        p1.setVisible(true);
        p2.setVisible(false);
        p3.setVisible(false);
        p1.setPerson(person);
    }//GEN-LAST:event_btn_roundTableActionPerformed

    private void btn_bookingListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bookingListActionPerformed

        callList("Select * from BOOKING where BOOKING_DATE = CURDATE() and PERSON_ID=" + this.person.getPersonId());

        p1.setVisible(false);
        p2.setVisible(true);
        p3.setVisible(false);
        p2.setPerson(person);
    }//GEN-LAST:event_btn_bookingListActionPerformed

    private void btn_roundTableMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_roundTableMouseEntered
        btn_roundTable.setForeground(new java.awt.Color(0, 58, 72));
        btn_roundTable.setFont(new java.awt.Font("FreesiaUPC", 1, 28));
    }//GEN-LAST:event_btn_roundTableMouseEntered

    private void btn_roundTableMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_roundTableMouseExited
        btn_roundTable.setForeground(new java.awt.Color(255, 255, 255));
        btn_roundTable.setFont(new java.awt.Font("FreesiaUPC", 1, 26));
    }//GEN-LAST:event_btn_roundTableMouseExited

    private void btn_roundTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_roundTableMouseClicked
        btn_roundTable.setForeground(new java.awt.Color(255, 255, 51));
    }//GEN-LAST:event_btn_roundTableMouseClicked

    private void btn_bookingListMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_bookingListMouseEntered
        btn_bookingList.setForeground(new java.awt.Color(0, 58, 72));
        btn_bookingList.setFont(new java.awt.Font("FreesiaUPC", 1, 28));
    }//GEN-LAST:event_btn_bookingListMouseEntered

    private void btn_bookingListMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_bookingListMouseExited
        btn_bookingList.setForeground(new java.awt.Color(255, 255, 255));
        btn_bookingList.setFont(new java.awt.Font("FreesiaUPC", 1, 26));
    }//GEN-LAST:event_btn_bookingListMouseExited

    private void btn_bookingListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_bookingListMouseClicked
        btn_bookingList.setForeground(new java.awt.Color(255, 255, 51));
    }//GEN-LAST:event_btn_bookingListMouseClicked

    private void btn_editProfileMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_editProfileMouseEntered
        btn_editProfile.setForeground(new java.awt.Color(0, 58, 72));
        btn_editProfile.setFont(new java.awt.Font("FreesiaUPC", 1, 28));
    }//GEN-LAST:event_btn_editProfileMouseEntered

    private void btn_editProfileMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_editProfileMouseExited
        btn_editProfile.setForeground(new java.awt.Color(255, 255, 255));
        btn_editProfile.setFont(new java.awt.Font("FreesiaUPC", 1, 26));
    }//GEN-LAST:event_btn_editProfileMouseExited

    private void btn_editProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_editProfileMouseClicked
        btn_editProfile.setForeground(new java.awt.Color(255, 255, 51));
    }//GEN-LAST:event_btn_editProfileMouseClicked

    private void btn_logoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_logoutMouseEntered
        btn_logout.setForeground(new java.awt.Color(0, 58, 72));
    }//GEN-LAST:event_btn_logoutMouseEntered

    private void btn_logoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_logoutMouseExited
        btn_logout.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_btn_logoutMouseExited

    private void btn_editProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editProfileActionPerformed
        p1.setVisible(false);
        p2.setVisible(false);
        p3.setVisible(true);
        p3.setPerson(this.person);
    }//GEN-LAST:event_btn_editProfileActionPerformed

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        setVisible(false);
        LoginGui login = new LoginGui();
        login.setVisible(true);
    }//GEN-LAST:event_btn_logoutActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        p1.setPerson(this.person);
    }//GEN-LAST:event_formWindowOpened
    public void callList(String ds) {
        //clear table
        JTable BookingList = p2.getBookingList();
        BookingList.setModel(new DefaultTableModel());

        //Model for Table
        DefaultTableModel model = (DefaultTableModel) BookingList.getModel();
        model.addColumn("NO.");
        model.addColumn("Date");
        model.addColumn("Time");
        model.addColumn("Pickup Place");
        model.addColumn("Send Place");
        model.addColumn("Tel.");

        Connection con = ConnectionBuilder.getConnection();
        Statement st = null;

        try {
            st = con.createStatement();

            //"select * from Booking order by  Booking_Date desc"
            String sql = ds;

            ResultSet rec = st.executeQuery(sql);
           
            int row = 0;
            while ((rec != null) && rec.next()) {
                model.addRow(new Object[0]);
                model.setValueAt(rec.getInt("Booking_Id"), row, 0);
                model.setValueAt(rec.getString("Booking_Date"), row, 1);
                model.setValueAt(rec.getString("Booking_Round"), row, 2);
                String point= queryJoin("Select  r.ROUTE_LOCATION from BOOKING  b join ROUTE r  on b.ROUTE_LOCATION_RECIEVE = r.ROUTE_ID  where b.BOOKING_ID=" + rec.getInt("Booking_Id"));
                String destination = queryJoin("Select  r.ROUTE_LOCATION from BOOKING  b join ROUTE r on b.ROUTE_LOCATION_DESTINATION = r.ROUTE_ID where b.BOOKING_ID=" + rec.getInt("Booking_ID"));
                model.setValueAt(point, row, 3);
                model.setValueAt(destination, row, 4);
                model.setValueAt(rec.getString("Booking_Telephone"),row,5);
                row++;
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

    }
    public String queryJoin(String sql){
        String result="";
        try{
            Connection con = ConnectionBuilder.getConnection();
            Statement st = con.createStatement();
            ResultSet rs=st.executeQuery(sql);
            rs.next();
            result=rs.getString(1);
            
            
        }catch(SQLException e){
            System.out.println(e);
        }
        return result;
    }

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
            java.util.logging.Logger.getLogger(BookingHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookingHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookingHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookingHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookingHome(Person.findById(1)).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DynamicPanel;
    private javax.swing.JLabel bg;
    private javax.swing.JButton btn_bookingList;
    private javax.swing.JButton btn_editProfile;
    private javax.swing.JButton btn_logout;
    private javax.swing.JButton btn_roundTable;
    private javax.swing.JLabel eway;
    private javax.swing.JLabel logoBus;
    private javax.swing.JLabel logoUser;
    private javax.swing.JPanel panel_btn;
    private javax.swing.JPanel panel_top;
    private javax.swing.JPanel panel_wallpp;
    private javax.swing.JLabel showName;
    // End of variables declaration//GEN-END:variables
}
