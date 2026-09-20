class Solution {
    public int[] replaceElements(int[] arr) {
        int n= arr.length;
        int[] res = new int[n];
        res[n-1] = -1;

        int max = -1;
        for(int i = n-1; i>0; i--){
            //max = Math.max(max, arr[i]);
            if(arr[i]>max){
                max=arr[i];
            }
            res[i-1] = max;
        }
        
        return res;
    }
}