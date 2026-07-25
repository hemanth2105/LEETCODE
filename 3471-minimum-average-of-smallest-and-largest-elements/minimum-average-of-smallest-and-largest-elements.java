class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int left=0;
        int right=nums.length-1;
        ArrayList<Double> list=new ArrayList<>();
        while(left<=right)
        {
            double avg=(nums[left]+nums[right])/2.0;
            list.add(avg);
            left++;
            right--;
        }
        double min = Collections.min(list);
        return min;
    }
}