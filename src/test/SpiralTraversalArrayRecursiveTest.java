

package test;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static SpiralTraversalArray.SpiralTraversalArrayRecursiveSolution.printInSpiralOrder;
import static org.junit.Assert.assertEquals;

/**
 * Created by zevik on 9/16/22.
 */
public class SpiralTraversalArrayRecursiveTest {


    private String normalizeStringOfArray(int[][] array) {
        return Arrays.deepToString(array).replace("[[","").replace("]]","").replace("[","").replace("]","").replace(", ",",");
    }

    private String createStringAsNTimesOfNumber(int numTimes, int number) {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i < numTimes; i++) {
            result.append(number).append(",");
        }
        result.append(number);
        return result.toString();
    }

    @Test
    public void testSpiralPrintCase1() {


        int sampleArray[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };

        int M = sampleArray.length, N = sampleArray[0].length;
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        printInSpiralOrder(sampleArray,0,0,M,N);


        assertEquals("1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10,",
                outContent.toString());

    }



}
