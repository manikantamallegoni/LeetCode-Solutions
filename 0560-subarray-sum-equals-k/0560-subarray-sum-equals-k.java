class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map= new HashMap<>();
        int sum=0;
         int count=0;
         map.put(0,1);
          for(int x:nums){
            sum+=x;

        
      int need= sum-k;
      if(map.containsKey(need)){
        count+=map.get(need);


      }
      map.put(sum, map.getOrDefault(sum,0)+1);
          }
        return count;
    }
}