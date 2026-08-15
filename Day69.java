import java.util.Arrays;
import java.util.Scanner;

public class TPrimes_230B {
    static boolean [] prime=new boolean[1000001];

    static void sieve() {
        Arrays.fill(prime, true);
        prime[0]=false;
        prime[1]=false;
        for (int i = 2; i*i<= 1000000; i++) {
            if (prime[i]){
                for(int j=i*i; j<=1000000;j+=i){
                    prime[j]=false;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sieve();
        for(int i=0;i<n;i++){
            long a=sc.nextLong();
            long root= (long) Math.sqrt(a);

            while ((root+1)*(root+1)<=a) root++;
            while (root*root > a) root--;

            if(root*root==a && prime[(int)root]){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
