package PrimeNumbersArrayExercise;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        PrimeNumbersArray primeNumbersArray = new PrimeNumbersArray();
        int[] numbersArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[] resultsArray = primeNumbersArray.filterPrimeNumbers(numbersArray);

        System.out.println("Original numbers array: " + Arrays.toString(numbersArray));
        System.out.println("Result prime numbers array: " + Arrays.toString(resultsArray));
    }
}
