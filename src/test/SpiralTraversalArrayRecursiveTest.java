

package test;

import SpiralTraversalArray.SpiralTraversalArrayIterativeSolution;
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


        assertEquals("1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10",
                outContent.toString());

    }


    @Test
    public void testSpiralPrintCase2() {


        int sampleArray[][] = {
                { 1, 2, 3,  },
                { 4, 22, 6,  },
                { 7, 222, 9,  },
                { 10, 2222, 12 }
        };

        int M = sampleArray.length, N = sampleArray[0].length;
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        printInSpiralOrder(sampleArray,0,0,M,N);

        assertEquals("1,2,3,6,9,12,2222,10,7,4,22,222",
                outContent.toString());

    }

    @Test
    public void testSpiralPrintCase3() {

        int rows=6,columns=6;
        int sampleArray[][] = new int[rows][rows];

        for (int i=0;i<rows;i++){
            for (int j=0;j<columns;j++) {
                sampleArray[i][j] = i+j+1;
            }
        }

        int M = sampleArray.length, N = sampleArray[0].length;
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        printInSpiralOrder(sampleArray,0,0,M,N);

        assertEquals("1,2,3,4,5,6,7,8,9,10,11,10,9,8,7,6,5,4,3,2,3,4,5,6,7,8,9,8,7,6,5,4,5,6,7,6",
                outContent.toString());

    }


    // Negative sample
    @Test
    public void testSpiralPrintCase4() {

        int rows=6,columns=6;
        int sampleArray[][] = new int[rows][columns];

        for (int i=0;i<rows;i++){
            for (int j=0;j<columns;j++) {
                sampleArray[i][j] = i+j+1;
            }
        }

        int M = sampleArray.length, N = sampleArray[0].length;
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        printInSpiralOrder(sampleArray,0,0,M,N);

        assertEquals(normalizeStringOfArray(sampleArray),
                outContent.toString());

    }

    @Test
    public void testSpiralPrintCase5() {


        int rows=4,columns=6;
        int sampleArray[][] = new int[rows][columns];

        for (int i=0;i<rows;i++){
            for (int j=0;j<columns;j++) {
                sampleArray[i][j] = i+j+1;
            }
        }

        int M = sampleArray.length, N = sampleArray[0].length;
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        printInSpiralOrder(sampleArray,0,0,M,N);

        assertEquals("1,2,3,4,5,6,7,8,9,8,7,6,5,4,3,2,3,4,5,6,7,6,5,4",
                outContent.toString());

    }

    // Boundary test
    @Test
    public void testSpiralPrintCase6() {


        int sampleArray[][] = new int[][]{};


        int M = 0, N = 0;
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        printInSpiralOrder(sampleArray,0,0,M,N);

        assertEquals("",
                outContent.toString());

    }



    @Test
    public void testSpiralPrintCase8() {

        int rows=8,columns=12;
        int desiredElementsValue = 3;

        int sampleArray[][] = new int[rows][columns];

        for (int i=0;i<rows;i++){
            for (int j=0;j<columns;j++) {
                sampleArray[i][j] = desiredElementsValue;
            }
        }

        int M = sampleArray.length, N = sampleArray[0].length;
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        printInSpiralOrder(sampleArray,0,0,M,N);

        assertEquals(createStringAsNTimesOfNumber(rows*columns, desiredElementsValue),
                outContent.toString());

    }



}
