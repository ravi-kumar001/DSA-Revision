public class MInTimeToInitialStateUsingLPS {
    public static int[] LPS(String word, int[] lps, int n) {
        lps[0] = 0;
        int length = 0;
        int i = 1;

        while (i < n) {
            if (word.charAt(i) == word.charAt(length)) {
                length++;
                lps[i] = length;
                i++;
            } else {
                if (length != 0) {
                    length = lps[length - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }

        return lps;
    }

    public static int minimumTimeToInitialState(String word, int k) {
        int n = word.length();
        int lps[] = new int[word.length()];

        LPS(word, lps, n);

        int maxSuffixLength = lps[n - 1];

        while (maxSuffixLength > 0 && ((n - maxSuffixLength) % k != 0)) {
            maxSuffixLength = lps[maxSuffixLength - 1];
        }

        if ((n - maxSuffixLength) % k == 0) {
            return (n - maxSuffixLength) / k;
        }

        return (int) Math.ceil(n / (double) (k));
    }

    public static void main(String[] args) {
        String word = "abacaba";
        int k = 3;

        System.out.println(minimumTimeToInitialState(word, k));
    }
}
