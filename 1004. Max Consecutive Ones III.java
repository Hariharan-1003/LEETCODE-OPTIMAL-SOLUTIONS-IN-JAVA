class Solution {
    public int longestOnes(int[] nums, int k) {
        int left=0,right=0;
        int cnt=0,max=0;
        while(right<nums.length){
            if(nums[right]==0){
                cnt++;
            }
            if(cnt<=k){
                max=Math.max(right-left+1,max);
            }
            if(cnt>k) {
                if(nums[left]==0){
                    cnt--;
                }
                left++;
            }
            right++;
        }
        return max;
    }
}
