package CrackingTheCodeInterview;

import java.util.Scanner;

/**
 * Arrays: Left Rotation
 *
 * A left rotation operation on an array of size n shifts
 * each of the array's elements 1 unit to the left.
 *
 * For example, if 2 left rotations are performed on array [1,2,3,4,5],
 * then the array would become [3,4,5,1,2].
 */
public class Arrays_LeftRotation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }

        int[] res = new int[n];

        for(int i=k;i<n;i++)
            res[i-k] = a[i];

        for(int i=0;i<k;i++)
            res[n-k+i] = a[i];

        for(int e : res)
            System.out.print(e+" ");
        System.out.println();
    }
}
