package com.malenxe;

import java.util.Arrays;

public class MyStack {
    private class Node{
        private int data;
        Node next;
    }
    Node first;
    Node last;
    int count = 0;
    public void push(int data){
        Node newNode = new Node();
        newNode.data = data;
        if (first == null)
            first = last = newNode;
        else {
            Node tempNode = first;
            while (tempNode.next != null){
                tempNode = tempNode.next;
            }
            tempNode.next = newNode;
            last = newNode;
        }
        count++;
    }
    public int pop(){
        Node current;
        Node nNode = current = first;
        if (first == last){
            first = last = null;
            count--;
            return current.data;
        }
        nNode = nNode.next;
        while(nNode.next != null){
            current = current.next;
            nNode = nNode.next;
        }
        current.next = null;
        last = current;
        count--;
        return nNode.data;
    }
    public int peek(){
        Node current = first;
        while (current.next != null){
            current = current.next;
        }
        return current.data;
    }
    private int[] arrays(Node current){
        int[] array = new int[count];
        int index = 0;
        while (current != null){
            array[index++] = current.data;
            current = current.next;
        }
        return  array;
    }
    public boolean isEmpty(){
        return first == null;
    }

    @Override
    public String toString(){
        return Arrays.toString(arrays(first));
    }
}