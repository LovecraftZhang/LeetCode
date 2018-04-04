    public int hammingDistance(int x, int y) {
        int difference = 0;
        int bitxor = x ^ y;
        
        while (bitxor > 0){
            if (bitxor % 2 == 1){
                difference++;
            }
            bitxor = bitxor >>> 1;
        }
        
        return difference;
    }