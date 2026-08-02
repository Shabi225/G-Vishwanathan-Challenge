import java.util.Scanner;
 
public class KefaAndFirstSteps_580A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] money=new int[n];
        for(int i=0;i<n;i++){
            money[i]= sc.nextInt();
        }
        int count=0;
        int cnt=1;
        for(int i=0;i<n-1;i++){
            if(money[i]<=money[i+1]){
                cnt++;
            }
            else {
                cnt=1;
            }
            count=Math.max(count,cnt);
        }
        System.out.println(Math.max(count,cnt));
    }
}
