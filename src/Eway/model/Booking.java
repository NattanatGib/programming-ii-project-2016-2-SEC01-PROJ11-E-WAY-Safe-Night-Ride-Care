
package Eway.model;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Booking {
    private String time;//เวลาที่ให้ไปรับ
    private String date;//วันที่ที่ใช้รถ
    private Person student;
    private int recieveId;//สถานที่รับ
    private int sendId;//สถานที่ส่ง
    private static int id=1;
    public Booking(){
        
    }

    public Booking(String time, String date,Person Student, int recieveId, int routeId) {
        this.time = time;
        this.student=Student;
        this.date = date;
        this.recieveId= recieveId;
        this.sendId = routeId;
        if(regisBook())
            System.out.println("Success");
        else
            System.out.println("Failed");
        
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

    public Person getStudent() {
        return student;
    }

    public int getRecieveId() {
        return recieveId;
    }

    public int getSendId() {
        return sendId;
    }

    public void setStudent(Person student) {
        this.student = student;
    }

    public void setRecieveId(int recieveId) {
        this.recieveId = recieveId;
    }

    public void setSendId(int sendId) {
        this.sendId = sendId;
    }
    
    @Override
    public String toString() {
        return "Time : "+ time + "\n" +
               "Daye : "+ date + "\n" +
               "RecieveID : "+ recieveId + "\n" +
               "SendId: "+sendId+"\n";
               //"Location : " + sendPlace ;
    }
    
    public boolean regisBook() {
        String sqlInsert = "insert into BOOKING(BOOKING_ID,BOOKING_DATE,BOOKING_ROUND, ROUTE_LOCATION_RECIEVE,ROUTE_LOCATION_DESTINATION)"
                + " values (?, ?, ?,?,?)";
        try {
            Connection con = ConnectionBuilder.getConnection();
            PreparedStatement stm = con.prepareStatement(sqlInsert);
            stm.setInt(1, id++);
            stm.setString(2,this.date );
            stm.setString(3, this.time);
            stm.setInt(4, recieveId);
            stm.setInt(5, this.sendId);
            stm.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.out.println(ex);
            return false;
        }catch(Exception e){
            System.out.println(e);
            return false;
        }
    }
    
    
}


