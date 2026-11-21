class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        TreeMap<Integer,Integer>map=new TreeMap<>();
        Arrays.sort(hand);
        if(hand.length%groupSize!=0) return false;
        for(int i=0;i<hand.length;i++){
            map.put(hand[i],map.getOrDefault(hand[i],0)+1);
        }
        
        int cnt=0;
        while(!map.isEmpty()){
            cnt=0;
            int num=map.firstKey();
            while(cnt<groupSize){
                if(!map.containsKey(num)){
                    return false;
                }
               map.put(num,map.get(num)-1);
               if(map.get(num)==0){
                map.remove(num);
               }
                num=num+1;
                cnt++;
            }
            
        
        }

        return true;
    }
}