class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int start=1, end=maxElement(piles);
        int ans=end;
        while(start<=end){
            int speed=(start+end)/2;
            int noOfHours= caluculateNoOfHrs(piles,speed);
            if(noOfHours>h){
                start=speed+1;
            }
            else{
                ans=speed;
                end=speed-1;
            }
          
        }
          return ans;
        
    }
    private int maxElement(int[] piles){
        int maxEle=piles[0];
        for(int x:piles){
            if(x>maxEle){
                maxEle=x;
            }
        }
        return maxEle;
    }
    private int caluculateNoOfHrs(int[] piles, int speed){
        int noOfHrs=0;
        for(int pile:piles){
            noOfHrs+=Math.ceil((pile+0.0)/speed);
        }
        return noOfHrs;
    }
}