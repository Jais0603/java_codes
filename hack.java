
import java.util.*;

public class hack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long k = sc.nextLong();
            long num = 0;
            for (long i = 1; ; i++) {
                long digits = countDigits(i);
                if (k > digits) {
                    k -= digits;
                } else {
                    num = i;
                    break;
                }
            }
            for (; k > 0; k--) {
                num = getNextNumber(num);
            }
            System.out.println(num);
        }
    }

    static long countDigits(long n) {
        long count = 0;
        while (n > 0) {
            if (n % 10 != 4) {
                count++;
            }
            n /= 10;
        }
        return count;
    }

    static long getNextNumber(long n) {
        long next = n + 1;
        while (containsFour(next)) {
            next++;
        }
        return next;
    }

    static boolean containsFour(long n) {
        while (n > 0) {
            if (n % 10 == 4) {
                return true;
            }
            n /= 10;
        }
        return false;
    }
}

