package app.model;

import java.io.Serializable;

public class GroceryItem implements Serializable {
    private String name;
    private double price;
    private boolean claimed;
    private String claimedBy;

    public GroceryItem(String name, double price) {
        this.name = name;
        this.price = price;
        this.claimed = false;
    }

    public void claim(String user) {
        if (!claimed) {
            claimed = true;
            claimedBy = user;
        }
    }

    public String toString() {
        return name + " ₹" + price + (claimed ? " (Taken by " + claimedBy + ")" : "");
    }
https://chatgpt.com/c/69cbc251-3e04-83e8-a1b6-4403c7536fa3
    public double getPrice() { return price; }
}