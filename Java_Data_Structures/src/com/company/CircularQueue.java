package com.company;

import java.util.Arrays;

public class CircularQueue {

    private int items[];
    private int rear;
    private int front;
    private int count;

    public ArrayQueue(int capacity){
        items = new int[capacity];
    }

    public void enqueue(int item){
        if(count == items.length)
            throw new IllegalStateException();
        items[rear] = item;
        rear = (rear + 1) % items.length;
        count++;

    }

    public int dequeue(){
        if(count == 0)
            throw new IllegalStateException();
        var item = items[front];
        items[front] = 0;
        front = (front + 1) % items.length;
        count--;
        return item;
    }

    public int peek(){
        if(count == 0)
            throw new IllegalStateException();
        return items[front];
    }

    @Override
    public String toString(){
        return Arrays.toString(items);
    }

}
