package DS;
public class stack{
    private char[] data;
    private static final int DEFAULT_SIZE = 100;

    public stack(){
        this(DEFAULT_SIZE);
    }

    public stack(int size){
        data = new char[size];
    }

    int ptr = -1;

    public boolean push(char value){
        if(isFull()){
            System.out.println("Stack is Full");
            return false;
        }
        ptr++;
        data[ptr] = value;
        return true;
    }

    public char pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is Empty");
        }
        char item = data[ptr];
        ptr--;
        return item;
    }

    public char peek() throws Exception{
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