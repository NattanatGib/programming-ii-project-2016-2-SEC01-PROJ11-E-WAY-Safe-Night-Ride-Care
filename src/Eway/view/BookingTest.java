/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Eway.view;

import Eway.model.Booking;
import java.util.Scanner;
import java.util.Date;
import java.sql.Time;
/**
 *
 * @author Rei
 */
public class BookingTest {
     public static void main(String args[]) {
        System.out.println("Welcome to Save Ride Night Care reservation system!");
        Date a = new Date(2017,04,13);
        Scanner sc = new Scanner(System.in);
        System.out.println("Time : 1.23.00 2.00.00 3.01.00");
        int i=1;
        do{
            if(i<1||i>3){
                System.out.println("Please Enter again");
            }
            System.out.print("Choose time : "); 
            i=sc.nextInt();
            
            
            String time="";
            if(i==1){
                time="23:00:00";
            }else if(i==2){
                time="00:00:00";
            }else if(i==3){
                time="01:00:00";
            }
           
         }while(!(i==1||i==2||i==3));
        //System.out.print("Date : ");
        String date = "2017-02-14";
        
        System.out.print("Where are you? : ");
        String place = sc.next();
        
        System.out.println("Location : ประชาอุทิศ45 พุทบูชา สวนธน etc.");
        System.out.print("Where you want to go? : ");
        String location = sc.next();
        System.out.println();
        //Booking r1 = new Booking(time,date,place,location);
        //System.out.println(r1);
  
    }
}
