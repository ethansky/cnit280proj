
import java.util.ArrayList;

/**
 *
 * @author Ethan Emmons
 */
public class WarehouseStockList extends javax.swing.JFrame {
    private class ProductStock{
        private Product p;
        private int stockVal;
        private int stockReordered;
        private int daysUntilArrive;
        public ProductStock(Product p){
            this.p = p;
            this.stockVal = (int)(Math.random() * 30);
            this.stockReordered = 0;
            this.daysUntilArrive = -1;
        }
        public Product getProductObj(){
            return this.p;
        }
        public int getNumStock(){
            return this.stockVal;
        }
        public int getStockReordered(){
            return this.stockReordered;
        }
        public void updateStockReordered(int n){
            this.stockReordered += n;
        }
        
        public int getNumDays(){
            return this.daysUntilArrive;
        }
        
        public void updateNumDays(){
            if (this.daysUntilArrive == -1){
                this.daysUntilArrive = (int) (Math.random() * 7) + 1;
            } else
                this.daysUntilArrive = (int) (Math.random() * 7) + 1;
        }
    }
    
    private ArrayList<ProductStock> prods;
    private ArrayList<String> prod_names;
    public WarehouseStockList() {
        prods = new ArrayList<>();
        prods.add(new ProductStock(new Product("0001", "Foam Roller", "Cylinder made of foam for massaging the body", 2, 4.5, 2.5, 24, 25, "Massage", "Boston Fitness Supplies")));
        prods.add(new ProductStock(new Product("0002", "Foam Roller", "Cylinder made of foam for massaging the body", 1.8, 4, 3, 18, 18, "Massage", "Winter Gear Distributers")));
        prods.add(new ProductStock(new Product("0003", "5lb Dumbbell", "5lb neoprene dumbbell", 5, 2.76, 2.75, 7.5, 13, "Weights", "Boston Fitness Supplies")));
        prods.add(new ProductStock(new Product("0004", "5lb Dumbbell", "5lb neoprene dumbbell", 5, 2.76, 2.5, 7.33, 15, "Weights", "Winter Gear Distributers")));
        prods.add(new ProductStock(new Product("0005", "Resistance Bands", "Set of 5 resistance bands", 0.25, 0.3, 2.5, 12, 11.89, "Resistance Bands", "Boston Fitness Supplies")));
        prods.add(new ProductStock(new Product("0006", "Resistance Bands", "Set of 3 resistance bands", 0.25, 0.3, 2.5, 12, 7.99, "Resistance Bands", "Winter Gear Distributers")));
        prod_names = new ArrayList<>();
        prod_names.add("0001");
        prod_names.add("0002");
        prod_names.add("0003");
        prod_names.add("0004");
        prod_names.add("0005");
        prod_names.add("0006");
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        prod_name_list = new javax.swing.JList(prod_names.toArray());
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        product_fld = new javax.swing.JTextField();
        amount_in_stock_fld = new javax.swing.JTextField();
        reorder_btn = new javax.swing.JButton();
        reorder_amount_fld = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        shipping_status_fld = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        supplier_fld = new javax.swing.JTextField();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        prod_name_list.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        prod_name_list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prod_name_listMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(prod_name_list);

        jLabel1.setText("Product:");

        jLabel2.setText("Amount in Stock:");

        product_fld.setEditable(false);
        product_fld.setColumns(1);

        amount_in_stock_fld.setEditable(false);
        amount_in_stock_fld.setColumns(1);

        reorder_btn.setText("Reorder");
        reorder_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reorder_btnActionPerformed(evt);
            }
        });

        reorder_amount_fld.setColumns(1);

        jLabel3.setText("Reorder Amount:");

        jLabel4.setText("Shipping Status:");

        shipping_status_fld.setEditable(false);
        shipping_status_fld.setColumns(1);

        jLabel5.setText("Supplier:");

        supplier_fld.setEditable(false);
        supplier_fld.setColumns(1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(shipping_status_fld)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(reorder_btn)
                            .addComponent(reorder_amount_fld, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 94, Short.MAX_VALUE))
                    .addComponent(amount_in_stock_fld, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(product_fld, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(supplier_fld))
                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(product_fld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(supplier_fld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(amount_in_stock_fld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(shipping_status_fld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(reorder_amount_fld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addComponent(reorder_btn)
                        .addGap(33, 33, 33)))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void prod_name_listMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prod_name_listMouseClicked
        for (ProductStock ps : prods){
            if (prod_name_list.getSelectedValue().equalsIgnoreCase(ps.getProductObj().getId())){
                amount_in_stock_fld.setText(String.format("%d + %d ordered", ps.getNumStock(), ps.getStockReordered()));
                product_fld.setText(ps.getProductObj().getName());
                shipping_status_fld.setText(ps.getStockReordered() != 0 ? (ps.getNumDays() + " days until arrival") : (""));
                supplier_fld.setText(ps.getProductObj().getSupplier());
            }
        }
    }//GEN-LAST:event_prod_name_listMouseClicked

    private void reorder_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reorder_btnActionPerformed
        for (ProductStock ps : prods){
            if (prod_name_list.getSelectedValue().equalsIgnoreCase(ps.getProductObj().getId())){
                try{
                    Integer.parseInt(reorder_amount_fld.getText());
                } catch (Exception e){
                    return;
                }
                if (Integer.parseInt(reorder_amount_fld.getText()) <= 0){
                    return;
                }
                ps.updateStockReordered(Integer.parseInt(reorder_amount_fld.getText()));
                ps.updateNumDays();
                reorder_amount_fld.setText("");
                shipping_status_fld.setText(ps.getNumDays() + " days until arrival");
                amount_in_stock_fld.setText(String.format("%d + %d ordered", ps.getNumStock(), ps.getStockReordered()));
                
            }
        }
    }//GEN-LAST:event_reorder_btnActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amount_in_stock_fld;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JList<String> prod_name_list;
    private javax.swing.JTextField product_fld;
    private javax.swing.JTextField reorder_amount_fld;
    private javax.swing.JButton reorder_btn;
    private javax.swing.JTextField shipping_status_fld;
    private javax.swing.JTextField supplier_fld;
    // End of variables declaration//GEN-END:variables
}
