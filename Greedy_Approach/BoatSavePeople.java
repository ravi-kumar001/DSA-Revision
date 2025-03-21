import java.util.Arrays;

public class BoatSavePeople {
    public static int numRescueBoats(int[] people, int limit) {
        // so our greedy approach, we peek one heaviest person and one smallest weight
        // person if possible
        Arrays.sort(people);
        int i = 0, j = people.length - 1;
        int boat = 0;

        while (i <= j) {
            if(people[i] + people[j] <= limit) {
                i++;
            }
            j--;
            boat++;
        }

        return boat;
    }

    public static void main(String[] args) {
        int people[] = { 3, 5, 3, 4 };
        int limit = 5;
        System.out.println(numRescueBoats(people, limit));
    }
}
