package strings;

import java.util.ArrayList;

public class WordCount {
//    private String word;
//    private int count;
//    public WordCount(String word, int count) {
//        this.word = word;
//    }
    public String letterCount(String word) {
        int count = 0;
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            String s = (i + 1) + " - " + word.charAt(i);
            System.out.println(s);
        }
        count = word.length();
        output.append("Total word count for ").append(word).append(" is: ").append(count);
        return output.toString();
    }

    public String wordCount(String word) {
        var words = word.split(" ");
        int numOfWords = words.length;

        for (int i = 0; i < words.length; ++i) {
            String s = (i + 1) + " - " + words[i];
            System.out.println(s);
        }
        return String.format("Your word contains %d words", numOfWords);
    }

    public String backwardString(String text) {
        StringBuilder output = new StringBuilder();
        for (int i = text.length() - 1; i >= 0; --i) {
            output.append(text.charAt(i));
        }
        return output.toString();
    }

    public String jumbledString(String text) {
        StringBuilder modifiedText = new StringBuilder(text);
        //ArrayList<String> words = new ArrayList<>();

        for (int i = 0; i < modifiedText.length(); ++i) {
            if (i != 0 && Character.isUpperCase(modifiedText.charAt(i))) {
                modifiedText.insert(i, " ");
                i++;
            }
        }
        return modifiedText.toString();
    }
}
