class Solution {
    public int minInsertions(String s) {
        int insertion=0;
        int count=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('){
                count++;
            }else{
            if(i+1<s.length()&&s.charAt(i+1)==')'){
               i++;
            }else{
                insertion++;
            }
                    if(count>0){
            count--;
        }else{
                            insertion++;

        }
            }
        }
 
        return insertion+count*2;
       







    }


}