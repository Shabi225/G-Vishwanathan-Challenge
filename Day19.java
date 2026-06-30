/*Codeforces 50A*/
import java.util.Scanner;

public class DominoPiling_50A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int M =sc.nextInt();
        int N =sc.nextInt();
        int totalSquares=M*N;
        int totalDominoes=totalSquares/2;
        System.out.println(totalDominoes);
    }
}
