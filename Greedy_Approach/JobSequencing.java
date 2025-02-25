import java.util.ArrayList;
import java.util.Collections;

public class JobSequencing {
    static class Job {
        int deadLine;
        int profit;
        int id;

        public Job(int deadLine, int profit, int id) {
            this.deadLine = deadLine;
            this.profit = profit;
            this.id = id;
        }
    }

    public static void main(String[] args) {
        int jobInfo[][] = { { 4, 20 }, { 1, 10 }, { 1, 30 }, { 1, 40 } };
        ArrayList<Job> jobs = new ArrayList<>();

        for (int i = 0; i < jobInfo.length; i++) {
            jobs.add(new Job(jobInfo[i][0], jobInfo[i][1], i));
        }

        // our greedy Approach, sort on the basis of profit
        Collections.sort(jobs, (obj1, obj2) -> obj2.profit - obj1.profit);

        ArrayList<Integer> ans = new ArrayList<>();
        int time = 0;

        for (int i = 0; i < jobs.size(); i++) {
            Job curr = jobs.get(i);
            if (curr.deadLine > time) {
                time++;
                ans.add(curr.id);
            }
        }

        System.out.println(time);

        for(int i = 0; i< ans.size();i++) {
            System.out.print(ans.get(i) + " ");
        }
    }
}
