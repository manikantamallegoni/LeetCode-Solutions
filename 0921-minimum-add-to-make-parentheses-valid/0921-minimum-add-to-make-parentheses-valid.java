class Solution {
    public int minAddToMakeValid(String s) {
        int Ocount=0;
        int Ccount=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('){
                Ocount++;

            }else{
                if(Ocount>0){
                    Ocount--;
                }
                else{Ccount++;}
            }
        
        }
        return Ocount+Ccount;
       
        
    
    
}
}