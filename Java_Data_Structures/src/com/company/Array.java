package com.company;

public class Array {

    private int items[];
    private int count;

    public Array(int capacity) {
        items = new int[capacity];
    }

    public void insert(int item){
        items[count++] = item;
        resizeIfRequired();
    }

    private void resizeIfRequired(){
        if(items.length == count){
            var newItems = new int[count * 2];

            for (int i = 0; i < count; i++)
                newItems[i] = items[i];

            items = newItems;
        }
    }

    public void insertAt(int item, int index){
        if(index < 0 || index > count)
            throw new IllegalArgumentException();
        // 10, 20, 30, 40,    <-- 25 , 2
        // 0   1   2   3      count = 4 , i = 3
        resizeIfRequired();
        for (int i = count - 1;i >= index; i--){
            items[i + 1] = items[i];
        }
        items[index] = item;
        count++;
    }

    public void removeAt(int index) {
        if (index < 0 || index >= count)
            throw new IllegalArgumentException();
        // 10, 20, 30, 40, 50    index = 3
        //
        for (int i = index; i < count; i++)
            items[i] = items[i + 1];
        count --;
    }

    public void reversed(){
        var newItems = new int[count];
        // 10, 20, 30, 40, 50      count = 5 - 0 - 1 = 4

        // 50, 40, 30, 20, 10
        for (int i = 0; i < count; i++)
            newItems[i] = items[count - i - 1];

        items = newItems;
    }

    public int indexOf(int item){
        for(int i = 0; i < count; i++)
            if(items[i] == item)
                return i;

        return -1;
    }

    public int max() {
        int max = 0;
        for (int i = 0; i < count; i++) {
            if (max < items[i])
                max = items[i];
        }
        return max;
    }

    public void print(){
        for (int i = 0; i < count; i++)
            System.out.println(items[i]);
    }
}
