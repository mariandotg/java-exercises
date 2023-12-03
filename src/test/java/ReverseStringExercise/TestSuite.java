package ReverseStringExercise;

import ReverseStringExercise.Solution1.ReverseStringBuilderTest;
import ReverseStringExercise.Solution2.ReverseStringLoopTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        ReverseStringBuilderTest.class,
        ReverseStringLoopTest.class,
})
public class TestSuite {}
