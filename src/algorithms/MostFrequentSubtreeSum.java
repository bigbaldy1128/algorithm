package algorithms;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wangjinzhao on 2017/3/23.
 */
public class MostFrequentSubtreeSum {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public class Solution {
        int max = 0;
        Map<Integer, Integer> hashMap;

        public int[] findFrequentTreeSum(TreeNode root) {
            if(root==null)
            {
                return new int[0];
            }
            hashMap = new HashMap<>();
            find(root);
            return hashMap
                    .entrySet()
                    .stream()
                    .filter(p -> p.getValue() == max)
                    .mapToInt(Map.Entry::getKey)
                    .toArray();
        }

        private int find(TreeNode root) {
            int left = root.left != null ? find(root.left) : 0;
            int right = root.right != null ? find(root.right) : 0;
            int sum = root.val + left + right;
            hashMap.put(sum, hashMap.getOrDefault(sum, 0) + 1);
            max = Math.max(max, hashMap.get(sum));
            return sum;
        }
    }
}
