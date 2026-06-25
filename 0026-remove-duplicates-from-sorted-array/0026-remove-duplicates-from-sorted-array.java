class Solution {
    public int removeDuplicates(int[] nums) {
        int ans = 0;
        for(int num : nums){
            if(ans == 0 || num != nums[ans-1]){
                nums[ans] = num;
                ans +=1;
                
            }

        }
        return ans;
    }
}