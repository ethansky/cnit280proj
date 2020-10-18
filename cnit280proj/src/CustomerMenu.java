/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ethan - God Tier
 */
public class CustomerMenu extends javax.swing.JFrame {

    /**
     * Creates new form CustomerMenu
     */
    private Customer cust;
    public CustomerMenu(Customer cust) {
        this.cust = cust;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        view_account_details_btn = new javax.swing.JButton();
        edit_account_details_btn = new javax.swing.JButton();
        view_prev_orders_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        view_account_details_btn.setText("View Account Details");
        view_account_details_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view_account_details_btnActionPerformed(evt);
            }
        });

        edit_account_details_btn.setText("Edit Account Details");
        edit_account_details_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_account_details_btnActionPerformed(evt);
            }
        });

        view_prev_orders_btn.setText("View Previous Orders");
        view_prev_orders_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view_prev_orders_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(view_prev_orders_btn)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(view_account_details_btn)
                        .addGap(32, 32, 32)
                        .addComponent(edit_account_details_btn)))
                .addGap(41, 41, 41))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(view_account_details_btn)
                    .addComponent(edit_account_details_btn))
                .addGap(18, 18, 18)
                .addComponent(view_prev_orders_btn)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void view_account_details_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view_account_details_btnActionPerformed
        ViewUserAccountDetails frame = new ViewUserAccountDetails(cust);
        frame.setVisible(true);
    }//GEN-LAST:event_view_account_details_btnActionPerformed

    private void edit_account_details_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_account_details_btnActionPerformed
        EditUserAccountDetails frame = new EditUserAccountDetails(cust);
        frame.setVisible(true);
    }//GEN-LAST:event_edit_account_details_btnActionPerformed

    private void view_prev_orders_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view_prev_orders_btnActionPerformed
        PrevCustomerOrders frame = new PrevCustomerOrders();
        frame.setVisible(true);
    }//GEN-LAST:event_view_prev_orders_btnActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(CustomerMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(CustomerMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(CustomerMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(CustomerMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new CustomerMenu().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton edit_account_details_btn;
    private javax.swing.JButton view_account_details_btn;
    private javax.swing.JButton view_prev_orders_btn;
    // End of variables declaration//GEN-END:variables
}
