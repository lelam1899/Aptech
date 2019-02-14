public class Product {
    public int id;
    public String name;
    public double price;
    public int quantity;

    public Product(int id, String name, int price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public int showQuantity(){
        return this.quantity;
    }
}
