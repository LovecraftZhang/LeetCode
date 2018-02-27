public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        if (s.length() == 0) return true;
        
        char[] char_s = s.toCharArray();
        char[] char_t = t.toCharArray();
        Arrays.sort(char_s);
        Arrays.sort(char_t);
        for (int i = 0; i < char_s.length; i++){
            if(!(char_s[i] == char_t[i])){
                return false;
            }
        }
        return true;
    }