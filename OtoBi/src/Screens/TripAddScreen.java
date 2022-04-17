/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Screens;

import Contollers.MainController;
import Contollers.TripController;
import Objects.Trip;
import Validator.TripValidator;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;


public class TripAddScreen extends javax.swing.JFrame {
  
    public void setDateDay(){
         for(int i = 2022;i<=2080;i++){
            cbDateYear.addItem(String.valueOf(i));
         }
        cbDateDay.removeAllItems();
        int month = Integer.parseInt(String.valueOf(cbDateMonth.getSelectedItem()));
        int year = Integer.parseInt(String.valueOf(cbDateYear.getSelectedItem()));
        if(month==2&&(year%4!=0)){
           for(int i=1;i<=28;i++){
                cbDateDay.addItem(String.valueOf(i));
            } 
        }else if(month==2&&(year%4==0)){
            for(int i=1;i<=29;i++){
                cbDateDay.addItem(String.valueOf(i));
            }
        }else if(month%2==1&&month<=7){
            for(int i=1;i<=31;i++){
                cbDateDay.addItem(String.valueOf(i));
            }
        }else if(month%2==0&&month<=7){
            for(int i=1;i<=30;i++){
                cbDateDay.addItem(String.valueOf(i));
            }
        }else if(month%2==0&&month>7){
            for(int i=1;i<=31;i++){
                cbDateDay.addItem(String.valueOf(i));
            }
        }else{
            for(int i=1;i<=30;i++){
                cbDateDay.addItem(String.valueOf(i));
            }
        }
        
    }
    public void setDateMonth(){
         cbDateMonth.removeAllItems();
         for(int i = 1;i<=12;i++){
            cbDateMonth.addItem(String.valueOf(i));
         }

         
    }
    public void setTime(){
        cbTimeClock.removeAllItems();
        cbTimeMin.removeAllItems();
        for(int i=0;i<=59;i++){
            if(i<10){
                cbTimeMin.addItem("0"+String.valueOf(i));   
            }else{
                cbTimeMin.addItem(String.valueOf(i));
            }      
        }
        for(int i=0;i<=23;i++){
            if(i<10){
                cbTimeClock.addItem("0"+String.valueOf(i));
            }else{
                cbTimeClock.addItem(String.valueOf(i));
            }      
        }
        
    }
    public void setFuelandPriceValue(){
        jsAdultPrice.setValue(80);
        jsStudentPrice.setValue(60);
        txtFuelCom.setText("18.0");
        txtFuelPrice.setText("22.0");
    }        
    public void setLoc() throws IOException{
        cbNereden.removeAllItems();
        cbNereye.removeAllItems();
        TripController tc = new TripController();
        String[] countrys = tc.getCountryList();
        for(int i = 0;i<countrys.length;i++){
            cbNereden.addItem(countrys[i]);
            cbNereye.addItem(countrys[i]);
        }
    }
    public void setTripName(){
        String firstCountry = String.valueOf(cbNereden.getSelectedItem());
        String secondCountry = String.valueOf(cbNereye.getSelectedItem());
        TripController sc = new TripController();
        String tripName = sc.convertTripName(firstCountry, secondCountry);
        txtSeferAdi.setText(tripName);
    }
    public Trip getData(){
        String averageTime = txtHowMuchTime.getText();
        String nereden = String.valueOf(cbNereden.getSelectedItem());
        String nereye = String.valueOf(cbNereye.getSelectedItem());
        String date = String.valueOf(cbDateDay.getSelectedItem()).concat(".")
                .concat(String.valueOf(cbDateMonth.getSelectedItem()))
                .concat(".").concat(String.valueOf(cbDateYear.getSelectedItem())); 
        String time =String.valueOf(cbTimeClock.getSelectedItem()).concat(".").concat(String.valueOf(cbTimeMin.getSelectedItem()));
        int ortKm=0;
        String seferAdi =txtSeferAdi.getText();
        if(!txtKm.getText().isEmpty()){
            ortKm =Integer.parseInt(txtKm.getText());
        }
        String fuelPrice = txtFuelPrice.getText();
        String fuelCom = txtFuelCom.getText();
        int adultPrice = Integer.parseInt(String.valueOf(jsAdultPrice.getValue()));
        int studentPrice = Integer.parseInt(String.valueOf(jsStudentPrice.getValue()));
        Trip trip = new Trip(nereden,nereye,date,time,seferAdi,ortKm,averageTime);
        trip.setAdultPrice(adultPrice);
        trip.setStudentPrice(studentPrice);
        trip.setFuelConsumption(Float.parseFloat(fuelCom));
        trip.setFuelPrice(Float.parseFloat(fuelPrice));
        return trip;
    }
    
    public TripAddScreen() {
        initComponents();
    }
    
