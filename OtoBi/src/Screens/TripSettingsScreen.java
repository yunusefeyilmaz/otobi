/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Screens;

import Contollers.MainController;
import Contollers.TripController;
import Objects.Trip;
import Validator.TripValidator;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Yunus
 */
public class TripSettingsScreen extends javax.swing.JFrame {

    /**
     * Creates new form TripSettingsScreen
     */
    public void refreshTripsList() throws IOException{
        TripController controller = new TripController();
        String[] lst = controller.readTripFolderTrips();
        for(int i = 0;i< controller.returnTripsCount();i++){
            cbTrips.addItem(lst[i]);
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
    public void setTrip2Folder() throws IOException{
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
        trip.setAdultPrice(Integer.parseInt(String.valueOf(jsAdultPrice.getValue())));
        trip.setStudentPrice(Integer.parseInt(String.valueOf(jsStudentPrice.getValue())));
        trip.setFuelPrice(Float.parseFloat(txtFuelPrice.getText()));
        trip.setAverageTime(txtAveTime.getText());
        String time =String.valueOf(cbTimeClock.getSelectedItem()).concat(".").concat(String.valueOf(cbTimeMin.getSelectedItem()));
        trip.setTime(time);
        trip.setFuelConsumption(Float.valueOf(txtFuelCon.getText()));
        trip.setAveKm(Integer.parseInt(txtAveKm.getText()));
        TripValidator val = new TripValidator();
        if(val.checkAllData(trip)){
            cont.createTrip(trip); 
        }
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
        setTripData(trip);
    }
    public void setTripData(Trip trip){
        lblTripName.setText(trip.getTripName());
        lblFirstCountry.setText(trip.getNereden());
        lblSecondCountry.setText(trip.getNereye());
        lblKm.setText(trip.getAveKm() + "   KM");
        lblAvTime.setText(trip.getAverageTime() + " SAAT ORT.");
        lblPassCount.setText(String.valueOf(trip.getPassCount()));
        jsAdultPrice.setValue(trip.getAdultPrice());
        jsStudentPrice.setValue(trip.getStudentPrice());
        txtFuelPrice.setText(String.valueOf(trip.getFuelPrice()));
        txtFuelCon.setText(String.valueOf(trip.getFuelConsumption()));
        txtAveKm.setText(String.valueOf(trip.getAveKm()));
        txtAveTime.setText(String.valueOf(trip.getAverageTime()));
        String time = trip.getTime();
        int hour = Integer.parseInt(time.substring(0,2));
        int min = Integer.parseInt(time.substring(3));
        cbTimeClock.setSelectedIndex(hour);
        cbTimeMin.setSelectedIndex(min);
    }
    public void clcTripData(){  
        lblTripName.setText("");
        lblFirstCountry.setText("");
        lblSecondCountry.setText("");
        lblKm.setText("");
        lblAvTime.setText("");
        lblPassCount.setText("");
        jsAdultPrice.setValue(0);
        jsStudentPrice.setValue(0);
        txtFuelPrice.setText("");
    }
    public TripSettingsScreen() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbTrips = new javax.swing.JComboBox<>();
        lblAdult = new javax.swing.JLabel();
        lblStudent = new javax.swing.JLabel();
        jsAdultPrice = new javax.swing.JSpinner();
        jsStudentPrice = new javax.swing.JSpinner();
        lblFuel = new javax.swing.JLabel();
        txtFuelPrice = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        lblTripName = new javax.swing.JLabel();
        lblFirstCountry = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblSecondCountry = new javax.swing.JLabel();
        lblKm = new javax.swing.JLabel();
        lblAvTime = new javax.swing.JLabel();
        lblTextPassCount = new javax.swing.JLabel();
        lblPassCount = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        lblFuel1 = new javax.swing.JLabel();
        txtFuelCon = new javax.swing.JTextField();
        lblAverageKm = new javax.swing.JLabel();
        txtAveKm = new javax.swing.JTextField();
        lblAverageTime = new javax.swing.JLabel();
        txtAveTime = new javax.swing.JTextField();
        lblTime = new javax.swing.JLabel();
        cbTimeClock = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        cbTimeMin = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(850, 515));
        setResizable(false);
        setSize(new java.awt.Dimension(850, 515));

        cbTrips.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        cbTrips.setBorder(null);
        cbTrips.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTripsActionPerformed(evt);
            }
        });

        lblAdult.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        lblAdult.setText("Yetişkin Fiyatı :");

        lblStudent.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        lblStudent.setText("Öğrenci Fiyatı :");

        jsAdultPrice.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jsAdultPrice.setBorder(null);

        jsStudentPrice.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jsStudentPrice.setBorder(null);

        lblFuel.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        lblFuel.setText("Benzin Fiyatı : ");

        txtFuelPrice.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        txtFuelPrice.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtFuelPrice.setText(" ");
        txtFuelPrice.setBorder(null);
        txtFuelPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFuelPriceActionPerformed(evt);
            }
        });

        btnSave.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        btnSave.setText("KAYDET");
        btnSave.setBorder(null);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        lblTripName.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblTripName.setText(" ");

        lblFirstCountry.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        lblFirstCountry.setText(" ");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setText("->");

        lblSecondCountry.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        lblSecondCountry.setText(" ");

        lblKm.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        lblKm.setText(" ");

        lblAvTime.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        lblAvTime.setText(" ");

        lblTextPassCount.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        lblTextPassCount.setText("YOLCU SAYISI : ");

        lblPassCount.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        lblPassCount.setText("  ");

        btnBack.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        btnBack.setText("<");
        btnBack.setBorder(null);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblFuel1.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        lblFuel1.setText("Benzin Tüketim (100km/L) :");

        txtFuelCon.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        txtFuelCon.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtFuelCon.setBorder(null);

        lblAverageKm.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        lblAverageKm.setText("Ortalama Kilometre :");

        txtAveKm.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        txtAveKm.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtAveKm.setBorder(null);

        lblAverageTime.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        lblAverageTime.setText("Ortalama Saat :");

        txtAveTime.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        txtAveTime.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtAveTime.setBorder(null);

        lblTime.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        lblTime.setText("Saat Kaçta Kalkacak :");

        cbTimeClock.setBorder(null);

        jLabel12.setText(".");

        cbTimeMin.setBorder(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbTrips, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblAdult, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblFuel, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblFuel1)
                            .addComponent(lblAverageKm)
                            .addComponent(lblAverageTime))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtFuelPrice)
                            .addComponent(jsStudentPrice)
                            .addComponent(jsAdultPrice)
                            .addComponent(txtFuelCon)
                            .addComponent(txtAveKm)
                            .addComponent(txtAveTime, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblTime)
                        .addGap(10, 10, 10)
                        .addComponent(cbTimeClock, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbTimeMin, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblAvTime, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblTextPassCount, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPassCount, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblKm, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblFirstCountry, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblSecondCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblTripName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(42, 42, 42))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTripName)
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSecondCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFirstCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblKm, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblAvTime, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTextPassCount)
                            .addComponent(lblPassCount)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbTrips, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAdult)
                            .addComponent(jsAdultPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblStudent)
                            .addComponent(jsStudentPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFuel)
                            .addComponent(txtFuelPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFuel1)
                            .addComponent(txtFuelCon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAveKm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAverageKm))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAveTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAverageTime))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTime)
                            .addComponent(jLabel12)
                            .addComponent(cbTimeClock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbTimeMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(117, 117, 117)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbTripsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTripsActionPerformed
        clcTripData();
        selectedTrip();
    }//GEN-LAST:event_cbTripsActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try {
            setTrip2Folder();
            JOptionPane.showInternalMessageDialog(null, "Başarıyla kaydedildi.","BAŞARILI",JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException ex) {
            Logger.getLogger(TripSettingsScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        MainScreen frame = new MainScreen();
        MainController.OpenScreen(frame);
        dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtFuelPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFuelPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFuelPriceActionPerformed

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
            java.util.logging.Logger.getLogger(TripSettingsScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TripSettingsScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TripSettingsScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TripSettingsScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TripSettingsScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cbTimeClock;
    private javax.swing.JComboBox<String> cbTimeMin;
    private javax.swing.JComboBox<String> cbTrips;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSpinner jsAdultPrice;
    private javax.swing.JSpinner jsStudentPrice;
    private javax.swing.JLabel lblAdult;
    private javax.swing.JLabel lblAvTime;
    private javax.swing.JLabel lblAverageKm;
    private javax.swing.JLabel lblAverageTime;
    private javax.swing.JLabel lblFirstCountry;
    private javax.swing.JLabel lblFuel;
    private javax.swing.JLabel lblFuel1;
    private javax.swing.JLabel lblKm;
    private javax.swing.JLabel lblPassCount;
    private javax.swing.JLabel lblSecondCountry;
    private javax.swing.JLabel lblStudent;
    private javax.swing.JLabel lblTextPassCount;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel lblTripName;
    private javax.swing.JTextField txtAveKm;
    private javax.swing.JTextField txtAveTime;
    private javax.swing.JTextField txtFuelCon;
    private javax.swing.JTextField txtFuelPrice;
    // End of variables declaration//GEN-END:variables
}
