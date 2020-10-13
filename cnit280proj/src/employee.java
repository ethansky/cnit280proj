public class employee {
    private String id;
    private String fname;
    private String lname;
    private String phone;
    private String hiredate;
    private String email;
    private String address;
    private String departmentid;
    private String storeid;
    private String warehouseid;
    private String hqid;


    public employee(String id, String fname, String lname, String phone, String hiredate, String email, String address, String departmentid, String storeid, String warehouseid, String hqid) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.phone = phone;
        this.hiredate = hiredate;
        this.email = email;
        this.address = address;
        this.departmentid = departmentid;
        this.storeid = storeid;
        this.warehouseid = warehouseid;
        this.hqid = hqid;
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

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getHiredate() {
        return this.hiredate;
    }

    public void setHiredate(String hiredate) {
        this.hiredate = hiredate;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDepartmentid() {
        return this.departmentid;
    }

    public void setDepartmentid(String departmentid) {
        this.departmentid = departmentid;
    }

    public String getStoreid() {
        return this.storeid;
    }

    public void setStoreid(String storeid) {
        this.storeid = storeid;
    }

    public String getWarehouseid() {
        return this.warehouseid;
    }

    public void setWarehouseid(String warehouseid) {
        this.warehouseid = warehouseid;
    }

    public String getHqid() {
        return this.hqid;
    }

    public void setHqid(String hqid) {
        this.hqid = hqid;
    }
    
}
