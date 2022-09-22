class Solution {
//     public String reverseWords(String str) {
//         String ans = "";
// 		String arr = str.split(" ");
//         arr = arr.toString();
// 		 ans= ans+ reverse(arr);
        
//         return ans;
//     }
    
//     public  String reverse(String s){
//         String ans="";
//         int n=s.length();

//         for(int i=n-1; i>=0; i--){
//             ans=ans+s.charAt(i);
//         }

//         return ans;
//     }
    
    public String reverseWords(String s) {
        String[] arr=s.split(" ");
        String ans="";
        for(int i=0;i<arr.length;i++)
        {
            StringBuilder str=new StringBuilder(arr[i]+"");
            StringBuilder rev=str.reverse();
            if(i==arr.length-1)
                ans+=rev+"";
            else
                ans+=rev+" ";
        }
        return ans;
    }
}