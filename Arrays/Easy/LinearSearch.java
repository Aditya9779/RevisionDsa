import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Size of the Array");
        int size = s.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements in Array");
        for (int i = 0; i < size; i++) {
            array[i] = s.nextInt();
        }
        System.out.println("Enter the Target to find in the Array");
        int target=s.nextInt();
        int idx=0;
        for (int x:array) {
            if (x==target){
                System.out.print("Index is " + idx);
            }
            idx++;
        }
    }
}
