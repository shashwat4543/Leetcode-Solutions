class Solution {
    public String minWindow(String s, String t) {
        int[] hashArray = new int[256];
        for(int i =0;i<t.length();i++){
            hashArray[t.charAt(i)]+=1;
        }
        int m = t.length();
        int count = 0;
        int sindex = -1;
        int minlength =Integer.MAX_VALUE;
        int l =0;
        for(int r=0;r<s.length();r++){
            if(hashArray[s.charAt(r)]>0){
                count++;
            }
            hashArray[s.charAt(r)]-=1;
            while(count==m){
                
                if(r-l+1<minlength){
                    sindex = l;
                    minlength = r-l+1;
                }
                
                hashArray[s.charAt(l)]+=1;
                if(hashArray[s.charAt(l)]>0) count--;
                l++;
            }

            
        }
        return sindex == -1? "" : s.substring(sindex, minlength+sindex);
    }
}