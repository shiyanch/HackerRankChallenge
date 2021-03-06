package Algorithms.Warmup;

import java.util.Scanner;

/**
 * Plus Minus
 *
 * Given an array of integers, calculate which fraction of its elements are positive,
 * which fraction of its elements are negative, and which fraction of its elements are zeroes, respectively.
 * Print the decimal value of each fraction on a new line.
 *
 * Note: This challenge introduces precision problems.
 * The test cases are scaled to six decimal places,
 * though answers with absolute error of up to 10^-4 are acceptable.
 *
 * Input Format
 * The first line contains an integer, N, denoting the size of the array.
 * The second line contains N space-separated integers describing an array of numbers .
 *
 * Output Format
 * You must print the following 3 lines:
 *
 * A decimal representing of the fraction of positive numbers in the array.
 * A decimal representing of the fraction of negative numbers in the array.
 * A decimal representing of the fraction of zeroes in the array.
 *
 * Sample Input
 * 6
 * -4 3 -9 0 4 1
 *
 * Sample Output
 * 0.500000
 * 0.333333
 * 0.166667
 */
public class PlusMinus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];

        int positive = 0;
        int negitive = 0;
        int zero = 0;

        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
            if(arr[arr_i] > 0)
                positive++;
            else if(arr[arr_i] < 0)
                negitive++;
            else
                zero++;
        }

        System.out.printf("%.6f\n",positive/(arr.length*1.0));
        System.out.printf("%.6f\n",negitive/(arr.length*1.0));
        System.out.printf("%.6f\n",zero/(arr.length*1.0));
    }
}
