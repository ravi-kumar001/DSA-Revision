public class Basics {

    public static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start < end) { // Not need to check start == end b/c this is already same
            if (str.charAt(start) == str.charAt(end)) {
                start++;
                end--;
            }
        }

        return start == end;
    }

    public static double shortestPath(String route) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < route.length(); i++) {
            if (route.charAt(i) == 'E') {
                x++;
            } else if (route.charAt(i) == 'N') {
                y++;
            } else if (route.charAt(i) == 'S') {
                y--;
            } else {
                x--;
            }
        }

        return Math.sqrt((x * x) + (y * y));
    }

    public static String largestString(String fruits[]) {
        String larStr = fruits[0];

        for (int i = 1; i < fruits.length; i++) {
            if (larStr.compareTo(fruits[i]) < 0) {
                larStr = fruits[i];
            }
        }
        return larStr;
    }

    public static String firstLetterUpper(String str) {
        StringBuilder sb = new StringBuilder("");
        sb.append(Character.toUpperCase(str.charAt(0)));

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();
    }

    public static String stringCompression(String str) {
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;
            sb.append(str.charAt(i));
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            if (count > 1) {
                sb.append(count);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        // String str = "Ravi Kumar";

        // String str2 = new String("Ravi Kumar Patel");

        // System.out.println(str.charAt(0));

        // System.out.println(str);
        // System.out.println(str2);

        // String str = "madam";
        // System.out.println(isPalindrome(str));

        // String route = "WNEENESENNN";
        // System.out.println(shortestPath(route));

        // String fruits[] = { "mango", "apple", "banana" };
        // System.out.println(largestString(fruits));

        // String str = "hi, my name is ravi.";
        // System.out.println(firstLetterUpper(str));

        String str = "aaabbcccdd";
        System.out.println(stringCompression(str));

    }
}