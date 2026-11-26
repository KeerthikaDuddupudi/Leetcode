class Solution {
    public int minOperations(int[] nums, int x) {
        int maxlength=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,-1);
        int sum=0;
        int tsum=0;
        for(int n:nums){
            tsum+=n;
        }
        int t=tsum-x;
        if(t==0){
            return nums.length;
        }
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(map.containsKey(sum-t)){
                maxlength=Math.max(maxlength,i-map.get(sum-t));
            }
            map.put(sum,i);

        }
        if(maxlength==0){
            return -1;
        }
        return nums.length-maxlength;
    }
}