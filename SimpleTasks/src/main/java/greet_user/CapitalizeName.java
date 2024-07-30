package greet_user;

import java.util.ArrayList;

public class CapitalizeName {
    public String capitalizeName(String name) {
        String[] nameList = name.split(" ");
        ArrayList<String> transformedNameList = new ArrayList<>();
        for (String list: nameList) {
            String transformedName = list.substring(0, 1).trim().toUpperCase() + list.substring(1);
            transformedNameList.add(transformedName);
        }
        return String.join(" ", transformedNameList);
    }
}
