class Solution {
    public int leastInterval(char[] tasks, int n) {
       int [] freq=new int[26];
       for(char ch:tasks){
        freq[ch-'A']++;
       }
       int maxfreq=0;
       for(int i=0;i<26;i++){
        maxfreq=Math.max(freq[i],maxfreq);
       }
       int cnt=0;
       for(int i=0;i<26;i++){
        if(freq[i]==maxfreq){
            cnt++;
        }
       }
        return Math.max((maxfreq-1)*(n+1)+cnt,tasks.length);
    }
}