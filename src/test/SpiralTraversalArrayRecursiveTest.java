

package test;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


import static SpiralTraversalArray.SpiralTraversalArrayRecursiveSolution.printInSpiralOrderRecursiveApproach;
import static org.junit.Assert.assertEquals;
import static test.TestUtilities.*;

/**
 * Created by zevik on 9/16/22.
 */
public class SpiralTraversalArrayRecursiveTest {


    //  create assert function in order to adhere to DRY
    private void assertTestCaseIsPassed(int[][] array, String expectedPrint) {

        int M = array.length;
        int N = M>0 ? array[0].length : 0;
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        printInSpiralOrderRecursiveApproach(array,0,0,M,N);

        assertEquals(expectedPrint,
                outContent.toString());
    }

        @Test
    public void testSpiralPrintCase1() {


        int sampleArray[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };

        assertTestCaseIsPassed(sampleArray, "1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10");

    }


    @Test
    public void testSpiralPrintCase2() {


        int sampleArray[][] = {
                { 1, 2, 3,  },
                { 4, 22, 6,  },
                { 7, 222, 9,  },
                { 10, 2222, 12 }
        };

        assertTestCaseIsPassed(sampleArray, "1,2,3,6,9,12,2222,10,7,4,22,222");

    }

    @Test
    public void testSpiralPrintCase3() {

        int rows=6,columns=6;
        int sampleArray[][] = create2DArray(rows, columns);

        assertTestCaseIsPassed(sampleArray, "1,2,3,4,5,6,7,8,9,10,11,10,9,8,7,6,5,4,3,2,3,4,5,6,7,8,9,8,7,6,5,4,5,6,7,6");

    }


    // Negative sample
    @Test
    public void testSpiralPrintCase4() {

        int rows=6,columns=6;
        int sampleArray[][] = create2DArray(rows, columns);

        assertTestCaseIsPassed(sampleArray, normalizeStringOfArray(sampleArray));

    }

    @Test
    public void testSpiralPrintCase5() {


        int rows=4,columns=6;
        int sampleArray[][] = create2DArray(rows, columns);

        assertTestCaseIsPassed(sampleArray,"1,2,3,4,5,6,7,8,9,8,7,6,5,4,3,2,3,4,5,6,7,6,5,4");

    }

    // Boundary test
    @Test
    public void testSpiralPrintCase6() {


        int sampleArray[][] = new int[][]{};

        assertTestCaseIsPassed(sampleArray,"");

    }



    @Test
    public void testSpiralPrintCase8() {

        int rows=8,columns=12;
        int desiredElementsValue = 3;

        int sampleArray[][] = create2DArrayWithSameElements(rows, columns, 3);

        assertTestCaseIsPassed(sampleArray,createStringByNTimesOfNumber(rows*columns, desiredElementsValue));

    }



}
