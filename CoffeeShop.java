import java.util.ArrayList;
import java.util.List;

class MenuItem {
    private String name;
    private String itemType;
    private double price;

    public MenuItem(String name, String itemType, double price) {
        this.name = name;
        this.itemType = itemType;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getItemType() {
        return itemType;
    }

    public double getPrice() {
        return price;
    }
}

public class CoffeeShop {
    private List<MenuItem> menu;
    private List<String> orders;

    public CoffeeShop(String name, List<MenuItem> menu) {
        this.menu = menu;
        this.orders = new ArrayList<>();
    }

    public String addOrder(String name) {
        for (MenuItem item : menu) {
            if (item.getName().equals(name)) {
                orders.add(name);
                return "Order added!";
            }
        }
        return "This item is currently unavailable!";
    }

    public String fulfillOrder() {
        if (!orders.isEmpty()) {
            String order = orders.remove(0);
            return "The " + order + " is ready!";
        } else {
            return "All orders have been fulfilled!";
        }
    }

    public List<String> listOrders() {
        return orders;
    }

    public double dueAmount() {
        double total = 0.0;
        for (String order : orders) {
            for (MenuItem item : menu) {
                if (item.getName().equals(order)) {
                    total += item.getPrice();
                    break;
                }
            }
        }
        return total;
    }

    public String cheapestItem() {
        MenuItem cheapest = menu.get(0);
        for (MenuItem item : menu) {
            if (item.getPrice() < cheapest.getPrice()) {
                cheapest = item;
            }
        }
        return cheapest.getName();
    }

    public List<String> drinksOnly() {
        List<String> drinks = new ArrayList<>();
        for (MenuItem item : menu) {
            if (item.getItemType().equals("drink")) {
                drinks.add(item.getName());
            }
        }
        return drinks;
    }

    public List<String> foodOnly() {
        List<String> food = new ArrayList<>();
        for (MenuItem item : menu) {
            if (item.getItemType().equals("food")) {
                food.add(item.getName());
            }
        }
        return food;
    }
}