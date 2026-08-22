import java.util.Scanner;

public class HitTheLottery_996A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int amount= sc.nextInt();
        int bills=0;
        while (amount>0){
            if(amount/100>=1){
                amount-=100;
                bills++;
            } else if (amount/20>=1) {
                amount-=20;
                bills++;
            }else if (amount/10>=1) {
                amount-=10;
                bills++;
            }else if (amount/5>=1) {
                amount-=5;
                bills++;
            }else  {
                amount-=1;
                bills++;
            }
        }
        System.out.println(bills);
    }
}
