/*
Given two linked lists sorted in increasing order, create a new linked list representing the intersection of the two linked lists. 
The new linked list should be made with without changing the original lists.

Note: The elements of the linked list are not necessarily distinct.

Example 1:

Input:
LinkedList1 = 1->2->3->4->6
LinkedList2 = 2->4->6->8
Output: 2 4 6
Explanation: For the given two
linked list, 2, 4 and 6 are the elements
in the intersection.
Example 2:

Input:
LinkedList1 = 10->20->40->50
LinkedList2 = 15->40
Output: 40
Your Task:
You don't have to take any input of print anything. Your task is to complete the function findIntersection(), 
which will take head of both of the linked lists as input and should find the intersection of two linked list 
and add all the elements in intersection to the third linked list and return the head of the third linked list.
  */
  
  //code

class Insertion
{
   public static Node findIntersection(Node head1, Node head2)
    {
        Node result = null;
        Node tail = null;

        while (head1 != null && head2 != null) {
            if (head1.data == head2.data) {
                // Found an intersection, add to the result list
                if (result == null) {
                    result = new Node(head1.data);
                    tail = result;
                } else {
                    tail.next = new Node(head1.data);
                    tail = tail.next;
                }
                head1 = head1.next;
                head2 = head2.next;
            } else if (head1.data < head2.data) {
                head1 = head1.next;
            } else {
                head2 = head2.next;
            }
        }
        return result;
    }
}
//Expected Time Complexity : O(n+m)
//Expected Auxilliary Space : O(n+m)
