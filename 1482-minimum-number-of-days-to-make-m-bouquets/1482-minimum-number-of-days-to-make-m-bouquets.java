class Solution {
    public boolean bloom(int arr[],int m,int k,int mid){
        int count=0;
        int c=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=mid){
                c++;
                if(c==k){
                    count++;
                    c=0;
                }
            }else{
                c=0;
            }
        }
        return count>=m;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int l=Integer.MAX_VALUE;
        int h=Integer.MIN_VALUE;
        if(bloomDay.length<m*k){
            return -1;
        }
        for(int i=0;i<bloomDay.length;i++){
            l=Math.min(l,bloomDay[i]);
            h=Math.max(h,bloomDay[i]);
        }
        int ans=-1;
        
        while(l<=h){
            int mid=l+(h-l)/2;
            if(bloom(bloomDay,m,k,mid)){
                ans=mid;
                h=mid-1;
            }else{
                l=mid+1;
            }
        }
      return ans;
        
    }
}