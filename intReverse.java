public int reverse(int x) {
        boolean positive = true;
        if (x<0){
            x = 0 -x;
            positive = false;
        }
        
        char[] charArray = Integer.toString(x).toCharArray();
        
        // recerse
        int i = 0;
        int j = charArray.length - 1;
        while (i < j) {
            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
            i++;
            j--;
        }
        
        try {
            int result = Integer.parseInt(new String(charArray));
            if(positive){
                return result;
            } else {
                return 0 - result;
            }
        } catch(NumberFormatException e){
            return 0;
        }      
        
    }