class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int cnt=0;
        if(flowerbed.length==1){
            if(flowerbed[0]==0){
                cnt++;
            }
            return cnt>=n;
        }
        for(int i=0;i<flowerbed.length;i++){
            if(flowerbed[i]==0){
                if(i==0 && flowerbed[i+1]!=1){
                    flowerbed[i]=1;
                    cnt++;
                }else if(i==flowerbed.length-1 && flowerbed[i-1]!=1){
                    flowerbed[i]=1;
                    cnt++;
                }else if(i>0 && i<flowerbed.length-1 && flowerbed[i-1] != 1 && flowerbed[i+1] != 1){
                    flowerbed[i]=1;
                    cnt++;
                }
            }
        }
        return cnt>=n;
    }
}