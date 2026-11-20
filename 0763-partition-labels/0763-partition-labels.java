class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> list=new ArrayList<>();
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),i);
        }
        int end=0;
        int st=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            end=Math.max(end,map.get(ch));
            if(i==end){
             list.add(end-st+1);
             st=i+1;
            }

        }
        return list;
    }
}