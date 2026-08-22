import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class IWannaBeTheGuy_469A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int l1= sc.nextInt();
        Set<Integer> levels=new HashSet<>();
        for(int i=0;i<l1;i++){
            int x=sc.nextInt();
            levels.add(x);
        }
        int l2= sc.nextInt();
        for(int i=0;i<l2;i++){
            int y=sc.nextInt();
            levels.add(y);
        }

        if(levels.size()==n){
            System.out.println("I become the guy.");
        }else {
            System.out.println("Oh, my keyboard!");
        }
    }
}
