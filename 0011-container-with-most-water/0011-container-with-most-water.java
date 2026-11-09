class Solution {
    public int maxArea(int[] height) {
       int l=0;
       int r=height.length-1;
       int gap=0;
       int water=0;
       int max=Integer.MIN_VALUE;
       while(l<r){
        gap=r-l;
        int min=Math.min(height[l],height[r]);
        max=Math.max(max,gap*min);
        if(height[l]<height[r]){
            l++;
        }else{
            r--;
        }
       }
       return max;
}
}