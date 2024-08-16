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

        var i = fruits.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

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

    public void mapCollection() {
        Map countryCapital = new HashMap();

        countryCapital.put("Nigeria", "Abuja (FCT)");
        countryCapital.put("England", "London");
        countryCapital.put("Canada", "Ontario");
        countryCapital.put("France", "Paris");

        System.out.println("Contains Egypt: " + countryCapital.containsKey("Egypt"));
        System.out.println("Countries and capitals: " + countryCapital);
    }
}
