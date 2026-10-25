class Solution {
    public boolean isVowel(Character ch){
        return ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u';
    }
    
    public int maxVowels(String s, int k) {
        int l=0;
        int cnt=0;
        int max=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(i-l+1>k){
                char ch1=s.charAt(l);
                if(isVowel(ch1)){
                    cnt--;
                }
                l++;
            }
            if(isVowel(ch)){
                cnt++;
            }
            max=Math.max(max,cnt);
        }
        return max;
    }
}