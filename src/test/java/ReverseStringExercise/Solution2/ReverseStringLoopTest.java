package ReverseStringExercise.Solution2;

import ReverseStringExercise.Models.StringReverser;

import ReverseStringExercise.StringReverserTest;

public class ReverseStringLoopTest extends StringReverserTest {
    @Override
    protected StringReverser createStringReverser() {
        return new ReverseStringLoop();
    }
}
