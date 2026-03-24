package product12;

import java.util.Scanner;

public class Product {
    String productNames[];
    double prices[];
    int size;

    public Product(int size) {
        this.size = size;
        productNames = new String[size];
        prices = new double[size];
    }

    public void acceptProducts() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < size; i++) {
            System.out.print("Enter product name: ");
            productNames[i] = sc.nextLine();

            System.out.print("Enter price: ");
            prices[i] = sc.nextDouble();
            sc.nextLine();
        }
    }

    public void displayProducts() {
        System.out.println("\nProduct List:");
        for (int i = 0; i < size; i++) {
            System.out.println(productNames[i].toUpperCase() + " - " + prices[i]);
        }
    }

    public void findCostlyProduct() {
        double max = prices[0];
        int index = 0;

        for (int i = 1; i < size; i++) {
            if (prices[i] > max) {
                max = prices[i];
                index = i;
            }
        }

        System.out.println("\nMost Expensive Product:");
        System.out.println(productNames[index] + " - " + prices[index]);
    }
}