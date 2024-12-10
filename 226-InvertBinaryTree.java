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
class Solution {

    public TreeNode invertTree(TreeNode root) {
        // recursive
        if(root==null){
            return null;
        }



        TreeNode left =invertTree(root.left);
        TreeNode right=invertTree(root.right);

        root.left=right;
        root.right=left;
    
    


    /* itereative
        if(root == null){
            return null;
        }
        final List <TreeNode> res= new ArrayList();

        res.add(root);

        while(!res.isEmpty()){
            final TreeNode node = res.remove(0); use poll if you are using a queue

            final TreeNode temp = node.left;
            node.left = node.right;
            node.right=temp;

            if(node.left != null){
                res.add(node.left);
            }
            if(node.right != null){
                res.add(node.right);
            }


        }
        return root;*/
        return root;      

        
    }
}
