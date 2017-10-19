package Medium;

import org.junit.Before;
import org.junit.Test;
import java.util.*;
import java.lang.*;
import Utils.TreeNode;

/**
 * Created by Trung on 10/17/2017.
 *
 * Source: GeeksForGeeks.org
 */
public class _144_BinaryTreePreorderTest {


    // Java program to find maximum sum leaf to root
// path in Binary Tree
    TreeNode root;
    @Before
    // driver function to test the above functions
    public void setUp(String args[])
    {
        // Input the number of test cases you want to run
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t > 0)
        {
            HashMap<Integer, TreeNode> m = new HashMap<> ();
            int n = sc.nextInt();

            this.root = null;

            while (n > 0)
            {
                int n1 = sc.nextInt();
                int n2 = sc.nextInt();
                char lr = sc.next().charAt(0);

                //  cout << n1 << " " << n2 << " " << (char)lr << endl;
                TreeNode parent = m.get(n1);
                if (parent == null)
                {
                    parent = new TreeNode(n1);
                    m.put(n1, parent);
                    if (root == null)
                        root = parent;
                }

                TreeNode child = new TreeNode(n2);
                if (lr == 'L')
                    parent.setLeft(child);
                else
                    parent.setRight(child);
                m.put(n2, child);
                n--;
            }

            try {
                preorderTraversal(root);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.print("\n");
            t--;
        }
    }

    @Test
    public void preorderTraversal(TreeNode root) throws Exception {

    }

}