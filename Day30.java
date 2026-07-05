/*Codeforces 791A*/
import java.util.Scanner;

public class BearAndBigBrother_791A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int limakAge=sc.nextInt();
        int bobAge=sc.nextInt();
        int years=0;
        while(limakAge<=bobAge){
            limakAge=limakAge*3;
            bobAge=bobAge*2;
            years++;
        }
        System.out.println(years);
    }
}
