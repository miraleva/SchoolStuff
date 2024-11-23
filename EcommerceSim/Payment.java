package EcommerceSim;

public abstract class Payment {
    private double total;

    public Payment(double total){
        this.total=total;
    }
    
    public void Pay(String paymentWay){
        System.out.println("Paying total of:" + total + "with" + paymentWay);

    }
    
    public double getTotal(){
        return total;

}

