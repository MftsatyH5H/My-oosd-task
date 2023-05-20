import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<MenuItem> menu = new ArrayList<>();
        menu.add(new MenuItem("cinnamon roll", "food", 1.50));
        menu.add(new MenuItem("iced coffee", "drink", 2.00));
        menu.add(new MenuItem("tuna sandwich", "food", 3.25));
        menu.add(new MenuItem("ham and cheese sandwich", "food", 3.50));
        menu.add(new MenuItem("orange juice", "drink", 2.50));
        menu.add(new MenuItem("lemonade", "drink", 2.00));
        menu.add(new MenuItem("cranberry juice", "drink", 2.75));

        
        CoffeeShop tcs = new CoffeeShop("Tesha's Coffee Shop", menu);

        System.out.println(tcs.addOrder("hot cocoa")); 
        System.out.println(tcs.addOrder("iced tea")); 
        System.out.println(tcs.addOrder("cinnamon roll")); 
        System.out.println(tcs.addOrder("iced coffee")); 

        
        System.out.println(tcs.listOrders()); 

        
        System.out.println(tcs.dueAmount());

        
        System.out.println(tcs.fulfillOrder()); 
        System.out.println(tcs.fulfillOrder()); 

       
        System.out.println(tcs.listOrders()); 

        
        System.out.println(tcs.fulfillOrder()); 

        
        System.out.println(tcs.drinksOnly()); 

        
        System.out.println(tcs.foodOnly()); 

        
        System.out.println(tcs.cheapestItem()); 
    }
}