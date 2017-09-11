package PROGRAMS;

import java.util.Scanner;

/**
 * Created by janish on 9/1/2017.
 */
public class Solution1 {
    public int krakenCount(int m, int n) {
        if (m == 0 || n == 0) return 0;
        if (m == 1 || n == 1) return 1;
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) dp[i][0] = 1;
        for (int j = 0; j < n; j++) dp[0][j] = 1;
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i-1][j] + dp[i][j-1] + dp[i-1][j-1];
            }
        }
        return dp[m-1][n-1];
    }

    public static void main(String args[])
    {
        Solution1 s = new Solution1();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(s.krakenCount(a, b));
    }
}