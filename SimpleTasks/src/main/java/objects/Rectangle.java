package objects;

public class Rectangle {
    protected int length;
    protected int width;
    protected int sides = 4;

    public Rectangle() {
        setLength(0);
        setWidth(0);
    }

    public Rectangle(int length, int width) {
        getLength(length);
        getWidth(width);
    }

    public int getLength(int length) {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth(int width) {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getSides() {
        return sides;
    }

    public void setSides(int sides) {
        this.sides = sides;
    }

    public double calculateArea() {
        return length * width;
    }

    public void print() {
        System.out.println("In the parent class: Rectangle");
    }
}
