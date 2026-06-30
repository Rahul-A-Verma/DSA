class Solution {
    public int repeatedStringMatch(String a, String b) {
        StringBuilder repeatedStr = new StringBuilder();
        int count = 0;
        
        while (repeatedStr.length() < b.length()) {
            repeatedStr.append(a);
            count++;
        }
        
        if (repeatedStr.indexOf(b) != -1) {
            return count;
        }
        
        repeatedStr.append(a);
        count++;
        
        if (repeatedStr.indexOf(b) != -1) {
            return count;
        }
        
        return -1;
    }
}