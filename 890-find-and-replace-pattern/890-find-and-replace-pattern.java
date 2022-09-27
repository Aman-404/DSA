class Solution {
    
    public List<String> findAndReplacePattern(String[] w, String p) {
        
        List<String> ans = new ArrayList<>();
        
        
        
        for(int j=0;j<w.length;j++){
            HashMap<Character,Character> mp1 = new HashMap<>();
            HashMap<Character,Boolean> mp2 = new HashMap<>();
            String s = w[j];
           
            boolean value = true;
            for(int i=0;i<s.length();i++){
            char ch1= s.charAt(i);
            char ch2 = p.charAt(i);
            
            if(mp1.containsKey(ch1)==true){
                if(mp1.get(ch1)!=ch2){
                  value = false;
                    break;  
                }
            }else{
                if(mp2.containsKey(ch2)==true){
                  value = false;
                    break;
                }
                else{
                mp1.put(ch1,ch2);
                mp2.put(ch2,true);
               }
            }
        }
            if(value == true){
                ans.add(s);
            }
        }
        return ans;
    }
}