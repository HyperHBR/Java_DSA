import java.util.ArrayList;
import java.util.Collections;

public class _07_Job_Scheduling {
    public static class Job{
        int id;
        int deadlineTime;
        int profit;

        public Job(int id,int deadlineTime,int profit){
            this.id = id;
            this.deadlineTime = deadlineTime;
            this.profit = profit;
        }
    }
    public static void main(String[] args) {
        int JobsInfo[][] = {
            {4,20},
            {1,10},
            {1,40},
            {1,30}
        };

        ArrayList<Job> AllJobs = new ArrayList<>();

        for(int i=0;i<JobsInfo.length;i++){
            AllJobs.add(new Job(i, JobsInfo[i][0], JobsInfo[i][1]));
        }

        
        Collections.sort(AllJobs, (obj1,obj2) -> obj2.profit - obj1.profit);
        
        ArrayList<Integer> JobSeq = new ArrayList<>();

        int time = 0;

        for(int i=0;i<AllJobs.size();i++){
            if(AllJobs.get(i).deadlineTime > time){
                time++;
                JobSeq.add(AllJobs.get(i).id);
            }
        }

        System.out.println(JobSeq);
    }
}
