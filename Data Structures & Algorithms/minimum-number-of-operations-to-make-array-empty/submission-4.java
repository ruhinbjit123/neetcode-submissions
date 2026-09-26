class Solution {
    public static int minOperations(int[] nums){
        int opsCount = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        for (int value : map.values()) {
            if (value == 1) {
                return -1;
            }
            int remainder = value % 3;

            if (remainder == 0) {
                opsCount += value / 3;
            }
            else if (remainder == 1) {
                opsCount += (value / 3) - 1 + 2;
            }
            else {
                opsCount += value / 3 + 1;
            }
        }
        return opsCount;
    }
}