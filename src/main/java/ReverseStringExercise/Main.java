package ReverseStringExercise;

import ReverseStringExercise.Solution1.ReverseStringBuilder;

public class Main {
    public static void main(String[] args) {
        ReverseStringBuilder stringReverser = new ReverseStringBuilder();
        String original = "Hello, World!";

        String reversed1 = stringReverser.reverseString(original);

        System.out.println("Original string: " + original);
        System.out.println("Reversed string (with StringBuilder): " + reversed1);
    }
}