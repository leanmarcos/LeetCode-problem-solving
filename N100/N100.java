package N100;

public class N100 {

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode() {}
     *     TreeNode(int val) { this.val = val; }
     *     TreeNode(int val, TreeNode left, TreeNode right) {
     *         this.val = val;
     *         this.left = left;
     *         this.right = right;
     *     }
     * }
     */

    public boolean isSameTree(TreeNode p, TreeNode q) {

        if(p == null && q == null) return true;
        if(p == null || q == null) return false;

        Queue<TreeNode> treeOne = new LinkedList<>();
        Queue<TreeNode> treeTwo = new LinkedList<>();

        treeOne.add(p);
        treeTwo.add(q);

        while(!treeOne.isEmpty() && !treeTwo.isEmpty()){
            TreeNode actual1 = treeOne.poll();
            TreeNode actual2 = treeTwo.poll();

            if(actual1.val != actual2.val) return false;

            // controlar caso en el que uno sea null y el otro no
            if((actual1.left == null && actual2.left != null) ||
                    actual1.left != null && actual2.left == null
            ) return false;

            if((actual1.right == null && actual2.right != null) ||
                    actual1.right != null && actual2.right == null
            ) return false;


            if(actual1.left != null) treeOne.add(actual1.left);
            if(actual1.right != null) treeOne.add(actual1.right);

            if(actual2.left != null) treeTwo.add(actual2.left);
            if(actual2.right != null) treeTwo.add(actual2.right);
        }

        return true;
    }
}
