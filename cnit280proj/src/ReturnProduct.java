import java.util.ArrayList;
import javax.swing.DefaultListModel;
import java.util.Random;

/*
 * @author Ethan Emmons
 */
public class ReturnProduct extends javax.swing.JFrame {
    private class ProductReturnable {
        private int ret_id;
        private String ord_id;
        private String prod;
        private boolean isReturnable;
        
        public ProductReturnable(int ret_id, String ord_id, String prod, boolean isReturnable){
            this.ret_id = ret_id;
            this.ord_id = ord_id;
            this.prod = prod;
            this.isReturnable = isReturnable;
        }
        public void setReturnable(boolean bool) {
            this.isReturnable = bool;
        }
        public boolean getReturnable() {
            return this.isReturnable;
        }
        public String getProd() {
            return this.prod;
        }
        
        public String getOrderId() {
            return this.ord_id;
        }
        
        public int getRetId(){
            return this.ret_id;
        }
        
        public String toString(){
            return this.prod;
        }
        
    }
    private ArrayList<Order> ord_arr;
    private ArrayList<ProductReturnable> ret_arr;
    private DefaultListModel ord_dlm;
    private DefaultListModel prod_dlm;
    public ReturnProduct(ArrayList ord_arr, DefaultListModel ord_dlm) {
        this.ord_arr = ord_arr;
        this.ord_dlm = ord_dlm;
        this.prod_dlm = new DefaultListModel();
        this.ret_arr = new ArrayList<>();
        int ret_counter = 0;
        Random rd = new Random();
        for(Order ord : this.ord_arr) {
            for(String prod : ord.getProducts()) {
                this.ret_arr.add(new ProductReturnable(ret_counter, ord.getOrderId(), prod, rd.nextBoolean()));
                ret_counter++;
            }
        }
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
        ord_id_list = new javax.swing.JList(ord_dlm);
        ret_prod_btn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        prod_name_list = new javax.swing.JList(prod_dlm);
        is_returnable_field = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        ord_field = new javax.swing.JTextField();
        prod_field = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        ord_id_list.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        ord_id_list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ord_id_listMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ord_id_list);

        ret_prod_btn.setText("Return");
        ret_prod_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ret_prod_btnActionPerformed(evt);
            }
        });

        prod_name_list.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        prod_name_list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prod_name_listMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(prod_name_list);

        is_returnable_field.setEditable(false);
        is_returnable_field.setColumns(1);

        jLabel1.setText("Returnable?");

        ord_field.setEditable(false);
        ord_field.setText("Orders");

        prod_field.setEditable(false);
        prod_field.setText("Products");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ord_field, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(prod_field, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(is_returnable_field)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 28, Short.MAX_VALUE)
                                .addComponent(ret_prod_btn)
                                .addGap(31, 31, 31))))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(33, 33, 33))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ord_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prod_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(is_returnable_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ret_prod_btn)))
                .addGap(57, 57, 57))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ord_id_listMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ord_id_listMouseClicked
        this.prod_dlm.removeAllElements();
        for (ProductReturnable prod_ret : this.ret_arr) {
            if (prod_ret.getOrderId() == ord_id_list.getSelectedValue()) {
                prod_dlm.addElement(prod_ret);
            }
        }
    }//GEN-LAST:event_ord_id_listMouseClicked

    private void prod_name_listMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prod_name_listMouseClicked
        is_returnable_field.setText("" + prod_name_list.getSelectedValue().getReturnable());
    }//GEN-LAST:event_prod_name_listMouseClicked

    private void ret_prod_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ret_prod_btnActionPerformed
        if(prod_name_list.getSelectedValue().getReturnable()){
            ProductReturnTrue frame = new ProductReturnTrue();
            frame.setVisible(true);
        } else {
            ProductReturnFalse frame = new ProductReturnFalse();
            frame.setVisible(true);
        }
    }//GEN-LAST:event_ret_prod_btnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField is_returnable_field;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField ord_field;
    private javax.swing.JList<String> ord_id_list;
    private javax.swing.JTextField prod_field;
    private javax.swing.JList<ProductReturnable> prod_name_list;
    private javax.swing.JButton ret_prod_btn;
    // End of variables declaration//GEN-END:variables
}
