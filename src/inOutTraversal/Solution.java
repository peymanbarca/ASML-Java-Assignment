package inOutTraversal;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zevik on 9/21/22.
 */
public class Solution {


    public static void recursiveApproach(int array[][],  int rows, int columns, boolean clockwise) {

        // special cases
        if (array==null || array.length == 0) {
            return;
        }
        // If x or y are outside the boundaries of the matrix
        if ( rows ==0 || columns==0)
            return;


        if (!clockwise) {


            // print last row
            for (int i = 0; i < columns; i++) {
                System.out.print(array[rows-1][i]+",");
            }
            // print last column
            for (int i = rows-2; i >= 0; i--) {
                System.out.print(array[i][columns-1]+",");
            }
        }
        else {

            // print last column
            for (int i = 0; i <= rows-1; i++) {
                System.out.print(array[i][columns-1]+",");
            }

            // print last row
            for (int i = columns-2; i >= 0; i--) {
                System.out.print(array[rows-1][i]+",");
            }
        }



        if (!clockwise)
            recursiveApproach(array,  rows-1, columns-1, true);
        else
            recursiveApproach(array,  rows-1, columns-1, false);

    }

    public static void main(String[] args)
    {
        int sampleArray[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };


        int M = sampleArray.length, N = sampleArray[0].length;
        System.out.println(" \n The spiral presentation of the input array is as follows : ");
        recursiveApproach(sampleArray, M, N,false);
    }
}
