package exercise;

/**
 * Created by wangjinzhao on 2018/10/30
 */
public class MyExercise {
    public void sort(int[] nums) {
        buildHeap(nums);
        for (int i = nums.length - 1; i > 0; i--) {
            swap(nums, 0, i);
            adjustHeap(nums, 0, i);
        }
    }

    private void buildHeap(int[] nums) {
        for (int i = nums.length / 2; i >= 0; i--) {
            adjustHeap(nums, i, nums.length);
        }
    }

    private void adjustHeap(int[] nums, int i, int heapSize) {
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

    private void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
