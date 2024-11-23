package EcommerceSim;

public class Product {
    private String name;
    private double price;
    private int itemID;
    private int stock; 

    public Product(String name, double price,int itemID, int stock){
        this.name=name;
        this.price=price;
        this.itemID=itemID;
        this.stock=stock;

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public void showProductInfo(){
        System.out.println("ID:" +itemID + "Name:" + name + "Price:" + price + "Stock:"+ stock);
    }

    public void reduceStock(){
        this.stock -=1; 
    }
}
