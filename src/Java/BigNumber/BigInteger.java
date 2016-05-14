package Java.BigNumber;

import java.util.Scanner;

/**
 * Java BigInteger
 *
 * In this problem you have to add and multiply huge numbers!
 * These numbers are so big that you can't contain them in any ordinary data types like long integer.
 *
 * Use the power of Java's BigInteger class and solve this problem.
 * Input Format
 * There will be two lines containing two numbers, a and b.
 *
 * Constraints
 * a and b are non-negative integers and can have maximum 200 digits.
 *
 * Output Format
 * Output two lines. The first line should contain a+b, and the second line should contain a*b.
 * Don't print any leading zeros.
 *
 * Sample Input
 * 1234
 * 20
 *
 * Sample Output
 * 1254
 * 24680
 *
 */
public class BigInteger {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        java.math.BigInteger bi1 = new java.math.BigInteger(scan.next());
        java.math.BigInteger bi2 = new java.math.BigInteger(scan.next());

        System.out.println(bi1.add(bi2));
        System.out.println(bi1.multiply(bi2));
    }
}
