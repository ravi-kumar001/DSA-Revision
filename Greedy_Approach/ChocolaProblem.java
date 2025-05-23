import java.util.Arrays;
import java.util.Collections;

public class ChocolaProblem {
    public static void main(String[] args) {

        Integer costV[] = { 2, 1, 3, 1, 4 };
        Integer costH[] = { 4, 1, 2 };

        // Our Greedy Approch is sort on the basis of cost
        Arrays.sort(costV, Collections.reverseOrder());
        Arrays.sort(costH, Collections.reverseOrder());

        int h = 0, v = 0;
        int hp = 1, vp = 1;
        int price = 0;

        while (h < costH.length && v < costV.length) {
            if (costV[v] <= costH[h]) {
                price += vp * costH[h];
                h++;
                hp++;
            } else {
                price += hp * costV[v];
                v++;
                vp++;
            }
        }BUy

        while (h < costH.length) {
            price += vp * costH[h];
            h++;
            hp++;
        }

        while (v < costV.length) {
            price += hp * costV[v];
            v++;
            vp++;
        }

        System.out.println(price);
    }
}
