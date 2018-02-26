class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for (int n : nums) // for each n in nums
            if (i == 0 || n > nums[i-1])
                nums[i++] = n;
        return i;
    }
}