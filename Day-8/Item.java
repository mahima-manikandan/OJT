public class Item {
    private String itemId;
    private String name;
    private int quantity;
    private double price;
    public Item(String itemId, String name, int quantity, double price) {
        this.itemId = itemId;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }
    public void updateQuantity(int newQuantity) {
        this.quantity = newQuantity;
    }
    public void displayDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Name: " + name);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: $" + price);
    }
    public static void main(String[] args) {
        Item item1 = new Item("201", "AC", 50, 999.99);
        item1.displayDetails();

        item1.updateQuantity(55);
        System.out.println("Updated Quantity:");
        item1.displayDetails();
    }
}