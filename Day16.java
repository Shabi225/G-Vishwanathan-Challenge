/*codeforces 263A*/
import java.util.Scanner;

public class BeautifulMatrix_263A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [][] matrix=new int[5][5];
        int rowp=0;
        int colp=0;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                matrix[i][j]=sc.nextInt();
                if (matrix[i][j]==1){
                    rowp=i;
                    colp=j;
                }
            }
        }
        int moves=0;
        while (rowp>2)  {
            rowp--;
            moves++;
        }
        while (rowp<2){
            rowp++;
            moves++;
        }
        while (colp<2){
            colp++;
            moves++;
        }
        while (colp>2) {
            colp--;
            moves++;
        }
        System.out.println(moves);
    }
}
