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


public class Solution {
    public static void main(String[] args) throws IOException {
        /* 
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
        */
        Scanner stdin = new Scanner(System.in);
        int boxSize = stdin.nextInt();
        int arr[][] = new int[boxSize][boxSize];
        for (int i = 0; i < boxSize; i++) {
            for (int j = 0; j < boxSize; j++) {
                arr[i][j] = stdin.nextInt();
            }
        }
        /* 
        for (int i = 0; i < boxSize; i++) {
            for (int j = 0; j < boxSize; j++) {
                System.out.print (arr[i][j]);
            }
            System.out.println();
        }
        */
        System.out.println (Result.diagonalDifference(arr, boxSize));      
    }
}
