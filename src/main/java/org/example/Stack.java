package org.example;

import java.util.Arrays;

public class Stack {
    private int[] values = new int[5];
    private int size;




    //Push
    public void push(int value){
        //If new value exceeds capacity of stack
        if(this.size == this.values.length){
           throw new StackOverflowError();
            }
        //Add value to top of array and increment size
        this.values[size++] = value;
    }

    //Pop
    public int pop(){
        if(this.size == 0)
            throw new IllegalStateException();
        //First decrement the size by one (currently size represents an open/empty space in which to push), then return the value/
        return this.values[--this.size];
    }

    @Override
    public String toString(){
        var content = Arrays.copyOfRange(this.values, 0, this.size);
        return Arrays.toString(content);
    }

    //Peek
    public int peek(){
        if(this.size == 0)
            throw new IllegalStateException();
        return this.values[this.size-1];
    }

    //Return Stack Min


    //isEmpty
    public boolean isEmpty(){
        return this.size == 0;
    }
}
