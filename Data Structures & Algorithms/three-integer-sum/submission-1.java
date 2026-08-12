class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        //List<List<Integer>> ansList = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        for(int i=0;i<nums.length-1;i++)
        {
                int l=i+1;
                int r=nums.length-1;
                while(l<r){
                     int sum = nums[i] + nums[l] + nums[r];
                if(sum==0)
                    {
                        set.add(new ArrayList<>(Arrays.asList(nums[i],nums[l],nums[r])));
                                            l++;r--;
                    }
                    else if(sum>=0)
                    {
                        r--;
                    }
                    else
                    {
                        l++;
                    }
                }
        }
            
        return new ArrayList<>(set);
    }
}
