import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import java.util.Scanner;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(int[][] arr, int boxSize) {
    // Write your code here
    int column = 0;
    int column1 = boxSize - 1;
    int leftSum = 0;
    int rightSum = 0;

    for (int i = 0; i < boxSize; i++) {
        for (int j = 0; j < boxSize; j++) {
            //System.out.println (arr[i][j] + " " + i + " " + j + " " + column + " " + i + " " + column1);
            if (j == column) {
            //    System.out.println ("HI");
                rightSum = rightSum + arr[i][j];
            }
            if (j == column1) {
            //    System.out.println ("HELLO");
                leftSum = leftSum + arr[i][j];
                //column = column - 1;
            }
        }
        column++;
        column1 = column1 - 1;
        //System.out.println(leftSum + " " + rightSum);
    }
    //System.out.println (rightSum);
    //System.out.println (leftSum);
    int difference = 0;
    if (leftSum > rightSum) {
        difference = leftSum - rightSum;
    } else {
        difference = rightSum - leftSum;
    }
    return difference;
    }

}
