class Solution {
    public String[] sortPeople(String[] people, int[] height) {
        String[] result = new String[people.length];

        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < people.length; i++) {
            map.put(height[i], people[i]);
        }

        Arrays.sort(height);
        for (int i = 0; i < people.length; i++) {
            result[i] = map.get(height[height.length - 1 - i]);
        }

        return result;
    }
}

