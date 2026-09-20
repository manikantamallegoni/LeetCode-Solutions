class Solution {
    public int reverseDegree(String s) {
        int ans=0;
      ans= multiRe(s,ans);
       return ans;
        
        
    }
    int multiRe(String s,int ans){
          for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            int val='z'-c+1;
             ans+= val*(i+1);
    }
    return ans;
}

}