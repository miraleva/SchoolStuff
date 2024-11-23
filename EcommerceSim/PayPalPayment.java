package EcommerceSim;

public class PayPalPayment extends Payment {
    private double total;

    public PayPalPayment(double total) {
        super(total);
    }

    @Override
    public void Pay() {
        System.out.println("Paying total of:" + total + "with paypal");
    }

}