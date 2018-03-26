    private int[] nums;
    private Random random;

    public Solution(int[] nums) {
        this.nums = nums;
        random = new Random();
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return nums;
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        if(nums == null) return null;
        int[] a = nums.clone();
        for(int j = 0; j < a.length; j++) {
            int i = random.nextInt(j + 1);
            swap(a, i, j);
//(1) If i == j, nums[j] does not need to change its position, which has probability 1/(1+j).
//(2) if i !=j, nums[j] needs to be swapped with nums[i]. The probability of any number x in the range //[0,j-1] to be at position j = nums[j] changes its position * x is at position i
//= (1-1/(1+j)) * (1/j) = 1/(1+j)
//Each number has equal probability to be at any position.
        }
        return a;
    }
    
    private void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }