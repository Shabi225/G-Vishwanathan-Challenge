/*codeforces 466A*/
import java.util.Scanner;

public class CheapTravel_466A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        int cost1=n*a;
        int cost2=(n/m)*b+(n%m)*a;
        int cost3=(n+m-1)/m*b;
        System.out.println(Math.min(cost1,Math.min(cost3,cost2)));
    }
}
