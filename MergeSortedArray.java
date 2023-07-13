class Solution1 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] res = new int[m+n];
        int c = 0,i=0,j=0;

        while(i <m && j <n){
            if(nums1[i]<nums2[j]){
                res[c++]=nums1[i++];
            }
            else{
                res[c++]=nums2[j++];
            }
        }

        if(j==n){
             
            for(;i<m ;i++){
                    res[c++]=nums1[i];
            }
        }
        else{
            for(;j<n;j++){
                    res[c++]=nums2[j];
            }
        }

        for(int k =0;k<m+n;k++){
            nums1[k]=res[k];
        }
       
    }
}




class Solution2 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
           int  i = m - 1;
           int  j = n - 1;
           int  l = m + n - 1;

           while( j >=0 ){
               if( i >=0 && nums1[i] > nums2[j]){
                   nums1[l--]=nums1[i--];
               }
               else{
                   nums1[l--]=nums2[j--];
               }
           }
       
    } 
}