/* 
Given a Binary Tree. Check whether it is Symmetric or not, i.e. whether the binary tree is a Mirror image of itself or not.

Example 1:

Input:
         5
       /   \
      1     1
     /       \
    2         2
Output: 
True
Explanation: 
Tree is mirror image of itself i.e. tree is symmetric
Example 2:

Input:
         5
       /   \
      10     10
     /  \     \
    20  20     30
Output: 
False
Your Task:
You don't need to read input or print anything. Your task is to complete the function isSymmetric() which 
takes the root of the Binary Tree as its input and returns True if the given Binary Tree is the same as 
the Mirror image of itself. Else, it returns False.
  
  //code
  
class Symmetric {
    // Helper function to check if two trees are mirror images of each other
    public static boolean isMirror(Node node1, Node node2) {
        // If both nodes are null, they are mirror images
        if (node1 == null && node2 == null)
            return true;

        // If only one of the nodes is null, they can't be mirror images
        if (node1 == null || node2 == null)
            return false;

        // Check if the current nodes' values are equal and
        // their subtrees are mirror images of each other
        return (node1.data == node2.data)
            && isMirror(node1.left, node2.right)
            && isMirror(node1.right, node2.left);
    }

    // Main function to check whether the tree is symmetric or not
    public static boolean isSymmetric(Node root) {
        if (root == null)
            return true;

        // Check if the left and right subtrees are mirror images
        return isMirror(root.left, root.right);
    }
}
//Expected Time Complexity: O(N).
//Expected Auxiliary Space: O(Height of the Tree).
