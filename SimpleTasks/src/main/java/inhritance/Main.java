package inhritance;

public class Main {
    public static void main(String[] args) {
//        Person person = new Person();
//        Employee employee = new Employee();
//        Square square = new Square();
//        square.print("Square");
        Dog captain = new Dog();
        Animal roost = new Cat();
        //captain.makeSound();

        // polymorphism
//        Animal billows = new Dog();
//        billows.makeSound();
        Feed animalFeed = new Feed();
        animalFeed.feedAnimal(captain);
        animalFeed.feedAnimal(roost);
    }
}
