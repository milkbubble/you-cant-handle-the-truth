import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HandleTruthTest {
    @Test
    public void makeshiftTest() {
        String stringTestOne = "Hi my name is Tim Medvedev and today I am testing a " +
                             " word count method to see how many words I can count";

        String[] testCase1 = stringTestOne.split(" ");
        String[] testCase2 = stringTestTwo.split(" ");
        String[] testCase3 = stringTestThree.split(" ");
        String[] testCase4 = stringTestFour.split(" ");
        String[] testCase5 = stringTestFive.split(" ");
        String[][] testCases = new String[][] { testCase1, testCase2, testCase3, testCase4, testCase5};

        for (int i = 0; i < testCases.length; i ++) {
            for (int j = 0; j < testCases[i].length;) {
                assertEquals(HandleTruth.wordCount(testCases[i]), expected.get(i));
            }
        }
    }
}