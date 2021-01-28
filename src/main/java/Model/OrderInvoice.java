package Model;

public class OrderInvoice {

    private int OrderNo;
    private String NIC;
    private String CName;
    private float TotalPayableamount;
    private String PaymentMethod;
    private String Orderdate;
    private String PaymentDate;
    private String Status;

    public OrderInvoice(int OrderNo, String NIC, String CName, float TotalPayableamount, String PaymentMethod, String Orderdate, String PaymentDate, String Status) {
        this.OrderNo = OrderNo;
        this.NIC = NIC;
        this.CName = CName;
        this.TotalPayableamount = TotalPayableamount;
        this.PaymentMethod = PaymentMethod;
        this.Orderdate = Orderdate;
        this.PaymentDate = PaymentDate;
        this.Status = Status;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public int getOrderNo() {
        return OrderNo;
    }

    public void setOrderNo(int OrderNo) {
        this.OrderNo = OrderNo;
    }

    public String getNIC() {
        return NIC;
    }

    public void setNIC(String NIC) {
        this.NIC = NIC;
    }

    public String getCName() {
        return CName;
    }

    public void setCName(String CName) {
        this.CName = CName;
    }

    public float getTotalPayableamount() {
        return TotalPayableamount;
    }

    public void setTotalPayableamount(float TotalPayableamount) {
        this.TotalPayableamount = TotalPayableamount;
    }

    public String getPaymentMethod() {
        return PaymentMethod;
    }

    public void setPaymentMethod(String PaymentMethod) {
        this.PaymentMethod = PaymentMethod;
    }

    public String getOrderdate() {
        return Orderdate;
    }

    public void setOrderdate(String Orderdate) {
        this.Orderdate = Orderdate;
    }

    public String getPaymentDate() {
        return PaymentDate;
    }

    public void setPaymentDate(String PaymentDate) {
        this.PaymentDate = PaymentDate;
    }
}
