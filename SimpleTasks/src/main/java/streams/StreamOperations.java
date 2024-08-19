package streams;

import java.util.List;

public class StreamOperations {
    List<String> veggies = List.of(
            "spinach",
            "cabbages",
            "peas",
            "green beans",
            "brussel sprouts",
            "carrots"
    );

    public void anyMatchDemo() {
        boolean anyMatches = veggies.stream().anyMatch(v -> v.contains(" "));
        System.out.println(anyMatches);
    }

    public void allMatchDemo() {
        boolean allMatches = veggies.stream().allMatch(v -> v.length() == 4);
        System.out.println(allMatches);
    }

    public void filterDemo() {
        veggies.stream()
                .filter(v -> v.startsWith("c"))
                .forEach(System.out::println);
    }

    public void mapDemo() {
       veggies.stream()
               .map(String::toUpperCase)
               .forEach(System.out::println);
    }

    public void reduceDemo() {
        String output = veggies
                .stream()
                .sorted()
                .reduce("", (a, b) -> a + " | " + b);

        System.out.println(output);
    }
}
