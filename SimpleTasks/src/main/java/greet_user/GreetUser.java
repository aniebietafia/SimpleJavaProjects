package greet_user;

import java.util.Scanner;

public class GreetUser {

    public String askUserName() {
        System.out.println("What is your firstname?");
        Scanner scanner = new Scanner(System.in);
        String firstname = scanner.next();

        System.out.println("What is your last name?");
        String lastname = scanner.next();
        scanner.close();
        return firstname + " " + lastname;
    }

    public void greetUser() {
        String name = askUserName();
        CapitalizeName capitalizeName = new CapitalizeName();
        String transformedName = capitalizeName.capitalizeName(name);
        System.out.println("Hi there " + transformedName);
    }
}
