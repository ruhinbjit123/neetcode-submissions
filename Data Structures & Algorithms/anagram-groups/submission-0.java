class Solution {
    public static List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }
        if (strs.length == 1) {
            List<String> list = new ArrayList<>();
            list.add(strs[0]);
            return List.of(list);
        }
        Map<String, List<String>> map = new HashMap<>();

        for(String s: strs) {
            int[] count = new int[26];
            for (char c : s.toCharArray()) {
                count[c - 'a']++;
            }

            String key = Arrays.toString(count);

            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(s);
        }

        return new ArrayList<>(map.values());
    }
}
