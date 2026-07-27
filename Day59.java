import java.util.Scanner;

public class SerejaAndDima_381A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] cards=new int[n];
        for (int i=0;i<n;i++){
            cards[i]=sc.nextInt();
        }
        int serejaScore=0;
        int dimaScore=0;
        int i=0;
        int j=n-1;
        boolean serejaTurn=true;
        while (i <= j ){
            int picked;
            if(cards[j]>cards[i]){
                picked=cards[j--];
            }else {
                picked=cards[i++];
            }
            if(serejaTurn){
                serejaScore+=picked;
            }else {
                dimaScore+=picked;
            }
            serejaTurn=!serejaTurn;
        }

        System.out.println(serejaScore+" "+dimaScore);
    }
}
