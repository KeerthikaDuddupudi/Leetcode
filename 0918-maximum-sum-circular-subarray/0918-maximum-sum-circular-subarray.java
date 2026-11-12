class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int cmax=0;
        int cmin=0;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int ts=0;

        for(int i=0;i<nums.length;i++){
            ts+=nums[i];
            cmax=Math.max(nums[i],cmax+nums[i]);
            max=Math.max(max,cmax);
            cmin=Math.min(nums[i],cmin+nums[i]);
            min=Math.min(min,cmin);
        }
        int maxi=Math.max(max,ts-min);
        if(max<0){
            return max;
        }

        return maxi;
    }
}