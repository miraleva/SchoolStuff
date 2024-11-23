# 🛍️ E-commerce Simulation Project

A Java-based e-commerce simulation system demonstrating shopping basket functionality with product management.

## 📋 Project Overview

This project simulates a basic e-commerce system where users can:
- Create and manage products
- Add products to a shopping basket
- Remove products from the basket
- View basket contents and total price
- Track product stock levels

## 🚀 Running the Project

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- Command line interface or IDE

### Compilation and Execution
```bash
# Compile the project
javac .\EcommerceSim\Main.java

# Run the program
java EcommerceSim.Main
```

## 💡 Complete Usage Example

Here's the main program demonstrating the system's functionality:

```java
package EcommerceSim;

public class Main {
    public static void main(String[] args) {
        // Create products with (name, price, ID, stock)
        Product product1 = new Product("Book", 1000, 1, 3);
        Product product2 = new Product("Pen", 50, 2, 54);
        Product product3 = new Product("Notebook", 200, 3, 33);
        Product product4 = new Product("Pencil", 60, 3, 12);
        Product product5 = new Product("Stanley", 6000, 4, 2);

        // Create shopping basket
        ShoppingBasket myBasket = new ShoppingBasket();

        // Add products to basket
        myBasket.addProduct(product5);  // Add Stanley
        myBasket.addProduct(product5);  // Add another Stanley
        myBasket.addProduct(product5);  // Add third Stanley
        myBasket.addProduct(product4);  // Add Pencil
        myBasket.addProduct(product3);  // Add Notebook

        // Show basket total and contents
        System.out.println("Total Basket Price " + myBasket.getTotal());
        myBasket.showBasket();

        // Check product stock
        System.out.println("Market stock for " + product5.getName() + " is " + product5.getStock());

        // Remove products
        myBasket.removeProduct(product5);  // Remove Stanley
        myBasket.removeProduct(product5);  // Remove Stanley
        myBasket.removeProduct(product5);  // Remove Stanley
        myBasket.removeProduct(product5);  // Try to remove non-existent Stanley
    }
}
```

### Expected Output
The program will demonstrate:
1. Adding multiple items to basket
2. Displaying total basket price
3. Showing basket contents
4. Displaying remaining stock
5. Removing items from basket

## 🏗️ Project Structure

### Main.java
- Entry point of the application
- Demonstrates usage of all core features
- Contains example product creation and basket operations

### Product.java
- Manages product information (name, price, ID, stock)
- Handles stock tracking
- Provides product information display

### ShoppingBasket.java
- Manages shopping cart operations
- Handles product addition and removal
- Calculates total price
- Shows basket contents

### Payment.java
- Abstract class for payment handling
- Defines payment interface
- Manages payment totals

### Shipment.java
- Handles shipping information
- Manages delivery methods
- Displays shipping details

## ⚠️ Limitations

1. **Fixed Capacity:**
   - Shopping basket limited to 5 different items
   - No dynamic resizing

2. **Stock Management:**
   - Single unit increment/decrement only
   - No bulk updates

3. **Session Persistence:**
   - Data exists only during runtime
   - No permanent storage

## 🔧 Implementation Notes

- Product stock is automatically managed when adding/removing from basket
- Basket prevents adding items when full or out of stock
- Duplicate items increase quantity instead of adding new entries
- Remove operations automatically update product stock


## 🤝 Contributing

Feel free to fork the repository and submit pull requests.

## 📝 License

This project is available for educational purposes.

## 📞 Contact

Project Link: [https://github.com/miraleva/SchoolStuff/tree/master/EcommerceSim](https://github.com/miraleva/SchoolStuff/tree/master/EcommerceSim)