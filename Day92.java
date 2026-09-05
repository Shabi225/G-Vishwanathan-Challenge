import java.util.Scanner;

public class CaptainFlintAndCrewRecruitment_1388A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int[] nearlyPrimes={6,10,14,15,21,35};
        for(int i=0;i<t;i++){
            int n= sc.nextInt();
            if(n<=30){
                System.out.println("NO");
            }else {
                System.out.println("YES");
                for(int j=0;j<3;j++){
                    n-=nearlyPrimes[j];
                    if ((n==6||n==10||n==14||n==15||n==21||n==35) && j==2){
                        n=n+nearlyPrimes[j]-nearlyPrimes[j+1];
                        System.out.print(nearlyPrimes[j+1]+" ");
                    }else {
                        System.out.print(nearlyPrimes[j]+" ");
                    }
                }
                System.out.println(n);
            }

        }
    }
}
