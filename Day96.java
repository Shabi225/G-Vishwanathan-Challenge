import java.util.Arrays;
import java.util.Scanner;

public class Puzzles_337A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] pps=new int[m];
        for(int i=0;i<m;i++){
            pps[i]=sc.nextInt();
        }
        Arrays.sort(pps);
        int difference=Integer.MAX_VALUE;
        int left=0;
        int right=0;
        while (left+n<=m){
            right=left+n;
            int max=Integer.MIN_VALUE;
            int min=Integer.MAX_VALUE;
            for(int i=left;i<right;i++){
                if(pps[i]>max)  max=pps[i];
                if(pps[i]<min)  min=pps[i];
            }
            difference=Math.min(difference,max-min);
            left++;
        }
        System.out.println(difference);
    }
}
