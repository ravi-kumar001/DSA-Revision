import java.util.Arrays;

public class CommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        // Corner Case
        if (strs.length == 1) {
            return strs[0];
        }

        Arrays.sort(strs);

        String first = strs[0];
        String second = strs[strs.length - 1];

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < first.length(); i++) {
            if (first.charAt(i) != second.charAt(i)) {
                break;
            }
            result.append(first.charAt(i));
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String strs[] = { "f" };
        System.out.println(longestCommonPrefix(strs));
    }
}
