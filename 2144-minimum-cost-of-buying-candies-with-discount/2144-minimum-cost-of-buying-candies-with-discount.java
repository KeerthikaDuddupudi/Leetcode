class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int sum=0;
        int cnt=0;
        for(int i=cost.length-1;i>=0;i--){
            sum+=cost[i];
            cnt++;
            if(cnt==2){
                i--;
                cnt=0;
            }
        }
        return sum;
    }
}