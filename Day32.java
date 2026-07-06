/*Codeforces 110A*/
import java.util.Scanner;

public class NearlyLuckyNumber_110A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long num=sc.nextLong();
        int digiCnt=0;
        while(num>0){
            long digit=num%10;
            num=num/10;
            if(digit==4 || digit==7){
                digiCnt++;
            }
        }
        if (digiCnt==4 || digiCnt==7){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }

}
