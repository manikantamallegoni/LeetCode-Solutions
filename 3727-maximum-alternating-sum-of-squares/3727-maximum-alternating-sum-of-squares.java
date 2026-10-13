
class Solution {
    public long maxAlternatingSum(int[] nums) {
       int[] arr = new int[nums.length];

for (int i = 0; i < nums.length; i++) {
    arr[i] = Math.abs(nums[i]);
}

Arrays.sort(arr);
        long sum=0;
        long min=0;
        for(int i=0;i<nums.length;i++){
            long square=arr[i]*arr[i];
            if(i<nums.length/2){
                min+=square;
            }else  sum+=square;

        }
        return sum-min;
    }
}