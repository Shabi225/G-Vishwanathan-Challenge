import java.util.Scanner;

public class FedorAndNewGame_467B {
    static int difference(int player,int fedor){
        int x=player^fedor;
        int count=0;
        while (x>0){
            if((x&1)==1){
                count++;
            }
            x>>=1;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int k=sc.nextInt();
        int[] army=new int[m];
        for(int i=0;i<m;i++){
            army[i]=sc.nextInt();
        }
        int fedor=sc.nextInt();
        int playerCount=0;
        for (int i=0;i<m;i++){
            int diff=difference(army[i],fedor);
            if(diff<=k){
                playerCount++;
            }
        }
        System.out.println(playerCount);
    }
}
