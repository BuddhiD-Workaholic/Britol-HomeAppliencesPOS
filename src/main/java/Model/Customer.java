
package Model;

public class Customer {
    private String NIC;
    private String Name;
    private int TelephoneNo;
    private String Addres;
    private String Email;

    public Customer(String NIC, String Name, int TelephoneNo, String Addres, String Email) {
        this.NIC = NIC;
        this.Name = Name;
        this.TelephoneNo = TelephoneNo;
        this.Addres = Addres;
        this.Email = Email;
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

    public int getTelephoneNo() {
        return TelephoneNo;
    }

    public void setTelephoneNo(int TelephoneNo) {
        this.TelephoneNo = TelephoneNo;
    }

    public String getAddres() {
        return Addres;
    }

    public void setAddres(String Addres) {
        this.Addres = Addres;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    
}
