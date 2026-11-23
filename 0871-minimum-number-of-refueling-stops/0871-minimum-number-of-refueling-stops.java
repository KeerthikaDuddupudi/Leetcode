class Solution {
    public int minRefuelStops(int target, int startFuel, int[][] stations) {
        PriorityQueue<Integer>pq=new PriorityQueue(Collections.reverseOrder());
        int prev=0;
        int stops=0;
        int fuel=startFuel;
        for(int i=0;i<=stations.length;i++){
            int curr=(i==stations.length)?target:stations[i][0];
            fuel-=(curr-prev);
            while(fuel<0 && !pq.isEmpty()){
                fuel+=pq.poll();
                stops++;
            }
            if(fuel<0){
                return -1;
            }
            if(i<stations.length){
                pq.offer(stations[i][1]);
            }
            prev=curr;
        }
        return stops;
    }
}