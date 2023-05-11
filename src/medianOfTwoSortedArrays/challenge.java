package medianOfTwoSortedArrays;

import java.util.Arrays;

/**
 * 05-08-23
 * Median of Two Sorted Arrays
 * Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
 * The overall run time complexity should be O(log (m+n)).
 * <p>
 * Example1:
 * Input:nums1 = [1,3], nums2 = [2]
 * Output:2.00000
 * Explanation: merged array = [1,2,3] and median is 2.
 * <p>
 * Example2:
 * Input:nums1 = [1,2], nums2 = [3,4]
 * Output:2.50000
 * Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
 * <p>
 * Constraints
 * nums1.length == m
 * nums2.length == n
 * 0 <= m <= 1000
 * 0 <= n <= 1000
 * 1 <= m + n <= 2000
 * -106 <= nums1[i], nums2[i] <= 106
 */

 public class challenge {
    public static void main(String[] args) {
        int[] nums1 = {1,3};
        int[] nums2 = {2};

        System.out.println(median(nums1, nums2));

        int[] nums3 = {1,2};
        int[] nums4 = {3,4};

        System.out.println(median(nums3, nums4));
    }

    public static double median(int[] a, int[] b){
        double mnum;
        int[] merge = new int[a.length + b.length];
        int idx = 0;

        for(int i = 0; i < merge.length; i++){
            if(i >= a.length){
                merge[i] = b[idx];
                idx++;
            }
            else{
                merge[i] = a[i];
            }
        }

        Arrays.sort(merge);

        //System.out.println("Merge Array: " + Arrays.toString(merge));

        if(merge.length % 2 == 0){ //even length
            int mid2 = merge.length / 2;
            //finds two middle numbers in array then finds average of them
            mnum = (merge[mid2-1] + merge[mid2]) / 2.0;
        }
        else{
            int midIdx = merge.length / 2;
            mnum = merge[midIdx];
        }

        return mnum;
    }
}