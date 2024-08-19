package streams;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

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

    public void collectDemo() {
        Set<String> stringSet = veggies.stream()
                .filter(v -> v.startsWith("c"))
                .collect(Collectors.toSet());

        stringSet.forEach(element -> {
            String output = element.substring(0, 1).toUpperCase() + element.substring(1);
            System.out.println(output);
        });
    }
}
