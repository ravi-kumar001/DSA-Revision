import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class IndianCoins {
    public static void main(String[] args) {
        Integer coins[] = {1, 4, 2, 5, 10, 200, 20, 50, 100, 500, 2000 };
        int amount = 591;

        Arrays.sort(coins, Collections.reverseOrder());

        int totalCoins = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        int i = 0;
        while (amount != 0) {
            if (amount >= coins[i]) {
                while (amount >= coins[i]) {
                    totalCoins++;
                    ans.add(i);
                    amount -= coins[i];
                }
            }
            i++;
        }

        System.out.println(totalCoins);

        for (int j = 0; j < ans.size(); j++) {
            System.out.print(coins[ans.get(j)] + " ");
        }

    }
}
