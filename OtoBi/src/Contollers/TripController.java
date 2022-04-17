package Contollers;

import Objects.Trip;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;


public class TripController {
    
    String[] sehirler ={"Adana","Adıyaman", "Afyon", "Ağrı", "Amasya", "Ankara", "Antalya", "Artvin",
            "Aydın", "Balıkesir","Bilecik", "Bingöl", "Bitlis", "Bolu", "Burdur", "Bursa", "Çanakkale",
            "Çankırı", "Çorum","Denizli","Diyarbakır", "Edirne", "Elazığ", "Erzincan", "Erzurum ", "Eskişehir",
            "Gaziantep", "Giresun","Gümüşhane", "Hakkari", "Hatay", "Isparta", "Mersin", "İstanbul", "İzmir",
            "Kars", "Kastamonu", "Kayseri","Kırklareli", "Kırşehir", "Kocaeli", "Konya", "Kütahya ", "Malatya",
            "Manisa", "Kahramanmaraş", "Mardin", "Muğla", "Muş", "Nevşehir", "Niğde", "Ordu", "Rize", "Sakarya",
            "Samsun", "Siirt", "Sinop", "Sivas", "Tekirdağ", "Tokat", "Trabzon  ", "Tunceli", "Şanlıurfa", "Uşak",
            "Van", "Yozgat", "Zonguldak", "Aksaray", "Bayburt ", "Karaman", "Kırıkkale", "Batman", "Şırnak",
            "Bartın", "Ardahan", "Iğdır", "Yalova", "Karabük ", "Kilis", "Osmaniye ", "Düzce"};
    
