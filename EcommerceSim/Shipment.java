package EcommerceSim;

public class Shipment {
    private String adress;
    private String shippingWay;
    
    public Shipment(String adress, String shippingWay){
        this.adress=adress;
        this.shippingWay=shippingWay;
    }

    public void shippingDetail(){
        System.out.println("The adress is:"+ adress);
        System.out.println("Shipping Method is:"+ shippingWay);

    }

    public String getAddress(){
        return adress;
    }
    
    public String getShippingWay(){
        return shippingWay;
    }
    
}
