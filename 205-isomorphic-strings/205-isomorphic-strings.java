class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        // we use hashmap to keep in check our previous logs
        
        HashMap<Character, Character> map = new HashMap<>();
        
        for(int i=0;i<s.length();i++)
        {
            // s chars are mapped with t
            
            if(map.containsKey(s.charAt(i)))
            {
                if(map.get(s.charAt(i)) != t.charAt(i))
                {
                    return false;
                }  
            }
            else 
            {
                if(map.containsValue(t.charAt(i)) == true)
                {
                    return false;
                }
                else
                {
                    map.put(s.charAt(i), t.charAt(i));   
                }
            }
        }
        return true;
    }
}