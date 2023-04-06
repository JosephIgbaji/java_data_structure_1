package com.malenxe;

import java.util.Arrays;

public class LinkedListQueue {
    private class Node{
        int data;
        Node next;
    }
    private int size;
    Node first;
    Node last;
    public void add(int data){
        Node newNode = new Node();
        newNode.data = data;
        if (first == null)
            first = last = newNode;
        else {
            Node current = first;
            while(current.next != null)
                current = current.next;
            current.next = newNode;
            last = newNode;
        }
        size++;
    }
    public int remove(){
        Node current = first;
        Node nNode = current.next;
        first = nNode;
        size--;
        return current.data;
    }
    public int peek(){
        return first.data;
    }
    public boolean isEmpty(){
        return first == null;
    }
    @Override
    public String toString(){
        int[] array = toArray(first);
        return Arrays.toString(array);
    }
    private int[] toArray(Node first){
        var current = first;
        int[] array = new int[size];
        int i = 0;
        while(current != null){
            array[i++] = current.data;
            current = current.next;
        }
        return array;
    }
}
