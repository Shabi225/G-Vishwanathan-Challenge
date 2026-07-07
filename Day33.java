/*Codeforces 61A*/
import java.math.BigInteger;
import java.util.Scanner;

public class UltraFastMathematician_61A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String binary1=sc.next();
        String binary2=sc.next();
        BigInteger num1=new BigInteger(binary1,2);
        BigInteger num2=new BigInteger(binary2,2);
        BigInteger ans=num1.xor(num2);
        String binaryResult=ans.toString(2);
        int targetLen=binary1.length();
        String paddedResult=String.format("%"+targetLen+"s",binaryResult).replace(' ','0');
        System.out.println(paddedResult);
    }
}
