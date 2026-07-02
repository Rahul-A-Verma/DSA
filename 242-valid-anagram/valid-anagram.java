class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> charCounts = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            charCounts.put(ch, charCounts.getOrDefault(ch, 0) + 1);
        }
        
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            
            if (!charCounts.containsKey(ch)) {
                return false;
            }
            
            charCounts.put(ch, charCounts.get(ch) - 1);
            
            if (charCounts.get(ch) < 0) {
                return false;
            }
        }
        
        return true;
    }
}