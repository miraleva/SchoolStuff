package EcommerceSim;

public class ShoppingBasket {
    private int count;
    private ShoppingBasketItem[] items;
    private int shoppingBasketItemPointer;

    public ShoppingBasket() {
        this.items = new ShoppingBasketItem[5];
        this.count = 0;
        this.shoppingBasketItemPointer = -1;

    }

    public void addProduct(Product product) {
        if (product.getStock() <= 0) {
            System.out.println("Insufficent Stock on " + product.getName());
            return;

        }
        if (this.shoppingBasketItemPointer > 4) {
            System.out.println("ShoppingBasket At maximum capacity");
            return;
        }

        System.out.println(product.getName() + "is added ");

        if (shoppingBasketItemPointer == -1) {
            shoppingBasketItemPointer += 1;
            ShoppingBasketItem item = new ShoppingBasketItem(product.getName(), product.getPrice(), product.getItemID(),
                    1);
            product.reduceStock();
            items[shoppingBasketItemPointer] = item;

            return;
        }
        for (int i = 0; i < shoppingBasketItemPointer + 1; i++) {
            if (items[i].name == product.getName()) {
                items[i].amount += 1;
                product.reduceStock();
                return;
            }

        }
        shoppingBasketItemPointer += 1;
        ShoppingBasketItem item = new ShoppingBasketItem(product.getName(), product.getPrice(), product.getItemID(), 1);
        product.reduceStock();
        items[shoppingBasketItemPointer] = item;

    }

    public void removeProduct(Product product) {

        for (int i = 0; i < shoppingBasketItemPointer + 1; i++) {
            if (items[i].name == product.getName()) {
                if (items[i].amount < 1) {
                    System.out.println("no such product");
                    return;
                }
                items[i].amount--;
                product.increaseStock();
                return;
            }

        }
    }

    public double getTotal() {
        double totalCost = 0;
        for (int i = 0; i < shoppingBasketItemPointer + 1; i++) {
            totalCost = totalCost + items[i].price * items[i].amount;
        }
        return totalCost;
    }

    public void showBasket() {
        System.out.println("Basket Items");
        for (int i = 0; i < shoppingBasketItemPointer + 1; i++) {

            if (items[i].amount > 0) {
                System.out.println(items[i].name + "  Count :" + items[i].amount);
            }
        }

    }
}

class ShoppingBasketItem {
    protected String name;
    protected double price;
    protected int itemID;
    protected int amount;

    public ShoppingBasketItem(String name, double price, int itemID, int amount) {
        this.name = name;
        this.price = price;
        this.itemID = itemID;
        this.amount = amount;

    }
}
