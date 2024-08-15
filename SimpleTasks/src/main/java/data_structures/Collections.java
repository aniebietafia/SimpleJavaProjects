package data_structures;

import java.util.HashSet;
import java.util.Set;

public class Collections {

    public void setCollection(){
        Set fruits = new HashSet();

        fruits.add("Banana");
        fruits.add("Pineapple");
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Garden Egg");
        fruits.add("apple");

        System.out.println("Fruits collection: " + fruits);
    }
}
