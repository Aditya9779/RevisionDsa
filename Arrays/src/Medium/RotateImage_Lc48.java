package Medium;

import java.util.Scanner;

public class RotateImage_Lc48 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the row");
        int row = s.nextInt();
        System.out.println("Enter the col");
        int col = s.nextInt();
        int[][] array = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Enter the row " + i + " and col " + j);
                array[i][j] = s.nextInt();
            }
        }
        rotateImage(array);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void rotateImage(int[][] nums) {
        if (nums == null) {
            return;
        }
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = nums[i][j];
                nums[i][j] = nums[j][i];
                nums[j][i] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = nums[i][j];
                nums[i][j] = nums[i][n - 1 - j];
                nums[i][n - 1 - j] = temp;
            }
        }
    }
}
