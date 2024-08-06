package abstraction;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(4, 4);
        System.out.println(rectangle.calculateArea());
    }
}
