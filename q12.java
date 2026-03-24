import product12.Product;

public class q12 {
    public static void main(String[] args) {
        int size=3;
        Product p = new Product(size);
        p.acceptProducts();
        p.displayProducts();
        p.findCostlyProduct();
    }
}