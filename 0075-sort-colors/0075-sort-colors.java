class Solution {
    public void swap(int nums[],int l,int r){
        int temp=nums[l];
        nums[l]=nums[r];
        nums[r]=temp;
    }
    public void sortColors(int[] nums) {
        int l=0;
        int m=0;
        int h=nums.length-1;
        while(m<=h){
            if(nums[m]==0){
                swap(nums,l,m);
                l++;
                m++;
            }else if(nums[m]==1){
                m++;
            }else{
                swap(nums,h,m);
                h--;
            }
        }
        
    }
}