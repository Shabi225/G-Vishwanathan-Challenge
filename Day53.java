import java.util.Scanner;

public class NightAtTheMuseum_731A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int rotations=0;
        char current='a';
        for(int i=0;i<str.length();i++){
            char next=str.charAt(i);
            int diff=Math.abs(next-current);
            rotations+=Math.min(diff,26-diff);
            current=next;
        }
        System.out.println(rotations);
    }
}
