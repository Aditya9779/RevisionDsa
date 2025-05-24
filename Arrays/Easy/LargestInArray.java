import java.util.Scanner;

public class LargestInArray {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Size of the Array");
        int size=s.nextInt();
        int[] array =new int[size];
        System.out.println("Enter the elements in Array");
        for (int i = 0; i <size ; i++) {
            array[i]=s.nextInt();
        }
        int max=Integer.MIN_VALUE;
        for (int i = 0; i <size ; i++) {
            max=Math.max(max,array[i]);
        }
        System.out.println("Max is " + max);
    }
}
