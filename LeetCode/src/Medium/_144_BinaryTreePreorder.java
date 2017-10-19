package Medium;

import java.util.*;
import Utils.TreeNode;

/**
 * Created by Trung on 10/17/2017.
 *
 * Problem statement: Traverse a binary tree pre-order using iterative approach.
 * Solution:
 *
 */
public class _144_BinaryTreePreorder {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        TreeNode fallBack;
        if (root != null) {
            Queue<TreeNode> q = new LinkedList<>();
            Stack<TreeNode> right = new Stack<>();
            q.add(root);
            while (!q.isEmpty()){
                TreeNode curr = q.poll();
                if (curr != null) {
                    result.add(root.getVal());
                }
                if (curr.getRight() != null) right.add(curr.getRight());
                while (curr.getLeft() != null) {
                    q.add(curr.getLeft());
                    continue;
                }
                //No more on left subtree


            }


        }
        return result;
    }
}
