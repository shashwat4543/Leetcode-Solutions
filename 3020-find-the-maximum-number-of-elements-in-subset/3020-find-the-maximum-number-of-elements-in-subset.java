class Solution {
    public int maximumLength(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        int ans = 0;
        if (map.containsKey(1)) {
            int count = map.get(1);
            ans = (count % 2 == 0) ? count - 1 : count;
        }
        
        for (int key : map.keySet()) {
            if (key == 1) {
                continue;
            }
            
            int currentLength = 0;
            long current = key;
            
            while (current <= 1000000000 && map.containsKey((int) current) && map.get((int) current) >= 2) {
                currentLength += 2;
                current = current * current; 
            }
            
            if (current <= 1000000000 && map.containsKey((int) current) && map.get((int) current) >= 1) {
                currentLength += 1;
            }
            else {
                currentLength -= 1;
            }  
            ans = Math.max(ans, currentLength);
        }
        return ans;
    }
}
