package test;

import java.util.Arrays;

/**
 * Created by zevik on 9/17/22.
 */
public class TestUtilities {

    //  pretty sequential printing elements a 2D array
    static String normalizeStringOfArray(int[][] array) {
        return Arrays.deepToString(array).replace("[[","").replace("]]","").replace("[","").replace("]","").replace(", ",",");
    }

    // create a string by N times of a specifc number
    static String createStringByNTimesOfNumber(int numTimes, int number) {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i < numTimes; i++) {
            result.append(number).append(",");
        }
        result.append(number);
        return result.toString();
    }

    static int[][] create2DArray(int rows, int columns) {
        int sampleArray[][] = new int[rows][columns];

        for (int i=0;i<rows;i++){
            for (int j=0;j<columns;j++) {
                sampleArray[i][j] = i+j+1;
            }
        }
        return sampleArray;
    }

    static int[][] create2DArrayWithSameElements(int rows, int columns, int targetValue) {
        int sampleArray[][] = new int[rows][columns];

        for (int i=0;i<rows;i++){
            for (int j=0;j<columns;j++) {
                sampleArray[i][j] = targetValue;
            }
        }
        return sampleArray;
    }
}
