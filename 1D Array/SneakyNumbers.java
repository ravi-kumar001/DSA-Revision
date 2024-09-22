import java.util.ArrayList;
import java.util.Arrays;

public class SneakyNumbers {
    public static int[] getSneakyNumbers(int[] nums) {
        // Find max number of nums
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }
        }

        ArrayList<Integer> result = new ArrayList<>();

        int freq[] = new int[max + 1];

        for (int i = 0; i < nums.length; i++) {
            freq[nums[i]]++;
        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] == 2) {
                result.add(i);
            }
        }

        int[] sneakyNumbers = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            sneakyNumbers[i] = result.get(i);
        }

        return sneakyNumbers;
    }

    public static void main(String[] args) {
        int nums[] = { 0,3,2,1,3,2 };
        System.out.println(Arrays.toString(getSneakyNumbers(nums)));
    }
}
