package Easy;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * Created by Trung on 10/17/2017.
 */
public class _617_Merge2BinaryTrees {

    public static TreeNode merge(TreeNode t1, TreeNode t2) {
        Queue<TreeNode> q1 = new LinkedList<>();
        Queue<TreeNode> q2 = new LinkedList<>();
        Set<TreeNode> visited1 = new HashSet<>();
        Set<TreeNode> visited2 = new HashSet<>();

        q1.add(t1);
        q2.add(t2);

        return null;
    }

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
