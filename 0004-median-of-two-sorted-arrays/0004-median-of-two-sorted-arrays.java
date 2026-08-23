class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int sum1=0;
        int sum2=0;
        int n= nums1.length;
        int m=nums2.length;
        int k=n+m;
      int[] arr= new int[k];
      for(int i=0; i<n; i++){
        arr[i]=nums1[i];
      }
      for(int i=0;i<m; i++){
        arr[n+i]=nums2[i];
      }
      Arrays.sort(arr);
      if(k%2!=0){
        return (double)arr[k/2];
      }
      double mid=(double)(arr[k/2]+arr[(k/2)-1])/2;
      return mid;

        

    }
}