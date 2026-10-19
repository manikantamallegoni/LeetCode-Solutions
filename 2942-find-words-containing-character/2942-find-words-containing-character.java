class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
       ArrayList<Integer> a= new ArrayList<>();
      for(int i=0;i<words.length;i++){
        for(int j=0;j<words[i].length();j++){
            char c= words[i].charAt(j);
            if(c==x){
  a.add(i);
       break;
            }
     
        }
      }
      return a;
        
    }
}