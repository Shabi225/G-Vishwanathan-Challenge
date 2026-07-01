/*Codeforces 160A*/
import java.util.*;

public class Twins_160A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int noOfCoins=sc.nextInt();
        Integer[] value=new Integer[noOfCoins];
        for(int i=0;i<noOfCoins;i++){
            value[i]= sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<noOfCoins;i++){
            sum+=value[i];
        }
        Arrays.sort(value, Collections.reverseOrder());
        int mySum=0;
        int i=0;
        int ans=0;
        while(sum>=mySum){
            mySum+=value[i];
            sum-=value[i];
            ans=i+1;
            i++;
        }
        System.out.println(ans);
    }
}
