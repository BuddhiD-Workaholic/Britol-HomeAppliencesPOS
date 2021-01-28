package Model;

public class MainWindow {

    private String NIC;
    private String Name;
    private int orderNo;
    private float TotalPayable;
    private String PaymentMethod;
    private String PDate;

    public MainWindow(String NIC, String Name, int orderNo, float TotalPayable, String PaymentMethod, String PDate) {
        this.NIC = NIC;
        this.Name = Name;
        this.orderNo = orderNo;
        this.TotalPayable = TotalPayable;
        this.PaymentMethod = PaymentMethod;
        this.PDate = PDate;
    }

    public String getNIC() {
        return NIC;
    }

    public void setNIC(String NIC) {
        this.NIC = NIC;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(int orderNo) {
        this.orderNo = orderNo;
    }

    public float getTotalPayable() {
        return TotalPayable;
    }

    public void setTotalPayable(float TotalPayable) {
        this.TotalPayable = TotalPayable;
    }

    public String getPaymentMethod() {
        return PaymentMethod;
    }

    public void setPaymentMethod(String PaymentMethod) {
        this.PaymentMethod = PaymentMethod;
    }

    public String getPDate() {
        return PDate;
    }

    public void setPDate(String PDate) {
        this.PDate = PDate;
    }

}
