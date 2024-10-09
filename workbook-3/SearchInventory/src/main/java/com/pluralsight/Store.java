package com.pluralsight;
//TODO: Add bonus
import java.util.ArrayList;
import java.util.Scanner;

public class Store {
    public static ArrayList<Product> getInventory() {
        ArrayList<Product> inventory = new ArrayList<>();

        inventory.add(new Product(1, "Soda", 1.29));
        inventory.add(new Product(2, "Water", 1.49));
        inventory.add(new Product(3, "Beer", 3.00));
        inventory.add(new Product(4, "Wine", 6.99));
        inventory.add(new Product(5, "Potato", 0.49));

        return inventory;
    }




public static void main(String[] args) {
        ArrayList<Product> inventory = getInventory();

        Scanner scanner = new Scanner(System.in);
        System.out.println("We carry the following inventory: ");
        for (int i = 0; i < inventory.size(); i++) {
            Product p = inventory.get(i);
            System.out.printf("id: %d %s - Price: $%.2f" + "%n",
                    p.getId(), p.getName(), p.getPrice());
        }
    }


}
