

package test;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static LiveCodeChallenge.Solution.recursiveApproach;
import static org.junit.Assert.assertEquals;

/**
 * Created by zevik on 9/16/22.
 */
public class LiveCodeChallengeTest {


    //  create assert function in order to adhere to DRY
    private void assertTestCaseIsPassed(int[][] array, String expectedPrint) {

        int M = array.length;
        int N = M>0 ? array[0].length : 0;
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        recursiveApproach(array,M,N,false);

        assertEquals(expectedPrint,
                outContent.toString());
    }

    @Test
    public void testSpiralPrintCase1() {


        int sampleArray[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 },
                { 10, 11, 12 }
        };

        assertTestCaseIsPassed(sampleArray, "10,11,12,9,6,3,2,5,8,7,4,1,");

    }


    @Test
    public void testSpiralPrintCase2() {


        int sampleArray[][] = {
                { 1, 2, 3, 4, 5 },
                { 6, 7, 8, 9, 10 },
                { 11, 12, 13, 14, 15 },
                { 16, 17, 18, 19, 20 }
        };

        assertTestCaseIsPassed(sampleArray, "16,17,18,19,20,15,10,5,4,9,14,13,12,11,6,7,8,3,2,1,");

    }



}
