class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> result=new ArrayList<>();

        backtrack("",0,0,n,result);
        return result;

        
    }
    private void backtrack(String current,int start, int close ,int n,List<String>result){
        if(start==n&&close==n){
            result.add(current);
            return;
        }
        if(start<n){
            backtrack(current+"(",start+1,close,n,result);

        }
        if(close<start){
            backtrack(current+")",start,close+1,n,result);
        }



    }
}