/*Codeforces 734A*/
import java.util.Scanner;

public class AntonAndDanik_734A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String sequence=sc.next();
        int dCount=0;
        int aCount=0;
        for(int i=0;i<n;i++){
            char c=sequence.charAt(i);
            if(c=='D'){
                dCount++;
            } else if (c=='A') {
                aCount++;
            }
        }
        if (aCount>dCount){
            System.out.println("Anton");
        }
        else if (dCount>aCount) {
            System.out.println("Danik");
        }
        else {
            System.out.println("Friendship");
        }
    }
}
