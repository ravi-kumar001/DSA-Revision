public class Basics {
    public static boolean vowelChecker(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I'
                || c == 'O' || c == 'U') {
            return true;
        }
        return false;
    }

    public static boolean modifiedVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }

    public static String reverseVowels(String s) {

        char[] charArray = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            if (!modifiedVowel(charArray[start])) {
                start++;
                continue;
            }
            if (!modifiedVowel(charArray[end])) {
                end--;
                continue;
            }

            // Otherwise swap

            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;

            start++;
            end--;
        }

        return new String(charArray);
    }

    public static void main(String[] args) {
        String s = "E";
        System.out.println(reverseVowels(s));
    }
}