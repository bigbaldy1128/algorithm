package exercise;

import javax.swing.plaf.basic.BasicSplitPaneUI;

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

    int pow(int a, int n) {
        if (n == 0) return 1;
        if (n == 1) return a;
        if ((n & 1) == 1) {
            int r = pow(a, (n - 1) / 2);
            return r * r * a;
        } else {
            int r = pow(a, n / 2);
            return r * r;
        }
    }

    private void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
