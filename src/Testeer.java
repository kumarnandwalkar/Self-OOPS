class Order {
    private final String status;
    private int orderId;
    private String orderedFoods;
    private double totalPrice;

    // Parameterized constructor
    public Order

    (int orderId, String orderedFoods) {
        this.orderId = orderId;
        this.orderedFoods = orderedFoods;
        this.status = "Ordered";
    }

    // Method to calculate total price with a 5% service charge
    public double calculateTotalPrice(int unitPrice) {
        double serviceCharge = 0.05; // 5%
        this.totalPrice = unitPrice * (1 + serviceCharge);
        return this.totalPrice


    }

    // Getter methods (optional)
    public int getOrderId() {
        return orderId;
    }

    public String getOrderedFoods() {
        return orderedFoods;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public String getStatus() {
        return status;
    }
}

public class Testeer {
    static {
        System.out.println("Status: Ordered");
    }

    public static void main(String[] args) {
        // xzobject of the Order class with orderId=101 and orderedFoods="Burger"
        Order order = new Order(101, "Burger");

        // Calculate and display total price
        double calculatedTotalPrice = order.calculateTotalPrice(30);

        // Display order details
        System.out.println("Order Details:");
        System.out.println("Order Id: " + order.getOrderId());
        System.out.println("Ordered Food: " + order.getOrderedFoods());
        System.out.println("Order status: " + order.getStatus());
        System.out.println("Total Price: " + calculatedTotalPrice);
    }
}