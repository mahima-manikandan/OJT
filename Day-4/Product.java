//Write a Java program to create a class called "Inventory" with a collection of products and methods to add and remove products, and to check for low inventory.
import java.util.ArrayList;

class Product {
    String name;
    int quantity;

    Product(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return name + " (Quantity: " + quantity + ")";
    }
}

class Inventory {
    ArrayList<Product> products = new ArrayList<>();

    void addProduct(Product product) {
        products.add(product);
        System.out.println("Added: " + product);
    }

    void removeProduct(String name) {
        products.removeIf(product -> product.name.equals(name));
        System.out.println("Removed product with name: " + name);
    }

    void checkLowInventory(int threshold) {
        System.out.println("Products with low inventory (less than " + threshold + "):");
        for (Product product : products) {
            if (product.quantity < threshold) {
                System.out.println(product);
            }
        }
    }

    void listProducts() {
        if (products.isEmpty()) {
            System.out.println("The inventory is empty.");
        } else {
            System.out.println("Products in the inventory:");
            for (Product product : products) {
                System.out.println(product);
            }
        }
    }

    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        inventory.addProduct(new Product("Laptop", 5));
        inventory.addProduct(new Product("Smartphone", 2));
        inventory.addProduct(new Product("Headphones", 10));

        inventory.listProducts();
        inventory.checkLowInventory(3);
        inventory.removeProduct("Smartphone");
        inventory.listProducts();
    }
}
