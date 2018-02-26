public int singleNumber(int[] nums) {
        if (nums.length == 1) return nums[0];
        
        int result = nums[0]; 
        int n = nums.length;
        for(int i=1;i<n;i++){
            result= result^nums[i];  // Get the xor of all elements
        }
        return result;
    }