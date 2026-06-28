/*Codeforces 236A*/
import java.util.*;

 public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      String username=sc.next();
      Set<Character> unique=new HashSet<>();
      for (int i=0; i<username.length(); i++){
          unique.add(username.charAt(i));
      }

      if(unique.size()%2!=0){
          System.out.println("IGNORE HIM!");
      }
      else {
          System.out.println("CHAT WITH HER!");
      }
}
