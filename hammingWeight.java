    public int hammingWeight(int n) {
	    int ones = 0;
    	while(n!=0) {
            
/*n in bit AND with 1 (that is represented as
00000000000000000000000000000001), and if this operation result is 1,
that means that the last bit of the input integer is 1. Thus we add it to the 1s count.
 */
    		ones = ones + (n & 1);
    		n = n>>>1;
    	}
    	return ones;
    }