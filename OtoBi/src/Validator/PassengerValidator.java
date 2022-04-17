package Validator;

import Contollers.PassengerController;
import Contollers.TripController;
import Objects.Passenger;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Yunus
 */
public class PassengerValidator {
    public boolean checkAllDate(Passenger pass) throws IOException, ClassNotFoundException{
       if(!checkAge(pass.getAge())){
           JOptionPane.showMessageDialog(null, "Yaş hatalı girildi veya boş bırakıldı lütfen yeniden deneyiniz.","HATALI SAYI",JOptionPane.OK_OPTION);
           return false;
       }
       if(!checkSeatNum(pass)){
           JOptionPane.showMessageDialog(null, "Seçtiğiniz koltuk boş değildir. Lütfen farklı bir koltuk seçiniz","HATALI KOLTUK",JOptionPane.OK_OPTION);
           return false;
       }
       if(!checkPhoneNum(pass.getNumber())){
           JOptionPane.showMessageDialog(null, "Telefon numarası hatalı veya boş bırakıldı. Lütfen 11 haneli numrayı giriniz.","HATALI NUMARA",JOptionPane.OK_OPTION);
           return false;
       }
       return true;
    }
    public boolean checkAge(int age){
        if(String.valueOf(age)==null)return false;
        if(age==0)return false;
        if(age>120||age<0)return false;
        return true;
    }
    public boolean checkSeatNum(Passenger pass) throws IOException, FileNotFoundException, ClassNotFoundException{
        PassengerController cont = new PassengerController();
        Passenger[] p  =cont.getPassList(pass.getSeferAdi());
        for(int i =0;i<cont.getPassListCount(pass.getSeferAdi());i++){
            if(pass.getKoltukNum()==p[i].getKoltukNum()){
                return false;
            }
        }
        return true;
    }
    public boolean checkPhoneNum(String number){
        String ph =String.valueOf(number);
        if(ph.length()!=11)return false;
        return true;
    }
}
