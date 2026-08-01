import java.util.Arrays;
import java.util.Scanner;

public class VanyaAndLanterns_492B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int l=sc.nextInt();
        int[] l_cords=new int[n];
        for(int i=0;i<n;i++){
            l_cords[i]= sc.nextInt();
        }
        Arrays.sort(l_cords);
        double diff=0;
        double diff1=l_cords[0];
        double diff2=l-l_cords[n-1];

        for(int i=1;i<n;i++){
            diff=Math.max(l_cords[i]-l_cords[i-1],diff);
        }
        System.out.printf("%.10f%n",Math.max(Math.max(diff1,diff2),diff/2.0));

    }
}
