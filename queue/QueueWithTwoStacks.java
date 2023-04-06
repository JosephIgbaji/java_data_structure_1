package com.malenxe;

import java.util.Arrays;
import java.util.Stack;

public class StackQueue {
    Stack<Integer> stackAdd = new Stack<>();
    Stack<Integer> stackRem = new Stack<>();
    private int count = 0;

    public void enqueue(int value){
        stackAdd.push(value);
        count++;
    }
    public int dequeue(){
        toNewStack();
        count--;
        return stackRem.pop();
    }
    private void toNewStack(){
        if (stackRem.isEmpty()){
            Stack<Integer> tempStack = stackAdd;
            while(!tempStack.isEmpty())
                stackRem.push(tempStack.pop());
        }

    }
    public int peek(){
        toNewStack();
        return stackRem.peek();
    }

    @Override
    public String toString(){
        int[] array = new int[count];
        int index = 0;
        toNewStack();
        Stack<Integer> tempStack = stackRem;
        while(!tempStack.isEmpty())
            array[index++] = tempStack.pop();
        return Arrays.toString(array);
    }

}