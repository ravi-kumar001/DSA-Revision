import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ActivitySelection {
    public static void main(String[] args) {
        int start[] = { 1, 3, 0, 5, 8, 5 };
        int end[] = { 2, 4, 6, 7, 9, 9 };

        // if our end array is not sorted
        int arr[][] = new int[end.length][3];
        for (int i = 0; i < end.length; i++) {
            arr[i][0] = i;
            arr[i][1] = start[i];
            arr[i][2] = end[i];
        }

        Arrays.sort(arr, Comparator.comparingDouble(o -> o[2]));

        // Lets define our first actitvity
        int maxAct = 1;
        ArrayList<Integer> ans = new ArrayList<>();
        int endTime = arr[0][2];
        ans.add(arr[0][0]);

        for (int i = 1; i < arr.length; i++) {
            if (arr[i][1] >= endTime) {
                maxAct++;
                ans.add(i);
                // update our endTime
                endTime = arr[i][2];
            }
        }

        System.out.println(maxAct);

        for (int i = 0; i < ans.size(); i++) {
            System.out.print("A" + ans.get(i) + " ");
        }
    }
}
