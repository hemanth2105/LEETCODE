class Solution {
    public int firstMatchingIndex(String s) {
        char[] arr=s.toCharArray();
        int left=0;
        int right=arr.length-1;
        while(left<=right)
        {
            if(arr[left]==arr[right])
            {
                return left;
            }
            left++;
            right--;
        }
        return -1;
    }
}