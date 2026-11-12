class Solution {
    public int subarrays(int [] nums,int k){
         int l=0;
        int cnt=0;
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2!=0){
                cnt++;
            }
                while(cnt>k){
                   if(nums[l]%2!=0){
                    cnt--;
                   }
                   l++;
                
            }
            c+=i-l+1;
           
        }
         return c;
    }
    public int numberOfSubarrays(int[] nums, int k) {
        return subarrays(nums,k)-subarrays(nums,k-1);
       

        
    }
}