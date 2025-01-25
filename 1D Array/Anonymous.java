class Clac {
    public int add(int nums[]) {
        int result = 0;
        for (int n : nums) {
            result += n;
        }
        return result;
    }

}

public class Anonymous {

    public static void main(String[] args) {
        Clac obj = new Clac();
        int result = obj.add(new int[] { 1, 2, 3, 4 });
        System.out.println(result);
    }
}