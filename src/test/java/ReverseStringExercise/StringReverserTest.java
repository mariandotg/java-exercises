package ReverseStringExercise;

import ReverseStringExercise.Models.StringReverser;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public abstract class StringReverserTest {
    protected StringReverser stringReverser;

    protected abstract StringReverser createStringReverser();

    @Test
    public void testReverseEmptyString() {
        assertEquals("", stringReverser.reverseString(""));
    }

    @Test
    public void testReverseSingleCharacter() {
        assertEquals("a", stringReverser.reverseString("a"));
    }

    @Test
    public void testReverseString() {
        assertEquals("!dlroW ,olleH", stringReverser.reverseString("Hello, World!"));
    }

    @Before
    public void setUp() {
        stringReverser = createStringReverser();
    }
}
