import java.util.ArrayList;

public class Order {
    private String order_id;
    private String date_ordered;
    private String tracking_number;
    private ArrayList<String> order_prods;

    public Order(String order_id, String date_ordered, String tracking_number) {
        this.order_id = order_id;
        this.date_ordered = date_ordered;
        this.tracking_number = tracking_number;
        this.order_prods = new ArrayList<>();
    }
    
    public void setID(String s){
        this.order_id = s;
    }
    
    public String getOrderId() {
        return this.order_id;
    }

    public String getDateOrdered() {
        return this.date_ordered;
    }

    public String getTrackingNumber() {
        return this.tracking_number;
    }
    
    public ArrayList<String> getProducts() {
        return order_prods;
    }
    
    public void addProduct(String p){
        order_prods.add(p);
    }
}