// StringManipulator.java - The class to be tested

public class StringManipulator {

    public String concatenateStrings(String str1, String str2) {
        return str1 + str2;
    }

    public int countWords(String input) {
        String[] words = input.split("\\s+");
        return words.length;
    }

    public String reverseString(String input) {
        return new StringBuilder(input).reverse().toString();
    }
}
