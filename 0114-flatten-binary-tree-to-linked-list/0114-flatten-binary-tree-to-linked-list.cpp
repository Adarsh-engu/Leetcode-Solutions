/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    void flatten(TreeNode* root) {
        TreeNode* d=new TreeNode(-1);
        solve(root,d);
        TreeNode* ptr=root;
        while(ptr)
        {
            ptr->right=ptr->left;
            ptr->left=nullptr;
            ptr=ptr->right;
        }
    }
    void solve(TreeNode* root,TreeNode* &temp)
    {
        if(!root)
        return;
        temp->left=root;
        temp=root;
        solve(root->left,temp);
        solve(root->right,temp);
    }
};