// Maximum Sub Array
/*
Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

A subarray is a contiguous part of an array.



Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
Example 2:

Input: nums = [1]
Output: 1
Example 3:

Input: nums = [5,4,-1,7,8]
Output: 23
 */

package Java.Arrays;

public class Program3 {

    int maxOfSubArray_KadaneAlgo(int[] array){
        int current_Max = Integer.MIN_VALUE;
        int max_Sum = array[0];
        for(int i=1;i<array.length;i++){
            if(current_Max>0){
                current_Max+=array[i];
            }
            if(current_Max<0){
                current_Max = array[i];
            }
            if(current_Max > max_Sum)
                max_Sum = current_Max;
        }
        return max_Sum;
    }

    int maxSubArray_SimpleDPApproach(int[] array){
        int max_sum = array[0];
        int current_sum = array[0];
        for(int i=0;i<array.length;i++){
            current_sum = Math.max(array[i],current_sum+array[i]);
            max_sum = Math.max(max_sum,current_sum);
        }
        return max_sum;
    }

//    public static void main(String[] args){
//        int[] array = {-2,1,-3,4,-1,2,1,-5,4};
//        System.out.println(new Program3().maxOfSubArray_KadaneAlgo(array));
//        System.out.println(new Program3().maxSubArray_SimpleDPApproach(array));
//    }
}
