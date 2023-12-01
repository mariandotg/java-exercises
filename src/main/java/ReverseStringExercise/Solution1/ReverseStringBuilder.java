package ReverseStringExercise.Solution1;

import ReverseStringExercise.Models.StringReverser;

public class ReverseStringBuilder implements StringReverser {
    @Override
    public String reverseString(String string) {
        if (string.isEmpty()) {
            return string;
        }

        char[] charArray = string.toCharArray();
        StringBuilder reversedBuilder = new StringBuilder();

        for (int i = charArray.length - 1; i >= 0; i--) {
            reversedBuilder.append(charArray[i]);
        }

        return reversedBuilder.toString();
    }
}
