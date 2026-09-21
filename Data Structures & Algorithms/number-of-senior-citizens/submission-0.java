class Solution {
    public int countSeniors(String[] details) {
        int count = 0;
        for (String temp : details) {
            int n = temp.length();
            String subStr =  temp.substring(n-4,n-2);
            int age = Integer.parseInt(subStr);

            if (age > 60) {
                count++;
            }
        }

        return count;
    }
}