package Model;

public class Product 
{
    private String productID; 
    private String Name;
    private float price;
    private String MDate;
    private String EDate;
    private int Quantity;

    public Product(String productID, String Name, float price, int Quantity,String MDate, String EDate) {
        this.productID = productID;
        this.Name = Name;
        this.price = price;
        this.MDate = MDate;
        this.EDate = EDate;
        this.Quantity = Quantity;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getMDate() {
        return MDate;
    }

    public void setMDate(String MDate) {
        this.MDate = MDate;
    }

    public String getEDate() {
        return EDate;
    }

    public void setEDate(String EDate) {
        this.EDate = EDate;
    }

}
