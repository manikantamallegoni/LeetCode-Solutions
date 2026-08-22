class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int pro=1; 
        int m=n;
         while(n>0){

            int dig=n%10;
            sum+=dig;
            pro*=dig;
            n=n/10;

       

         }
              
         if(m%(sum+pro)==0){
            return true;
         }
         return false;

        
    }
}