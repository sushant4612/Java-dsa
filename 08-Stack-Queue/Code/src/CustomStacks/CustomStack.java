package CustomStacks;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    public CustomStack(int size){
        this.data = new int[size];
    }

    public CustomStack(){
        this(DEFAULT_SIZE);
    }
    int ptr = -1;

    public boolean push(int value){
        if(isFull()){
            System.out.println("Stack is Full");
            return false;
        }
        ptr++;
        data[ptr] = value;
        return true;
    }

    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is Empty");
        }
        int item = data[ptr];
        ptr--;
        return item;
    }

    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is Empty");
        }
        return data[ptr];
    }

    public boolean isFull(){
        return ptr == data.length - 1;
    }

    public boolean isEmpty(){
        return ptr == -1;
    }
}
