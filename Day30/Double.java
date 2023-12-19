/*
Given a doubly linked list of n elements. Your task is to reverse the doubly linked list in-place.

Example 1:

Input:
LinkedList: 3 <--> 4 <--> 5
Output: 5 4 3
Example 2:

Input:
LinkedList: 75 <--> 122 <--> 59 <--> 196
Output: 196 59 122 75
Your Task:
Your task is to complete the given function reverseDLL(), which takes head reference as argument and this 
function should reverse the elements such that the tail becomes the new head and all pointers are pointing 
in the right order. You need to return the new head of the reversed list. The printing and verification is done by the driver code.
*/

//Code

public static Node reverseDLL(Node  head)
{
    Node temp = head;
    
    while (temp.next!=null) {
        Node t = temp.prev;
        temp.prev = temp.next;
        temp.next = t;
        temp = temp.prev;
    }
    Node t = temp.prev;
    temp.prev = temp.next;
    temp.next = t;
    head = temp;
    
    return head;
}
