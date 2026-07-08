/*Codeforces 122A*/
import java.util.Scanner;

public class LuckyDivision_122A {
    static boolean luckyNum(int num){
        while (num>0){
            int digit=num%10;
            if(digit!=4 && digit!=7){
                return false;
            }
            num=num/10;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%4==0 || n%7==0 || n%47==0){
            System.out.println("YES");
        }
        else if (luckyNum(n)) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
