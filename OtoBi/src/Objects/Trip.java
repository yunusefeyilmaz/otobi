package Objects;

import java.io.Serializable;


public class Trip implements Serializable{
    
    private String nereden;
    private String nereye;
    private String date;
    private String time;
    private String tripName;
    private String averageTime;
    private int aveKm;
    private int passCount=0;
    private Passenger[] passengers = new Passenger[20];
    private int adultPrice=80;
    private int studentPrice=60;
    private float fuelPrice = (float) 22.00;
    private float fuelConsumption = (float) 18.00;
    
    public Trip(){       
    }
    
    public Trip(String nereden,String nereye,String date,String time,String seferAdi,int ortKm,String averageTime){
        this.nereden = nereden;
        this.nereye = nereye;
        this.date = date;
        this.time = time;
        this.tripName = seferAdi;
        this.aveKm = ortKm;
        this.averageTime =averageTime;
    }
    
    /**
     * @return the nereden
     */
    public String getNereden() {
        return nereden;
    }

    /**
     * @param nereden the nereden to set
     */
    public void setNereden(String nereden) {
        this.nereden = nereden;
    }

    /**
     * @return the nereye
     */
    public String getNereye() {
        return nereye;
    }

    /**
     * @param nereye the nereye to set
     */
    public void setNereye(String nereye) {
        this.nereye = nereye;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the time
     */
    public String getTime() {
        return time;
    }

    /**
     * @param time the tripName to set
     */
    public void setTime(String time) {
        this.time = time;
    }

    /**
     * @return the tripName
     */
    public String getTripName() {
        return tripName;
    }

    /**
     * @param tripName the tripName to set
     */
    public void setTripName(String tripName) {
        this.tripName = tripName;
    }

    /**
     * @return the aveKm
     */
    public int getAveKm() {
        return aveKm;
    }

    /**
     * @param aveKm the aveKm to set
     */
    public void setAveKm(int aveKm) {
        this.aveKm = aveKm;
    }

    /**
     * @return the passCount
     */
    public int getPassCount() {
        return passCount;
    }

    /**
     * @param passCount the passCount to set
     */
    public void setPassCount(int passCount) {
        this.passCount = passCount;
    }

    /**
     * @return the passengers
     */
    public Passenger[] getPassengers() {
        return passengers;
    }

    /**
     * @param passengers the passengers to set
     */
    public void setPassengers(Passenger[] passengers) {
        this.passengers = passengers;
    }

    /**
     * @return the adultPrice
     */
    public int getAdultPrice() {
        return adultPrice;
    }

    /**
     * @param adultPrice the adultPrice to set
     */
    public void setAdultPrice(int adultPrice) {
        this.adultPrice = adultPrice;
    }

    /**
     * @return the studentPrice
     */
    public int getStudentPrice() {
        return studentPrice;
    }

    /**
     * @param studentPrice the studentPrice to set
     */
    public void setStudentPrice(int studentPrice) {
        this.studentPrice = studentPrice;
    }

    /**
     * @return the fuelPrice
     */
    public float getFuelPrice() {
        return fuelPrice;
    }

    /**
     * @param fuelPrice the fuelPrice to set
     */
    public void setFuelPrice(float fuelPrice) {
        this.fuelPrice = fuelPrice;
    }

    /**
     * @return the averageTime
     */
    public String getAverageTime() {
        return averageTime;
    }

    /**
     * @param averageTime the averageTime to set
     */
    public void setAverageTime(String averageTime) {
        this.averageTime = averageTime;
    }

    /**
     * @return the fuelConsumption
     */
    public float getFuelConsumption() {
        return fuelConsumption;
    }

    /**
     * @param fuelConsumption the fuelConsumption to set
     */
    public void setFuelConsumption(float fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    
}
