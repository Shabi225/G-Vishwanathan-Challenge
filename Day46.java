/*Leetcode 1331: Rank Transform of an Array*/
class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] dummy=arr.clone();
        Arrays.sort(dummy);
        int m=0;
        for(int e:dummy){
            if(m==0 || dummy[m-1]!=e){
                dummy[m++]=e;
            }
        }
        int[] unique=Arrays.copyOf(dummy,m);
        for(int i=0;i<arr.length;i++){
            arr[i]=Arrays.binarySearch(unique,arr[i])+1;
        }
        return arr;
    }
}
