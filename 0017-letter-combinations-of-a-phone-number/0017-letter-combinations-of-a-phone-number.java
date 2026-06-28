class Solution {
    private final String[] map;
    public Solution(){
        map = new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    }
    private void helper(String digits,int idx, List<String> result , String word){
        if(idx==digits.length()){
            result.add(word);
            return;
        }
        String s = map[digits.charAt(idx)-'0'];
        for(int i =0;i<s.length();i++){
            
            helper(digits,idx+1,result,word+s.charAt(i));

        }

    }

    public List<String> letterCombinations(String digits) {
       List<String> result = new ArrayList<>();
       String word = "";
       helper(digits,0,result,word);
       return result;
    }
}