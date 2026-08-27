import java.util.Scanner;

public class ThreePairwiseMaximums_1385A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0,b=0,c=0;
        for (int i=0;i<n;i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            int z=sc.nextInt();
            if(x==y && z<=x){
                a=x;
                c=z;
                b=z;
                System.out.println("YES");
                System.out.println(a+" "+b+" "+c);
            }
            else if(y==z && x<=y){
                c=y;
                a=x;
                b=x;
                System.out.println("YES");
                System.out.println(a+" "+b+" "+c);
            }
            else if (x==z && y<=x){
                b=z;
                c=y;
                a=y;
                System.out.println("YES");
                System.out.println(a+" "+b+" "+c);
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
