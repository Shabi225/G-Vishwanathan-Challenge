/*Codeforces 266B*/
import java.util.Scanner;

public class QueueAtTheSchool_266B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t= sc.nextInt();
        String arrangement= sc.next();
        char[] letters=arrangement.toCharArray();
        while(t>0){
            int i=0;
            while (i<n){
                if(i+1<n){
                    if(letters[i]=='B'&&letters[i+1]=='G'){
                        char temp=letters[i];
                        letters[i]=letters[i+1];
                        letters[i+1]=temp;
                        i++;
                    }
                }
                i++;
            }
            t--;
        }
        StringBuilder ans=new StringBuilder();
        int j=0;
        while (j<n){
            ans.append(letters[j]);
            j++;
        }
        System.out.println(ans.toString());
    }
}
