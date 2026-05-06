class Solution {
    public int[] twoSum(int[] nums, int target) {
        List<Integer> result = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
       
        for(int i=0;i<nums.length;i++)
        {
            int find = target-nums[i];
            if(map.containsKey(find))
            {
             
                result.add(map.get(find));
                result.add(i);
            }
            map.put(nums[i],i);
        }
        return result.stream()
                   .mapToInt(Integer::intValue)
                   .toArray();
    }
}
