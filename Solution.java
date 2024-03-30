class Solution {
    public String longestCommonPrefix(String[] strs) {
      StringBuilder res = new StringBuilder();
      Arrays.sort(strs);
      char [] first = strs[0].toCharArray();
      char [] last = strs[strs.length -1].toCharArray();
      for(int i = 0; i < strs[0].length(); i++){
        if(first[i] != last[i]){
            break;
        }
        res.append(first[i]);
      }
      return res.toString();
    }
}