
import javax.swing.*;
import java.awt.*;
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Allah
 */
public class Cow extends javax.swing.JFrame {

    /**
     * Creates new form Cow
     */
    ImageIcon[] img;
    int step=0;
    
    public Cow() {
        initComponents();
        btnNext.setVisible(false);
        btnPrevious.setVisible(false);
        lblStep.setVisible(false);
        lblStepByStep.setVisible(false);
        btnBack.setVisible(false);
        lblShow.setIcon(new ImageIcon(Objects.requireNonNull(this.getClass().getResource("/cow.jpg"))));
        img = new ImageIcon[6];
        
        img[0]= new ImageIcon(Objects.requireNonNull(this.getClass().getResource("/cow_1.jpg")));
        img[1]=new ImageIcon(Objects.requireNonNull(this.getClass().getResource("/cow_2.jpg")));
        img[2]=new ImageIcon(Objects.requireNonNull(this.getClass().getResource("/cow_3.jpg")));
        img[3]=new ImageIcon(Objects.requireNonNull(this.getClass().getResource("/cow_4.jpg")));
        img[4]=new ImageIcon(Objects.requireNonNull(this.getClass().getResource("/cow_5.jpg")));
        img[5]=new ImageIcon(Objects.requireNonNull(this.getClass().getResource("/cow_6.jpg")));
    }
    private int ImageCount()
    {
        return img.length;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultState="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPanel jPanel1 = new JPanel();
        lblShow = new javax.swing.JLabel();
        lblStep = new javax.swing.JLabel();
        lblStepByStep = new javax.swing.JLabel();
        btnPrevious = new javax.swing.JButton();
        btnStart = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("گاو");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblShow.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblStep.setFont(new java.awt.Font("Vazirmatn", Font.BOLD, 18)); // NOI18N
        lblStep.setForeground(new java.awt.Color(255, 0, 51));
        lblStep.setText("مرحله :");

        lblStepByStep.setFont(new java.awt.Font("Vazirmatn", Font.BOLD, 14)); // NOI18N
        lblStepByStep.setForeground(new java.awt.Color(0, 51, 204));
        lblStepByStep.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStepByStep.setText("---");

        btnPrevious.setBackground(new java.awt.Color(204, 0, 204));
        btnPrevious.setFont(new java.awt.Font("Vazirmatn", Font.BOLD, 14)); // NOI18N
        btnPrevious.setText("گام قبلی");
        btnPrevious.addActionListener(this::btnPreviousActionPerformed);

        btnStart.setBackground(new java.awt.Color(204, 0, 204));
        btnStart.setFont(new java.awt.Font("Vazirmatn", Font.BOLD, 12)); // NOI18N
        btnStart.setText("شروع کن");
        btnStart.addActionListener(this::btnStartActionPerformed);

        btnNext.setBackground(new java.awt.Color(204, 0, 204));
        btnNext.setFont(new java.awt.Font("Vazirmatn", Font.BOLD, 14)); // NOI18N
        btnNext.setText("گام بعدی");
        btnNext.addActionListener(this::btnNextActionPerformed);

        btnBack.setForeground(new java.awt.Color(255, 0, 102));
        btnBack.setText("بازگشت");
        btnBack.addActionListener(evt -> btnBackActionPerformed());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnPrevious)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNext))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(lblShow, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addComponent(lblStepByStep, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblStep))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addComponent(btnStart, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 21, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblShow, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStep)
                    .addComponent(lblStepByStep, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPrevious, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(btnStart, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(btnBack))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed() {//GEN-FIRST:event_btnBackActionPerformed
        Fehrest f = new Fehrest();
        this.setVisible(false);
        f.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        step++;
        if (step > ImageCount()) {
            step = 1;
        }
        lblShow.setIcon(img[step-1]);
        lblStepByStep.setText(step +"از"+ ImageCount());
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
        step--;
        if(step>0 && step<=ImageCount())
        {
            lblShow.setIcon(img[step-1]);
            lblStepByStep.setText(step +"از"+ ImageCount());
        }
        else if(step<=0)
        {
            step=ImageCount();
            lblShow.setIcon(img[step-1]);
            lblStepByStep.setText(step +"از"+ ImageCount());
        }
    }//GEN-LAST:event_btnPreviousActionPerformed

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
       btnNext.setVisible(true);
       btnPrevious.setVisible(true);
       lblStep.setVisible(true);
       lblStepByStep.setVisible(true);
       btnStart.setVisible(false);
       btnBack.setVisible(true);
       
       step++;
        lblStepByStep.setText(step +"از"+ ImageCount());
       lblShow.setIcon((img[0]));
    }//GEN-LAST:event_btnStartActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultState="collapsed" desc=" Look and feel setting code (optional) ">
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
        } catch (ClassNotFoundException | InstantiationException | UnsupportedLookAndFeelException |
                 IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Cow().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JButton btnStart;
    private javax.swing.JLabel lblShow;
    private javax.swing.JLabel lblStep;
    private javax.swing.JLabel lblStepByStep;
    // End of variables declaration//GEN-END:variables
}
