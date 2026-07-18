/*Leetcode 3867: GCD of formed pairs*/
class Solution {
    static int gcd(int a,int b){
        while(b!=0){
            int t=b;
            b=a%b;
            a=t; 
        }
        return a;
    }
    public long gcdSum(int[] nums) {
        int n=nums.length;
        int [] prefixGcd=new int[nums.length];
        int max=Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            max=Math.max(max,nums[i]);
            prefixGcd[i]=gcd(nums[i],max);
        }
        long sumGcd=0;
        int i=0;
        int j=n-1; 
        Arrays.sort(prefixGcd);
        while(i<j){
            long gcd=gcd(prefixGcd[i],prefixGcd[n-i-1]);
            sumGcd+=gcd;
            i++;
            j--;
        }
        return sumGcd;
    }
}
