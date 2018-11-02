package exercise;

import algorithms.PathSum2;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

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

    public String addStrings(String num1, String num2) {
        StringBuilder res = new StringBuilder();
        int carry = 0;
        for (int i = num1.length() - 1, j = num2.length() - 1; i >= 0 || j >= 0 || carry == 1; i--, j--) {
            int x = i < 0 ? 0 : num1.charAt(i) - '0';
            int y = j < 0 ? 0 : num2.charAt(j) - '0';
            res.append((x + y + carry) % 10);
            carry = (x + y + carry) / 10;
        }
        return res.reverse().toString();
    }

    private void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
