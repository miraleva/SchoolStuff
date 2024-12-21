package EcommerceSim;

public class Main {
    public static void main(String[] args) {

        Product product1 = new Product("Book", 1000, 1, 3);
        Product product2 = new Product("Pen", 50, 2, 54);
        Product product3 = new Product("Notebook", 200, 3, 33);
        Product product4 = new Product("Pencil", 60, 3, 12);
        Product product5 = new Product("Stanley", 6000, 4, 2);

        ShoppingBasket myBasket = new ShoppingBasket();

        myBasket.addProduct(product5);
        myBasket.addProduct(product5);
        myBasket.addProduct(product5);
        myBasket.addProduct(product4);
        myBasket.addProduct(product3);

        System.out.println("Total Basket Price " + myBasket.getTotal());
        myBasket.showBasket();

        System.out.println("Market stock for " + product5.getName() + " is " + product5.getStock());

        myBasket.removeProduct(product5);
        myBasket.removeProduct(product5);
        myBasket.removeProduct(product5);
        myBasket.removeProduct(product5);

       

    }
}


