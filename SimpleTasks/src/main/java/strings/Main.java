package strings;

public class Main {
    public static void main(String[] args) {
        WordCount textProcessor = new WordCount();
        System.out.println("*******************************");
        System.out.println(textProcessor.letterCount("aniebiet"));
        System.out.println("*******************************");
        System.out.println(textProcessor.wordCount("Java is super cool"));
        System.out.println("*******************************");
        System.out.println(textProcessor.backwardString("aniebiet imo afia"));
        System.out.println("*******************************");
        System.out.println(textProcessor.jumbledString("AriseAndShineForYourLightHasCome"));
    }
}
