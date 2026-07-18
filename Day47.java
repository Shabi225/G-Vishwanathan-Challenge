/*Leetcode 3658: GCD of odd and even sums*/
class Solution {
    static int gcd(int a,int b){
        int t=0;
        while(b!=0){
            t=b;
            b=a%b;
            a=t;
        }
        return a;
    }
    public int gcdOfOddEvenSums(int n) {
        int sumOdd=0;
        int sumEven=0;
        for(int i=0;i<n;i++){
            sumOdd+=2*1-1;
            sumEven+=2*i;
        }
        int ans=gcd(sumOdd,sumEven);
        return ans;
    }
}
