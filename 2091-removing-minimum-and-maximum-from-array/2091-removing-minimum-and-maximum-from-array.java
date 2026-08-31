class Solution {
    public int minimumDeletions(int[] nums) {

        int min = 0;
        int max = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<nums[min]){
                min=i;
            }
            if(nums[i]>nums[max]){
                max=i;
            }
        }
        // /delete fromleft 
        int left=Math.max(min,max)+1;
        //delete form right
        int right=nums.length -Math.min(min,max);
        //delete from both sides
        int both=nums.length-Math.max(min,max)+Math.min(min,max)+1;
        return Math.min(left,Math.min(right,both));


     

       
    }
}