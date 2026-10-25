class Solution {
    public double findMaxAverage(int[] nums, int k) {
       int l=0;
       double sum=0;
       for(int i=0;i<k;i++){
        sum+=nums[i];
       }
       double avg=0.0;
       double max=sum/k;
       for(int i=k;i<nums.length;i++){
        sum-=nums[l];
        l++;
        sum+=nums[i];
        avg=sum/k;
        max=Math.max(max,avg);
       }
        return max;
    }
}