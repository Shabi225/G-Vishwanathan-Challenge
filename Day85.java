import java.util.Scanner;

public class MagicNumbers_320A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        while (n>0){
            if(n%10==1){
                n=n/10;
            } else if (n%100==14) {
                n=n/100;
            } else if (n%1000==144) {
                n=n/1000;
            }else {
                break;
            }
        }
        if(n==0){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
