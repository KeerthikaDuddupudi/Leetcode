class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(a,b)->Integer.compare(a[1],b[1]));
        int cnt=0;
        long end=Long.MIN_VALUE;
        for(int p[]:points){
            int s=p[0];
            int e=p[1];
            if(end<s){
                cnt++;
                end=e;
            }
        }
        return cnt;
    }
}