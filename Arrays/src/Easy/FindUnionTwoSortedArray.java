package Easy;

import java.util.ArrayList;

public class FindUnionTwoSortedArray {
    /*Input
n = ,m = 5.
arr1[] = {1,2,3,4,5}
arr2[] = {2,3,4,4,5}
Output:  {1,2,3,4,5} */
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int[] arr1 = new int[]{2, 3, 4, 5};
        int i = 0, j = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (i < arr.length && j < arr1.length) {
            int x = arr[i];
            int y = arr1[j];
            if (x == y) {
                if (arrayList.isEmpty() || arrayList.get(arrayList.size() - 1) != x) {
                    arrayList.add(x);
                }
                i++;
                j++;
            } else if (x < y) {
                if (arrayList.isEmpty() || arrayList.get(arrayList.size() - 1) != x) {
                    arrayList.add(x);
                }
                i++;
            } else {
                if (arrayList.isEmpty() || arrayList.get(arrayList.size() - 1) != y) {
                    arrayList.add(y);
                }
                j++;
            }
        }
        while (i < arr.length) {
            arrayList.add(arr[i]);
            i++;
        }
        while (j < arr1.length) {
            arrayList.add(arr1[j]);
            j++;
        }
        for (int x : arrayList) {
            System.out.print(x + " ");
        }
    }
}
