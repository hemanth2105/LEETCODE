class Solution {
    public int maxDepth(String s) {

        int count = 0;
        int maxVal = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(') {
                count++;
                maxVal = Math.max(maxVal, count);
            } 
            else if (s.charAt(i) == ')') {
                count--;
            }
        }

        return maxVal;
    }
}