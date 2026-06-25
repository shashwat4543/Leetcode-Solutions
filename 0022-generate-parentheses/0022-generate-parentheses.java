class Solution {
    private void generate(List<String> result,int open,int close,int max,String s){
        if(s.length()==max*2){
            result.add(s);
            return;
        }
        if(open<max){
            generate(result,open+1,close,max,s+"(");
        }
        if(close<open){
            generate(result,open,close+1,max,s+")");
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generate(result,0,0,n,"");
        return result;
    }
}