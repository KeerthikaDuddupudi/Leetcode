class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[1],b[1]));
        int end=intervals[0][1];
        int cnt=0;
        for(int i=1;i<intervals.length;i++){
            int s=intervals[i][0];
            int e=intervals[i][1];
            if(end>s){
                cnt++;
            }else{
                end=e;
            }
        }
        return cnt;
    }
}