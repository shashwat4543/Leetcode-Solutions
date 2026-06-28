class Solution {
    private void generate(int[] nums,int idx,List<List<Integer>> result,List<Integer> ds){
        if(idx==nums.length){
            result.add(new ArrayList<>(ds));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(ds.contains(nums[i])) continue;
            ds.add(nums[i]);
            generate(nums,idx+1,result,ds);
            ds.remove(ds.size()-1);
        }

    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        generate(nums,0,result,ds);
        return result;
    }
}