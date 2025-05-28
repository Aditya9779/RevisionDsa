package Medium;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix_Lc54 {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        List<Integer> ans = spiralOrder(array);
        for (int x : ans) {
            System.out.print(x + " ");
        }
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int total = matrix.length * matrix[0].length;
        int count = 0;

        int rS = 0, rE = matrix.length - 1;
        int cS = 0, cE = matrix[0].length - 1;

        while (count < total) {
            for (int i = cS; i <= cE && count < total; i++) {
                ans.add(matrix[rS][i]);
                count++;
            }
            rS++;

            for (int i = rS; i <= rE && count < total; i++) {
                ans.add(matrix[i][cE]);
                count++;
            }
            cE--;

            for (int i = cE; i >= cS && count < total; i--) {
                ans.add(matrix[rE][i]);
                count++;
            }
            rE--;

            for (int i = rE; i >= rS && count < total; i--) {
                ans.add(matrix[i][cS]);
                count++;
            }
            cS++;
        }

        return ans;
    }
}
