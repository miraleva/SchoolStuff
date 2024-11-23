# 🛍️ E-commerce Simulation Project

A robust e-commerce simulation system implementing core shopping functionalities and order management.

## 📋 Overview

This project simulates an e-commerce platform with essential features like product management, shopping cart functionality, payment processing, and shipment handling. Built with a focus on modularity and scalability.

## 🏗️ Architecture

### Core Classes

#### Product
The foundation of our e-commerce system, managing all product-related data.

```python
class Product:
    def __init__(self, name: str, price: float, stock: int, item_id: str):
        self.name = name
        self.price = price
        self.stock = stock
        self.item_id = item_id
```

**Key Features:**
- Product name and unique identifier management
- Real-time stock tracking
- Dynamic pricing system
- Inventory alerts for low stock

#### ShoppingBasket
Handles the user's shopping session and selected items.

```python
class ShoppingBasket:
    def __init__(self):
        self.items = {}  # Dictionary of {product_id: quantity}
        self.total = 0.0
```

**Key Features:**
- Add/remove items functionality
- Quantity management
- Real-time total calculation
- Session persistence

#### Payment
Manages all aspects of transaction processing.

```python
class Payment:
    def __init__(self, amount: float, method: str):
        self.amount = amount
        self.method = method
        self.status = "pending"
```

**Key Features:**
- Multiple payment method support
- Secure transaction processing
- Payment status tracking
- Refund handling

#### Shipment
Coordinates delivery logistics and tracking.

```python
class Shipment:
    def __init__(self, order_id: str, address: dict):
        self.order_id = order_id
        self.address = address
        self.status = "processing"
```

**Key Features:**
- Real-time delivery tracking
- Address validation
- Multiple carrier support
- Delivery status updates

## 🚀 Getting Started

1. Clone the repository:
```bash
git clone https://github.com/yourusername/ecommerce-sim.git
cd ecommerce-sim
```

2. Install dependencies:
```bash
pip install -r requirements.txt
```

3. Run the simulation:
```bash
python main.py
```

## 💡 Usage Example

```python
# Create a new product
laptop = Product("Gaming Laptop", 999.99, 10, "TECH001")

# Add to shopping basket
basket = ShoppingBasket()
basket.add_item(laptop, quantity=1)

# Process payment
payment = Payment(basket.total, "credit_card")
payment.process()

# Create shipment
shipment = Shipment("ORD001", {
    "street": "123 Main St",
    "city": "Tech City",
    "country": "Codeland"
})
```

## 🤝 Contributing

Contributions are welcome! Please feel free to submit a Pull Request.

## 📝 License

This project is licensed under the MIT License - see the LICENSE file for details.

## 📞 Contact

For any queries, please open an issue or contact @miraleva