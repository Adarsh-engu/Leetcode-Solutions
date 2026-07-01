class Solution {
    public boolean canJump(int[] nums) {
        int n=nums.length;
        int ans=0;
        for(int i=0;i<n;i++)
        {
            if(i>ans)
            return false;
            ans=Math.max(ans,i+nums[i]);
        }
        return true;
    }
}