//leetcode-347
import java.util.*;
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int num:nums){
            hm.put(num,hm.getOrDefault(num,0)+1);
        }
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->b[1]-a[1]);
        for(Map.Entry<Integer,Integer> entry:hm.entrySet()){
            pq.add(new int[]{entry.getKey(),entry.getValue()});
        }
        int[] ans=new int[k];
        for(int i=0;i<k;i++){
            int[] cur=pq.poll();
            int number=cur[0];
            ans[i]=number;
        }
        return ans;
    }
}
