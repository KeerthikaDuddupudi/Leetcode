class Solution {
    public boolean split(int []nums,int k,int mid){
        int cnt=1;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(sum+nums[i]>mid){
              cnt++;
              sum=nums[i];
            }else{
                sum+=nums[i];
            }
        }
        return cnt<=k;
    }
    public int splitArray(int[] nums, int k) {
        int l=1;
        int h=0;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            l=Math.max(l,nums[i]);
            h+=nums[i];
        }
        while(l<=h){
            int mid=l+(h-l)/2;
            if(split(nums,k,mid)){
                ans=mid;
                h=mid-1;
            }else{
                l=mid+1;
            }
        }
        return ans;
    }
}