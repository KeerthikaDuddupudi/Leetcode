class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        
        Arrays.sort(boxTypes,(a,b)->b[1]-a[1]);
        int sum=0;
        for(int[] box:boxTypes){
            int a=box[0];
            int b=box[1];
            if(a<=truckSize){
                sum+=a*b;
                truckSize-=a;
            }else{
                sum+=truckSize*b;
                break;
            }
        }
        return sum;
    }
}