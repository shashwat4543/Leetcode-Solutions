class Solution {
    void reverseArray(int[] arr, int start , int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public void rotate(int[] nums, int k) {
        int d = k%nums.length;
        if(nums.length==2){
            if(nums[0]!=nums[1]&&d!=0){
                reverseArray(nums,0,1);
            }
        }
        if(nums.length>2) {
        reverseArray(nums, 0,nums.length-1);
        reverseArray(nums,0,d-1);
        reverseArray(nums,d,nums.length-1);
        }


    }
}