package algorithms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * Created by wangjinzhao on 2018/11/5
 */
public class PreOrder {
    class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public List<Integer> inorderTraversal(TreeNode root) {

        Stack<TreeNode> stack = new Stack<>();
        List<Integer> traversed = new ArrayList<>();
        if (root == null) return traversed;
        TreeNode p = root;
        while (p != null || !stack.isEmpty()) {
            while (p != null) {
                stack.push(p);
                p = p.left;
            }
            p = stack.pop();
            traversed.add(p.val);
            p = p.right;
        }
        return traversed;
    }

    public List<Integer> postorder(Node root) {
        LinkedList<Integer> list = new LinkedList<>();
        if (root == null)
            return list;
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            Node node = stack.pop();
            List<Node> child = node.children;
            list.addFirst(node.val);
            for (Node no : child) {
                stack.push(no);
            }
        }
        return list;
    }


    public List<Integer> preorder(Node root) {
        List<Integer> result = new LinkedList<>();
        Stack<Node> nodeStack = new Stack<>();
        if (root == null) {
            return result;
        }

        nodeStack.push(root);

        while (!nodeStack.isEmpty()) {
            Node nextNode = nodeStack.pop();
            result.add(nextNode.val);

            for (int i = nextNode.children.size() - 1; i >= 0; i--) {
                Node node = nextNode.children.get(i);
                if (node != null) {
                    nodeStack.push(node);
                }
            }
        }
        return result;
    }
}
