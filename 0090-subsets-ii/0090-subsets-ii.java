class Solution {
    private void generate(int idx,int[] arr,List<List<Integer>> result,List<Integer> ds){
        result.add(new ArrayList<>(ds));

        for(int i = idx;i<arr.length;i++){
            if(i>idx && arr[i]==arr[i-1]){
                continue;
            }
            ds.add(arr[i]);
            generate(i+1,arr,result,ds);
            ds.remove(ds.size()-1);
            
        }
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        generate(0,nums,result,ds);
        return result;
    }
}