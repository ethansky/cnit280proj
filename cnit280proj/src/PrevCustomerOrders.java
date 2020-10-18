
import java.util.ArrayList;
import javax.swing.DefaultListModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ethan Emmons
 */
public class PrevCustomerOrders extends javax.swing.JFrame {

    /**
     * Creates new form PrevCustomerOrders
     */
    private DefaultListModel plm;
    private DefaultListModel olm;
    private int counter;
    private ArrayList<Order> order_array;
    
    public PrevCustomerOrders() {
        plm = new DefaultListModel();
        olm = new DefaultListModel();
        olm.addElement("0001");
        olm.addElement("0002");
        olm.addElement("0003");
        counter = 4;
        order_array = new ArrayList<>();
        order_array.add(new Order("0001", "10-5-20", "90084312020"));
        order_array.get(0).addProduct("Foam Roller");
        order_array.get(0).addProduct("Foam Roller");
        order_array.get(0).addProduct("Resistance bands");
        
        order_array.add(new Order("0002", "10-2-20", "AS424891767CN"));
        order_array.get(1).addProduct("5lb Dumbbell");
        order_array.get(1).addProduct("5lb Dumbbell");
        
        order_array.add(new Order("0003", "10-6-20", "01005952112"));
        order_array.get(2).addProduct("Foam Roller");
        order_array.get(2).addProduct("Resistance bands");
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

        jScrollPane1 = new javax.swing.JScrollPane();
        order_id_list = new javax.swing.JList(olm);
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        products_ordered = new javax.swing.JList(plm);
        id_fld = new javax.swing.JTextField();
        ordered_fld = new javax.swing.JTextField();
        tracking_fld = new javax.swing.JTextField();
        order_again_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        order_id_list.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        order_id_list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                order_id_listMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(order_id_list);

        jLabel1.setText("Order ID");

        jLabel2.setText("Date Ordered");

        jLabel3.setText("Tracking Number");

        jLabel4.setText("Products");

        jScrollPane2.setViewportView(products_ordered);

        id_fld.setColumns(1);

        ordered_fld.setColumns(1);

        tracking_fld.setColumns(1);

        order_again_btn.setText("Order Again");
        order_again_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                order_again_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ordered_fld, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(id_fld, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tracking_fld, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(order_again_btn)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(order_again_btn)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(id_fld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(ordered_fld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(tracking_fld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void order_id_listMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_order_id_listMouseClicked
        plm.removeAllElements();
        for (Order o : order_array){
            if (order_id_list.getSelectedValue().equalsIgnoreCase(o.getOrderId())){
                id_fld.setText(o.getOrderId());
                ordered_fld.setText(o.getDateOrdered());
                tracking_fld.setText(o.getTrackingNumber());
                for (String s : o.getProducts()){
                    plm.addElement(s);
                }
            }
        }
    }//GEN-LAST:event_order_id_listMouseClicked

    private void order_again_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_order_again_btnActionPerformed
        String currid = "";
        if (counter > 9){
            olm.addElement("00" + counter);
            currid = "00" + counter;
        } else {
            olm.addElement("000" + counter);
            currid = "000" + counter;
        }
        for (int i = 0; i < order_array.size(); i++){
            Order prod_itr = order_array.get(i);
            if (prod_itr.getOrderId().equalsIgnoreCase(order_id_list.getSelectedValue())){
                order_array.add(new Order(currid, java.time.LocalDate.now().toString(), "" + ((long) Math.floor(Math.random() * 9_000_000_000L) + 1_000_000_000L)));
                for (String s : prod_itr.getProducts()){
                    order_array.get(order_array.size() - 1).addProduct(s);
                }
            }
        }
        counter++;
    }//GEN-LAST:event_order_again_btnActionPerformed

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
//            java.util.logging.Logger.getLogger(PrevCustomerOrders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(PrevCustomerOrders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(PrevCustomerOrders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(PrevCustomerOrders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new PrevCustomerOrders().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField id_fld;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton order_again_btn;
    private javax.swing.JList<String> order_id_list;
    private javax.swing.JTextField ordered_fld;
    private javax.swing.JList<String> products_ordered;
    private javax.swing.JTextField tracking_fld;
    // End of variables declaration//GEN-END:variables
}