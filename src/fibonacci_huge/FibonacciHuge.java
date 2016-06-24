import java.util.*;

public class FibonacciHuge {
    private static long getFibonacciHuge(long n, long m) {
        // find the length of Pisano period for m: pisano(m)
        // pisano(3) == 8;
        int pisano = getPisano(m);

        // find the remainder of n divided by pisano(m): rem(n, m)
        // rem(2015, 3) == 2015 % pisano(3) == 2015 % 8 == 7
        long rem = n % pisano;

        // find the remainder of F(rem(n, m)) divided by m, return it
        // return F(rem(n, m)) % m;
        // F(rem(n, m)) % m == F(7) % 3 == 1
        // return 1;
        return calc_mods_fast((int)rem, m);
    }

    private static int getPisano(long m) {
        // using the fact that all Pisano periods start with 0 1 1...
        // (not proven)
        if (1L == m) {
            return 1;
        } else if (2L == m) {
            return 3;
        } else {
            long rem_minus_2 = 1;
            long rem_minus_1 = 1;
            long rem;

            int pisano = 0;
            boolean isPisanoFound = false;
            do {
                rem = (rem_minus_2 + rem_minus_1) % m;

                if ((0L == rem_minus_2) && (1L == rem_minus_1) && (1L == rem)) {
                    isPisanoFound = true;
                } else {
                    rem_minus_2 = rem_minus_1;
                    rem_minus_1 = rem;
                }

                pisano++;
            } while(!isPisanoFound);

            return pisano;
        }
    }

    private static long calc_mods_fast(int n, long m) {
        if (n <= 1)
            return n;

        long[] a = new long[n];
        a[0] = 1;
        a[1] = 1;

        for (int i = 2; i < n; ++i) {
            a[i] = (a[i - 1] + a[i - 2]) % m;
        }

        return a[n - 1];
    }

    public static void main(String[] args) {
//        // test 1 (fast mod N)
//        for (int j = 2; j <= 9; ++j) {
//            System.out.print(j + ":");
//            for (int i = 0; i < 60; ++i) {
//                System.out.print(" " + calc_mods_fast(i, j));
//            }
//            System.out.println();
//        }
//        System.out.print(calc_mods_fast(100, 100)); // must return 75
//        return;

//        // test 2 (Pisano periods)
//        for (long j = 2L; j <= 100L; ++j) {
//            System.out.println(j + ": " + getPisano(j));
//        }
//        return;

        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long m = scanner.nextLong();

        // test case 1
//        n = 281621358815590L;
//        m = 30524L;
//        // result: 11963

        // test case 2
//        n = 1000L;
//        m = 100L;
//        // result: 75

        // test case 3
//        n = 2015L;
//        m = 3L;
//        // result: 1

        System.out.println(getFibonacciHuge(n, m));
    }
}

