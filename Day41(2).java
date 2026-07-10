import java.util.Scanner;

public class cAPSlOCK_131A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String word=sc.next();
        StringBuilder ans=new StringBuilder();
        char first=word.charAt(0);
        String rest=word.substring(1);
        if((Character.isLowerCase(first) && rest.toUpperCase().equals(rest))){
            ans.append(Character.toUpperCase(first));
            ans.append(rest.toLowerCase());
            System.out.println(ans.toString());
        }
        else if (word.toUpperCase().equals(word)) {
            ans.append(word.toLowerCase());
            System.out.println(ans.toString());
        }
        else {
            ans.append(word);
            System.out.println(ans.toString());
        }

    }
}
