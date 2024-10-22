import java.util.ArrayList;

public class KMP {
    public static int[] LPS(String word, int[] lps, int n) {
        lps[0] = 0;
        int length = 0;
        int i = 1;

        while (i < word.length()) {
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

    public static ArrayList<Integer> search(String txt, String pat) {
        int n = txt.length();
        int m = pat.length();
        int lps[] = new int[m];

        LPS(pat, lps, m);

        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < n) {
            if (txt.charAt(i) == txt.charAt(j)) {
                i++;
                j++;
            }

            if (j == m) {
                ans.add(i - j + 1); // 1'th based indexing
                j = lps[j - 1];
            } else if (txt.charAt(i) != txt.charAt(j)) {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        String txt = "abesdu";
        String pat = "edu";

        System.out.println(search(txt, pat));
    }
}
