package inhritance;

public class Feed {
    public void feedAnimal(Animal animal) {
        if (animal instanceof Dog) {
            System.out.println("This is the dog food");
        } else if (animal instanceof Cat) {
            System.out.println("This is the cat food");
        }
    }
}
