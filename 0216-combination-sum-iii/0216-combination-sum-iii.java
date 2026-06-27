class Solution {
    private void generate(int num , List<List<Integer>> result,List<Integer> ds,int n,int k){
        if(n==0 && ds.size()==k){
            result.add(new ArrayList<>(ds));
            return;
        }
        if (n <= 0 || ds.size() > k) return;

        for(int i = num;i<=9;i++){
            if(i<=n){
                ds.add(i);
                generate(i+1,result,ds,n-i,k);
                ds.remove(ds.size()-1);
            }
            else{
                break;
            }
        }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        generate(1,result,ds,n,k);
        return result;
    }
}