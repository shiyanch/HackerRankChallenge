package Tutorials30DaysOfCode;

import java.util.Scanner;

/**
 * Day 25: Running Time and Complexity
 *
 * Objective
 * Today we're learning about running time!
 * Check out the Tutorial tab for learning materials and an instructional video!
 *
 * Task
 * A prime is a natural number greater than 1
 * that has no positive divisors other than 1 and itself.
 * Given a number, n, determine and print whether it's Prime or Not prime.
 *
 * Note: If possible, try to come up with a O(N^(1/2)) primality algorithm,
 * or see what sort of optimizations you come up with for an O(N) algorithm.
 * Be sure to check out the Editorial after submitting your code!
 *
 * Input Format
 * The first line contains an integer, T, the number of test cases.
 * Each of the T subsequent lines contains an integer, n, to be tested for primality.
 *
 * Constraints
 *
 * Output Format
 * For each test case, print whether  is  or  on a new line.
 *
 * Sample Input
 * 3
 * 12
 * 5
 * 7
 * Sample Output
 * Not prime
 * Prime
 * Prime
 */
public class Day25RunningTimeAndComplexity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        while(T-- > 0) {
            int n = scanner.nextInt();
            if(isPrime(n))
                System.out.println("Prime");
            else
                System.out.println("Not prime");
        }
    }

    public static boolean isPrime(int n) {
        if(n == 1)
            return false;

        for(int i=2;i*i<n;i++) {
            if(n%i == 0)
                return false;
        }

        return true;
    }
}
