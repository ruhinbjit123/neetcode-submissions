class Solution {
    public int[] topKFrequent(int[] arr, int k) {
        int[] res = new int[k];
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> listFreq = new ArrayList<>();

        for (int j : arr) {
            map.put(j, map.getOrDefault(j, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            listFreq.add(entry.getValue());
        }
        listFreq.sort(Collections.reverseOrder());
        listFreq = listFreq.subList(0, k);

        for (int i = 0; i < listFreq.size(); i++) {
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (Objects.equals(entry.getValue(), listFreq.get(i))) {
                    res[i] = entry.getKey();
                    map.remove(entry.getKey());
                    break;
                }
            }
        }

        return res;
    }
}