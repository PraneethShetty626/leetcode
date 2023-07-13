class Solution {
    public String longestCommonPrefix(String[] strs) {
        String  res = "";
        int l =0;
        while(true){
            if(l== strs[0].length()){
                return res;
            }
            char c = strs[0].charAt(l);
            for(String i : strs){
                if(i.length() <= l || i.charAt(l) != c){
                    return res;
                }
            }
            l++;
            res+=c;
        }
        
    }
}