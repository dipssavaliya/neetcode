class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(int i=0;i<strs.length;i++)
        {
           char[] sortarray = strs[i].toCharArray();
           Arrays.sort(sortarray);
           String sortString =  new String (sortarray);
            if(!map.containsKey(sortString))
            {
            map.put(sortString,new ArrayList<>());
            }
            map.get(sortString).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }
}
