import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.*;

public class HandleTruthTest {
    @Test
    public void makeshiftTest() {
        String stringTestOne = "Hi my name is Tim Medvedev and today I am testing a " +
                             " word count method to see how many words I can count";
        String stringTestTwo = "word count word count word count word count";
        String stringTestThree = "This is a word count test this time time time time time we will be test" +
                "ing how many times time comes up";
        String stringTestFour = "They don't know me son who's gonna carry the boats and the logs";
        String stringTestFive = "This is the final string test how many times does string string string" +
                " come up I guess we'll see";
        String[] testCase1 = stringTestOne.split(" ");
        String[] testCase2 = stringTestTwo.split(" ");
        String[] testCase3 = stringTestThree.split(" ");
        String[] testCase4 = stringTestFour.split(" ");
        String[] testCase5 = stringTestFive.split(" ");
        String[][] testCases = new String[][] { testCase1, testCase2, testCase3, testCase4, testCase5};
        TreeMap<Integer, Set<String>> testOneExpected = new TreeMap<>(Collections.reverseOrder());

        for (int i = 0; i < testCases.length; i ++) {
            for (int j = 0; j < testCases[i].length;) {
                assertEquals(HandleTruth.wordCount(testCases[i]), expected.get(i));
            }
        }
    }
}