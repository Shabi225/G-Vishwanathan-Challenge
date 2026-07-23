/*Codeforces 1358A*/
import java.util.Scanner;

public class ParkLighting_1358A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [][] testCases=new int[n][2];
        for(int i=0;i<n;i++){
            testCases[i][0]=sc.nextInt();
            testCases[i][1]=sc.nextInt();
        }
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            ans[i]=(testCases[i][0]*testCases[i][1])/2+(testCases[i][0]*testCases[i][1])%2;
        }
        for(int i=0;i<n;i++){
            System.out.println(ans[i]);
        }
    }
}
