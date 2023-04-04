import java.util.Arrays;
public class MyStack {
    int[] array = new int[10];
    private int count = 0;
    public void push(int data){
        array[count++] = data;
    }
    public int peek(){
        return array[count - 1];
    }
    public int pop(){
        return array[--count];
    }
    public boolean isEmpty(){
        return count == 0;
    }
    @Override
    public String toString(){
        var content = Arrays.copyOfRange(array, 0, count);
        return Arrays.toString(content);
    }
}