package SpiralTraversalArray;

/**
 * Created by zevik on 9/16/22.
 */
public class SpiralTraversalArrayRecursiveSolution {


    // function for print spiral order of the input matrix
    private static void printInSpiralOrder(int arr[][], int x, int y, int M, int N)
    {


        // special case: If x or y are outside the boundaries of the matrix
        if (x >= M || y >= N) {
            return;
        }

        // print first row (most upper)
        for (int i = x; i < N; i++) {
            System.out.print(arr[x][i] + ",");
        }

        // print last column (right most)
        for (int i = x + 1; i < M; i++) {
            System.out.print(arr[i][N - 1] + ",");
        }

        // if last and first row are not the same, print last (most bellow) row,
        if ((M - 1) != x) {
            for (int i = N - 2; i >= y; i--) { // decreasing loop for print clock-wise
                System.out.print(arr[M - 1][i] + ",");
            }
        }

        // if last and first column are not the same, print first (left most) column,
        if ((N - 1) != y) {
            for (int i = M - 2; i > x; i--) { // decreasing loop for print clock-wise
                System.out.print(arr[i][y] + ",");
            }
        }

        // Call recursively (with next position and decreased rows and columns
        printInSpiralOrder(arr, x + 1, y + 1, M - 1, N - 1);
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
        printInSpiralOrder(sampleArray, 0, 0, M, N);
    }
}
