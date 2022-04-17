/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Screens;

import Contollers.MainController;
import Contollers.PassengerController;
import Contollers.TripController;
import Objects.Passenger;
import Objects.Trip;
import java.awt.Color;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Yunus
 */
public class TripShowScreen extends javax.swing.JFrame {

    /**
     * Creates new form TripShowScreen
     */
    Passenger[] pass ;
    JButton[] seats = new JButton[20];
    public void setSeatsList(){       
                seats[0] = btnP1;
                seats[1] = btnP2;
                seats[2] = btnP3;
                seats[3] = btnP4;
                seats[4] = btnP5;
                seats[5] = btnP6;
                seats[6] = btnP7;
                seats[7] = btnP8;
                seats[8] = btnP9;
                seats[9] = btnP10;
                seats[10] = btnP11;
                seats[11] = btnP12;
                seats[12] = btnP13;
                seats[13] = btnP14;
                seats[14] = btnP15;
                seats[15] = btnP16;
                seats[16] = btnP17;
                seats[17] = btnP18;
                seats[18] = btnP19;
                seats[19] = btnP20;                  
    }
    public void clcSeats(){
        for(int j=0;j<seats.length;j++){
            seats[j].setEnabled(true);
            //seats[j].setBackground(new Color(84,255,67));
            //seats[j].setForeground(Color.white);
            seats[j].setBackground(new Color(230,230,230));
            seats[j].setForeground(Color.black);
        }
    }
    public void setSeats() throws IOException, FileNotFoundException, ClassNotFoundException{
        String name =(String)cbTrips.getSelectedItem();
        PassengerController cont = new PassengerController();   
        int len = cont.getPassListCount(name);
        Passenger[] pass = new Passenger[len];
        pass = cont.getPassList(name); 
        for(int j=0;j<seats.length;j++){
          for(int i = 0;i<len;i++){    
            if(pass[i]!=null){
               if(j+1==pass[i].getKoltukNum()){               
                seats[j].setBackground(Color.red);
                seats[j].setForeground(Color.white);                
                }
             }
            }        
        }
    }
    public TripShowScreen() {
        initComponents();
    }
    public void clcTrips(){
        cbTrips.removeAllItems();
    }
    public void refreshTrips() throws IOException{    
        TripController controller = new TripController();
        if(controller.returnTripsCount()!=0){
            String[] lst = controller.readTripFolderTrips();
            for(int i = 0;i< controller.returnTripsCount();i++){
            cbTrips.addItem(lst[i]);
        }  
        }else{
            clcTrips();
            dispose();
        }
    }
    public void setTripData(Trip trip){
        lblTripNameEdit.setText(trip.getTripName());
        lblWhere1Edit.setText(trip.getNereden());
        lblWhere2Edit.setText(trip.getNereye());
        lblDateEdit.setText(trip.getDate());
        lblTimeEdit.setText(trip.getTime());
        lblKmEdit.setText(String.valueOf(trip.getAveKm()));
        lblPassCountEdit.setText(String.valueOf(trip.getPassCount()));
    }
    public void clcTripData(){
        lblTripNameEdit.setText("");
        lblWhere1Edit.setText("");
        lblWhere2Edit.setText("");
        lblDateEdit.setText("");
        lblTimeEdit.setText("");
        lblKmEdit.setText("");
        lblPassCountEdit.setText("");
    }
    
