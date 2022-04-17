/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Contollers;

import Objects.Passenger;
import Objects.Trip;

/**
 *
 * @author Yunus
 */
public class ProfitLossController {
       public static float calcFuelPrice(Trip trip){          
           float avLtOneKm=(float) (trip.getFuelConsumption()/(float)100.0); 
           float avPriceAllKm=(avLtOneKm*trip.getAveKm())*trip.getFuelPrice();
           return avPriceAllKm;
       }
       public static float calcPassPrice(Trip trip){
           Passenger[] pass= trip.getPassengers();
           float sum = 0;
           for(int i=0;i<trip.getPassCount();i++){
               sum+=pass[i].getPrice();
           }
           return sum;
       }
}
