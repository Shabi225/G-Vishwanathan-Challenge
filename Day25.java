/*Codeforces 59A*/
import java.util.Scanner;

public class Word_59A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String word=sc.next();
        int length=word.length();
        int upperCaseCount=0;
        int lowerCaseCount=0;
        for(int i=0;i<length;i++){
            char c=word.charAt(i);
            if(Character.isUpperCase(c)){
                upperCaseCount++;
            }
            else if(Character.isLowerCase(c)){
                lowerCaseCount++;
            }
        }
        if(upperCaseCount>lowerCaseCount){
            System.out.println(word.toUpperCase());
        }
        else if(upperCaseCount<=lowerCaseCount){
            System.out.println(word.toLowerCase());
        }

    }
}
