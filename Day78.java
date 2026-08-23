import java.util.Scanner;

public class TavasAndSaDDas_535B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int pos=0;
        int digiCnt=0;
        int i=0;
        while(n>0){
            int digit=n%10;
            if(digit==7){
                pos+= (int) Math.pow(2,i);
            }
            n=n/10;
            digiCnt++;
            i++;
        }
        int prevDigits=0;
        for (int j=1;j<digiCnt;j++){
            prevDigits+=(int) Math.pow(2,j);
        }
        int position=prevDigits+pos+1;
        System.out.println(position);
    }
}
