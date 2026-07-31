class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] arr={0,0};
        boolean b=false;
        for(int i=0 ;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]+nums[j]==target&&i!=j)
                {
                    arr[0]=i;
                    arr[1]=j;b=true;
                }

            }
            if(b) break;
        }
     return arr;   
    }
}