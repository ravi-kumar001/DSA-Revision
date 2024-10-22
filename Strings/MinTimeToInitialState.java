public class MinTimeToInitialState {

    public static int minimumTimeToInitialState(String word, int k) {
        int n = word.length();
        int i = k;
        int count = 1;

        while (i < n) {
            if (word.substring(0, n - i).equals(word.substring(i, n))) {
                return count;
            } else {
                i += k; // Move forward by k characters
                count++;
            }
        }

        return (int) Math.ceil(n / (double) (k));
    }

    public static void main(String[] args) {
        String word = "abacaba";
        int k = 3;

        System.out.println(minimumTimeToInitialState(word, k));

    }
}