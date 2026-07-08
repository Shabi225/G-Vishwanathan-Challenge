/*Codeforces 155A*/
import java.util.Scanner;

public class I_love_username_155A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] scores=new int[n];
        for(int i=0;i<n;i++){
            scores[i]=sc.nextInt();
        }
        int minScore=scores[0];
        int maxScore=scores[0];
        int amazingCount=0;
        for(int i=1;i<n;i++){
            if (scores[i]>maxScore){
                maxScore=scores[i];
                amazingCount++;
            }
            if (scores[i]<minScore){
                minScore=scores[i];
                amazingCount++;
            }
        }
        System.out.println(amazingCount);
    }
}
