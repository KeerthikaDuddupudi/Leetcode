class Solution {
    public boolean closeStrings(String word1, String word2) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int freq1[]=new int[26];
        int freq2[]=new int[26];
        if(word1.length()!=word2.length()){
            return false;
        }
        for(int i=0;i<word1.length();i++){
            freq1[word1.charAt(i)-'a']++;
            freq2[word2.charAt(i)-'a']++;

        }
        for(int i=0;i<26;i++){
            if((freq1[i]==0)!=(freq2[i]==0)){
                return false;
            }
        }
        Arrays.sort(freq1);
        Arrays.sort(freq2);
        if(Arrays.equals(freq1,freq2)){
                return true;
            } 
        return false;
    }
}