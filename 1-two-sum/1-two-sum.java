class Solution {
    public int[] twoSum(int[] nums, int target) {
       
        int[] arr = new int[2];
        
        int k=0;
        
        int j=1;
        
        for(int i=0;i<nums.length;i++){
            
            if(j<nums.length){
                
                if(nums[i]+nums[j]==target &&i!=j){
                    
                    arr[0]=i;
                    arr[1]=j;
                    break;   
                    
                }
                else{
                    
                    i--;
                    j++;
                    
                } 
                
            }else{
                
                j=i+1;
            }
            
            
        }
        return arr;
        
    }
    }