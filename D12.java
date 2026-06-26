/*Codeforces 112A*/
import java.util.Scanner;

public class PetyaAndStrings_112A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        String str2=sc.next();
        int result=str1.compareToIgnoreCase(str2);
        if(result>0){
            System.out.println(1);
        }
        else if(result<0){
            System.out.println(-1);
        }
        else {
            System.out.println(0);
        }
    }
}
