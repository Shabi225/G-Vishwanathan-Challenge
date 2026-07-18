/*Codeforces 69A*/
import java.util.Scanner;

public class YoungPhysicist_69A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] vectors=new int[n][3];
        for(int i=0;i<n;i++){
            vectors[i][0]=sc.nextInt();
            vectors[i][1]=sc.nextInt();
            vectors[i][2]=sc.nextInt();
        }
        int x=0,y=0,z=0;
        for(int i=0;i<n;i++){
            x+=vectors[i][0];
            y+=vectors[i][1];
            z+=vectors[i][2];
        }
        if(x==0 && y==0 && z==0){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
