/*Codeforces 66B*/
import java.util.Scanner;

public class PetyaAndCountryside_66B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] heights=new int[n];
        for(int i=0;i<n;i++){
            heights[i]=sc.nextInt();
        }
        int count=1;
        for(int i=0;i<n;i++){
            int cntEach=1;
            int j=i;
            while (j>0 && heights[j-1]<=heights[j]) {
                cntEach++;
                j--;
            }
            j=i;
            while(j<n-1 && heights[j+1]<=heights[j]){
                cntEach++;
                j++;
            }
            count=Math.max(count,cntEach);
        }
        System.out.println(count);
    }
}
