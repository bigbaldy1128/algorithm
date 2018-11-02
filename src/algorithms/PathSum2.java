package algorithms;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangjinzhao on 2018/11/2
 */
public class PathSum2 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new ArrayList<>();
        dfs(res, new ArrayList<>(), root, sum);
        return res;
    }

    private void dfs(List<List<Integer>> res, List<Integer> cur, TreeNode node, int sum) {
        if (node != null) {
            cur.add(node.val);
            sum = sum - node.val;
            if (sum == 0 && node.left == null && node.right == null) {
                res.add(new ArrayList<>(cur));
                cur.remove(cur.size() - 1);
                return;
            }
            dfs(res, cur, node.left, sum);
            dfs(res, cur, node.right, sum);
            cur.remove(cur.size() - 1);
        }
    }
}
