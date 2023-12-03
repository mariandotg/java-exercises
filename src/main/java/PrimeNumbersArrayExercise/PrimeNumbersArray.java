package PrimeNumbersArrayExercise;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumbersArray {
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
    public static int[] filterPrimeNumbers(int[] numbersArray) {
        List<Integer> primeList = new ArrayList<>();

        for(int number : numbersArray) {
            if (isPrime(number)) {
                primeList.add(number);
            }
        }

        return primeList.stream().mapToInt(Integer::intValue).toArray();
    }
}
