class Solution {
    public int[] twoSum(int[] nums, int target) {
       Map<Integer, Integer> indices = new HashMap<>();

       for(int i=0; i<nums.length; i++){
        indices.put(nums[i], i);
       }

       for(int j=0; j<nums.length; j++){
        int diff = target - nums[j];
        if(indices.containsKey(diff) && indices.get(diff) !=j){
            return new int[]{
                Math.min(j, indices.get(diff)),
                Math.max(j, indices.get(diff))
            };
        }
       }

       return new int[0];
    }
}
