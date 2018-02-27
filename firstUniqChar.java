public int firstUniqChar(String s) {
        // initialize frequency array
        int freq [] = new int[26];
        for(int i = 0; i < s.length(); i ++){
            // s.charAt(i) - 'a': shift 'a' ascii/unicode value
            // so 'a' - 'z' = 0 - 26
            freq [s.charAt(i) - 'a'] ++; // increment the count
        }
        
        for(int i = 0; i < s.length(); i ++){
            if(freq [s.charAt(i) - 'a'] == 1){
                return i;
            }
        }
        return -1;
    }