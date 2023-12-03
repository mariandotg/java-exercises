package ReverseStringExercise.Solution2;

import ReverseStringExercise.Models.StringReverser;

public class ReverseStringLoop implements StringReverser {
    @Override
    public String reverseString(String string) {
        if (string.isEmpty()) {
            return string;
        }

        char[] charArray = string.toCharArray();
        int start = 0;
        int end = string.length() - 1;

        while (start < end) {
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;

            start++;
            end--;
        }

        return new String(charArray);
    }
}
