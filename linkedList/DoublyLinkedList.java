package linkedList;

class Node{
    int data;
    Node next;
    Node prev;
    
    Node(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class DDL{
    Node head;

    public DDL(){
        head = null;
    }

    public void append(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
        newNode.prev = current;
    }

    public void insertAtBegin(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void printListForward() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Print all the nodes in the list from tail to head
    public void printListBackward() {
        if (head == null) return; // If the list is empty

        // Traverse to the last node
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        // Traverse backward from the last node
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.prev;
        }
        System.out.println("null");
    }

}
public class DoublyLinkedList {
    public static void main(String[] args) {
        DDL list = new DDL();
        list.append(10);
        list.append(20);
        list.append(30);
        list.append(40);

        System.out.println("List printed forward:");
        list.printListForward(); 
        
        list.insertAtBegin(5);

        System.out.println("List printed forward after prepending 5:");
        list.printListForward();

        // Print the list backward
        System.out.println("List printed backward:");
        list.printListBackward();

    }
}
