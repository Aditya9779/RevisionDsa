package Medium;

import java.util.Scanner;

public class FindingSqrtOfNumberUsingBS {
    public static void main(String[] args) {
        System.out.println("The value is  "+squareRoot(new Scanner(System.in).nextInt()));
    }

    static int squareRoot(int x) {
        if (x == 0 || x == 1) return x;
        int start = 1;
        int end = x;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (mid * mid == x) {
                return mid;
            } else if (mid * mid < x) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start;
    }
}
