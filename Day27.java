/*Codeforces 200B*/
import java.util.Scanner;

public class Drinks_200B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int noOfDrinks=sc.nextInt();
        int[] percentage=new int[noOfDrinks];
        for(int i=0; i<noOfDrinks;i++){
            percentage[i]=sc.nextInt();
        }
        double precentSum=0;
        for(int percent:percentage){
            precentSum+=percent;
        }
        System.out.println(precentSum/noOfDrinks);
    }
}
