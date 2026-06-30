class Solution {
    public int numberOfSubstrings(String s) {
        int[] count = new int[3];
        Arrays.fill(count,-1);
        int r=0;
        int ans = 0;
        while(r<s.length()){
            count[s.charAt(r) - 'a'] = r;
            if(count[0]!=-1 && count[1]!=-1 && count[2]!=-1){
                int min = Math.min(count[0],Math.min(count[1],count[2]));
                ans+= min +1;
            }
            r++;
        }
        return ans;
    }
}