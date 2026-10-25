class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int l=0;
        int sum=0;
        double avg=0.0;
        int cnt=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(i-l+1>k){
                sum-=arr[l];
                l++;
            }
            if(i-l+1==k){
                avg=(double)sum/k;
                if(avg>=threshold){
                    cnt++;
                }
            }
        }
       return cnt;
        
    }
}