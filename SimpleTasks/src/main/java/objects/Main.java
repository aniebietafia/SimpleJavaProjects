package objects;

public class Main {
    public static void main(String[] args) {
        HomeAreaCalculator calculateAreaOfRooms = new HomeAreaCalculator();
        double totalArea = calculateAreaOfRooms.homeAreaCalculator();
        System.out.println(totalArea);
    }
}
