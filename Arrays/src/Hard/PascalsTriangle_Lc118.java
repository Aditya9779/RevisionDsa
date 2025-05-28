package Hard;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle_Lc118 {
    public static void main(String[] args) {
        List<List<Integer>> ans = generate(5);
        for (List<Integer> take : ans) {
            for (Integer integer : take) {
                System.out.print(integer + " ");
            }
            System.out.println();
        }
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> first = new ArrayList<>();
        first.add(1);
        ans.add(first);
        for (int i = 1; i < numRows; i++) {
            List<Integer> pre = ans.get(i - 1);
            List<Integer> cur = new ArrayList<>();
            cur.add(1);
            for (int j = 1; j < i; j++) {
                cur.add(pre.get(j - 1) + pre.get(j));
            }
            cur.add(1);
            ans.add(cur);
        }
        return ans;
    }
}
