/*Codeforces 41A*/
import java.util.Scanner;

public class Translation_41A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String t=sc.next();
        String reversed=new StringBuilder(s).reverse().toString();
        if(t.equals(reversed)){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
