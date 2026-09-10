import java.util.Scanner;

public class Worms_474B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] piles=new int[n];
        for(int i=0;i<n;i++){
            if(i==0){
                piles[i]=sc.nextInt();
            }else {
                piles[i]=piles[i-1]+sc.nextInt();
            }
        }
        int m=sc.nextInt();
        while (m-->0){
            int label=sc.nextInt();
            int start=0,end=n-1;
            while (start<=end){
                int mid=start+(end-start)/2;
                if(label<=piles[mid]){
                    end=mid-1;
                } else  {
                    start=mid+1;
                }
            }
            System.out.println(start+1);
        }
    }
}
