package Bonus;


public class Permutation {
    public static void main(String[] args) {
        Permutation obj = new Permutation();
        String str = "ABC";
        obj.permutation(str);
    }

    void permutation(String str) {
        char[] stringConvert = str.toCharArray();
        permutationCall(stringConvert, 0);
    }

    private void swap(int i, int j, char[] nums) {
        char temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    void print(char[] nums) {
        String str =new String(nums);
        System.out.print(str);
        System.out.println();

    }

    private void permutationCall(char[] array, int index) {
        if (index == array.length) {
            /*System.out.println(Arrays.toString(array));*/
            print(array);
            return;
        }
        for (int i = index; i < array.length; i++) {
            swap(i, index, array);
            permutationCall(array, index + 1);
            swap(i, index, array);
        }
    }
}
