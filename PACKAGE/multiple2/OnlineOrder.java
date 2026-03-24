package multiple2;

public class OnlineOrder implements PaymentGateway, OrderDetails {
    private int orderID;
    private String customerName;
    private double amount;

    public OnlineOrder(int orderID, String customerName, double amount) {
        this.orderID = orderID;
        this.customerName = customerName;
        this.amount = amount;
    }

    public void processPayment(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid Payment Amount");
        } else if (amount >= 5000) {
            double discount = amount * 0.05;
            double finalAmount = amount - discount;
            System.out.println("5% Discount Applied");
            System.out.println("Final Payment: " + finalAmount);
        } else {
            System.out.println("Payment Successful: " + amount);
        }
    }

    public void showOrderDetails() {
        System.out.println("Order ID: " + orderID);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Order Amount: " + amount);
    }

    public void confirmOrder() {
        showOrderDetails();
        processPayment(amount);
    }
}