import java.util.Scanner;

public class PashmakAndFlowers_459B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int maxCount=0;
        int minCount=0;
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            if(a<min){
                min=a;
                minCount=1;
            } else if (a==min) {
                minCount++;
            }
            if (a>max) {
                max=a;
                maxCount=1;
            } else if (a==max) {
                maxCount++;
            }
        }
        System.out.print((max-min)+" ");
        if (max==min){
            System.out.println((long) maxCount*(maxCount-1)/2);
        }else {
            System.out.println((long) maxCount*minCount);
        }

    }
}
