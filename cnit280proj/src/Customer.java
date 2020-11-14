public class Customer {
    private String id;
    private String fname;
    private String lname;
    private String address;
    private String joindate;
    private String phone;
    private String email;
    private String payment_method;

    public Customer(String id, String fname, String lname, String address, String joindate, String phone, String email) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.address = address;
        this.joindate = joindate;
        this.phone = phone;
        this.email = email;
        this.payment_method = "Cash";
    }

    public String getId() {
        return this.id;
    }

    public String getFname() {
        return this.fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return this.lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getJoindate() {
        return this.joindate;
    }

    public void setJoindate(String joindate) {
        this.joindate = joindate;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getPaymentMethod() {
        return this.payment_method;
    }
    
    public void setPaymentMethod(String payment_method){
        this.payment_method = payment_method;
    }

}
