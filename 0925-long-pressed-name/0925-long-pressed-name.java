class Solution {
    public boolean isLongPressedName(String name, String type) {
        int i=1;
        int j=1;
        if(name.length()==1 && type.length()==1 && name!=type) return false;
        if(name.length()==type.length() && name.equals(type)) {
            return true;
        }
        while(i<name.length() && j<type.length()){
            if(name.charAt(i)==type.charAt(j)){
                i++;
                j++;
            }else if(i>0 && type.charAt(j)==name.charAt(i-1)){
                j++;
            }else{
                return false;
            }
        }
       while(j<type.length()){
           if(name.charAt(i-1)!=type.charAt(j)) return false;
           j++;
       }
        return i<name.length()?false:true;
    }
}