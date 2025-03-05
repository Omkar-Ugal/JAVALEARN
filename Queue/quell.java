package Queue;

import ArrayQuestion.removeDublicate;

class Queuell{
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node front,rear;

    public Queuell(){
        front = rear = null;
    }

    public boolean isEmpty(){
        return front == null;
    }

    public void enqueue(int item){
        Node newNode = new Node(item);

        if(rear == null){
            front = rear = newNode;
        }
        else{
            rear.next = newNode;
            rear = newNode;
        }
        System.out.println(item+" ");
    }

    public int dequeue(){
        if(isEmpty()){
            System.out.println("list is empty");
            return -1;
        }
        else{
            int item = front.data;
            front = front.next;
            if(front == null){
                rear = null;
            }
            System.out.println(item+ " deque from the queue");
            return item;
        }
    }

    public int front(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return -1;
        }
        return front.data;
    }

    public void print(){
        if(front == null){
            System.out.println("queue is empty");
            return;
        }

        Node current = front;
        while(current != null){
            System.out.print(current.data+" ");
            current = current.next;
        }
        System.out.println();
    }
}
public class quell {
    public static void main(String[] args) {
       Queuell q = new Queuell();
       q.enqueue(1);
       q.enqueue(2);
       q.enqueue(3);
       q.enqueue(4);
       q.enqueue(5);
       q.print(); 
    }
}
