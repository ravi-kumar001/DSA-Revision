import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {

    // public static boolean isAnagram(String str1, String str2) {
    // if (str1.length() != str2.length()) {
    // return false;
    // }

    // // Sort both string
    // char[] charArray1 = str1.toCharArray();
    // Arrays.sort(charArray1);

    // char[] charArray2 = str2.toCharArray();
    // Arrays.sort(charArray2);

    // int iterator = 0;
    // for (int i = 0; i < str1.length(); i++) {
    // if (charArray1[i] == charArray2[i]) {
    // iterator++;
    // }
    // }
    // return iterator == charArray1.length;
    // }

    public static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        // Sort both strings and compare
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }

    public static String getSorted(String str) {
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>(); // store the anagrams

        for (String str : strs) {
            String sortedStr = getSorted(str);

            if (!map.containsKey(sortedStr)) {
                map.put(sortedStr, new ArrayList<>());
            }

            map.get(sortedStr).add(str);

        }
        return new ArrayList<>(map.values());
    }

    public static int[] getFrequencyArray(String str) {
        int[] count = new int[26];

        for (char c : str.toCharArray()) {
            count[c - 'a']++;
        }
        return count;
    }

    public static List<List<String>> groupAnagrams1(String[] strs) {
        Map<String, List<String>> map = new HashMap<>(); // we want to key is as a sorted key and its anagram is in as
                                                         // List of String

        for (String str : strs) {
            int[] frequency = getFrequencyArray(str);
            String sortedStr = Arrays.toString(frequency); // Convert frequency array to a string for the key

            if (!map.containsKey(sortedStr)) {
                map.put(sortedStr, new ArrayList<>());
            }

            map.get(sortedStr).add(str);

        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };

        System.out.println(groupAnagrams(strs));
    }
}