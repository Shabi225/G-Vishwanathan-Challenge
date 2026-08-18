import java.util.Arrays;
import java.util.Scanner;

public class BerSUBall_489B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] boys=new int[n];
        for(int i=0;i<n;i++){
            boys[i]=sc.nextInt();
        }
        Arrays.sort(boys);
        int m=sc.nextInt();
        int[] girls=new int[m];
        for(int i=0;i<m;i++){
            girls[i]=sc.nextInt();
        }
        Arrays.sort(girls);
        int count=0;
        int i=0;int j=0;
        while(i<m && j<n){
            while (j<n && girls[i]-boys[j]>1){
                j++;
            }
            if (j==n) break;
            while (i<m && girls[i]-boys[j]<-1){
                i++;
            }
            if(i==m) break;

            if(girls[i]-boys[j]==0 || Math.abs(girls[i]-boys[j])==1){
                i++;
                j++;
                count++;
            }
        }
        System.out.println(count);
    }
}
