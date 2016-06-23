//package fibonacci_huge;

import java.util.*;

public class FibonacciHuge {
    private static long getFibonacciHuge(long n, long m) {
        //write your code here
        return 0;
    }

    private static long calc_fib_fast(int n) {
        if (n <= 1)
            return n;

        long[] a = new long[n];
        a[0] = 1;
        a[1] = 1;

        for (int i = 2; i < n; ++i) {
            a[i] = a[i - 1] + a[i - 2];
        }

        return a[n - 1];
    }

    public static void main(String[] args) {
        // test 1 (mod N)
        for (int j = 2; j <= 9; ++j) {
            System.out.print(j + ":");
            for (int i = 0; i < 60; ++i) {
                System.out.print(" " + calc_fib_fast(i) % j);
            }
            System.out.println();
        }

        return;

//        Scanner scanner = new Scanner(System.in);
//        long n = scanner.nextLong();
//        long m = scanner.nextLong();
//        System.out.println(getFibonacciHuge(n, m));
    }
}

