class Solution {
    public void sortColors(int[] arr) {
        int n=arr.length;
        int p1=-1;
		int p2=0;
		int p3=n-1;
		while(p2<=p3) {
			if(arr[p2]==0) {
				p1++;
				swap(arr,p1,p2);
				p2++;
			}
			else if(arr[p2]==2) {
				swap(arr,p2,p3);
				p3--;
			}
			else {
				p2++;
			}
		}
	}
	static void swap(int arr[],int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
    
}