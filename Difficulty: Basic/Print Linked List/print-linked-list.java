
/*
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}*/

class Solution {
    public int[] displayList(Node head) {
        // code here
        Node current = head;
        int n = 0;
        while(current != null){
            current = current.next;
            n++;
        }
        current = head;
        int[] result = new int[n];
        int i = 0;
        while(current!=null){
            result[i] = current.data;
            current = current.next;
            i++;
        }
        
        return result;
    }
}
