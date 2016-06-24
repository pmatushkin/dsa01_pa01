//package fibonacci_last_digit;

import java.util.*;

public class FibonacciLastDigit {
    private static int getFibonacciLastDigit(int n) {
        if (n <= 1)
            return n;

        int[] a = new int[n];
        a[0] = 1;
        a[1] = 1;

        for (int i = 2; i < n; ++i) {
            a[i] = (a[i - 1] + a[i - 2]) % 10;
        }

        return a[n - 1];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = getFibonacciLastDigit(n);
        System.out.println(c);
    }
}

