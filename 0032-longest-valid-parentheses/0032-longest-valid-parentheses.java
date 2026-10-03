class Solution {
    public int longestValidParentheses(String s) {

    int open=0;
    int close=0;
    int max=0;
    for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='('){
            open++;
        }
        else{
            close++;
        }
        if(open==close){
            max=Math.max(max,2*close);
        }else if(close>open){
            open=0;
            close=0;
        }

    }
    open=0;
    close=0;
    //try from the backk
    for(int i=s.length()-1;i>=0;i--){
        if(s.charAt(i)==')'){
            close++;
        }
        else{
            open++;
        }
        if(open==close){
            max=Math.max(max,2*open);
        }else if(open>close){
            open =0;
            close=0;
        }
    }
    return max;
}
}