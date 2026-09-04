import java.util.PriorityQueue;
import java.util.Scanner;

public class ConstructingTheArray_1353D {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int[] ans=new int[n];
            PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->{
                int lenA=a[1]-a[0]+1;
                int lenB=b[1]-b[0]+1;

                if(lenA!=lenB){
                    return lenB-lenA;
                }

                return a[0]-b[0];
            });
            int value=1;
            pq.offer(new int[]{0,n-1});
            while (!pq.isEmpty()){
                int[] seg= pq.poll();
                int l=seg[0];
                int r=seg[1];
                int mid;
                if((r-l+1)%2==1){
                    mid=(l+r)/2;
                }else {
                    mid=(l+r-1)/2;
                }
                if(ans[mid]==0){
                    ans[mid]=value;
                    value++;
                }

                if(l<=mid-1){
                    pq.offer(new int[]{l,mid-1});
                }
                if(mid+1<=r){
                    pq.offer(new int[]{mid+1,r});
                }
            }
            for (int i=0;i<n;i++){
                System.out.print(ans[i]+" ");
            }
            System.out.println();
        }
    }
}
