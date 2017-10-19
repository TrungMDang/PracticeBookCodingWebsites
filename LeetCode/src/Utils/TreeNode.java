package Utils;

/**
 * Created by Trung on 10/17/2017.
 */
public class TreeNode {
    private int val;
    private TreeNode left;
    private TreeNode right;
    public TreeNode(int data){
        val = data;
    }

    public int getVal() {
        return val;
    }
    public TreeNode getRight() {
        return this.right;
    }
    public TreeNode getLeft() {
        return this.left;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }
}
