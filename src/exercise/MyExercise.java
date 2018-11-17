package exercise;

import javax.swing.plaf.basic.BasicSplitPaneUI;
import java.util.Random;

/**
 * Created by wangjinzhao on 2018/10/30
 */
public class MyExercise {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public void heapSort(int[] nums) {
        buildHeap(nums);
        for (int i = nums.length - 1; i > 0; i--) {
            swap(nums, 0, i);
            adjust(nums, 0, i);
        }
    }

    private void buildHeap(int[] nums) {
        for (int i = nums.length / 2; i >= 0; i--) {
            adjust(nums, i, nums.length);
        }
    }

    private void adjust(int[] nums, int i, int heapSize) {
        while (true) {
            int left = i * 2 + 1;
            int right = i * 2 + 2;
            int top;
            if (left < heapSize && nums[left] > nums[i]) {
                top = left;
            } else {
                top = i;
            }
            if (right < heapSize && nums[right] > nums[top]) {
                top = right;
            }
            if (top != i) {
                swap(nums, top, i);
                i = top;
            } else {
                break;
            }
        }
    }

    private void quickSort(int[] nums, int p, int r) {
        if (p < r) {
            int q = partition(nums, p, r);
            quickSort(nums, p, q - 1);
            quickSort(nums, q + 1, r);
        }
    }

    private int partition(int[] nums, int p, int r) {
        int random = (int) (p + (r - p + 1) * Math.random());
        int x = nums[random];
        int i = p - 1;
        swap(nums, random, r);
        for (int j = p; j <= r; i++) {
            if (nums[j] <= x) {
                i++;
                swap(nums, i, j);
            }
        }
        return i;
    }

    public int selectKMin(int[] nums, int p, int r, int k) {
        if (p == r) {
            return nums[p];
        }
        int q = partition(nums, p, r);
        int count = q - p + 1;
        if (count == k) {
            return nums[q];
        } else if (k < count) {
            return selectKMin(nums, p, q - 1, k);
        } else {
            return selectKMin(nums, q + 1, r, k - count);
        }
    }

    private void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
