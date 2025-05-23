import java.util.ArrayList;
import java.util.List;

class Recursion {
    public static void substring(String str, int index, String ans) {
        if (index == str.length()) {
            System.out.println(ans + " ");
            return;
        }

        // for take in ans
        substring(str, index + 1, ans);
        substring(str, index + 1, ans + str.charAt(index));
    }

    public static void permutation(int[] nums, List<List<Integer>> ans, List<Integer> curr) {
        if (curr.size() == nums.length) {
            ans.add(new ArrayList<>(curr));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (curr.contains(nums[i])) {
                continue;
            }

            curr.add(nums[i]); // add
            permutation(nums, ans, curr);
            curr.remove(curr.size() - 1);
        }
    }

    public static int toh(int n, int from, int to, int aux) {
        if (n == 1)
            return 1;

        int count = toh(n - 1, from, aux, to);
        count++; // for nth disc we take 1 move
        count += toh(n - 1, aux, to, from);

        return count;
    }

    public static int towerOfHanoi(int n, int from, int to, int aux) {
        return toh(n, from, to, aux);
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3 };
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();

        permutation(nums, ans, curr);

        for (List<Integer> n : ans) {
            System.out.println(n);
        }
    }
}