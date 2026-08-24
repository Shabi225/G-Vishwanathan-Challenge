import java.util.Scanner;

public class LuckySumOfDigits_109A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        int b=0;
        boolean found=false;
        for(b=n/7;b>=0;b--){
            int remaining=n-7*b;
            if(remaining%4==0){
                a=remaining/4;
                found=true;
                break;
            }
        }
        StringBuilder ans=new StringBuilder();
        if(found){
            while(a>0){
                ans.append('4');
                a--;
            }
            while(b>0){
                ans.append('7');
                b--;
            }
            System.out.println(ans.toString());
        }else {
            System.out.println("-1");
        }
    }
}
