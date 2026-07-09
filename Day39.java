/*Codeforces 144A*/
import java.util.Scanner;

public class ArrivalOfTheGeneral_144A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] heights=new int[n];
        for(int i=0;i<n;i++){
            heights[i]=sc.nextInt();
        }
        int maxH=heights[0];
        int maxIndex=0;
        int minH=heights[0];
        int minIndex=0;
        for(int i=0;i<n;i++){
            if(heights[i]<=minH){
                minH=heights[i];
                minIndex=i;
            }
            if(heights[i]>maxH){
                maxH=heights[i];
                maxIndex=i;
            }
        }
        int time=maxIndex+(n-1-minIndex);
        if(maxIndex>minIndex){
            time--;
        }
        System.out.println(time);
    }
}
