/*Codeforces 344A*/
import java.util.Scanner;

public class Magnets_344A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int noOfMagnets=sc.nextInt();
        int[] magOrientation=new int[noOfMagnets];
        for(int i=0; i<noOfMagnets; i++){
            magOrientation[i]=sc.nextInt();
        }
        int groups=1;
        for (int i=0;i<noOfMagnets-1;i++){
            if(magOrientation[i]%10==0 && magOrientation[i+1]%10!=0){
                groups++;
            }
            else if (magOrientation[i]%10!=0 && magOrientation[i+1]%10==0) {
                groups++;
            }
        }
        System.out.println(groups);
    }
}
