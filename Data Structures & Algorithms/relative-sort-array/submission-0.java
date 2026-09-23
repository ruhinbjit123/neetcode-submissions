class Solution {
    private static int[] relativeSortArray(int[] arr1, int[] arr2){
        int[] result = new int[arr1.length];

        int index = 0;
        Arrays.sort(arr1);
        for (int num : arr2) {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] == num) {
                    result[index++] = arr1[i];
                    arr1[i] = -1; // Mark as used
                }
            }
        }

        for (int j : arr1) {
            if (j != -1) {
                result[index++] = j;
            }
        }

        return result;
    }
}