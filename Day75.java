import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HorseShoe_228A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Set<Integer> set=new HashSet<>();
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        set.add(a);
        set.add(b);
        set.add(c);
        set.add(d);
        System.out.println(4-set.size());
    }
}
