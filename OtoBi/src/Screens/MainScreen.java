package Screens;


import Contollers.TripController;
import Contollers.MainController;
import Screens.TripSettingsScreen;
import Screens.ProfitLossScreen;
import Screens.TripAddScreen;
import Screens.TripShowScreen;
import Screens.PassAddScreen;
import Screens.PassAddScreen;
import Screens.ProfitLossScreen;
import Screens.TripAddScreen;
import Screens.TripSettingsScreen;
import Screens.TripShowScreen;
import Validator.TripValidator;
import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Image;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.LookAndFeel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


public class MainScreen extends javax.swing.JFrame {

    /**
     * Creates new form MainScreen
     */
    public MainScreen() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSeferEkle = new javax.swing.JButton();
        btnYolcuEkle = new javax.swing.JButton();
        btnSeferGoruntule = new javax.swing.JButton();
        btnFiyat = new javax.swing.JButton();
        btnGelir = new javax.swing.JButton();
        lblSeferEkle = new javax.swing.JLabel();
        lblYolcuEkle = new javax.swing.JLabel();
        lblSeferEkle2 = new javax.swing.JLabel();
        lblSeferEkle3 = new javax.swing.JLabel();
        lblSeferEkle4 = new javax.swing.JLabel();
        lblBaslik = new javax.swing.JLabel();
        lblBaslik1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(109, 119, 119));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(850, 515));
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);

        btnSeferEkle.setFont(btnSeferEkle.getFont().deriveFont(btnSeferEkle.getFont().getSize()-2f));
        btnSeferEkle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/tripadd100.png"))); // NOI18N
        btnSeferEkle.setAlignmentY(0.0F);
        btnSeferEkle.setAutoscrolls(true);
        btnSeferEkle.setBorder(null);
        btnSeferEkle.setBorderPainted(false);
        btnSeferEkle.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSeferEkle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSeferEkle.setIconTextGap(-2);
        btnSeferEkle.setMargin(new java.awt.Insets(10, 10, 10, 10));
        btnSeferEkle.setMaximumSize(new java.awt.Dimension(108, 101));
        btnSeferEkle.setMinimumSize(new java.awt.Dimension(108, 101));
        btnSeferEkle.setName(""); // NOI18N
        btnSeferEkle.setPreferredSize(new java.awt.Dimension(108, 101));
        btnSeferEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeferEkleActionPerformed(evt);
            }
        });

        btnYolcuEkle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/personadd.png"))); // NOI18N
        btnYolcuEkle.setAlignmentY(0.0F);
        btnYolcuEkle.setAutoscrolls(true);
        btnYolcuEkle.setBorder(null);
        btnYolcuEkle.setBorderPainted(false);
        btnYolcuEkle.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnYolcuEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYolcuEkleActionPerformed(evt);
            }
        });

        btnSeferGoruntule.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/tripshow100.png"))); // NOI18N
        btnSeferGoruntule.setAutoscrolls(true);
        btnSeferGoruntule.setBorder(null);
        btnSeferGoruntule.setMinimumSize(new java.awt.Dimension(80, 80));
        btnSeferGoruntule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeferGoruntuleActionPerformed(evt);
            }
        });

        btnFiyat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/tripsett100.png"))); // NOI18N
        btnFiyat.setAutoscrolls(true);
        btnFiyat.setBorder(null);
        btnFiyat.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnFiyat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiyatActionPerformed(evt);
            }
        });

        btnGelir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/profitloss.png"))); // NOI18N
        btnGelir.setAutoscrolls(true);
        btnGelir.setBorder(null);
        btnGelir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGelirActionPerformed(evt);
            }
        });

        lblSeferEkle.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        lblSeferEkle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSeferEkle.setText("SEFER EKLE");

        lblYolcuEkle.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        lblYolcuEkle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblYolcuEkle.setText("YOLCU EKLE");

        lblSeferEkle2.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        lblSeferEkle2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSeferEkle2.setText("SEFER GÖRÜNTÜLE");

        lblSeferEkle3.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        lblSeferEkle3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSeferEkle3.setText("SEFER AYARLARI");

        lblSeferEkle4.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        lblSeferEkle4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSeferEkle4.setText("GELİR-GİDER");

        lblBaslik.setFont(lblBaslik.getFont().deriveFont(lblBaslik.getFont().getStyle() | java.awt.Font.BOLD, lblBaslik.getFont().getSize()+64));
        lblBaslik.setForeground(new java.awt.Color(204, 0, 0));
        lblBaslik.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblBaslik.setText("Bi");
        lblBaslik.setAlignmentY(0.0F);
        lblBaslik.setMaximumSize(new java.awt.Dimension(39, 30));
        lblBaslik.setOpaque(true);

        lblBaslik1.setFont(lblBaslik1.getFont().deriveFont(lblBaslik1.getFont().getStyle() | java.awt.Font.BOLD, lblBaslik1.getFont().getSize()+64));
        lblBaslik1.setForeground(new java.awt.Color(221, 255, 237));
        lblBaslik1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBaslik1.setText("Oto");
        lblBaslik1.setAlignmentY(0.0F);
        lblBaslik1.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(307, 307, 307)
                        .addComponent(lblBaslik1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblBaslik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(355, 355, 355)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSeferEkle4, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGelir, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(424, 424, 424)
                        .addComponent(lblSeferEkle2)
                        .addGap(42, 42, 42)
                        .addComponent(lblSeferEkle3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblSeferEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblYolcuEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSeferEkle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(72, 72, 72)
                                .addComponent(btnYolcuEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(74, 74, 74)
                        .addComponent(btnSeferGoruntule, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83)
                        .addComponent(btnFiyat, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBaslik1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBaslik, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFiyat, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSeferGoruntule, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnSeferEkle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnYolcuEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSeferEkle2)
                    .addComponent(lblSeferEkle3)
                    .addComponent(lblSeferEkle)
                    .addComponent(lblYolcuEkle))
                .addGap(25, 25, 25)
                .addComponent(btnGelir, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSeferEkle4)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        lblBaslik.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnGelirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGelirActionPerformed
        ProfitLossScreen frame = new ProfitLossScreen();
        try {
            if(TripValidator.isTripNull()) {
                try {
                    frame.refreshTripsList();
                } catch (IOException ex) {
                    Logger.getLogger(MainScreen.class.getName()).log(Level.SEVERE, null, ex);
                }
                MainController.OpenScreen(frame);
                dispose();
            }
        } catch (IOException ex) {
            Logger.getLogger(MainScreen.class.getName()).log(Level.SEVERE, null, ex);
        }     
    }//GEN-LAST:event_btnGelirActionPerformed

    private void btnFiyatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiyatActionPerformed
       TripSettingsScreen frame = new TripSettingsScreen();
        try {
            if(TripValidator.isTripNull()) {
                try {
                    frame.setTime();
                    frame.refreshTripsList();
                    frame.selectedTrip();
                } catch (IOException ex) {
                    Logger.getLogger(MainScreen.class.getName()).log(Level.SEVERE, null, ex);
                }
                MainController.OpenScreen(frame);
                dispose();
            }} catch (IOException ex) {
            Logger.getLogger(MainScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnFiyatActionPerformed

    private void btnYolcuEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYolcuEkleActionPerformed
        PassAddScreen frame = new PassAddScreen();
        try {
            if(TripValidator.isTripNull()) {
                try {
                    // TODO add your handling code here:
                    frame.refreshTrips();
                    frame.setSeatsList();
                    frame.setSeats();
                } catch (IOException ex) {
                    Logger.getLogger(MainScreen.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(MainScreen.class.getName()).log(Level.SEVERE, null, ex);
                }
                MainController.OpenScreen(frame);
                dispose();
            }
        } catch (IOException ex) {
            Logger.getLogger(MainScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnYolcuEkleActionPerformed

    private void btnSeferEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeferEkleActionPerformed
        TripAddScreen frame = new TripAddScreen();
        MainController.OpenScreen(frame);
        try { 
            frame.setFuelandPriceValue();
            frame.setTime();
            frame.setDateMonth();
            frame.setLoc();
            frame.listRefresh();
            frame.setTripName();       
            frame.setDateDay();          
        } catch (IOException ex) {
            Logger.getLogger(MainScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
        dispose();
    }//GEN-LAST:event_btnSeferEkleActionPerformed

    private void btnSeferGoruntuleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeferGoruntuleActionPerformed
      TripShowScreen frame = new TripShowScreen();
        try {
            if(TripValidator.isTripNull()) {
                MainController.OpenScreen(frame);
                frame.setSeatsList();
                try {
                    frame.refreshTrips();
                    frame.selectedTrip();
                    frame.setSeats();
                    frame.setPassData();
                    
                } catch (IOException ex) {
                    Logger.getLogger(MainScreen.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(MainScreen.class.getName()).log(Level.SEVERE, null, ex);
                }
            dispose();
            } } catch (IOException ex) {
            Logger.getLogger(MainScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnSeferGoruntuleActionPerformed

    public static void main(String args[]) {
        
        FlatLightLaf.setup();
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
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TripController tc = new TripController();
               
                try {
                MainController.createOtobiFolder();
                } catch (IOException ex) {
                Logger.getLogger(MainScreen.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                     UIManager.setLookAndFeel( new FlatDarculaLaf() );
                } catch( Exception ex ) {
                      System.err.println( "Failed to initialize LaF" );
                }
                 try {
                    tc.createCountryList();
                } catch (IOException ex) {
                    Logger.getLogger(MainScreen.class.getName()).log(Level.SEVERE, null, ex);
                }
                MainScreen mainscreen = new MainScreen();           
                MainController.OpenScreen(mainscreen);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFiyat;
    private javax.swing.JButton btnGelir;
    private javax.swing.JButton btnSeferEkle;
    private javax.swing.JButton btnSeferGoruntule;
    private javax.swing.JButton btnYolcuEkle;
    public javax.swing.JLabel lblBaslik;
    private javax.swing.JLabel lblBaslik1;
    private javax.swing.JLabel lblSeferEkle;
    private javax.swing.JLabel lblSeferEkle2;
    private javax.swing.JLabel lblSeferEkle3;
    private javax.swing.JLabel lblSeferEkle4;
    private javax.swing.JLabel lblYolcuEkle;
    // End of variables declaration//GEN-END:variables
}
