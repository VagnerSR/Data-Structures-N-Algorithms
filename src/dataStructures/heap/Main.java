package dataStructures.heap;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static int findKthSmallest(int[] nums, int k) {
        Heap maxHeap = new Heap();

        for (int i : nums) {
            maxHeap.insert(i);
            System.out.println(maxHeap.getHeap());
            if (maxHeap.getHeap().size() > k) {
                maxHeap.remove();
                System.out.println("removido" + maxHeap.getHeap());
            }
        }

        return maxHeap.remove();
    }

    public static List<Integer> streamMax(int[] nums) {
        Heap maxHeap = new Heap();
        List<Integer> res = new ArrayList<>();

        for (int i : nums) {
            maxHeap.insert(i);
            res.add(maxHeap.getHeap().get(0));
        }

        return res;
    }

    public static void main(String[] args) {
        int[] nums = {7, 10, 4, 3, 20, 15};
        int[] nums1 = {1, 5, 2, 9, 3, 6, 8};
        int k = 3;

        System.out.println(findKthSmallest(nums, k));
    }
}
