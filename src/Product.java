class ProductTest {
    private String itemno;
    private String name;
    private double price;
    private short qty;

    private String getItemNo() {
        return itemno;
    }

    private String getName() {
        return name;
    }

    private double getPrice() {
        return price;
    }

    private short getQty() {
        return qty;
    }

    public ProductTest(String itemno) {
        this.itemno = itemno;
    }

    public ProductTest(String itemno, String name) {
        this.itemno = itemno;
        this.name = name;
    }

    public ProductTest(String itemno, String name, double price, short qty) {
        this.itemno = itemno;
        this.name = name;
        setPrice(price);
        setQuantity(qty);
    }

    public void setPrice(double price) {
        this.price=price;
    }
    public void setQuantity(short qty){
        this.qty=qty;
    }
}
class Customer
{
    private String custId;
    private String name;
    private String address;
    private String phno;

    public Customer(String custId,String name)
    {
        this.custId=custId;
        this.address=name;
    }
    public Customer(String custId,String name,String address,String phno)
    {
        this.custId=custId;
        this.address=name;
        setAddress(address);
        setPhno(phno);
    }

    public String getCustId(){return custId;}
    public String getName(){return name;}
    public String getAddress(){return address;}
    public String getPhno(){return phno;}

    public void setAddress(String address)
    {
        this.address=address;
    }
    public void setPhno(String phno)
    {
        this.phno=phno;
    }
}
public class Product {
    public static void main(String[]args){
        // Creating ProductTest objects
        ProductTest p1 = new ProductTest("P101"); // Using constructor with 1 parameter
        ProductTest p2 = new ProductTest("P102", "Laptop"); // Constructor with 2 parameters
        ProductTest p3 = new ProductTest("P103", "Smartphone", 29999.99, (short) 5); // Constructor with 4 parameters

        // Creating Customer objects
        Customer c1 = new Customer("C001", "John"); // Constructor with 2 parameters
        Customer c2 = new Customer("C002", "Alice", "123 Main Street", "9876543210"); // Constructor with 4 parameters

        // Just printing to check values (optional)
        System.out.println("Product p1 created with Item No: " + p1); // p1 doesn't have public getters to show itemno here
        System.out.println("Product p2 created with Item No and Name: " + p2);
        System.out.println("Product p3 created with full details: " + p3);

        System.out.println("Customer c1 created with CustId and Name: " + c1);
        System.out.println("Customer c2 created with full details: " + c2);
    }
}
