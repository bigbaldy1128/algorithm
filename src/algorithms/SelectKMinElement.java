package algorithms;

public class SelectKMinElement {
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

    public int selectKMin(int[] nums, int p, int r, int k) {
        if (p == r) {
            return nums[p];
        }
        int q = partition(nums, p, r);
        int count = q - p + 1;
        if (k == count) {
            return nums[q];
        } else if (k < count) {
            return selectKMin(nums, p, q - 1, k);
        } else {
            return selectKMin(nums, q + 1, r, k - count);
        }
    }
}
