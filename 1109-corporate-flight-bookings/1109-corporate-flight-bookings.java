class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {


        int[] diff=new int[n+1];
        for(int i=0; i<bookings.length; i++){

            int start=bookings[i][0];
            int end=bookings[i][1];
            int seats=bookings[i][2];

            diff[start-1]+=seats;
            diff[end]-=seats;



        }
        int[] ans= new int[n];
        ans[0] =diff[0];
        for(int i=1;i<n; i++){
            ans[i]=ans[i-1]+diff[i];
        }
        return ans;


        
        
    }
}