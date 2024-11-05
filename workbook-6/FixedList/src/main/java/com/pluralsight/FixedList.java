package com.pluralsight;

import java.util.ArrayList;
import java.util.List;


public class FixedList<T> {
    private List<T> items;
    private int maxSize;

    public FixedList(int maxSize) {
        this.maxSize = maxSize;
        this.items = new ArrayList<>();
    }
    public void add(T item) {

        // if indexOf List is less than maxSize
        // add to list
        // else print "Unable to add: List full
        if (items.size() < maxSize) {
            items.add(item);
            System.out.println("Item/s added successfully");
        } else
        System.out.println("Error adding item. List full.");

    }
    //public List<T> getItems() {

    }
//}
