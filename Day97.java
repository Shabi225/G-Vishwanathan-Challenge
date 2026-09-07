import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Dragons_230A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int kiritoStrength=sc.nextInt();
        int n=sc.nextInt();
        TreeMap<Integer,Integer> dragons=new TreeMap<>();
        for(int i=0;i<n;i++){
            int dragonStrength=sc.nextInt();
            int dragonBonus=sc.nextInt();
            dragons.put(dragonStrength,
                    dragons.getOrDefault(dragonStrength, 0) + dragonBonus);
        }
        for(Map.Entry<Integer,Integer> entry:dragons.entrySet()){
            if(kiritoStrength>entry.getKey()){
                kiritoStrength+=entry.getValue();
            }else {
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");
    }
}
