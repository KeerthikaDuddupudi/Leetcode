class Solution {
    public long maxSpeed(int [] piles,int mid){
        long cnt=0;
        for(int i=0;i<piles.length;i++){
            cnt+=((long)piles[i]+mid-1)/mid;
        }
        return cnt;

    }
    public int minEatingSpeed(int[] piles, int h) {
        int l=1;
        int r=0;
        for(int i=0;i<piles.length;i++){
            
            r=Math.max(r,piles[i]);
        }
        while(l<=r){
            int mid=l+(r-l)/2;
            if(maxSpeed(piles,mid)<=h){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }

        return l;
    }
}