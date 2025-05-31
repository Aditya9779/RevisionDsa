    package Hard;

    import java.util.Arrays;
    import java.util.HashSet;

    public class FindTheRepeatingAndMissingNumbers {
        static int[] findRepeatingAndMissingNum(int[] nums) {
            if (nums.length == 0) return nums;
            HashSet<Integer> set = new HashSet<>();
            int sum = 0, repeating = 0;
            for (int i : nums) {
                if (set.contains(i)) {
                    repeating = i;
                } else {
                    set.add(i);
                }
                sum += i;
            }
            int totalSum = nums.length * (nums.length + 1) / 2;
            int missingNumber = totalSum - (sum - repeating);
            return new int[]{repeating, missingNumber};
        }

        public static void main(String[] args) {
            int []array = {3, 1, 2, 5, 4, 6, 7, 5};
            System.out.println(Arrays.toString(findRepeatingAndMissingNum(array)));
        }
    }
