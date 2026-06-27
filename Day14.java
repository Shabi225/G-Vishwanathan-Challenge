/*Codeforces 281A*/
import java.util.Scanner;

public class WordCapitalization_281A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String word=sc.next();
        String first=String.valueOf(word.charAt(0)).toUpperCase();
        String ans=first+word.substring(1);
        System.out.println(ans);
    }
}
