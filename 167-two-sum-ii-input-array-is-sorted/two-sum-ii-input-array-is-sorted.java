class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i=0;
        int j=numbers.length-1;
        // int[] res=new int[2];
        while(i<=j)
        {
            if((numbers[i]+numbers[j])==target)
            {
                return new int[]{i+1,j+1};
            }
            
            if((numbers[i]+numbers[j])<target)
            {
                i++;
            }
            if((numbers[i]+numbers[j])>target)
            {
                j--;
            }
            

        }
        // return res;
        return new int[]{i+1,j+1};
    }
}