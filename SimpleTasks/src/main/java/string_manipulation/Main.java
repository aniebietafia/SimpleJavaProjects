package string_manipulation;

public class Main {
    public static void main(String[] args) {
        String input = """
                abuja, nigeria
                paris, france
                ontario, canada
                new delhi, india
                sao tome, sao tome & principe
                """;
        StringManipulation manipulation = new StringManipulation(input);
        System.out.println(manipulation.stringManipulation());
    }
}
