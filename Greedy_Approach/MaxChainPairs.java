import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class MaxChainPairs {
    public static void main(String[] args) {
        int pairs[][] = { { 5, 24 }, { 39, 60 }, { 5, 28 }, { 27, 40 }, { 50, 60 } };
        ArrayList<Integer> ans = new ArrayList<>();

        // our greedy approach, sort the pairs on the basis of second number

        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));

        // initialise our first chain
        int count = 1;
        int endP = pairs[0][1];
        ans.add(0);

        for (int i = 1; i < pairs.length; i++) {
            if (pairs[i][0] >= endP) {
                count++;
                ans.add(i);
                endP = pairs[i][1];
            }
        }

        System.out.println(count);

        for (int i = 0; i < ans.size(); i++) {
            int index = ans.get(i);
            System.out.print(pairs[index][0] + " -> " + pairs[index][1] + "   ");
        }
    }
}
