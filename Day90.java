import java.util.Scanner;

public class XXXXX_1364A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int x=sc.nextInt();
            int [] nums=new int[n];
            int sum=0;
            int first=-1;
            int last=-1;
            for (int i=0;i<n;i++){
                nums[i]=sc.nextInt();
                sum+=nums[i];
                if(nums[i]%x!=0){
                    if(first==-1){
                        first=i;
                    }
                    last=i;
                }
            }
            if(sum%x!=0){
                System.out.println(n);
            } else if (first==-1) {
                System.out.println(-1);
            } else{
                int removeLeft=first+1;
                int removeRight=n-last;
                int ans=n-Math.min(removeRight,removeLeft);
                System.out.println(ans);
            }
        }
    }
}
