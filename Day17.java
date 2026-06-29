/*Codeforces 266A*/

import java.util.Scanner;

public class StonesOnTheTable_266A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int stoneCount=sc.nextInt();
        String colours=sc.next();
        int count=0;
        for(int i=0;i<stoneCount-1;i++){
            if(colours.charAt(i)==colours.charAt(i+1)){
                count++;
            }
        }
        System.out.println(count);
    }
}
