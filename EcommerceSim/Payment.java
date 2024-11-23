package EcommerceSim;

public abstract class Payment {
    private double total;

    public Payment(double total) {
        this.total = total;
    }

    public abstract void Pay();

    public double getTotal() {
        return total;

    }
}
