/*Coeforces 136A*/
import java.util.Scanner;

public class Presents_136A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] giftReceiver=new int[n+1];
        int[] giftGiver=new int[n+1];
        for(int i=1;i<n+1;i++){
            giftReceiver[i]=sc.nextInt();
            giftGiver[giftReceiver[i]]=i;
        }
        for (int i=1;i<n+1;i++){
            System.out.print(giftGiver[i]+" ");
        }
    }
}
