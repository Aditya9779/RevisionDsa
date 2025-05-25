package Easy;

import java.util.Scanner;

public class SecondLargestArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Size of the Array");
        int size = s.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements in Array");
        for (int i = 0; i < size; i++) {
            array[i] = s.nextInt();
        }
        int firstMax = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < size; i++) {
            if (firstMax < array[i]) {
                secondMax = firstMax;
                firstMax = array[i];
            }
        }
        System.out.println("SecondMax is " + secondMax);
    }

}
