/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Validator;

import Contollers.TripController;
import Objects.Trip;
import java.io.File;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Yunus
 */
public class TripValidator {
    public boolean checkAllData(Trip trip){
        if(!isNull(trip.getAverageTime())){
            JOptionPane.showMessageDialog(null, "Lütfen boş alanları doldurunuz","ORTALAMA ZAMAN",JOptionPane.OK_OPTION);
            return false;
        }
        if(!isNull(String.valueOf(trip.getFuelPrice()))||!isNull(String.valueOf(trip.getFuelConsumption()))){
            JOptionPane.showMessageDialog(null, "Lütfen boş alanları doldurunuz","YAKIT BİLGİLERİ",JOptionPane.OK_OPTION);
            return false;
        }
        if(!checkIntNegative(trip.getAveKm())||!checkIntNegative(trip.getAdultPrice())||!checkIntNegative(trip.getStudentPrice())||!checkIntNegative(trip.getFuelConsumption())
                ||!checkIntNegative(trip.getFuelPrice())||!checkIntNegative(Float.parseFloat(trip.getAverageTime()))){
            JOptionPane.showMessageDialog(null, "Negatif bir değer ya da boş bir alan bıraktınız lütfen tekrar deneyin","NEGATİF DEĞER VEYA BOŞ",JOptionPane.OK_OPTION);
            return false;
        }
        return true;
    }
    public String checkFileExits(Trip trip) throws IOException{
        TripController cont = new TripController();
        String[] trips=cont.readTripFolderTrips();
        int counter=0;
        int length =trip.getTripName().length();
        for(int i =0;i<trips.length;i++){ 
            String tripName = "";
            if(length<=trips[i].length()){
                tripName=trips[i].substring(0, length);
            } 
            if(tripName.equals(trip.getTripName()))counter++;
        }
        if(counter==0)return trip.getTripName();
        String newName =trip.getTripName()+ "-" +String.valueOf(counter);
        return newName;
    }
    public boolean checkIntNegative(int i){
        if(i<=0)return false;
        return true;
    }
    public boolean checkIntNegative(float i){
        if(i<=0)return false;
        return true;
    }
    public boolean isNull(String text){
        if(text==null)return false;
        return true;
    }
    public static boolean isTripNull() throws IOException{
        File file = new File(System.getProperty("user.home")+"\\Documents\\OtoBi\\Trips.txt");
        TripController cont = new TripController();     
        if(cont.returnTripsCount()>0&&file.exists())return true;
        JOptionPane.showMessageDialog(null, "Lütfen ilk önce sefer oluşturun.","SEFER YOK",JOptionPane.OK_OPTION);
        return false;
    }
}
