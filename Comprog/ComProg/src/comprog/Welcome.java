package comprog;

public class Welcome extends javax.swing.JFrame {

    public Welcome() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnLog = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLog.setBackground(new java.awt.Color(255, 102, 0));
        btnLog.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLog.setIcon(new javax.swing.ImageIcon(getClass().getResource("/comprog/Images/images (1).png"))); // NOI18N
        btnLog.setText("TIME LOG");
        btnLog.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogActionPerformed(evt);
            }
        });
        getContentPane().add(btnLog, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 140, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/comprog/Images/Welcome.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogActionPerformed
        dispose();
            Admin admin = new Admin();
            admin.setVisible(true);
            
    }//GEN-LAST:event_btnLogActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Welcome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLog;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
