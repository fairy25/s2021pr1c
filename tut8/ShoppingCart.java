package tut8;

import java.util.ArrayList;

public class ShoppingCart {
    ArrayList<CartItem> items;

    public ShoppingCart() {
        items = new ArrayList<>();
    }

    public void addToCart(Product p, int q) {
        items.add(new CartItem(p, q));
    }

    public double getWeight() {
        double totalWeight = 0;
        for (CartItem c : items) {
            totalWeight += c.product.weight * c.quantity;
        }
        return totalWeight;
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        for (CartItem c : items) {
            totalPrice += c.product.price * c.quantity;
        }
        return totalPrice;
    }
}
