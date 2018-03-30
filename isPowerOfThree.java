    public boolean isPowerOfThree(int n) {
        if (n < 0) return false;
        double result = Math.log10(n) / Math.log10(3);
        return result % 1 == 0; 
    }