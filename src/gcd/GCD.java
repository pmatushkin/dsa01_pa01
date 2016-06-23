//package gcd;

import java.util.*;

public class GCD {
    private static int gcd(int a, int b) {
        int current_gcd = 1;
        for (int d = 2; d <= a && d <= b; ++d) {
            if (a % d == 0 && b % d == 0) {
                if (d > current_gcd) {
                    current_gcd = d;
                }
            }
        }

        return current_gcd;
    }

    private static int gcd_euclidean(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            int a_prime = a % b;

            return(gcd_euclidean(b, a_prime));
        }
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

//        // test
//        for (int i = 10; i < 2000000; ++i) {
//            for (int j = 10; j < 2000000; ++j) {
//
//                int gcd = gcd(i, j);
//                int gcd_euclidean = gcd_euclidean(i, j);
//
//                if (gcd != gcd_euclidean) {
//                    System.out.println("FAIL  at: " + i + ", " + j);
//                    System.out.println("gcd     : " + gcd);
//                    System.out.println("gcd_e   : " + gcd_euclidean);
//                }
//            }
//        }

        System.out.println(gcd_euclidean(a, b));
    }
}
