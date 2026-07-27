
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class XeniaAndDivisors_342A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[] freq=new int[8];
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            if(x==5 || x==7){
                System.out.println(-1);
                return ;
            }
            freq[x]++;
        }

        List <String> ans=new ArrayList<>();
        while (freq[3]>0){
            if(freq[1]==0 || freq[6]==0){
                System.out.println(-1);
                return;
            }
            freq[1]--;
            freq[3]--;
            freq[6]--;
            ans.add("1 3 6");
        }
        while (freq[4]>0){
            if (freq[1]==0 || freq[2]==0){
                System.out.println(-1);
                return;
            }
            freq[1]--;
            freq[2]--;
            freq[4]--;
            ans.add("1 2 4");
        }
        while (freq[6]>0){
            if (freq[1]==0 || freq[2]==0){
                System.out.println(-1);
                return;
            }
            freq[1]--;
            freq[2]--;
            freq[6]--;
            ans.add("1 2 6");
        }
        for(int i=1;i<8;i++){
            if(freq[i]!=0){
                System.out.println(-1);
                return;
            }
        }
        for(String s:ans){
            System.out.println(s);
        }
    }
}
