package billing;

public class Product {

    private static int lastGeneratedID = 100;

    private final int id;
    private final String name;
    private final float price;
    private final int quantity;

    public Product(String name, float price, int quantity) {
        this.id = lastGeneratedID;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        lastGeneratedID++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

}