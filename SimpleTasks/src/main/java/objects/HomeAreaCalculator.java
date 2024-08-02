package objects;

public class HomeAreaCalculator {
    public double homeAreaCalculator() {
        Rectangle room1 = new Rectangle();
        room1.setLength(50);
        room1.setWidth(25);
        double areaOfRoom1 = room1.calculateArea();

        Rectangle room2 = new Rectangle(30, 75);
        double areaOfRoom2 = room2.calculateArea();

        return areaOfRoom1 + areaOfRoom2;
    }
}
