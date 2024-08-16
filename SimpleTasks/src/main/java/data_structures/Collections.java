package data_structures;

import java.util.*;

public class Collections {

    public void setCollection(){
        Set fruits = new HashSet();

        fruits.add("Banana");
        fruits.add("Pineapple");
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Garden Egg");

        System.out.println("Fruits collection: " + fruits);
    }

    public void listCollection() {
        List fruits = new ArrayList();
        fruits.add("Banana");
        fruits.add("Pineapple");
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Garden Egg");

        System.out.println("List fruits collection: " + fruits);
        System.out.println("Size of fruits: " + fruits.size());
    }

    public void queueCollection() {
        Queue fruits = new LinkedList();

        fruits.add("Cherry");
        fruits.add("Strawberry");
        fruits.add("Lemon");
        fruits.add("Mango");
        fruits.add("Topaz");

        System.out.println("Peek: " + fruits.peek());
        System.out.println("Queue Collections: " + fruits);
    }
}
