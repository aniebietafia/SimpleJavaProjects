package inhritance;

import objects.Rectangle;

public class Square extends Rectangle {

    @Override
    public double calculateArea() {
        return sides * length;
    }
}
