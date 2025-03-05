package linkedList;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class LinkedList{
    Node head;

    public LinkedList(){
        this.head=null;
    }

    public void append(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }
        else{
            Node current = head;
            while(current.next != null){
                current = current.next;
            }

            current.next = newNode;
        }
    }

    public void inserAtHead(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    } 

    public void deleteHead(int data){
        if(head == null) return;

        if(head.data == data){
            head = head.next;
            return;
        }
    }

    public void print(){
        Node current = head;

        while(current != null){
            System.out.print(current.data+" -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public void delete(int data) {
        if (head == null) {
            return; // Empty list, nothing to delete
        }

        // If the head node itself holds the data to be deleted
        if (head.data == data) {
            head = head.next; // Move head to the next node
            return;
        }

        // Traverse the list to find the node to delete
        Node current = head;
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next; // Remove the node
                return;
            }
            current = current.next;
        }
    }
}
public class singlyLinkedListTest {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.append(1);
        list.append(2);
        list.append(2);
        list.append(2);
        list.append(2);
        list.append(2);
        list.delete(2);
        list.inserAtHead(3);
        list.inserAtHead(1);
        list.print();
    }
}
