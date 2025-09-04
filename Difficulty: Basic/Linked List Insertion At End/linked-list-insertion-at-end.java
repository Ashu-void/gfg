/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node insertAtEnd(Node head, int x) {
        // code here
        Node newNode = new Node(x);
        Node temp = head;
        
        if(head == null){
            head = newNode;
            return head;
        }
        
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        
        return head;
        
    }
}