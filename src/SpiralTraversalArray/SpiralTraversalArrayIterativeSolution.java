package SpiralTraversalArray;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by zevik on 9/16/22.
 */
public class SpiralTraversalArrayIterativeSolution {

    // function for give the spiral order of input array
    public static String printInSpiralOrder(int[][] array) {

        List<Integer> answer = new ArrayList<Integer>();

        // special case
        if (array==null || array.length == 0)
            return "";

        // find number of rows & columns
        int M = array.length, N = array[0].length;
        boolean[][] visited = new boolean[M][N];

        // define direction for traversing based on clock-wise rotation
        int[] directionInRows = { 0, 1, 0, -1 };
        int[] directionInColumns = { 1, 0, -1, 0 };
        // define start point
        int x = 0, y = 0, directionIndex = 0;

        for (int i = 0; i < M * N; i++) {
            answer.add(array[x][y]);
            visited[x][y] = true;

            int currentRow = x + directionInRows[directionIndex];
            int currentColumn = y + directionInColumns[directionIndex];

            if (0 <= currentRow && currentRow < M && 0 <= currentColumn && currentColumn < N
                    && !visited[currentRow][currentColumn]) {
                x = currentRow;
                y = currentColumn;
            } else {
                // change the direction
                directionIndex = (directionIndex + 1) % 4;
                x += directionInRows[directionIndex];
                y += directionInColumns[directionIndex];
            }
        }
        return answer.stream().map(Object::toString).collect(Collectors.joining(","));
    }

    public static void main(String[] args) {

        int sampleArray[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };

        System.out.println(" \n The spiral presentation of the input array is as follows : \n" +
                printInSpiralOrder(sampleArray));

    }
}
