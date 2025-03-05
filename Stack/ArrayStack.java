package Stack;

class StackArr{
    int[] stack;
    int top;
    int size;

    public StackArr(int size){
        this.size = size;
        stack = new int[size];
        top = -1;
    }

    public void push(int x){
        if(top == size -1){
            System.out.println("stack overFlow");
            return;
        }
        stack[++top] = x;
    }

    public int pop(){
        if(top == -1){
            return -1;
        }
        return stack[top--];
    }

    public int peek(){
        if(top == -1){
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top];
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == size-1;
    }

}
public class ArrayStack {
    public static void main(String[] args) {
        StackArr st = new StackArr(5);
        st.push(1);
        st.push(2);
        st.push(3);
        st.pop();
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st.peek());
        while(!st.isEmpty()){
            System.out.print(st.peek()+" ");
            st.pop();
         }
    }
}
