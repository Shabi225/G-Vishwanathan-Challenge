import java.util.Scanner;

public class DivisibilityProblem_1328A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int[][] nums=new int[t][2];
        int[] moves=new int[t];
        for(int i=0;i<t;i++){
            nums[i][0]=sc.nextInt();
            nums[i][1]=sc.nextInt();
            if(nums[i][0]%nums[i][1]!=0){
                int m=nums[i][1]-(nums[i][0]%nums[i][1]);
                moves[i]=m;
            }
            else {
                moves[i]=0;
            }

        }
        for(int i=0;i<t;i++){
            System.out.println(moves[i]);
        }
    }
}
