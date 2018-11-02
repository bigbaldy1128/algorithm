package algorithms;

/**
 * Created by wangjinzhao on 2017/3/16.
 */
public class HeapSort {
    public void heapSort(int[] nums) {
        buildMaxHeap(nums);
        for (int i = nums.length - 1; i > 0; i--) {
            swap(nums, 0, i);
            maxHeapify(nums, 0, i);
        }
    }

    public void buildMaxHeap(int[] nums) {
        for (int i = nums.length / 2; i >= 0; i--) {
            maxHeapify(nums, i, nums.length);
        }
    }

    private void maxHeapify(int[] nums, int i, int heapSize) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int largest;
        if (left < heapSize && nums[left] > nums[i]) {
            largest = left;
        } else {
            largest = i;
        }
        if (right < heapSize && nums[right] > nums[largest]) {
            largest = right;
        }
        if (largest != i) {
            swap(nums, i, largest);
            maxHeapify(nums, largest, heapSize);
        }
    }

    private void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    //循环方式实现
    private void maxHeapify2(int[] nums, int i, int heapSize) {
        while (true) {
            int left = 2 * i;
            int right = 2 * i + 1;
            int largest;
            if (left < heapSize && nums[left] > nums[i]) {
                largest = left;
            } else {
                largest = i;
            }
            if (right < heapSize && nums[right] > nums[largest]) {
                largest = right;
            }
            if (largest != i) {
                int temp = nums[i];
                nums[i] = nums[largest];
                nums[largest] = temp;
                i = largest;
            } else {
                break;
            }
        }
    }
}
