package com.company;

public class Stack{
    private int items[];
    private int count;

    public Stack(int capacity){
        items = new int[capacity];
    }

    public void push(int item){
        if(count == items.length)
            throw new StackOverflowError();
        items[count++] = item;
    }
    public int pop() {
        if (count == 0)
            throw new IllegalStateException();
        return items[--count];
    }
    public int peek(){
        if (count == 0)
            throw new IllegalStateException();
        return items[count -1];
    }
    public void print(){
        for(int i = 0; i <count; i++)
        {
            System.out.println(items[i]);
        }
    }

//    or using java in build method to show contain of array
//    @Override
//    public String toString() {
//        var content = Arrays.copyOfRange(items, 0, count);
//        return Arrays.toString(content);
//    }
    
}