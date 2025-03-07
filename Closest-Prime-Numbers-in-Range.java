class Solution {
    public Boolean checkPrime(int n){
        for(int j=2;j*j<=n;j++){
                if(n%j==0) {
                    return false;
                }
        }
        return true;
    }
    public int[] closestPrimes(int left, int right) {
        int[] nums = new int[2];
        int[] ans = new int[2];
        int minDis=Integer.MAX_VALUE;
        for(int i=left;i<=right;i++){
            if(i>2 && i%2 == 0) continue;
            if(checkPrime(i) && i!=1){
                if(nums[0]==0 ) {
                    nums[0] = i;
                }
                else if(nums[1]==0) {
                    nums[1] = i;
                    if(nums[1]-nums[0]<minDis){
                        ans[0]=nums[0];
                        ans[1]=nums[1];
                        minDis = nums[1]-nums[0];
                        if(minDis==1) break;
                        if(minDis==2) break; 
                    }
                    nums[0]=nums[1];
                    nums[1]=0; 
                }
            }

        }
        if(minDis==Integer.MAX_VALUE){
            ans[0]=-1;
            ans[1]=-1;
        }
        return ans;
    }
}
