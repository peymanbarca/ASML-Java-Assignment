package SpiralTraversalArray;

/**
 * Created by zevik on 9/16/22.
 */
public class SpiralTraversalArrayRecursiveSolution {


    // recursive function for print spiral order of the input array
    public static void printInSpiralOrderRecursiveApproach(int array[][], int x, int y, int M, int N)
    {


        // special cases
        if (array==null || array.length == 0) {
            return;
        }
        // If x or y are outside the boundaries of the matrix
        if ( x >= M || y >= N)
            return;

        // print first row (most upper)
        for (int i = x; i < N; i++) {
            if (i>0)
                System.out.print("," + array[x][i]);
            else
                System.out.print(array[x][i]);
        }

        // print last column (right most)
        for (int i = x + 1; i < M; i++) {
            System.out.print("," + array[i][N - 1]);
        }

        // if last and first row are not the same, print last (most bellow) row,
        if ((M - 1) != x) {
            for (int i = N - 2; i >= y; i--) { // decreasing loop for print clock-wise
                System.out.print("," + array[M - 1][i]);
            }
        }

        // if last and first column are not the same, print first (left most) column,
        if ((N - 1) != y) {
            for (int i = M - 2; i > x; i--) { // decreasing loop for print clock-wise
                System.out.print("," + array[i][y]);
            }
        }

        // Call recursively (with next position and decreased rows and columns
        printInSpiralOrderRecursiveApproach(array, x + 1, y + 1, M - 1, N - 1);
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
        printInSpiralOrderRecursiveApproach(sampleArray, 0, 0, M, N);
    }
}
