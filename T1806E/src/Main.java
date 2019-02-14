public class Main {
    public static void main(String[] args) {
        Product product1 = new Product(1, "Iphone7", 2000, 5);
        Product product2 = new Product(2, "Iphone6", 1500, 3);
        Product product3 = new Product(3, "Iphone5", 1000, 0);

        Order order1 = new Order(1);
        order1.addProduct(product1);
        order1.addProduct(product2, 20);
        order1.addProduct(product3);
        System.out.println("Product list in the order: ");
        for (int i = 0; i < order1.listProduct.size(); i++) {
            System.out.println(order1.listProduct.get(i).name);
        }

        System.out.println("The total: " + order1.total);

    }
}