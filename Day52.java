/*Leetcode 208A*/
import java.util.Scanner;

public class DubStep_208A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String[] words=s.split("WUB");
        StringBuilder sb=new StringBuilder();
        for(String w:words){
            if(!w.isEmpty()){
                sb.append(w);
                sb.append(" ");
            }
        }
        System.out.println(sb.toString());
    }
}
