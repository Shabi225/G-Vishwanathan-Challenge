/*Codeforces 231A*/
import java.util.Scanner;

public class Team_231A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
        sc.nextLine();
        int prbC=0;
        for(int i=0;i<input;i++){
            int count=0;
            int n=0;
            String num=sc.nextLine();
            String[] sp=num.split(" ");
            while(n<3){
                count += Integer.parseInt(sp[n]);
                n++;
            }
            if(count>=2){
                prbC++;
            }
        }
        System.out.println(prbC);
    }
}
