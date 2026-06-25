class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        
        for (int x = 0; x < n; x++) {
            boolean Sorted = true;
            for (int i = 0; i < n - 1; i++) {
                if (nums[(i + x) % n] > nums[(i + 1 + x) % n]) {
                    Sorted = false;
                    break;
                }
            }
            if (Sorted) return true;
        }
        return false;
    }
}
