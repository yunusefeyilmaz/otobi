/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Contollers;

import Objects.Passenger;
import Objects.Trip;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author Yunus
 */
public class PassengerController {
    public static void AddPass2Trip(Passenger person) throws FileNotFoundException, IOException, ClassNotFoundException{
        TripController cont = new TripController();
        Trip trip = new Trip();
        trip =cont.readTrip(person.getSeferAdi());
        int i = trip.getPassCount();
        i++;
        Passenger[] passengers = new Passenger[20];
        passengers = trip.getPassengers();
        Passenger[] passengers2 = new Passenger[20];
        for(int j=0;j<passengers.length;j++){
            passengers2[j]=passengers[j];
        }
        passengers2[i-1] = person;
        trip.setPassCount(i);
        trip.setPassengers(passengers2);
        cont.createTrip(trip);
    }
    public Passenger[] getPassList(String name) throws IOException,FileNotFoundException, ClassNotFoundException{
        TripController cont = new TripController();
        Trip trip = cont.readTrip(name);
        Passenger[] passengers=trip.getPassengers();
        return passengers;
    }
    public int getPassListCount(String name) throws IOException, FileNotFoundException, ClassNotFoundException{
        TripController cont = new TripController();
        Trip trip = cont.readTrip(name);
        return trip.getPassCount();
    }
    public void deletePass(int seatNum,String tripName) throws IOException, FileNotFoundException, ClassNotFoundException{
        Passenger[] list =getPassList(tripName);
        int listlength = getPassListCount(tripName);
        int delpassindex=0;
        for(int i=0;i<listlength;i++){
            if(list[i].getKoltukNum()==seatNum)delpassindex=i;
        }
        Passenger[] newlist = new Passenger[20];
        for(int i=0,j=0;i<listlength;i++){
            if(i!=delpassindex){
                newlist[j]=list[i];
                j++;
            }
        }
        TripController cont = new TripController();
        Trip trip = cont.readTrip(tripName);
        trip.setPassCount(trip.getPassCount()-1);
        trip.setPassengers(newlist);
        cont.createTrip(trip);
    }
}
