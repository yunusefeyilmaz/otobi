
package Screens;

import Contollers.MainController;
import Contollers.ProfitLossController;
import Contollers.TripController;
import Objects.Trip;
import java.awt.Color;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Yunus
 */
public class ProfitLossScreen extends javax.swing.JFrame {

    /**
     * Creates new form ProfitLossScreen
     */
    public ProfitLossScreen() {
        initComponents();
    }
    public void refreshTripsList() throws IOException{
        TripController controller = new TripController();
        String[] lst = controller.readTripFolderTrips();
        for(int i = 0;i< controller.returnTripsCount();i++){
            cbTrips.addItem(lst[i]);
        }
    }
    public void setTripData() throws IOException, ClassNotFoundException{
        String selected =String.valueOf(cbTrips.getSelectedItem());
        TripController cont = new TripController();
        Trip trip =cont.readTrip(selected);
        setProfitLossData(trip);
    }
    public void setProfitLossData(Trip trip){
        float loss = ProfitLossController.calcFuelPrice(trip);
        float profit = ProfitLossController.calcPassPrice(trip);
        float sum =profit-loss;
        if(sum<0){
            lblSum.setForeground(Color.red);
        }else{
            lblSum.setForeground(Color.green);
        }
       
        lblProfit.setText(String.valueOf(profit)+"   ₺");
        lblLoss.setText(String.valueOf(loss)+"   ₺");
        lblSum.setText(String.valueOf(sum) +"   ₺");
    }
    public void clcData(){
        lblProfit.setText("");
        lblLoss.setText("");
        lblSum.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jProgressBar1 = new javax.swing.JProgressBar();
        jSeparator1 = new javax.swing.JSeparator();
        cbTrips = new javax.swing.JComboBox<>();
        lblTextProfit = new javax.swing.JLabel();
        lblTextLoss = new javax.swing.JLabel();
        lblProfit = new javax.swing.JLabel();
        lblLoss = new javax.swing.JLabel();
        lblTextSum = new javax.swing.JLabel();
        lblSum = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        lblComment = new javax.swing.JLabel();

        jSeparator1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        cbTrips.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        cbTrips.setBorder(null);
        cbTrips.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTripsActionPerformed(evt);
            }
        });

        lblTextProfit.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        lblTextProfit.setText("GELİR :");

        lblTextLoss.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        lblTextLoss.setText("GİDER :");

        lblProfit.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        lblProfit.setForeground(new java.awt.Color(102, 255, 102));

        lblLoss.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        lblLoss.setForeground(new java.awt.Color(255, 51, 51));

        lblTextSum.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        lblTextSum.setText("TOPLAM : ");

        lblSum.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        lblSum.setForeground(new java.awt.Color(255, 51, 51));
        lblSum.setText("-300 ₺");

        btnBack.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        btnBack.setText("<");
        btnBack.setBorder(null);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblComment.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        lblComment.setText("Gelir gider hesabı girdiğiniz değerlere bağlı oluşan fiyatlardır.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblTextProfit, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(lblProfit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblTextLoss, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(lblLoss, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(cbTrips, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(235, 235, 235)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTextSum, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSum, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblComment, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(273, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(cbTrips, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTextProfit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblProfit, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTextLoss, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(5, 5, 5))
                    .addComponent(lblLoss, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(lblComment, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTextSum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblSum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(117, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbTripsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTripsActionPerformed
        clcData();
        try {
            setTripData();
        } catch (IOException ex) {
            Logger.getLogger(ProfitLossScreen.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProfitLossScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cbTripsActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        MainScreen frame = new MainScreen();
        MainController.OpenScreen(frame);
        dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    
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
            java.util.logging.Logger.getLogger(ProfitLossScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProfitLossScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProfitLossScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProfitLossScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProfitLossScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JComboBox<String> cbTrips;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel lblComment;
    private javax.swing.JLabel lblLoss;
    private javax.swing.JLabel lblProfit;
    private javax.swing.JLabel lblSum;
    private javax.swing.JLabel lblTextLoss;
    private javax.swing.JLabel lblTextProfit;
    private javax.swing.JLabel lblTextSum;
    // End of variables declaration//GEN-END:variables
}
