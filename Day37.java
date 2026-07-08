/*Codeforces 133A*/
import java.util.Scanner;

public class HQ9_133A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String instruction=sc.next();
        for(int i=0;i<instruction.length();i++){
            if(instruction.charAt(i)=='H' || instruction.charAt(i)=='Q' || instruction.charAt(i)=='9'){
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}