    public void selectedTrip(){
        String selected= String.valueOf(cbTrips.getSelectedItem());
        TripController cont = new TripController();
        Trip trip = new Trip();
        try {
            trip =cont.readTrip(selected);
        } catch (IOException ex) {
            Logger.getLogger(TripShowScreen.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TripShowScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(trip !=null){
            setTripData(trip);
        } 
    }
    public void clcPassData(){
        lblPassName.setText("");
        lblPassAge.setText("");
        lblPassGender.setText("");
        lblPassPhone.setText("");
        lblPassPrice.setText("");
        lblPassSeatNum.setText("");
        lblPassType.setText("");
    }
    public void setPassData() throws IOException, FileNotFoundException, ClassNotFoundException{
        String selected= String.valueOf(cbTrips.getSelectedItem());
        PassengerController pc = new PassengerController();
        pass=pc.getPassList(selected); 
    }
    public void foundPass(int seatNum) throws IOException, ClassNotFoundException, FileNotFoundException{
        String selected= String.valueOf(cbTrips.getSelectedItem());
        int founded=-1;
        for(int i =0;i<pass.length;i++){
            if(pass[i]!=null){
                if(seatNum==pass[i].getKoltukNum()){
                setPassInfo(pass[i]);
                founded=1;
            }
            }
        }
        if(founded!=1)clcPassData();
    }
    public void setPassInfo(Passenger pass){
        lblPassName.setText(pass.getName());
        lblPassAge.setText(String.valueOf(pass.getAge()));
        lblPassGender.setText(pass.getGender());
        lblPassPhone.setText(String.valueOf(pass.getNumber()));
        lblPassPrice.setText(String.valueOf(pass.getPrice()));
        lblPassSeatNum.setText(String.valueOf(pass.getKoltukNum()));
        lblPassType.setText(pass.getPassType());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpID = new javax.swing.JPanel();
        btnP1 = new javax.swing.JButton();
        btnP6 = new javax.swing.JButton();
        btnP9 = new javax.swing.JButton();
        btnP12 = new javax.swing.JButton();
        btnP15 = new javax.swing.JButton();
        btnP18 = new javax.swing.JButton();
        btnP2 = new javax.swing.JButton();
        btnP3 = new javax.swing.JButton();
        btnP4 = new javax.swing.JButton();
        btnP7 = new javax.swing.JButton();
        btnP10 = new javax.swing.JButton();
        btnP20 = new javax.swing.JButton();
        btnP17 = new javax.swing.JButton();
        btnP14 = new javax.swing.JButton();
        btnP11 = new javax.swing.JButton();
        btnP8 = new javax.swing.JButton();
        btnP5 = new javax.swing.JButton();
        btnP13 = new javax.swing.JButton();
        btnP16 = new javax.swing.JButton();
        btnP19 = new javax.swing.JButton();
        cbTrips = new javax.swing.JComboBox<>();
        jpPass = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblPassType = new javax.swing.JLabel();
        lblPassName = new javax.swing.JLabel();
        lblPassGender = new javax.swing.JLabel();
        lblPassAge = new javax.swing.JLabel();
        lblPassPhone = new javax.swing.JLabel();
        lblPassSeatNum = new javax.swing.JLabel();
        lblPassPrice = new javax.swing.JLabel();
        btnDelPass = new javax.swing.JButton();
        jpTrip = new javax.swing.JPanel();
        lblTripKnow = new javax.swing.JLabel();
        lblTripName = new javax.swing.JLabel();
        lblWhere1 = new javax.swing.JLabel();
        lblWhere2 = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        lblPassCount = new javax.swing.JLabel();
        lblKm = new javax.swing.JLabel();
        lblTripNameEdit = new javax.swing.JLabel();
        lblWhere1Edit = new javax.swing.JLabel();
        lblWhere2Edit = new javax.swing.JLabel();
        lblDateEdit = new javax.swing.JLabel();
        lblTimeEdit = new javax.swing.JLabel();
        lblKmEdit = new javax.swing.JLabel();
        lblPassCountEdit = new javax.swing.JLabel();
        btnDelTrip = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jpID.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnP1.setText("1");
        btnP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnP1ActionPerformed(evt);
            }
        });

