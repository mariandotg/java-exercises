package ReverseStringExercise.Solution1;

import ReverseStringExercise.Models.StringReverser;
import ReverseStringExercise.StringReverserTest;

public class ReverseStringBuilderTest extends StringReverserTest {
    @Override
    protected StringReverser createStringReverser() {
        return new ReverseStringBuilder();
    }
}
