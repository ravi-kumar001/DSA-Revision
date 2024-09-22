public class MissingNumber {
    public static int missingNumber(int[] nums) {
        int n = nums.length + 1;
        int xor1 = 0, xor2 = 0;
        
        for (int i = 0; i < n; i++) {
            xor1 ^= i;
        }

        for (int num : nums) {
            xor2 ^= num;
        }

        return xor1 ^ xor2;
    }

    public static void main(String[] args) {
        int nums[] = { 0, 3, 1 };
        System.out.println(missingNumber(nums));
    }
}
