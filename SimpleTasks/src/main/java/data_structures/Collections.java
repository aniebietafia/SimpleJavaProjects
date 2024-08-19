package data_structures;

import java.util.*;

public class Collections {

    public void setCollection(){
        Set<String> fruits = new HashSet<>();

        fruits.add("Banana");
        fruits.add("Pineapple");
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Garden Egg");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println("Fruits collection: " + fruits);
    }

    public void listCollection() {
        List<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Pineapple");
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Garden Egg");

        System.out.println("List fruits collection: " + fruits);
        System.out.println("Size of fruits: " + fruits.size());
    }

    public void queueCollection() {
        Queue<String> fruits = new LinkedList<>();

        fruits.add("Cherry");
        fruits.add("Strawberry");
        fruits.add("Lemon");
        fruits.add("Mango");
        fruits.add("Topaz");

        System.out.println("Peek: " + fruits.peek());
        System.out.println("Queue Collections: " + fruits);
    }

    public void mapCollection() {
        Map<Object, Object> countryCapital = new HashMap<>();

        countryCapital.put("Nigeria", "Abuja (FCT)");
        countryCapital.put("England", "London");
        countryCapital.put("Canada", "Ontario");
        countryCapital.put("France", "Paris");

        System.out.println("Contains Egypt: " + countryCapital.containsKey("Egypt"));
        System.out.println("Countries and capitals: " + countryCapital);
    }
}
