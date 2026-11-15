class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int a=nums1.length;
        int b=nums2.length;
        if(a>b) return findMedianSortedArrays(nums2,nums1);
        int l=0;
        int h=nums1.length;
        int left=(a+b+1)/2;
        while(l<=h){
            int mid1=l+(h-l)/2;
            int mid2=left-mid1;
            int l1=(mid1==0)?Integer.MIN_VALUE:nums1[mid1-1];
            int l2=(mid2==0)?Integer.MIN_VALUE:nums2[mid2-1];
            int r1=(mid1==a)?Integer.MAX_VALUE:nums1[mid1];
            int r2=(mid2==b)?Integer.MAX_VALUE:nums2[mid2];
            if(l1>r2){
                h=mid1-1;
            }else if(l2>r1){
                l=mid1+1;
            }else{
                if((a+b)%2 ==1) return Math.max(l1,l2);
                return ((double)Math.max(l1,l2)+Math.min(r1,r2))/2;
            }

        }

        return (double)-1;
    }
}