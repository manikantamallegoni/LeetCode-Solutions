class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> st= new Stack<>();
        int Ocount=0;
        StringBuilder sb= new StringBuilder();

        

        for(char c:s.toCharArray()){
            if(c=='('){
              
                if(Ocount>0){
                    sb.append(c);
                }
                  Ocount++;
            }
            else{
                Ocount--;
                if(Ocount>0){
                    sb.append(c);
                }
            }
           
        }
        return sb.toString();
        
        
    }
}