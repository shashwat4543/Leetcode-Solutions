class Solution {
    private void sum(List<List<Integer>> ans,int[] arr,int target,int index,List<Integer> list){

        if(index == arr.length){
            if(target==0){
                ans.add(new ArrayList<>(list));
            }
            return;
        }

         if (arr[index] <= target) {
            list.add(arr[index]);  
            sum(ans,arr, target - arr[index], index, list);  
            list.remove(list.size() - 1);  
        }
        sum( ans,arr, target, index+1, list);

    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
         List<List<Integer>> ans = new ArrayList<>(); 
         List<Integer> list = new ArrayList<>();
         sum(ans,candidates,target,0,list);
         return ans;
    }
}