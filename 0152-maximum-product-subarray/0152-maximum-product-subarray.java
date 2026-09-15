class Solution {
    public int maxProduct(int[] nums) {
        if(nums==null||nums.length==0){
            return 0;
        }
        int maxP=nums[0];
        int minP=nums[0];
        int res=nums[0];
        for(int i=1;i<nums.length;i++){
           int temp = maxP;

maxP = Math.max(nums[i],
        Math.max(maxP * nums[i], minP * nums[i]));

minP = Math.min(nums[i],
        Math.min(temp * nums[i], minP * nums[i]));

             res=Math.max(res,maxP);
            
        }
        return res;
       

        
    }
}