import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class JzzhuAndChildren_450A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        Queue<Integer> q=new LinkedList<>();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            q.offer(i);
        }
        int ans=-1;
        while (!q.isEmpty()) {
            int child=q.poll();
            if (a[child] - m > 0) {
                q.offer(child);
                a[child]-=m;
            } else {
                ans=child;
            }
        }
        System.out.println(ans+1);
    }
}
