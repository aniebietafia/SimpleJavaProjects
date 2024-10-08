package string_manipulation;

import java.util.ArrayList;

public class CapitalizeLetter {
    private final String str;

    public CapitalizeLetter(String str) {
        this.str = str;
    }

    public String capitalizeLetter() {
        ArrayList<String> stringList = new ArrayList<>();

        if (this.str == null || this.str.isEmpty()) return this.str;

        String[] strings = this.str.split(" ");
        for (String string: strings) {
            String capitalizedWord = string.substring(0, 1).toUpperCase() + string.substring(1);
            stringList.add(capitalizedWord);
        }

        return String.join(" ", stringList);
    }
}
