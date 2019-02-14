import java.util.ArrayList;

public class Order {
    public int idOrder;
    public double total;
    public ArrayList<Product> listProduct = new ArrayList<Product>();

    public Order(int idOrder) {
        this.idOrder = idOrder;
        this.total = 0;
    }
    public void addProduct(Product p) {
        if(p.quantity > 0) {
            listProduct.add(p);
            this.total += p.price;
        } else {
            System.out.println(p.name + " het hang");
        }

    }  public void addProduct(Product p, int discount) {
        if(p.showQuantity() > 0) {
            listProduct.add(p);
            this.total += p.price*discount/100;
        } else {
            System.out.println("Product is out.");
        }

    }
}
