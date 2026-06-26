class Solution {
    private void generate(int idx,int[] arr,int target,List<List<Integer>> result, List<Integer> ds){
        
        if(target==0){
            result.add(new ArrayList<>(ds));
            return;
        }

        for(int i= idx;i<arr.length;i++){
            if (i > idx && arr[i] == arr[i - 1]) continue;
            if (arr[i] > target) break;
            ds.add(arr[i]);

            generate(i+1,arr,target-arr[i],result,ds);
            ds.remove(ds.size()-1);
        }

    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        generate(0,candidates,target,result,ds);
        return result;
    }
}