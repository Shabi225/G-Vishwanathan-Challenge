/*Codeforces 546A*/
import java.util.Scanner;

public class SoldierAndBananas_546A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int n= sc.nextInt();
        int w=sc.nextInt();
        int total_amt=(k*w*(w+1)/2);
        int toBorrow=total_amt-n;
        if(toBorrow<=0){
            System.out.println(0);
        }
        else {
            System.out.println(toBorrow);
        }
    }
}
