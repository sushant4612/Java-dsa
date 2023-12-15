package DS;

public class queue {

    private int[] data;

    private static final int DEFAULT_SIZE = 10;

    public queue(int size){
        this.data = new int[size];
    }

    public queue(){
        this(DEFAULT_SIZE);
    }

    int end = -1;

    public boolean add(int item){
        if(isFull()){
            return false;
        }
        end++;
        data[end] = item;
        return true;
    }

    public int delete() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }
        int val = data[0];
        for (int i = 1; i < data.length ; i++) {
            data[i-1] = data[i];
        }
        end--;
        return val;
    }


    public void display(){
        for (int i = 0; i <= end ; i++) {
            System.out.print(data[i] + "->");
        }
        System.out.println("END");
    }

    public boolean isEmpty(){
        return end == -1;
    }

    public  boolean isFull(){
        return end == data.length - 1;
    }
}
