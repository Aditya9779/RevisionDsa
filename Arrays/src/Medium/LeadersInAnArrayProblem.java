package Medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LeadersInAnArrayProblem {
    /*
Example 1:
Input:
arr = [4, 7, 1, 0]
Output:
7 1 0
Explanation:
Rightmost element is always a leader. 7 and 1 are greater than the elements in their right side.
*/
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int size = s.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = s.nextInt();
        }
        int n = nums.length;
        ArrayList<Integer> arrayList = new ArrayList<>();
        int check=nums[nums.length-1];
        arrayList.add(check);
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i]>=check){
              check=nums[i];
              arrayList.add(check);
            }
        }
        Collections.reverse(arrayList);
        for(int i:arrayList){
            System.out.print(i +" ");
        }
    }
}
