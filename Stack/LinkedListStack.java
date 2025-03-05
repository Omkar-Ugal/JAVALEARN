package Stack;

class StackLL{
    private class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    public StackLL(){
        head = null;
    }

    public void push(int x){
        Node newnode = new Node(x);
        newnode.next = head;
        head = newnode;
    }

    public int pop(){
        if(head == null){
            System.out.println("stackUnderFlow");
            return -1;
        }
        int popItem = head.data;
        head = head.next;
        return popItem;
    }

    public int peek(){
        if(head == null){
            System.out.println("stack is empty");
            return -1;
        }
        return head.data;
    }

    public boolean isEmpty(){
        return head == null;
    }
}
public class LinkedListStack {
   public static void main(String[] args) {
    StackLL st = new StackLL();
    st.push(1);
    st.push(1);
    st.push(1);
    st.push(1);
    st.push(1);
    st.push(1);
    st.push(1);
    st.push(1);
    st.push(1);
    st.push(1);
    st.push(1);

   System.out.println(st.peek());

   st.pop();

   while(!st.isEmpty()){
    System.out.print(st.peek()+" ");
    st.pop();
     }
   } 
}
