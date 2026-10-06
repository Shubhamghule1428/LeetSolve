class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> intMap = new HashMap<>();

        int[] result = new int[2];

        for(int i = 0; i<nums.length; i++){
            int num = target - nums[i];

            if(intMap.containsKey(num)){
                result[0]=i;
                result[1]=intMap.get(num);
                return result;
            }else{
                intMap.put(nums[i],i);
            }
        }
        return result;
    }
}