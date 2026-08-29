import java.util.Scanner;

public class Domino_353A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] up=new int[n];
        int[] down=new int[n];
        int upSum=0;
        int downSum=0;
        for (int i=0;i<n;i++){
            up[i]=sc.nextInt();
            upSum+=up[i];
            down[i]=sc.nextInt();
            downSum+=down[i];
        }
        int time=0;
        if(upSum%2==0 && downSum%2==0){
            System.out.println(0);
        }
        else if (upSum%2!=0 && downSum%2!=0) {
            int i=0;
            boolean found=false;
            while (i<n){
                upSum=upSum-up[i]+down[i];
                downSum=downSum+up[i]-down[i];
                time++;

                if(upSum%2==0 && downSum%2==0){
                    System.out.println(time);
                    found=true;
                    break;
                }
                else {
                    upSum=upSum+up[i]-down[i];
                    downSum=downSum-up[i]+down[i];
                    time--;
                }
                i++;
            }
            if(!found){
                System.out.println(-1);
            }
        }
        else {
            System.out.println(-1);
        }
    }
}
