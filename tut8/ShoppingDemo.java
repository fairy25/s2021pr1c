package tut8;

public class ShoppingDemo {
    public static void main(String[] args) {
        Customer c = new Customer("Quan", "0123456789");
        Product egg = new Product("Egg", 3500, 0.1);
        Product bread = new Product("Bread", 5000, 0.08);
        Product milk = new Product("Milk", 33000, 1.1);
        ShoppingCart sc = new ShoppingCart();
        sc.addToCart(egg, 2);
        sc.addToCart(bread, 1);
        sc.addToCart(milk, 3);
        System.out.println("Total weight is: " + sc.getWeight());
        System.out.println("Total price is: " + sc.getTotalPrice());
    }
}
