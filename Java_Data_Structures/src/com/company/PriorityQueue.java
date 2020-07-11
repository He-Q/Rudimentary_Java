package com.company;

import java.util.Arrays;

public class PriorityQueue {

    private int items[];
    private int count;

    public PriorityQueue(int capacity){
        items = new int[capacity];
    }

    public void add(int item){
        if(count == items.length)
            throw new IllegalStateException();
        // 10, 20, 40, 50   item = 30
        var i = shiftItemsToInsert(item);      // return index at which you should insert new item
        items[i] = item;
        count++;
    }
    public int shiftItemsToInsert(int item){
        int i;
        for(i = count - 1; i >= 0 ; i--){
            if(items[i] > item)
                items[i + 1] = items[i];
            else
                break;
        }
        return i + 1;
    }

    public int  remove(){
        if(count == 0)
            throw new IllegalStateException();
        return items[--count];
    }

    @Override
    public String toString(){
        return Arrays.toString(items);
    }
}
