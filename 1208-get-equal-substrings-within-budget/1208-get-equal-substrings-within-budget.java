class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int l=0;
        int sum=0;
        int max=0;
        for(int i=0;i<s.length();i++){
            sum+=Math.abs(s.charAt(i)-t.charAt(i));
            while(sum>maxCost){
               sum-=Math.abs(s.charAt(l)-t.charAt(l));
               l++;
            }
            max=Math.max(max,i-l+1);
        }
        return max;
    }
}