class Solution {
    public int ub(int nums[],int t){
        int l=0;
        int h=nums.length-1;
        int ans=-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(nums[mid]==t){
                ans=mid;
                l=mid+1;
            }else if(nums[mid]<t){
                l=mid+1;
            }else{
                h=mid-1;
            }
        }
        return ans;
    }
    public int lb(int nums[],int t){
        int l=0;
        int h=nums.length-1;
        int ans=-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(nums[mid]==t){
                ans=mid;
                h=mid-1;
            }else if(nums[mid]<t){
                l=mid+1;
            }else{
                h=mid-1;
            }
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        int a=lb(nums,target);
        int b=ub(nums,target);
        return new int[]{a,b};
        
    }
}