/*Codeforces 467A*/
import java.util.Scanner;

public class GeorgeAndAccommodation_467A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [][] rooms=new int[n][2];
        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
                rooms[i][j]=sc.nextInt();
            }
        }
        int roomCount=0;
        for(int row[]:rooms){
            if(row[1]-row[0]>=2){
                roomCount++;
            }
        }
        System.out.println(roomCount);
    }
}
