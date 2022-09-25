class Solution {
    public int[] sortArray(int[] nums) {
        int[] b = new int[nums.length];
        merge(nums,0,nums.length-1,b);
        return(nums);
    }
    public static void merge(int[] a ,int s, int e,int[] b){
        int m=s+(e-s)/2;
        if(s<e){
            merge(a,s,m,b);
            merge(a,m+1,e,b);
            mergeboth(a,s,m,e,b);
        }
    }
    public static void mergeboth(int[] a,int s,int m,int e,int[] b){
        int i=s,j=m+1,k=0,t=0;
        while(i<=m && j<=e){
            if(a[i]<a[j])
                b[k++]=a[i++];
            else
                b[k++]=a[j++];
        }
        while(i<=m)
            b[k++]=a[i++];
        while(j<=e)
            b[k++]=a[j++];
        for( i=s;i<=e;i++){
            a[i]=b[t++];
        }
    }
}