/*Codeforces 151A*/
import java.util.Scanner;

public class SoftDrinking_151A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int l=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int p=sc.nextInt();
        int nl=sc.nextInt();
        int np=sc.nextInt();
        int totalDrink=k*l;
        int totalLime=c*d;
        //since each friend takes equal amounts
        int possible_toasts_by_Drink=totalDrink/nl;
        int possible_toasts_by_Salt=p/np;
        int possibleToasts=Math.min(possible_toasts_by_Salt,possible_toasts_by_Drink);
        int totalPossibleToasts=Math.min(possibleToasts,totalLime)/n;
        System.out.println(totalPossibleToasts);
    }
}
