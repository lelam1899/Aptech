import ASM4.Order;
import ASM4.Product;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product(1, "sp1", 2000, 5);
        Product product2 = new Product(2, "sp2", 1500,2);
        Product product3 = new Product(3, "sp3", 1000, 0);

        Order order1 = new Order(1);
        order1.addProduct(product1);
        order1.addProduct(product2, 20);
        order1.addProduct(product3);
        System.out.println("Danh sach san pham: ");
        for (int i = 0; i < order1.listProduct.size(); i++) {
            System.out.println(order1.listProduct.get(i).name);
        }

        System.out.println("Tong tien: " + order1.total);

    }
}