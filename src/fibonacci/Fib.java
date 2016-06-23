//package fibonacci;

import java.util.Scanner;

public class Fib {
    private static long calc_fib(int n) {
        if (n <= 1)
            return n;

        return calc_fib(n - 1) + calc_fib(n - 2);
    }

    private static long calc_fib_fast(int n) {
        if (n <= 1)
            return n;

        int[] a = new int[n];
        a[0] = 1;
        a[1] = 1;

        for (int i = 2; i < n; ++i) {
            a[i] = a[i - 1] + a[i - 2];
        }

        return a[n - 1];
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

//        // test 1
//        for (int i = 1; i < 45; ++i) {
//            long fib = calc_fib(i);
//            long fib_fast = calc_fib_fast(i);
//
//            if (fib != fib_fast) {
//                System.out.println("FAIL  at: " + i);
//                System.out.println("fib     : " + fib);
//                System.out.println("fib_fast: " + fib_fast);
//
//                break;
//            }
//        }

//        // test 2
//        for (int i = 0; i < 45; ++i) {
//            long fib_fast = calc_fib_fast(i);
//
//            System.out.println("i  : " + i);
//            System.out.println("fib: " + fib_fast);
//        }

        System.out.println(calc_fib_fast(n));
    }
}
