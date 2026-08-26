import java.util.Scanner;

public class LittleElephantAndBits_258A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int l=s.length();
        StringBuilder sb=new StringBuilder();
        int index=Integer.MAX_VALUE;
        for(int i=0;i<l;i++){
            if(s.charAt(i)=='0'){
                index=Math.min(index,i);
            }
            sb.append(s.charAt(i));
        }
        if(index!=Integer.MAX_VALUE){
            sb.deleteCharAt(index);
        }else {
            sb.deleteCharAt(sb.length()-1);
        }
        System.out.println(sb);
    }
}