        btnP6.setText("6");
        btnP6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnP6ActionPerformed(evt);
            }
        });

        btnP9.setText("9");
        btnP9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnP9ActionPerformed(evt);
            }
        });

        btnP12.setText("12");
        btnP12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnP12ActionPerformed(evt);
            }
        });

        btnP15.setText("15");
        btnP15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnP15ActionPerformed(evt);
            }
        });

        btnP18.setText("18");
        btnP18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnP18ActionPerformed(evt);
            }
        });

        btnP2.setText("2");
        btnP2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnP2ActionPerformed(evt);
            }
        });

        btnP3.setText("3");
        btnP3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnP3ActionPerformed(evt);
            }
        });

        btnP4.setText("4");
        btnP4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnP4ActionPerformed(evt);
            }
        });

        btnP7.setText("7");
        btnP7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnP7ActionPerformed(evt);
            }
        });

        btnP10.setText("10");
        btnP10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnP10ActionPerformed(evt);
            }
        });

        btnP20.setText("20");
        btnP20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnP20ActionPerformed(evt);
            }
        });

        btnP17.setText("17");
        btnP17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnP17ActionPerformed(evt);
            }
        });

        btnP14.setText("14");
        btnP14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnP14ActionPerformed(evt);
            }
        });

        btnP11.setText("11");
        btnP11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnP11ActionPerformed(evt);
            }
        });

        btnP8.setText("8");
        btnP8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnP8ActionPerformed(evt);
            }
        });

        btnP5.setText("5");
        btnP5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnP5ActionPerformed(evt);
            }
        });

        btnP13.setText("13");
        btnP13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnP13ActionPerformed(evt);
            }
        });

        btnP16.setText("16");
        btnP16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnP16ActionPerformed(evt);
            }
        });

        btnP19.setText("19");
        btnP19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnP19ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpIDLayout = new javax.swing.GroupLayout(jpID);
        jpID.setLayout(jpIDLayout);
        jpIDLayout.setHorizontalGroup(
            jpIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpIDLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jpIDLayout.createSequentialGroup()
                        .addComponent(btnP1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnP2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(134, 134, 134))
                    .addGroup(jpIDLayout.createSequentialGroup()
                        .addGroup(jpIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnP6, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnP9, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnP12, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnP15, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnP18, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnP3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnP4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnP7, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnP10, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnP13, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnP16, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnP19, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jpIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnP8, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnP11, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnP14, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnP17, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnP20, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnP5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        jpIDLayout.setVerticalGroup(
            jpIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpIDLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jpIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnP1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnP2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpIDLayout.createSequentialGroup()
                        .addGroup(jpIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnP3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnP4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnP6, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnP7, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnP9, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnP10, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpIDLayout.createSequentialGroup()
                                .addComponent(btnP13, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnP16, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnP19, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpIDLayout.createSequentialGroup()
                                .addComponent(btnP12, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnP15, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnP18, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jpIDLayout.createSequentialGroup()
                        .addComponent(btnP5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnP8, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnP11, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnP14, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnP17, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnP20, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17))
        );

        cbTrips.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTripsActionPerformed(evt);
            }
        });
        cbTrips.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                cbTripsPropertyChange(evt);
            }
        });

        jpPass.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel2.setForeground(java.awt.Color.lightGray);
        jLabel2.setText("YOLCU BİLGİLERİ");

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel3.setForeground(java.awt.Color.lightGray);
        jLabel3.setText("Yolcu Adı : ");

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel4.setForeground(java.awt.Color.lightGray);
        jLabel4.setText("Yolcu Yaşı :");

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel5.setForeground(java.awt.Color.lightGray);
        jLabel5.setText("Yolcu Telefon Numarası  :");

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel6.setForeground(java.awt.Color.lightGray);
        jLabel6.setText("Yolcu Cinsiyeti :");

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel7.setForeground(java.awt.Color.lightGray);
        jLabel7.setText("Koltuk Numarası :");

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel8.setForeground(java.awt.Color.lightGray);
        jLabel8.setText("Ödediği Ücret :");

        lblPassType.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPassType.setText("    ");
        lblPassType.setToolTipText("");
        lblPassType.setAlignmentY(0.0F);
        lblPassType.setFocusable(false);
        lblPassType.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lblPassType.setInheritsPopupMenu(false);
        lblPassType.setName(""); // NOI18N

        lblPassName.setText(" ");

        lblPassGender.setText(" ");

        lblPassAge.setText(" ");

        lblPassPhone.setText(" ");

        lblPassSeatNum.setText(" ");

        lblPassPrice.setText(" ");

        btnDelPass.setForeground(new java.awt.Color(255, 51, 102));
        btnDelPass.setText("YOLCUYU SİL");
        btnDelPass.setBorder(null);
        btnDelPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelPassActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpPassLayout = new javax.swing.GroupLayout(jpPass);
        jpPass.setLayout(jpPassLayout);
        jpPassLayout.setHorizontalGroup(
            jpPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPassLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpPassLayout.createSequentialGroup()
                        .addGroup(jpPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPassName, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPassAge, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPassGender, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblPassType, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpPassLayout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(79, 79, 79)
                            .addComponent(btnDelPass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpPassLayout.createSequentialGroup()
                            .addGroup(jpPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jpPassLayout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblPassSeatNum, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel5))
                            .addGroup(jpPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpPassLayout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblPassPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpPassLayout.createSequentialGroup()
                                    .addGap(21, 21, 21)
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblPassPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(14, 14, 14))
        );
        jpPassLayout.setVerticalGroup(
            jpPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPassLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(btnDelPass))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblPassName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lblPassGender))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblPassAge))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblPassPhone))
                .addGap(57, 57, 57)
                .addComponent(lblPassType, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(lblPassSeatNum)
                    .addComponent(lblPassPrice))
                .addGap(18, 18, 18))
        );

        jpTrip.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblTripKnow.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        lblTripKnow.setForeground(java.awt.Color.lightGray);
        lblTripKnow.setText("SEFER BİLGİLERİ");

        lblTripName.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        lblTripName.setForeground(java.awt.Color.lightGray);
        lblTripName.setText("Sefer Adı : ");

        lblWhere1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        lblWhere1.setForeground(java.awt.Color.lightGray);
        lblWhere1.setText("Nereden :");

        lblWhere2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        lblWhere2.setForeground(java.awt.Color.lightGray);
        lblWhere2.setText("Nereye:");

        lblDate.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        lblDate.setForeground(java.awt.Color.lightGray);
        lblDate.setText("Tarih :");

        lblTime.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        lblTime.setForeground(java.awt.Color.lightGray);
        lblTime.setText("Saat Kaçta :");

        lblPassCount.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        lblPassCount.setForeground(java.awt.Color.lightGray);
        lblPassCount.setText("Yolcu Sayısı :");

        lblKm.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        lblKm.setForeground(java.awt.Color.lightGray);
        lblKm.setText("Ortalama Km : ");

        lblTripNameEdit.setText(" ");

        lblWhere1Edit.setText(" ");

        lblWhere2Edit.setText(" ");

        lblDateEdit.setText(" ");

        lblTimeEdit.setText(" ");

        lblKmEdit.setText(" ");

        lblPassCountEdit.setText(" ");

        btnDelTrip.setForeground(new java.awt.Color(255, 51, 102));
        btnDelTrip.setText("SEFERİ SİL");
        btnDelTrip.setBorder(null);
        btnDelTrip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelTripActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpTripLayout = new javax.swing.GroupLayout(jpTrip);
        jpTrip.setLayout(jpTripLayout);
        jpTripLayout.setHorizontalGroup(
            jpTripLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTripLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpTripLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jpTripLayout.createSequentialGroup()
                        .addComponent(lblKm)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblKmEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelTrip, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jpTripLayout.createSequentialGroup()
                        .addGroup(jpTripLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpTripLayout.createSequentialGroup()
                                .addComponent(lblPassCount)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblPassCountEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblTripKnow, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jpTripLayout.createSequentialGroup()
                                .addGroup(jpTripLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jpTripLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(lblTripName, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblWhere1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblTime, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblWhere2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jpTripLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblWhere2Edit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                                    .addComponent(lblWhere1Edit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblTimeEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblDateEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblTripNameEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(88, 88, 88)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpTripLayout.setVerticalGroup(
            jpTripLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTripLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTripKnow)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpTripLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTripName)
                    .addComponent(lblTripNameEdit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpTripLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWhere1)
                    .addComponent(lblWhere1Edit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpTripLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWhere2)
                    .addComponent(lblWhere2Edit))
                .addGroup(jpTripLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpTripLayout.createSequentialGroup()
                        .addGap(0, 81, Short.MAX_VALUE)
                        .addGroup(jpTripLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpTripLayout.createSequentialGroup()
                                .addGroup(jpTripLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblKm)
                                    .addComponent(lblKmEdit))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jpTripLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblPassCount)
                                    .addComponent(lblPassCountEdit))
                                .addGap(16, 16, 16))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpTripLayout.createSequentialGroup()
                                .addComponent(btnDelTrip)
                                .addGap(15, 15, 15))))
                    .addGroup(jpTripLayout.createSequentialGroup()
                        .addGroup(jpTripLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDate)
                            .addComponent(lblDateEdit))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpTripLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTime)
                            .addComponent(lblTimeEdit))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("SEFER ADI :");
        jLabel9.setToolTipText("");

        btnBack.setText("<");
        btnBack.setBorder(null);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jpID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbTrips, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpTrip, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jpPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jpTrip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbTrips, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jpID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnP1ActionPerformed

        try {
            foundPass(1);
        } catch (IOException ex) {
            Logger.getLogger(TripShowScreen.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TripShowScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnP1ActionPerformed

    private void btnP2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnP2ActionPerformed
        try {
            foundPass(2);
        } catch (IOException ex) {
            Logger.getLogger(TripShowScreen.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TripShowScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnP2ActionPerformed

    private void cbTripsPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_cbTripsPropertyChange

    }//GEN-LAST:event_cbTripsPropertyChange

    private void cbTripsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTripsActionPerformed
        clcTripData();
        selectedTrip();
        clcSeats();
        clcPassData();
        try {
            setSeats();
            setPassData();
        } catch (IOException ex) {
            Logger.getLogger(TripShowScreen.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TripShowScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cbTripsActionPerformed

    private void btnP3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnP3ActionPerformed
        try {
            foundPass(3);
        } catch (IOException ex) {
            Logger.getLogger(TripShowScreen.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TripShowScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnP3ActionPerformed

    private void btnP4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnP4ActionPerformed
        try {
            foundPass(4);
        } catch (IOException ex) {
            Logger.getLogger(TripShowScreen.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TripShowScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnP4ActionPerformed

    private void btnP5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnP5ActionPerformed
        try {
            foundPass(5);
        }catch (ClassNotFoundException ex) {
            Logger.getLogger(TripShowScreen.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TripShowScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnP5ActionPerformed

    private void btnP6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnP6ActionPerformed
        try {
            foundPass(6);
        } catch (IOException ex) {
            Logger.getLogger(TripShowScreen.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TripShowScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnP6ActionPerformed

    private void btnP7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnP7ActionPerformed
         try {
            foundPass(7);
        } catch (IOException ex) {
            Logger.getLogger(TripShowScreen.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TripShowScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnP7ActionPerformed

    private void btnP8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnP8ActionPerformed
        try {
            foundPass(8);
        } catch (IOException ex) {
            Logger.getLogger(TripShowScreen.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TripShowScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnP8ActionPerformed

    private void btnP9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnP9ActionPerformed
         try {
            foundPass(9);
        } catch (IOException ex) {
            Logger.getLogger(TripShowScreen.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TripShowScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnP9ActionPerformed

    private void btnP10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnP10ActionPerformed
         try {
            foundPass(10);
        } catch (IOException ex) {
            Logger.getLogger(TripShowScreen.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TripShowScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnP10ActionPerformed

    private void btnP11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnP11ActionPerformed
         try {
            foundPass(11);
        } catch (IOException ex) {
            Logger.getLogger(TripShowScreen.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TripShowScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnP11ActionPerformed

    private void btnP12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnP12ActionPerformed
        try {
            foundPass(12);
        } catch (IOException ex) {
            Logger.getLogger(TripShowScreen.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TripShowScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnP12ActionPerformed

    private void btnP13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnP13ActionPerformed
         try {
            foundPass(13);
        } catch (IOException ex) {
            Logger.getLogger(TripShowScreen.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TripShowScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnP13ActionPerformed

    private void btnP14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnP14ActionPerformed
         try {
            foundPass(14);
        } catch (IOException ex) {
            Logger.getLogger(TripShowScreen.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TripShowScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnP14ActionPerformed

    private void btnP15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnP15ActionPerformed
         try {
            foundPass(15);
        } catch (IOException ex) {
            Logger.getLogger(TripShowScreen.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TripShowScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnP15ActionPerformed

    private void btnP16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnP16ActionPerformed
         try {
            foundPass(16);
        } catch (IOException ex) {
            Logger.getLogger(TripShowScreen.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TripShowScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnP16ActionPerformed

    private void btnP17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnP17ActionPerformed
         try {
            foundPass(17);
        } catch (IOException ex) {
            Logger.getLogger(TripShowScreen.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TripShowScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnP17ActionPerformed

    private void btnP18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnP18ActionPerformed
         try {
            foundPass(18);
        } catch (IOException ex) {
            Logger.getLogger(TripShowScreen.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TripShowScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnP18ActionPerformed

    private void btnP19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnP19ActionPerformed
         try {
            foundPass(19);
        } catch (IOException ex) {
            Logger.getLogger(TripShowScreen.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TripShowScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnP19ActionPerformed

    private void btnP20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnP20ActionPerformed
         try {
            foundPass(20);
        } catch (IOException ex) {
            Logger.getLogger(TripShowScreen.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TripShowScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnP20ActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        MainScreen frame = new MainScreen();
        MainController.OpenScreen(frame);
        dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnDelTripActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelTripActionPerformed
        TripController cont = new TripController();
        String tripName = lblTripNameEdit.getText();
        if(tripName==null){
            JOptionPane.showMessageDialog(null, "Lüfen Sefer Seçin");
        }else{
            try {
                cont.deleteTrip(tripName);
                clcTripData();
                clcTrips();
                clcSeats();
                refreshTrips();
                selectedTrip();
                setSeats();
                JOptionPane.showInternalMessageDialog(null, "Sefer başarıyla silindi.","BAŞARILI",JOptionPane.INFORMATION_MESSAGE);
            } catch (IOException ex) {
                Logger.getLogger(TripShowScreen.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(TripShowScreen.class.getName()).log(Level.SEVERE, null, ex);
            }            
        }
        
    }//GEN-LAST:event_btnDelTripActionPerformed

    private void btnDelPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelPassActionPerformed
       PassengerController pc = new PassengerController();
       if(lblPassSeatNum.getText()!=null){
          try {
            pc.deletePass(Integer.parseInt(lblPassSeatNum.getText()), lblTripNameEdit.getText());
            clcPassData();
            clcSeats();
            setSeats();
            JOptionPane.showInternalMessageDialog(null, "Yolcu başarıyla silindi.","BAŞARILI",JOptionPane.INFORMATION_MESSAGE);
            } catch (IOException ex) {
            Logger.getLogger(TripShowScreen.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
            Logger.getLogger(TripShowScreen.class.getName()).log(Level.SEVERE, null, ex);
            } 
       }
        
    }//GEN-LAST:event_btnDelPassActionPerformed

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TripShowScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelPass;
    private javax.swing.JButton btnDelTrip;
    private javax.swing.JButton btnP1;
    private javax.swing.JButton btnP10;
    private javax.swing.JButton btnP11;
    private javax.swing.JButton btnP12;
    private javax.swing.JButton btnP13;
    private javax.swing.JButton btnP14;
    private javax.swing.JButton btnP15;
    private javax.swing.JButton btnP16;
    private javax.swing.JButton btnP17;
    private javax.swing.JButton btnP18;
    private javax.swing.JButton btnP19;
    private javax.swing.JButton btnP2;
    private javax.swing.JButton btnP20;
    private javax.swing.JButton btnP3;
    private javax.swing.JButton btnP4;
    private javax.swing.JButton btnP5;
    private javax.swing.JButton btnP6;
    private javax.swing.JButton btnP7;
    private javax.swing.JButton btnP8;
    private javax.swing.JButton btnP9;
    private javax.swing.JComboBox<String> cbTrips;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jpID;
    private javax.swing.JPanel jpPass;
    private javax.swing.JPanel jpTrip;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblDateEdit;
    private javax.swing.JLabel lblKm;
    private javax.swing.JLabel lblKmEdit;
    private javax.swing.JLabel lblPassAge;
    private javax.swing.JLabel lblPassCount;
    private javax.swing.JLabel lblPassCountEdit;
    private javax.swing.JLabel lblPassGender;
    private javax.swing.JLabel lblPassName;
    private javax.swing.JLabel lblPassPhone;
    private javax.swing.JLabel lblPassPrice;
    private javax.swing.JLabel lblPassSeatNum;
    private javax.swing.JLabel lblPassType;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel lblTimeEdit;
    private javax.swing.JLabel lblTripKnow;
    private javax.swing.JLabel lblTripName;
    private javax.swing.JLabel lblTripNameEdit;
    private javax.swing.JLabel lblWhere1;
    private javax.swing.JLabel lblWhere1Edit;
    private javax.swing.JLabel lblWhere2;
    private javax.swing.JLabel lblWhere2Edit;
    // End of variables declaration//GEN-END:variables
}
