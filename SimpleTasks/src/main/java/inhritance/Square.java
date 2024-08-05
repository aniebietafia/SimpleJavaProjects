package inhritance;

import objects.Rectangle;

public class Square extends Rectangle {

    @Override
    public double calculateArea() {
        return sides * length;
    }

    public void print(String text){
        System.out.println(text + " is in the subclass");
    }
}
