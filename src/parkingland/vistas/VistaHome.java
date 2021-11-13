
package parkingland.vistas;


import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class VistaHome extends javax.swing.JFrame {
    
    Fondopanel fondo = new Fondopanel();

 
    public VistaHome() {
        
        this.setContentPane(fondo);
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bar1 = new javax.swing.JPanel();
        home = new javax.swing.JButton();
        insertcar = new javax.swing.JButton();
        inseruser = new javax.swing.JButton();
        ingresar = new javax.swing.JButton();
        history = new javax.swing.JButton();
        config = new javax.swing.JButton();
        bar2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bar3 = new Fondopanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bar1.setBackground(new java.awt.Color(153, 153, 153));

        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/parkingland/assent/home.png"))); // NOI18N
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });

        insertcar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/parkingland/assent/sports-car.png"))); // NOI18N
        insertcar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertcarActionPerformed(evt);
            }
        });

        inseruser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/parkingland/assent/user.png"))); // NOI18N
        inseruser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inseruserActionPerformed(evt);
            }
        });

        ingresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/parkingland/assent/add.png"))); // NOI18N
        ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarActionPerformed(evt);
            }
        });

        history.setIcon(new javax.swing.ImageIcon(getClass().getResource("/parkingland/assent/history.png"))); // NOI18N
        history.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historyActionPerformed(evt);
            }
        });

        config.setIcon(new javax.swing.ImageIcon(getClass().getResource("/parkingland/assent/management.png"))); // NOI18N
        config.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                configActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bar1Layout = new javax.swing.GroupLayout(bar1);
        bar1.setLayout(bar1Layout);
        bar1Layout.setHorizontalGroup(
            bar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bar1Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(bar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(config, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ingresar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inseruser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(insertcar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(home, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(history, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        bar1Layout.setVerticalGroup(
            bar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bar1Layout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inseruser, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(insertcar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(history, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(config, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
        );

        bar2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("PARKILAND");

        javax.swing.GroupLayout bar2Layout = new javax.swing.GroupLayout(bar2);
        bar2.setLayout(bar2Layout);
        bar2Layout.setHorizontalGroup(
            bar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bar2Layout.createSequentialGroup()
                .addGap(314, 314, 314)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bar2Layout.setVerticalGroup(
            bar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bar2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );

        bar3.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout bar3Layout = new javax.swing.GroupLayout(bar3);
        bar3.setLayout(bar3Layout);
        bar3Layout.setHorizontalGroup(
            bar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 791, Short.MAX_VALUE)
        );
        bar3Layout.setVerticalGroup(
            bar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bar3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void insertcarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertcarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_insertcarActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_homeActionPerformed

    private void inseruserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inseruserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inseruserActionPerformed

    private void ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ingresarActionPerformed

    private void configActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_configActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_configActionPerformed

    private void historyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_historyActionPerformed

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
            java.util.logging.Logger.getLogger(VistaHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bar1;
    private javax.swing.JPanel bar2;
    private javax.swing.JPanel bar3;
    public javax.swing.JButton config;
    public javax.swing.JButton history;
    public javax.swing.JButton home;
    public javax.swing.JButton ingresar;
    public javax.swing.JButton insertcar;
    public javax.swing.JButton inseruser;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables


class Fondopanel extends JPanel
{
    
    private Image imagen;
    
    @Override
    public void paint(Graphics g)
    {
         imagen = new ImageIcon(getClass().getResource("/parkingland.assent/logo2.png")).getImage();
         
         g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
         
         setOpaque(false);
         
         super.paint(g);
         
    }
       
    
    
}




}
