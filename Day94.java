import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SoldierAndCards_546C {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int p1= sc.nextInt();
        Queue<Integer> player1=new LinkedList<>();
        for (int i=0;i<p1;i++){
            int entry=sc.nextInt();
            player1.offer(entry);
        }
        int p2= sc.nextInt();
        Queue<Integer> player2=new LinkedList<>();
        for (int i=0;i<p2;i++){
            int entry=sc.nextInt();
            player2.offer(entry);
        }
        int fightCount=0;
        HashSet<String> seen=new HashSet<>();
        while (!player1.isEmpty() && !player2.isEmpty()){
            String state=player1.toString()+"|"+player2.toString();
            if (seen.contains(state)){
                System.out.println(-1);
                return;
            }
            seen.add(state);
            int card1=player1.poll();
            int card2=player2.poll();
            if(card1>card2){
                player1.offer(card2);
                player1.offer(card1);
            } else {
                player2.offer(card1);
                player2.offer(card2);
            }
            fightCount++;
        }
        if(player1.isEmpty()){
            System.out.println(fightCount+" 2");
        } else if (player2.isEmpty()) {
            System.out.println(fightCount+" 1");
        }
    }
}
