package Model;

public class OrderMultiProduct {

    private int OrderNo;
    private String ProductID;
    private String PName;

    public OrderMultiProduct(int OrderNo, String ProductID, String PName, float Price, int Quantity, float TotalPrice) {
        this.OrderNo = OrderNo;
        this.ProductID = ProductID;
        this.PName = PName;
        this.Price = Price;
        this.Quantity = Quantity;
        this.TotalPrice = TotalPrice;
    }
    private float Price;
    private int Quantity;
    private float TotalPrice;

    public int getOrderNo() {
        return OrderNo;
    }

    public void setOrderNo(int OrderNo) {
        this.OrderNo = OrderNo;
    }

    public String getProductID() {
        return ProductID;
    }

    public void setProductID(String ProductID) {
        this.ProductID = ProductID;
    }

    public String getPName() {
        return PName;
    }

    public void setPName(String PName) {
        this.PName = PName;
    }

    public float getPrice() {
        return Price;
    }

    public void setPrice(float Price) {
        this.Price = Price;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public float getTotalPrice() {
        return TotalPrice;
    }

    public void setTotalPrice(float TotalPrice) {
        this.TotalPrice = TotalPrice;
    }
}
