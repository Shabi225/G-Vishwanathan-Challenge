/*Codeforces 339B*/
import java.util.Scanner;

public class XeniaAndRingroad_339B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextInt();
        long m=sc.nextInt();
        long current=1;
        long time=0;
        for(int i=0;i<m;i++){
            long next=sc.nextLong();
            if(current<=next){
                time+=next-current;
            }
            else {
                time+=n-current+next;
            }
            current=next;
        }
        System.out.println(time);
    }
}
