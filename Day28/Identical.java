/*
Given two binary trees, the task is to find if both of them are identical or not.
Note: You need to return true or false, the printing is done by the driver code.

Example 1:

Input:
     1          1
   /   \      /   \
  2     3    2     3
Output: 
Yes
Explanation: 
There are two trees both having 3 nodes and 2 edges, both trees are identical having the root as 1, left child of 1 is 2 and right child of 1 is 3.
Example 2:

Input:
    1       1
  /  \     /  \
 2    3   3    2
Output: 
No
Explanation: There are two trees both having 3 nodes and 2 edges, but both trees are not identical.
Your task:
Since this is a functional problem you don't have to worry about input, you just have to complete the 
function isIdentical() that takes two roots as parameters and returns true or false. The printing is done by the driver code.
*/
  
  //code

class Identical
{
    //Function to check if two trees are identical.
	boolean isIdentical(Node root1, Node root2)
	{
	     if (root1 == null && root2 == null) {
            return true;
        }

        // If one tree is empty and the other is not, they are not identical.
        if (root1 == null || root2 == null) {
            return false;
        }

        // Check if the current nodes are equal and recursively check left and right subtrees.
        return (root1.data == root2.data) && 
               isIdentical(root1.left, root2.left) && 
               isIdentical(root1.right, root2.right);
	}
	
}
