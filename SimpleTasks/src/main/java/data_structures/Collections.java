package data_structures;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
}
