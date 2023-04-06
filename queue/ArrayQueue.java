package com.malenxe;

import java.util.Arrays;

public class ArrayQueue {
    private int[] queue;
    public ArrayQueue(int size){
        queue = new int[size];
    }
    private int count = 0;
    private int rear = 0;
    private int front = 0;

    public void enqueue(int value){
        if (count == queue.length)
            throw new IllegalStateException();
        queue[rear] = value;
        rear = (rear + 1) % queue.length;
        count++;
    }
    public int dequeue(){
        int val = queue[front];
        queue[front] = 0;
        front = (front + 1) % queue.length;
        count--;
        return val;
    }
    public int peek(){
        return queue[front];
    }
    public boolean isFull(){
        return (count == queue.length);
    }
    public boolean isEmpty(){
        return (count == 0);
    }
    @Override
    public String toString(){
        return Arrays.toString(queue);
    }
}