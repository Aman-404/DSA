class Solution {
    public int daysCapacity(int arr[],int cap){
        int reqDay = 1;
        int remaingCap = cap;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=remaingCap){
                remaingCap-=arr[i];
            }else{
                reqDay++;
                remaingCap =cap;
                remaingCap -= arr[i];
            }
        }
        return reqDay;
    }
    
    
    public int shipWithinDays(int[] we, int D) {
        int sum=0,maxEle = -1;
        for(int i : we){
            sum+=i;
            maxEle = Math.max(maxEle,i);
        }
        int s=maxEle,e=sum,ans=sum;
        while(s<=e){
            int m=s+(e-s)/2;
            int d = daysCapacity(we,m);
            if(d>D){
                s = m+1;
            }else{
                ans = Math.min(ans,m);
                e = m-1;
            }
            
        }
        return ans;
    }
}