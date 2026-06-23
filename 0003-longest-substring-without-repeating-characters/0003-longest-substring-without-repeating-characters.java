class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] hashArray = new int[256];
        Arrays.fill(hashArray, -1); 
        int l =0;
        int r =0;
        int maxlength =0;
        while(r<s.length()){
            if(hashArray[s.charAt(r)] > -1){
                l = Math.max(hashArray[s.charAt(r)] + 1, l);
            }
            maxlength = Math.max(maxlength,r-l+1);
            hashArray[s.charAt(r)] = r;
               
            r++;
        }
        return maxlength;
    }
}