class Solution {
    public String removeStars(String s) {
        Stack<Character>st= new Stack<>();
        String sm="";
        for(int i=0;i<s.length();i++){
            char c= s.charAt(i);
            if (Character.isLetter(c)){
                    st.push(c);
            }
            else st.pop();

            
        }
        for(int i=0; i<st.size();i++){
            sm+=st.get(i);
        }
        return sm;
    }
}