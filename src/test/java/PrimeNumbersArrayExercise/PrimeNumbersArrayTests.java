package PrimeNumbersArrayExercise;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertArrayEquals;

public abstract class PrimeNumbersArrayTests {
    protected PrimeNumbersArray primeNumbersArray;

    protected abstract PrimeNumbersArray createPrimeNumbersArray();

    @Test
    public void testIsPrimeWithPrimeNumber() {
        int primeNumber = 7;

        assertTrue(primeNumbersArray.isPrime(primeNumber));
    }

    @Test
    public void testIsPrimeWithoutPrimeNumber() {
        int notAPrimeNumber = 4;

        assertFalse(primeNumbersArray.isPrime(notAPrimeNumber));
    }

    @Test
    public void testFilterPrimeNumbers() {
        int[] numbersArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        assertArrayEquals(new int[]{2, 3, 5, 7}, primeNumbersArray.filterPrimeNumbers(numbersArray));
    }

    @Test
    public void testFilterPrimeNumbersWithoutPrimes() {
        int[] numbersArray = {1, 4, 6, 8, 9, 10};

        assertArrayEquals(new int[]{}, primeNumbersArray.filterPrimeNumbers(numbersArray));
    }

    @Before
    public void setUp() {
        primeNumbersArray = createPrimeNumbersArray();
    }
}
