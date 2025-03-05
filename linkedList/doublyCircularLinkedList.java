package linkedList;

// Node class to represent each node in the doubly circular linked list
class Node {
    int data;  // Data stored in the node
    Node next; // Reference to the next node
    Node prev; // Reference to the previous node

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

// DoublyCircularLinkedList class to represent the doubly circular linked list
class DoublyCircularLinkedList {
    Node head; // Head of the list

    // Constructor to initialize an empty list
    public DoublyCircularLinkedList() {
        head = null;
    }

    // Add a node at the end of the list
    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;  // If the list is empty, make the new node the head
            newNode.next = head;
            newNode.prev = head; // Point to itself (circular nature)
        } else {
            Node current = head;
            while (current.next != head) {  // Traverse until we find the last node
                current = current.next;
            }
            current.next = newNode; // Point the last node to the new node
            newNode.prev = current; // Make the new node's prev point to the current node
            newNode.next = head;    // Point the new node to head
            head.prev = newNode;    // Point the head's prev to the new node
        }
    }

    // Print all nodes in the list (one full circle traversal)
    public void printList() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node current = head;
        do {
            System.out.print(current.data + " <-> ");
            current = current.next;
        } while (current != head);
        System.out.println("(back to head)");
    }

    // Delete the first occurrence of a node with specific data
    public void delete(int data) {
        if (head == null) {
            return; // Empty list, nothing to delete
        }

        // If the head node itself holds the data to be deleted
        if (head.data == data) {
            if (head.next == head) {
                head = null; // If there's only one node, make the list empty
            } else {
                Node current = head;
                while (current.next != head) { // Traverse to find the last node
                    current = current.next;
                }
                current.next = head.next; // Last node points to the second node
                head.next.prev = current; // Second node's prev points to last node
                head = head.next;         // Move head to the next node
            }
            return;
        }

        // Traverse the list to find the node to delete
        Node current = head;
        while (current.next != head && current.data != data) {
            current = current.next;
        }

        if (current.data == data) {
            current.prev.next = current.next; // Previous node points to the next node
            current.next.prev = current.prev; // Next node points to the previous node
        }
    }
}

// Main class to test the Doubly Circular Linked List
public class doublyCircularLinkedList {
    public static void main(String[] args) {
        DoublyCircularLinkedList list = new DoublyCircularLinkedList();

        // Add nodes to the list
        list.append(10);
        list.append(20);
        list.append(30);
        list.append(40);

        System.out.println("Doubly Circular Linked List:");
        list.printList();

        // Delete a node from the list
        list.delete(30);
        System.out.println("After Deleting 30:");
        list.printList();

        // Delete the head node
        list.delete(10);
        System.out.println("After Deleting 10 (head node):");
        list.printList();
    }
}
