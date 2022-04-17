package Objects;


import java.io.Serializable;

/**
 *
 * @author Yunus
 */
public class Passenger implements Serializable{
    private String name;
    private int age;
    private String number;
    private String seferAdi;
    private String gender;
    private int koltukNum;
    private String passType;
    private int price;

    public Passenger(){
        
    }
    public Passenger(String name,int age,String number,String seferAdi,int koltukNum,String gender,String passType,int price){
        this.age = age;
        this.name = name;
        this.number = number;
        this.seferAdi = seferAdi;
        this.koltukNum = koltukNum;
        this.gender = gender;
        this.passType = passType;
        this.price = price;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the number
     */
    public String getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * @return the seferAdi
     */
    public String getSeferAdi() {
        return seferAdi;
    }

    /**
     * @param seferAdi the seferAdi to set
     */
    public void setSeferAdi(String seferAdi) {
        this.seferAdi = seferAdi;
    }

    /**
     * @return the koltukNum
     */
    public int getKoltukNum() {
        return koltukNum;
    }

    /**
     * @param koltukNum the koltukNum to set
     */
    public void setKoltukNum(int koltukNum) {
        this.koltukNum = koltukNum;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the passType
     */
    public String getPassType() {
        return passType;
    }

    /**
     * @param passType the passType to set
     */
    public void setPassType(String passType) {
        this.passType = passType;
    }

    /**
     * @return the price
     */
    public int getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(int price) {
        this.price = price;
    }
    
}
