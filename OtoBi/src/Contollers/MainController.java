package Contollers;


import Screens.MainScreen;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import javax.swing.JFrame;

public class MainController {
    
    public static void OpenScreen(JFrame frame){
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double width = screenSize.getWidth();
        double height = screenSize.getHeight();
        int width2 = (int)(width/2) -425;
        int height2 = (int)(height/2) -207;
        frame.setLocation(width2, height2);
        frame.setSize(850, 550);
        frame.setVisible(true);        
    }
    public static void createOtobiFolder() throws IOException{
        File file = new File(System.getProperty("user.home")+"\\Documents\\OtoBi");
        if(!file.exists()){
            new File(System.getProperty("user.home")+"\\Documents\\OtoBi").mkdirs();
        }
    }    
}
