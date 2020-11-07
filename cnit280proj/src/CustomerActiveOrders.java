import java.util.ArrayList;
/**
 *
 * @author Ethan Emmons
 */
public class CustomerActiveOrders extends javax.swing.JFrame {
    
    private ArrayList<String> ord_id_arr;
    public CustomerActiveOrders() {
        ord_id_arr = new ArrayList<>();
        ord_id_arr.add("0004");
        ord_id_arr.add("0005");
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
        active_order_list = new javax.swing.JList(ord_id_arr.toArray());
        jLabel1 = new javax.swing.JLabel();
        shipping_status_fld = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tracking_num_fld = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        order_id_fld = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        active_order_list.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        active_order_list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                active_order_listMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(active_order_list);

        jLabel1.setText("Shipping Status:");

        shipping_status_fld.setEditable(false);
        shipping_status_fld.setColumns(1);

        jLabel2.setText("Tracking Number:");

        tracking_num_fld.setEditable(false);

        jLabel3.setText("Order ID:");

        order_id_fld.setEditable(false);
        order_id_fld.setColumns(1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(shipping_status_fld)
                    .addComponent(tracking_num_fld, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                    .addComponent(order_id_fld))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(order_id_fld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tracking_num_fld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(shipping_status_fld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void active_order_listMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_active_order_listMouseClicked
        if (active_order_list.getSelectedValue().equalsIgnoreCase("0004")){
            order_id_fld.setText("0004");
            tracking_num_fld.setText("932843561820");
            shipping_status_fld.setText("Delivered.");
        } else if (active_order_list.getSelectedValue().equalsIgnoreCase("0005")){
            order_id_fld.setText("0005");
            tracking_num_fld.setText("76584312098");
            shipping_status_fld.setText("Will be delivered tomorrow.");
        }
    }//GEN-LAST:event_active_order_listMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> active_order_list;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField order_id_fld;
    private javax.swing.JTextField shipping_status_fld;
    private javax.swing.JTextField tracking_num_fld;
    // End of variables declaration//GEN-END:variables
}
