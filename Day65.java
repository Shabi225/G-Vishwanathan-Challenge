import java.util.Scanner;
 
public class ValeraAndPlates_369A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int k=sc.nextInt();
        int dish1=0;
        int dish2=0;
        for(int i=0;i<n;i++){
            int e=sc.nextInt();
            if(e==1){
                dish1++;
            }
            else if (e==2) {
                dish2++;
            }
        }
        int washes=0;
        while (dish1>m){
            washes++;
            dish1--;
        }
        m=m-dish1;
        while (dish2>(m+k)){
            washes++;
            dish2--;
        }
        System.out.println(washes);
    }
}
