package ReverseStringExercise;

import ReverseStringExercise.Solution1.ReverseStringBuilder;
import ReverseStringExercise.Solution2.ReverseStringLoop;

public class Main {
    public static void main(String[] args) {
        ReverseStringBuilder stringReverser1 = new ReverseStringBuilder();
        ReverseStringLoop stringReverser2 = new ReverseStringLoop();
        String original = "Hello, World!";

        String reversed1 = stringReverser1.reverseString(original);
        String reversed2 = stringReverser2.reverseString(original);

        System.out.println("Original string: " + original);
        System.out.println("Reversed string (with StringBuilder): " + reversed1);
        System.out.println("Reversed string (with Loop): " + reversed2);
    }
}