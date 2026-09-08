import java.util.Scanner;

public class PoliceRecruits_427A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int crimeCount=0;
        while (n-->0){
            int entry=sc.nextInt();
            if(sum>0 && entry<0){
                sum+=entry;
            }else if (entry>=0){
                sum+=entry;
            }else {
                crimeCount++;
            }
        }
        System.out.println(crimeCount);
    }
}
