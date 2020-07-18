package com.company;


import java.util.NoSuchElementException;

public class LinkedList{

    private class Node{
        private int value;
        private Node next;


        public Node (int value){
            this.value = value;
        }
    }

    private Node first;
    private Node last;
    private int size;

    public void addLast(int item){
        var node = new Node(item);

        // For Empty Linked list
        if(first == null){
            first = last = node;
        }
        // For List Containing only one item in it then
        else{
            last.next = node;
            last = node;
        }
        size++;
    }

    public void addFirst(int item){
        var node = new Node(item);

        if(first == null){
            first = last = node;
        }
        else{
            node.next = first;
            first = node;
        }
        size++;
    }

    public void removeLast(){
        if(first == null){
            throw new NoSuchElementException();
        }
        if(first == last) {
            first = last = null;
        }
        else{
            // 10 -> 20 -> 30
            //       P      L
        var previous = getPrevious(last);
        last = previous;
        last.next = null;
        }
        size--;
    }
    private Node getPrevious(Node node){
        var current = first;
        while(current != null){
            if(current.next == node) return current;
            current = current.next;
        }
        return null;
    }

    public void removeFirst(){

        if(first == null)
            throw new IllegalStateException();
        if(first == last)
            first = last = null;
        else {
            // 10 -> 20 -> 30 -> 40
            // F     S
            var second = first.next;
            first.next = null;
            first = second;
        }
        size--;
    }

    public int size(){
        return size;
    }

    public int[] toArray(){
        int array[] = new int[size];
        int index = 0;
        var current = first;

        while(current != null){
            array[index++] = current.value;
            current = current.next;
        }
        return array;
    }

    public void reverse(){
        if(first == null)
            return;

        var previous = first;
        var current = first.next;
        while(current != null){
            var next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        last = first;
        last.next = null;
        first = previous;
    }

    public int indexOf(int item){
        var current = first;
        var index = 0;

        while(current != null) {
            if (current.value == item)
                return index;
            current = current.next;
            index++;
        }
        return -1;
    }

    public boolean contain(int item){
        return indexOf(item) != -1;
    }

    public boolean isEmpty(){
        return first == null;
    }
    
    public void print(){
        var current = first;

        while(current != null){
            System.out.println(current.value);
            current = current.next;
        }
    }
}