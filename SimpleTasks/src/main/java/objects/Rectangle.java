package objects;

public class Rectangle {
    private int length;
    private int width;

    public Rectangle() {
        setLength(0);
        setWidth(0);
    }

    public Rectangle(int length, int width) {
        getLength(length);
        getWidth(width);
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    private int getWidth(int width) {
        return this.length;
    }

    private int getLength(int length) {
        return this.width;
    }

    public double calculateArea() {
        return length * width;
    }
}
