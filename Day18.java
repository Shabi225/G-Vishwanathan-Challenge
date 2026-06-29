/*Codeforces 282A Bit++*/
import java.util.Scanner;

public class Bit_282A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=0;
        int noOfOps=sc.nextInt();
        String[] ops=new String[noOfOps];
        for (int i=0;i<noOfOps;i++){
            ops[i]=sc.next();
        }
        for (int i=0;i<noOfOps;i++){
            if(ops[i].equals("++X")){
                ++x;
            }
            else if(ops[i].equals("X++")){
                x++;
            }
            else if(ops[i].equals("--X")){
                --x;
            }
            else if(ops[i].equals("X--")){
                x--;
            }
        }
        System.out.println(x);
    }
}
