/*Codeforces 118A*/
import java.util.Scanner;

public class StringTask_118A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String l=s.toLowerCase();
        StringBuilder newstr=new StringBuilder();
        for(int i=0;i<l.length(); i++){
            if(l.charAt(i)=='a' || l.charAt(i)=='e' || l.charAt(i)=='i' || l.charAt(i)=='o' || l.charAt(i)=='u' || l.charAt(i)=='y') continue;
            else{
                newstr.append('.');
                newstr.append(l.charAt(i));
            }
        }
        System.out.println(newstr.toString());
    }
}
