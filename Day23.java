/*Codeforces 617A*/
import java.util.Scanner;

public class Elephant_617A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int distance=sc.nextInt();
        int distCovered=0;
        int steps=0;
        while(distCovered<distance){
            distCovered+=5;
            steps++;
        }
        while(distCovered<distance){
            switch (distance-distCovered){
                case 4:
                    distCovered+=4;
                    steps++;
                    break;
                case 3:
                    distCovered+=3;
                    steps++;
                    break;
                case 2:
                    distCovered+=2;
                    steps++;
                    break;
                case 1:
                    distCovered+=1;
                    steps++;
                    break;
            }
        }
        System.out.println(steps);
    }
}
