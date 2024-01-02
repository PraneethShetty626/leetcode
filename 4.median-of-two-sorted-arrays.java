/*
 * @lc app=leetcode id=4 lang=java
 *
 * [4] Median of Two Sorted Arrays
 */

// @lc code=start
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
            int i=0,j=0,c=0;
            int[] sortedArray = new int[nums1.length+nums2.length];

            while(i < nums1.length && j < nums2.length){
                if(nums1[i] < nums2[j]){
                    sortedArray[c++] = nums1[i++];
                }
                else{
                    sortedArray[c++] = nums2[j++];
                }
                System.out.println(sortedArray[c-1]);
            }

            if(i < nums1.length ){
                while(i<nums1.length){
                    sortedArray[c++]=nums1[i++];
                    System.out.println(sortedArray[c-1]);
                } 
               
            }
            else {
                   while(j<nums2.length){
                    sortedArray[c++]=nums2[j++];
                    System.out.println(sortedArray[c-1]);
                }
            }

           

            if(sortedArray.length % 2 == 0){
                return (sortedArray[sortedArray.length / 2] + sortedArray[(sortedArray.length - 1 )/2]) / 2.0;
            }
            else {
                return sortedArray[sortedArray.length / 2];
            }


    }
}
// @lc code=end

