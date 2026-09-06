class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap<Character,Integer>m1=new HashMap<>();
        HashMap<Character,Integer>m2=new HashMap<>();
        for(char ch:s.toCharArray())
        m1.put(ch,m1.getOrDefault(ch,0)+1);
        for(char ch:t.toCharArray())
        m2.put(ch,m2.getOrDefault(ch,0)+1);
        for(char ch:m1.keySet()){
            if(!m2.containsKey(ch) || !m2.get(ch).equals(m1.get(ch))) return false;
        }
        for(char ch:m2.keySet()){
            if(!m1.containsKey(ch) || !m2.get(ch).equals(m1.get(ch))) return false;
        }
        return true;
    }
}
