package algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static algorithms.MergeSort.mergeSort;
import static algorithms.QuickSort.quickSort;
import static algorithms.SortAlgorithms.*;

public class Main {

    public static int removeElement(int[] nums, int val) {
        ArrayList<Integer> newArray = new ArrayList<>();

        for (int i : nums) {
            if (i != val) {
                newArray.add(i);
            }
        }

        return newArray.size();
    }

    public static int[] findMaxMin(int[] myList) {
        int max = myList[0];
        int min = myList[0];

        for (int i : myList) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }
        return new int[] {max, min};
    }

    public static String findLongestString(String[] stringList) {
        int strIndex = 0;

        for (int i = 0; i < stringList.length; i++) {
            if (stringList[i].length() > stringList[strIndex].length()) {
                strIndex = i;
            }
        }

        return stringList[strIndex];
    }

    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            minPrice = Math.min(minPrice, price);
            int profit = price - minPrice;
            maxProfit = Math.max(maxProfit, profit);
        }

        return maxProfit;
    }

    public static void rotate(int[] nums, int k) {
        k = k % nums.length;

        for (int start = 0, end = nums.length - k - 1; start < end; start++, end--) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
        }
        System.out.println(Arrays.toString(nums));

        for (int start = nums.length - k, end = nums.length - 1; start < end; start++, end--) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
        }
        System.out.println(Arrays.toString(nums));

        for (int start = 0, end = nums.length - 1; start < end; start++, end--) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
        }
        System.out.println(Arrays.toString(nums));
    }



    public static void main(String[] args) {
        int[] myArray = {4,2,6,5,1,3};
        int[] nums1 = {1, 2, 3, 4, 5, 6, 7};

        rotate(nums1, 3);

        int[] sortedByMerge = mergeSort(myArray);
        quickSort(myArray);

    }
}
