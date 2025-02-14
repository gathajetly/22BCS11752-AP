class Solution {
    public String longestNiceSubstring(String s) {
        if (s.length() < 2) return ""; 
        HashSet<Character> st = new HashSet<>();
        for (char ch : s.toCharArray()) {
            st.add(ch);
        }
        for (int i = 0; i < s.length(); i++) {
            if (st.contains(Character.toUpperCase(s.charAt(i))) && 
                st.contains(Character.toLowerCase(s.charAt(i)))) {
                continue; }
            String prev = longestNiceSubstring(s.substring(0, i));
            String next = longestNiceSubstring(s.substring(i + 1));

            return prev.length() >= next.length() ? prev : next;
        }
        
        return s; 
    }

}
