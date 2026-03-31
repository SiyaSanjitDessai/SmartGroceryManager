package app.model;

import java.io.Serializable;
import java.util.*;

public class GroceryList implements Serializable {
    private List<GroceryItem> items = Collections.synchronizedList(new ArrayList<>());

    public void addItem(GroceryItem item) {
        items.add(item);
    }

    public List<GroceryItem> getItems() {
        return items;
    }

    public double totalCost() {
        return items.stream().mapToDouble(GroceryItem::getPrice).sum();
    }
}