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
    public List<TreeNode> generateTrees(int n) {
        if(n>0)
        return helper(1,n);
        return new ArrayList<>();
    }
    List<TreeNode> helper(int low,int high)
    {
        List<TreeNode> ans=new ArrayList<>();
        if(low>high)
        {
            ans.add(null);
            return ans;
        }
        for(int i=low;i<=high;i++)
        {
            List<TreeNode> left=helper(low,i-1);
            List<TreeNode> right=helper(i+1,high);
            for(var l:left)
            {
                for(var r:right)
                {
                    TreeNode curr=new TreeNode(i);
                    curr.left=l;
                    curr.right=r;
                    ans.add(curr);
                }
            }
        }
        return ans;
    }
}