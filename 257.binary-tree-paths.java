/*
 * @lc app=leetcode id=257 lang=java
 *
 * [257] Binary Tree Paths
 */

// @lc code=start
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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();

        isLeaf(root,root.val+"",paths);

        return paths;

    }

    private void isLeaf(TreeNode root,String path,List<String> paths){

        if(root.left == null && root.right == null){
            paths.add(path);
        }
        else{

            if(root.left != null ){
                
                isLeaf(root.left , path+"->"+root.left.val, paths);
                
            }
            if(root.right!=null){
                
                isLeaf(root.right , path+"->"+root.right.val, paths);

            }

        }
    }
}
// @lc code=end

