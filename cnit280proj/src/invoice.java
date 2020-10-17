import java.util.Date;
public class Invoice {
    private String id;
    private String supplier;
    private String receivedate;
    private String duedate;
    private double amount;
    private String datepaid;
    private String status;


    public Invoice(String id, String supplier, String receivedate, String duedate, double amount, String datepaid, String status) {
        this.id = id;
        this.supplier = supplier;
        this.receivedate = receivedate;
        this.duedate = duedate;
        this.amount = amount;
        this.datepaid = datepaid;
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

    public String getReceiveDate() {
        return this.receivedate;
    }

    public void setReceiveDate(String receivedate) {
        this.receivedate = receivedate;
    }

    public String getDueDate() {
        return this.duedate;
    }

    public void setDueDate(String duedate) {
        this.duedate = duedate;
    }

    public double getAmount() {
        return this.amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    
    public String getDatePaid() {
        return this.datepaid;
    }

    public String getStatus() {
        return this.status;
    }

    public void payInvoice() {
        this.status = "Paid";
        this.datepaid = java.time.LocalDate.now().toString();
    }


    @Override
    public String toString() {
        return "{" +
            " id='" + id + "'" +
            ", supplier='" + supplier + "'" +
            ", receivedate='" + receivedate + "'" +
            ", duedate='" + duedate + "'" +
            ", amount='" + amount + "'" +
            ", status='" + status + "'" +
            "}";
    }

}