    public void createTripsFolder() throws IOException{
        File file = new File(System.getProperty("user.home")+"\\Documents\\OtoBi\\Trips.txt");
        if(!file.exists()){
            file.createNewFile();
        }
    }
    public String[] getCountryList() throws IOException{
        File file = new File(System.getProperty("user.home")+"\\Documents\\OtoBi\\CountryList.txt");
        Scanner s = new Scanner(file); 
        if(!file.exists()){
            createCountryList();
        }
        int i=0;
        if(file.exists()){
            while(s.hasNextLine()){
                s.nextLine(); 
                i++;
            }     
        }
        String[] countrylist = new String[i];
        Scanner s1 = new Scanner(file);
        i=0;
        if(file.exists()){
            while(s1.hasNextLine()){
                countrylist[i]=s1.nextLine(); 
                i++;
            }     
        }
        s.close();
        s1.close();
        return countrylist;
    }
    public void createCountryList() throws IOException{
        File file = new File(System.getProperty("user.home")+"\\Documents\\OtoBi\\CountryList.txt");
        if(file.exists())return;
        file.createNewFile();
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        for(int i=0;i<sehirler.length;i++){
            bw.write(sehirler[i]);
            bw.newLine();
        }
        bw.close();
        fw.close();
    }
    public void addTripFolder2Trips(Trip sefer) throws IOException{
        File file = new File(System.getProperty("user.home")+"\\Documents\\OtoBi\\Trips.txt");
        if(!file.exists()){
            createTripsFolder();
        }
        FileWriter fw = new FileWriter(file,true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(sefer.getTripName());
        bw.newLine();
        bw.close();
        fw.close();
        increaseTrips();
    }
     public void addTripFolder2Trips(String[] list) throws IOException{
        File file = new File(System.getProperty("user.home")+"\\Documents\\OtoBi\\Trips.txt");
        if(!file.exists()){
            createTripsFolder();
        }
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        for(int i=0;i<list.length;i++){
            bw.write(list[i]);
            bw.newLine();
        }
        bw.close();
        fw.close();
    }
    public String[] readTripFolderTrips() throws FileNotFoundException, IOException{
        File file = new File(System.getProperty("user.home")+"\\Documents\\OtoBi\\Trips.txt");
        Scanner s = new Scanner(file);
        String[] lines = new String[returnTripsCount()] ;
        int i = 0;
        if(file.exists()){
            while(s.hasNextLine()){
                lines[i] = s.nextLine(); 
                i++;
            }
            s.close();
            return lines;
        }
        s.close();
        return null;
    }
    
    public void createTripFolder(Trip sefer) throws IOException{  
        File file = new File(System.getProperty("user.home")+"\\Documents\\OtoBi\\"+sefer.getTripName()+".dat");
        if(!file.exists()){
            file.createNewFile();
        }
    }
    public void createTrip(Trip sefer) throws IOException{
        File file = new File(System.getProperty("user.home")+"\\Documents\\OtoBi\\"+sefer.getTripName()+".dat");
        if(!file.exists()){
            createTripFolder(sefer);
        }
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(sefer);
        oos.close();
        fos.close();
    }
    public int increaseTrips() throws IOException{
        File file = new File(System.getProperty("user.home")+"\\Documents\\OtoBi\\TripsCounter.txt");
        if(!file.exists()){
            createTripsCounterFolder();
        }
            Scanner s = new Scanner(file);
            int c = Integer.parseInt(s.nextLine());
            c++;
            FileWriter fw = new FileWriter(file);
            fw.write(String.valueOf(c));
            fw.close();
            return c;   
    }
    public int returnTripsCount() throws IOException {
        File file = new File(System.getProperty("user.home")+"\\Documents\\OtoBi\\TripsCounter.txt");
        if(!file.exists()){
            createTripsCounterFolder();
        }
        Scanner s = new Scanner(file);
        int c =Integer.parseInt(s.nextLine());
        s.close();
        return c;
    }
    public int decreaseTrips() throws FileNotFoundException, IOException{
        File file = new File(System.getProperty("user.home")+"\\Documents\\OtoBi\\TripsCounter.txt");
        Scanner s = new Scanner(file);
        int c = Integer.parseInt(s.nextLine());
        c--;
        FileWriter fw = new FileWriter(file);
        fw.write(String.valueOf(c));
        fw.close();
        s.close();
        return c; 
    }
    public void createTripsCounterFolder() throws IOException{
        File file = new File(System.getProperty("user.home")+"\\Documents\\OtoBi\\TripsCounter.txt");
        if(!file.exists()){
            file.createNewFile();
            FileWriter fw = new FileWriter(file);
            fw.write("0");
            fw.close();
        }
    }
    public Trip readTrip(String tripName) throws FileNotFoundException, IOException, ClassNotFoundException{
        File file = new File(System.getProperty("user.home")+"\\Documents\\OtoBi\\"+tripName+".dat");
        FileInputStream fis = new FileInputStream(System.getProperty("user.home")+"\\Documents\\OtoBi\\"+tripName+".dat");
        ObjectInputStream oos = new ObjectInputStream(fis);
        Trip trip = new Trip();
        trip = (Trip)oos.readObject();
        fis.close();
        oos.close();
        return trip;
    }
    
    public String convertTripName(String first,String second){ 
        String sesliharfler="aeıioöuü";
        first =first.toLowerCase();
        second = second.toLowerCase();
        StringBuilder sb = new StringBuilder(first);
        StringBuilder sb1 = new StringBuilder(second);
        for(int j = 0;j<sesliharfler.length();j++){
            for(int i =1;i<first.length();i++){
                if(sesliharfler.charAt(j)==first.charAt(i)){
                    sb.setCharAt(i,' ');
                }
            }
            
            for(int i =1;i<second.length();i++){
                if(sesliharfler.charAt(j)==second.charAt(i)){
                    sb1.setCharAt(i,' ');
                }
            }
        }
       first = sb.toString();
       second = sb1.toString();
       first= first.replace(" ","");
       second = second.replace(" ","");    
       return first.toUpperCase()+second.toUpperCase();
    }
    public void deleteTrip(String tripName) throws IOException{
        deleteTrip2TripsFolder(tripName);
    }
    public void deleteTripFolder(String tripName){
        System.out.println(tripName);
        File file = new File(System.getProperty("user.home")+"\\Documents\\OtoBi\\"+tripName+".dat");
        if(file.delete())System.out.println("Delete  :  ");
    }
    public void deleteTrip2TripsFolder(String tripName) throws IOException{
        String[] trips = readTripFolderTrips();
        int selectedTrip=0;
        for(int i=0;i<returnTripsCount();i++){
            if(trips[i].equals(tripName)) selectedTrip=i;
        }
        deleteTripFolder(tripName);
        String[] newTripList=new String[returnTripsCount()- 1];
        for(int i=0,j=0;i<returnTripsCount();i++){
            if(i!=selectedTrip){
                newTripList[j]=trips[i];
                j++;
            }
        }
        int i =decreaseTrips();
        addTripFolder2Trips(newTripList);
    }
}
