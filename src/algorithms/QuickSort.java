package algorithms;

import java.util.Random;

/**
 * Created by wangjinzhao on 2017/3/16.
 */
public class QuickSort {
    public void quickSort(int[] nums, int p, int r) {
        if (p < r) {
            int q = partition(nums, p, r);
            quickSort(nums, p, q - 1);
            quickSort(nums, q + 1, r);
        }
    }


    private int partition(int[] nums, int p, int r) {
        int random = (int) (p + (r - p + 1) * Math.random());
        int x = nums[random];
        swap(nums, random, r); //把元素交换到最后
        int i = p - 1;
        for (int j = p; j <= r; j++) {
            if (nums[j] <= x) {
                i = i + 1;
                swap(nums, i, j);
            }
        }
        return i;
    }

    private void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
