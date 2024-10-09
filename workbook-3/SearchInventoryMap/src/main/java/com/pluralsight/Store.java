package com.pluralsight;
//TODO: Replace key with item name instead of number, Add Bonus Loop, Add trycatch
import java.util.HashMap;
import java.util.Scanner;

public class Store {

    // the key is the product id, the value is a product object
    static HashMap<Integer, Product> inventory =
            new HashMap<Integer, Product>();
    public static void main(String[] args) {


        // this method loads product objects into inventory
        loadInventory();

        Scanner scanner = new Scanner(System.in);
        System.out.print("What item # are you interested in? ");
        int id = scanner.nextInt();

        Product matchedProduct = inventory.get(id);

        if (matchedProduct == null) {
            System.out.println("We don't carry that product");
            return;
        }
        System.out.printf("We carry %s and the price is $%.2f",
                matchedProduct.getName(), matchedProduct.getPrice());
    }
    public static void loadInventory() {
        inventory.put(1, new Product(1, "Soda", 1.29));
        inventory.put(2, new Product(2, "Water", 1.49));
        inventory.put(3, new Product(3, "Beer", 3.00));
        inventory.put(4, new Product(4,"Wine", 6.99));
        inventory.put(5, new Product(5,"Potato", 0.49));
    }
}
