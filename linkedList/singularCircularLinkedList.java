package linkedList;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    } 
} 

class SCLL{
    Node head; 
    
    public SCLL(){
        head = null;
    } 
    public void append(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            newNode.next = head;
        }
        else{
            Node current = head;
            while(current.next != head){
                current = current.next;
            }
            current.next = newNode;
            newNode.next = head;
        }
    }

    public void print(){
        if(head == null){
            System.out.println("list is Empty");
            return;
        }
        Node current = head;
        do{
            System.out.print(current.data+" -> ");
            current = current.next;
        }
        while(current != head);
          //  System.out.println("back to head");
        
    }
}
public class singularCircularLinkedList {
    public static void main(String[] args) {
        SCLL list = new SCLL();
        list.append(10);
        list.append(20);
        list.append(30);
        list.append(40);

        System.out.println("Singly Circular Linked List:");
        list.print();

    }
}
