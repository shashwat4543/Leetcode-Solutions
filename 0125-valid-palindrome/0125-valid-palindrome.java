class Solution {
    public boolean checkPalindrome(int i, String res){
        if(i>=res.length()/2) return true;
        if (res.charAt(i) != res.charAt(res.length()-i-1)) return false;
        return checkPalindrome(i+1,res);
    }
    public boolean isPalindrome(String s) {
        String result = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int n = result.length();
        boolean ans = checkPalindrome(0,result);
        return ans;
    }

}