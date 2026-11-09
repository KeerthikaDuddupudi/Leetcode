class Solution {
    public int trap(int[] height) {
        int l=0;
        int r=height.length-1;
        int maxl=height[l];
        int maxr=height[r];
        int cnt=0;
        while(l<=r){
            if(height[l]<height[r]){
                if(height[l]>maxl){
                    maxl=height[l];
                }else{
                    cnt+=maxl-height[l];
                }
                l++;
            }else{
               if(height[r]>maxr){
                    maxr=height[r];
                }else{
                    cnt+=maxr-height[r];
                }
                r--;; 
            }
        }
        return cnt;
        
    }
}