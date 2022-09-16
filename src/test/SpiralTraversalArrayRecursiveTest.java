package test;

import SpiralTraversalArray.SpiralTraversalArrayIterativeSolution;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static SpiralTraversalArray.SpiralTraversalArrayIterativeSolution.printInSpiralOrder;
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

        String result = printInSpiralOrder(sampleArray);

        assertEquals("1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10",
                result);

    }


    @Test
    public void testSpiralPrintCase2() {


        int sampleArray[][] = {
                { 1, 2, 3,  },
                { 4, 22, 6,  },
                { 7, 222, 9,  },
                { 10, 2222, 12 }
        };

        String result = printInSpiralOrder(sampleArray);

        assertEquals("1,2,3,6,9,12,2222,10,7,4,22,222",
                result);

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

        String result = printInSpiralOrder(sampleArray);

        assertEquals("1,2,3,4,5,6,7,8,9,10,11,10,9,8,7,6,5,4,3,2,3,4,5,6,7,8,9,8,7,6,5,4,5,6,7,6",
                result);

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

        String result = printInSpiralOrder(sampleArray);

        assertEquals(normalizeStringOfArray(sampleArray),
                result);

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

        String result = printInSpiralOrder(sampleArray);

        assertEquals("1,2,3,4,5,6,7,8,9,8,7,6,5,4,3,2,3,4,5,6,7,6,5,4",
                result);

    }


    // Boundary test
    @Test
    public void testSpiralPrintCase6() {


        int sampleArray[][] = new int[][]{};


        String result = printInSpiralOrder(sampleArray);

        assertEquals("",
                result);

    }

    // Exceptional test
    @Test
    public void testSpiralPrintCase7() {


        int sampleArray[][] = null;


        String result = printInSpiralOrder(sampleArray);

        assertEquals("",
                result);

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

        String result = printInSpiralOrder(sampleArray);

        assertEquals(createStringAsNTimesOfNumber(rows*columns, desiredElementsValue),
                result);

    }
}
