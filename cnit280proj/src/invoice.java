public class Invoice {
    private String id;
    private String supplier;
    private String receivedate;
    private String duedate;
    private double amount;
    private String status;


    public Invoice(String id, String supplier, String receivedate, String duedate, double amount, String status) {
        this.id = id;
        this.supplier = supplier;
        this.receivedate = receivedate;
        this.duedate = duedate;
        this.amount = amount;
        this.status = status;
    }

    public String getId() {
        return this.id;
    }

    public String getSupplier() {
        return this.supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getReceivedate() {
        return this.receivedate;
    }

    public void setReceivedate(String receivedate) {
        this.receivedate = receivedate;
    }

    public String getDuedate() {
        return this.duedate;
    }

    public void setDuedate(String duedate) {
        this.duedate = duedate;
    }

    public double getAmount() {
        return this.amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
