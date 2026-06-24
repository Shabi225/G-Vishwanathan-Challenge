/*Codeforces 71A*/
import java.util.*;
 
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0; i<=n;i++){
            String word=sc.nextLine();
            if(word.length()>10){
                int length=word.length();
                String ans= String.valueOf(word.charAt(0))+(length-2)+ word.charAt(length - 1);
                System.out.println(ans);
            }
            else {
                System.out.println(word);
            }
        }
    }
}
