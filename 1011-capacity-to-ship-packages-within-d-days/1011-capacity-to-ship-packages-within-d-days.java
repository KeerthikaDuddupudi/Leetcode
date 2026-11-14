class Solution {
    public int nodays(int[]weights,int mid){
       int t=1;
       int sum=0;
       for(int i=0;i<weights.length;i++){

        if(sum+weights[i]>mid){
            t++;
            sum=weights[i];
        }else{
            sum+=weights[i];
        }
       }
        return t;
    }
    public int shipWithinDays(int[] weights, int days) {
        int l=0;
        int h=0;
        for(int i=0;i<weights.length;i++){
            l=Math.max(l,weights[i]);
            h+=weights[i];
        }
        while(l<=h){
            int mid=l+(h-l)/2;
            if(nodays(weights,mid)<=days){
                h=mid-1;
            }else{
                l=mid+1;
            }
        }
        return l;
    }
}