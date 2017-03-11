package Eway.model;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Booking {
    private String time;//เวลาที่ให้ไปรับ
    private String date;//วันที่ที่ใช้รถ
    private String recievePlace;//สถานที่รับ
    //private String sendPlace;//สถานที่ส่ง
    private int bookingId;
    private int routeId;
    public Booking(){
        
    }

    public Booking(String time, String date, String recievePlace, int routeId) {
        this.time = time;
        this.date = date;
        this.recievePlace = recievePlace;
        this.routeId = routeId;
    }

    /*public Booking(String time, String date, String recievePlace, String sendPlace) {
        this.date = date;
        this.time = time;
        this.recievePlace = recievePlace;
        this.sendPlace = sendPlace;
        ///////// ส่วนที่ผมทำ///////////////////////
        if(regisBook()){
            System.out.println("Success");
        }else
            System.out.println("Failed");
        ////////////////////////////////////////
    }*/

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getRecievePlace() {
        return recievePlace;
    }

    public void setRecievePlace(String recievePlace) {
        this.recievePlace = recievePlace;
    }

    @Override
    public String toString() {
        return "Time : "+ time + "\n" +
               "Daye : "+ date + "\n" +
               "Place : "+ recievePlace + "\n" ;
               //"Location : " + sendPlace ;
    }
    
    public boolean regisBook() {
        String sqlInsert = "insert into BOOKING(BOOKING_DATE, BOOKING_ROUND, ROUTE_ID)"
                + " values (?, ?, ?)";
        try {
            Connection con = ConnectionBuilder.getConnection();
            PreparedStatement stm = null;
            stm = con.prepareStatement(sqlInsert);
           
            stm.setString(1, this.date);
            stm.setString(2, this.time);
            stm.setInt(3, this.routeId);
            stm.execute();
            return true;
        } catch (SQLException ex) {
            System.out.println(ex);
            return false;
        }
    }
    
    
}

