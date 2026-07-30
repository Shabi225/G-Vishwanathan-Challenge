import java.util.Scanner;

public class NastiaAndNearlyGoodNumbers_1521A {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        while (n>0){
            long a= sc.nextInt();
            long b= sc.nextInt();
            if(b==1){
                System.out.println("NO");
            }
            else {
                System.out.println("YES");
                System.out.println(a+" "+(a*b)+" "+a*(b+1));
            }
            n--;
        }
    }
}