    public void clcData(){
        txtHowMuchTime.setText("");
        txtKm.setText("");
        cbNereden.setSelectedIndex(0);
        cbNereye.setSelectedIndex(1);
        txtSeferAdi.setText("");
    }
    public void listRefresh() throws IOException{
        DefaultListModel<String> listModel = new DefaultListModel();
        TripController controller = new TripController();
        if(controller.returnTripsCount()!=0){
            String[] lst = controller.readTripFolderTrips();
            for(int i = 0;i< controller.returnTripsCount();i++){
                listModel.add(i, lst[i]);
            }
            lstSeferler.setModel(listModel);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstSeferler = new javax.swing.JList<>();
        txtSeferAdi = new javax.swing.JTextField();
        txtHowMuchTime = new javax.swing.JTextField();
        txtKm = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnSeferEkle = new javax.swing.JButton();
        cbNereye = new javax.swing.JComboBox<>();
        cbDateDay = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cbDateMonth = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        cbDateYear = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        cbTimeClock = new javax.swing.JComboBox<>();
        cbTimeMin = new javax.swing.JComboBox<>();
        cbNereden = new javax.swing.JComboBox<>();
        lblStudentPrice = new javax.swing.JLabel();
        lblAdultPrice = new javax.swing.JLabel();
        lblFuelPrice = new javax.swing.JLabel();
        jsStudentPrice = new javax.swing.JSpinner();
        jsAdultPrice = new javax.swing.JSpinner();
        txtFuelPrice = new javax.swing.JTextField();
        lblFuelCom = new javax.swing.JLabel();
        txtFuelCom = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        btnSettingsCountry = new javax.swing.JButton();
        btnReloadCountry = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        lstSeferler.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SEFERLER", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Segoe UI Light", 0, 18))); // NOI18N
        lstSeferler.setAutoscrolls(false);
        lstSeferler.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstSeferlerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lstSeferler);

        txtSeferAdi.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtSeferAdi.setEnabled(false);
        txtSeferAdi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSeferAdiActionPerformed(evt);
            }
        });

        txtHowMuchTime.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtHowMuchTime.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtKm.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtKm.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtKm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKmActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel1.setText("SEFER ADI");

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel2.setText("NEREDEN");

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel3.setText("NEREYE");

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel4.setText("TARİH");

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel5.setText("SAAT KAÇTA KALKICAK");

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel6.setText("ORT. KAÇ SAAT SÜRECEK");

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel7.setText("Ort. KM :");

        btnSeferEkle.setText("SEFER EKLE");
        btnSeferEkle.setBorder(null);
        btnSeferEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeferEkleActionPerformed(evt);
            }
        });

        cbNereye.setBorder(null);
        cbNereye.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNereyeActionPerformed(evt);
            }
        });

        cbDateDay.setBorder(null);
        cbDateDay.setFocusable(false);

        jLabel8.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel8.setText("Gün :");

        jLabel9.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel9.setText("Ay :");

        cbDateMonth.setBorder(null);
        cbDateMonth.setMinimumSize(new java.awt.Dimension(60, 22));
        cbDateMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDateMonthActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel10.setText("Yıl :");

        cbDateYear.setBorder(null);
        cbDateYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDateYearActionPerformed(evt);
            }
        });

        jLabel12.setText(".");

        btnBack.setText("<");
        btnBack.setBorder(null);
        btnBack.setBorderPainted(false);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        cbTimeClock.setBorder(null);

        cbTimeMin.setBorder(null);
        cbTimeMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTimeMinActionPerformed(evt);
            }
        });

        cbNereden.setBorder(null);
        cbNereden.setFocusable(false);
        cbNereden.setRequestFocusEnabled(false);
        cbNereden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNeredenActionPerformed(evt);
            }
        });

        lblStudentPrice.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        lblStudentPrice.setText("Öğrenci Fiyat :");

        lblAdultPrice.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        lblAdultPrice.setText("Yetişkin Fiyat :");

        lblFuelPrice.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        lblFuelPrice.setText("Benzin Fiyatı :");

        jsStudentPrice.setBorder(null);

        jsAdultPrice.setBorder(null);

        txtFuelPrice.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtFuelPrice.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblFuelCom.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        lblFuelCom.setText("Araç Benzin Tüketimi(100km/L) :");

        txtFuelCom.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtFuelCom.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtFuelCom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFuelComActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Sylfaen", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setText(">");

        btnSettingsCountry.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/tripSetting28.png"))); // NOI18N
        btnSettingsCountry.setBorder(null);
        btnSettingsCountry.setContentAreaFilled(false);
        btnSettingsCountry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSettingsCountryActionPerformed(evt);
            }
        });

        btnReloadCountry.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/tripReload28.png"))); // NOI18N
        btnReloadCountry.setBorder(null);
        btnReloadCountry.setContentAreaFilled(false);
        btnReloadCountry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReloadCountryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtSeferAdi, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSeferEkle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbNereden, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbNereye, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lblFuelCom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFuelCom, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbDateDay, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(24, 24, 24)
                                        .addComponent(jLabel9))
                                    .addComponent(jLabel5)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cbTimeClock, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbTimeMin, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addComponent(cbDateMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbDateYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtHowMuchTime, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblAdultPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jsAdultPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel7))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblStudentPrice)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jsStudentPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblFuelPrice)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtFuelPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtKm, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 295, Short.MAX_VALUE)
                        .addComponent(jLabel11)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSettingsCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnReloadCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(243, 243, 243)
                        .addComponent(jLabel11))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSeferAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnReloadCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(cbNereye, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(cbNereden, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel13)
                                                .addComponent(btnSettingsCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(cbDateDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbDateMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbDateYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(cbTimeClock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbTimeMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtHowMuchTime, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblAdultPrice)
                                        .addComponent(jsAdultPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel7)
                                        .addComponent(txtKm, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblStudentPrice)
                                        .addComponent(jsStudentPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblFuelPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtFuelPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblFuelCom, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFuelCom, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36)
                                .addComponent(btnSeferEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(75, 75, 75))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSeferAdiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSeferAdiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSeferAdiActionPerformed

    private void btnSeferEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeferEkleActionPerformed
       TripValidator val = new TripValidator();
       TripController controller = new TripController();
       Trip trip = getData();
        try {
            String newName = val.checkFileExits(trip);
            txtSeferAdi.setText(newName);
            trip.setTripName(newName);
        } catch (IOException ex) {
            Logger.getLogger(TripAddScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(val.checkAllData(trip)){
            try {
                controller.createTrip(trip);
                controller.addTripFolder2Trips(trip);
                JOptionPane.showInternalMessageDialog(null, "Sefer ekleme başarılı.","BAŞARILI",JOptionPane.INFORMATION_MESSAGE);
            } catch (IOException ex) {
                System.err.println("hata 1");
            }
            try {
                listRefresh();
                } catch (IOException ex) {
             Logger.getLogger(TripAddScreen.class.getName()).log(Level.SEVERE, null, ex);
            }
            clcData();
            setTripName();
        }
        
    }//GEN-LAST:event_btnSeferEkleActionPerformed

    private void lstSeferlerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstSeferlerMouseClicked
        try {
            listRefresh();
        } catch (IOException ex) {
            Logger.getLogger(TripAddScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lstSeferlerMouseClicked

    private void cbNereyeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNereyeActionPerformed
        setTripName();
    }//GEN-LAST:event_cbNereyeActionPerformed

    private void cbDateYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDateYearActionPerformed
        setDateDay();
    }//GEN-LAST:event_cbDateYearActionPerformed

    private void cbDateMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDateMonthActionPerformed
        setDateDay();
    }//GEN-LAST:event_cbDateMonthActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
       MainScreen frame = new MainScreen();
        MainController.OpenScreen(frame);
        dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void cbNeredenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNeredenActionPerformed
       setTripName();
    }//GEN-LAST:event_cbNeredenActionPerformed

    private void txtKmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKmActionPerformed

    private void txtFuelComActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFuelComActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFuelComActionPerformed

    private void cbTimeMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTimeMinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbTimeMinActionPerformed

    private void btnSettingsCountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSettingsCountryActionPerformed
        try {
            Runtime.getRuntime().exec("notepad "+System.getProperty("user.home")+"\\Documents\\OtoBi\\CountryList.txt");
        } catch (IOException ex) {
            Logger.getLogger(TripAddScreen.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_btnSettingsCountryActionPerformed

    private void btnReloadCountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReloadCountryActionPerformed
        try {
            setLoc();
        } catch (IOException ex) {
            Logger.getLogger(TripAddScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnReloadCountryActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TripAddScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TripAddScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TripAddScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TripAddScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {  
            public void run() {
                new TripAddScreen().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnReloadCountry;
    private javax.swing.JButton btnSeferEkle;
    private javax.swing.JButton btnSettingsCountry;
    private javax.swing.JComboBox<String> cbDateDay;
    private javax.swing.JComboBox<String> cbDateMonth;
    private javax.swing.JComboBox<String> cbDateYear;
    private javax.swing.JComboBox<String> cbNereden;
    private javax.swing.JComboBox<String> cbNereye;
    private javax.swing.JComboBox<String> cbTimeClock;
    private javax.swing.JComboBox<String> cbTimeMin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jsAdultPrice;
    private javax.swing.JSpinner jsStudentPrice;
    private javax.swing.JLabel lblAdultPrice;
    private javax.swing.JLabel lblFuelCom;
    private javax.swing.JLabel lblFuelPrice;
    private javax.swing.JLabel lblStudentPrice;
    private javax.swing.JList<String> lstSeferler;
    private javax.swing.JTextField txtFuelCom;
    private javax.swing.JTextField txtFuelPrice;
    private javax.swing.JTextField txtHowMuchTime;
    private javax.swing.JTextField txtKm;
    private javax.swing.JTextField txtSeferAdi;
    // End of variables declaration//GEN-END:variables
}
