package org.example;

// We need two stacks to implement a min stack.
// One stack holds the values, the other stack
// (called minStack) holds the minimums.
public class MinStack {
    //Construct a two stack objects one a regular stack and one a minstack
    Stack stack = new Stack();
    Stack minStack = new Stack();

    //Push item into regular stack.
    //If minStack is empty push it in, otherwise peek at the bottom of the minStack and push it if's lower
    public void push(int value) {
        stack.push(value);

        if(minStack.isEmpty()){
            minStack.push(value);
        }
        else if(value < minStack.peek()){
            minStack.push(value);
        }
    }

    //If empty throw exception.
    // Pop the top if regular stack and save as a variable.
    //If the top of minStack is the same as the top of stack, then pop from minStack as well.
    public int pop() {
        if(stack.isEmpty()){
            throw new IllegalStateException();
        }
        var top = stack.pop();

        if(minStack.peek() == top){
            minStack.pop();
        }
        return top;
    }

    //Peek at minStack and return that value
    public int min() {
        return minStack.peek();
    }
}

