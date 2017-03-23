package algorithms;

import java.util.HashMap;

/**
 * Created by wangjinzhao on 2017/3/22.
 */
public class ConstructBinaryTreefromInorderAndPostorderTraversal {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder == null || postorder == null || inorder.length != postorder.length)
            return null;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < inorder.length; ++i)
            hashMap.put(inorder[i], i);
        return buildTree(0, inorder.length - 1, postorder, 0, postorder.length - 1, hashMap);
    }

    private TreeNode buildTree(int is, int ie, int[] postorder, int ps, int pe, HashMap<Integer, Integer> hashMap) {
        if (ps > pe || is > ie) return null;
        TreeNode root = new TreeNode(postorder[pe]);
        int ri = hashMap.get(postorder[pe]);
        TreeNode leftchild = buildTree(is, ri - 1, postorder, ps, ps + ri - is - 1, hashMap);
        TreeNode rightchild = buildTree(ri + 1, ie, postorder, ps + ri - is, pe - 1, hashMap);
        root.left = leftchild;
        root.right = rightchild;
        return root;
    }
}
