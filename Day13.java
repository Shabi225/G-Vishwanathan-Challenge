/*Codeforces 339A*/
import java.util.*;

public class HelpfulMaths_339A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String sum=sc.next();
        StringBuilder ans=new StringBuilder();
        String[] nums=sum.split("\\+");
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            ans.append(nums[i]);
            if(i==nums.length-1)    continue;
            ans.append("+");
        }
        System.out.println(ans.toString());
    }
}
