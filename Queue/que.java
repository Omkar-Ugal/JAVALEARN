package Queue;

class Queue{
     int[] queue;
     int front,rear,size,capacity;
      public Queue(int capacity){
        this.capacity = capacity;
        queue = new int[capacity];
        size = 0;
        rear = -1;
        front = 0;
      } 
      
      public boolean isFull(){
        return size == capacity;
      }

      public boolean isEmpty(){
        return size == 0;
      }

      public void enqueue(int item){
        if(isFull()){
            System.out.println("queue is full");
        }
        else{
            rear = (rear+1) % capacity;
            queue[rear] = item;
            size++;
        }
      }

      public int dequeue(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return -1;
        }
        else{
            int item = queue[front];
            front = (front + 1) % capacity;
            size--;
            return item;
        }
      }

      public int front(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return -1;
        }
        else{
            return queue[front];
        }
      }

      public void display(){
        if(isEmpty()){
            System.out.println("queue is empty");
        }
        else{
            int i = front;
            while(i != rear){
                System.out.print(queue[i] + " ");
                i = (i+1) % capacity;
            }
            System.out.println(queue[rear]);
         }
      }
}
public class que {
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        System.out.println(q.dequeue());
        q.display();
    }
}
