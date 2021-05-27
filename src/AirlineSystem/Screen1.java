
package AirlineSystem;

public class Screen1 extends javax.swing.JFrame {

   
    public Screen1() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Bar = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();
        Per = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Bar.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(Bar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 470, 690, 20));

        jLabel2.setBackground(new java.awt.Color(255, 0, 51));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Wings");
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 150, 90));

        Per.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        Per.setForeground(new java.awt.Color(240, 240, 240));
        Per.setText("99%");
        getContentPane().add(Per, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 400, 140, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AirlineSystem/flying-plane-sign-front-view-line-icon-vector-13545161.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-90, 0, 890, 520));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Screen1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JProgressBar Bar;
    public javax.swing.JLabel Per;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
