package Week2;

/**
 * Given two sorted arrays nums1 and nums2 of size m and n respectively, 
 * return the median of the two sorted arrays.
 * The overall run time complexity should be O(log (m+n)).
 * 
 * Example 1:
 * Input: nums1 = [1,3], nums2 = [2]
 * Output: 2
 * Explanation: merged array = [1,2,3] and median is 2.
 * 
 * Example 2:
 * Input: nums1 = [1,2], nums2 = [3,4]
 * Output: 2.5
 * Explanation: mergedArray = [1,2,3,4] and median is (2 + 3)/2 = 2.5
 */

public class MedianOfTwoSortedArrays {

    public static void main(String[] args) {
        int[] arr1 = {1,3};
        int[] arr2 = {2};
        System.out.println(medianOfTwoSortedArrays(arr1, arr2));

        int[] arr3 = {1,2};
        int[] arr4 = {3,4};
        System.out.println(medianOfTwoSortedArrays(arr3, arr4));
    }

    public static double medianOfTwoSortedArrays(int[] nums1, int[] nums2) {
        int totalLength = nums1.length + nums2.length;
        int[] mergedArray = new int[totalLength];
    
        int i = 0, j = 0, k = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                mergedArray[k++] = nums1[i++];
            } else {
                mergedArray[k++] = nums2[j++];
            }
        }
    
        while (i < nums1.length) {
            mergedArray[k++] = nums1[i++];
        }
    
        while (j < nums2.length) {
            mergedArray[k++] = nums2[j++];
        }
    
        if (totalLength % 2 == 0) {
            return (double) (mergedArray[totalLength/2 - 1] + mergedArray[totalLength/2]) / 2.0;
        } else {
            return (double) mergedArray[totalLength/2];
        }
    }
}