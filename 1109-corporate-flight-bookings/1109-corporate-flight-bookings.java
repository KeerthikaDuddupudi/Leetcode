class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int ans[]=new int[n];
        for(int[] arr:bookings){
            int f=arr[0];
            int l=arr[1];
            int s=arr[2];
            ans[f-1]+=s;
            if(l<n) ans[l]-=s;
        }
        for(int i=1;i<n;i++){
            ans[i]=ans[i-1]+ans[i];
        }
        return ans;
        
    }
}