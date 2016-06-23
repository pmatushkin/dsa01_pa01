//package lcm;

import java.util.*;

public class LCM {
    private static long lcm(int a, int b) {
        //write your code here
        int gcd = gcd_euclidean(a, b);

        return (long)a * (b / gcd);
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

        System.out.println(lcm(a, b));
    }
}
