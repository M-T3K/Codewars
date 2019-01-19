
public class Stack {

    private int stack;  // The Integer we are using to store data.
    private int base;   // Represents the different types of data that can be pushed onto the stack.
                        // To Understand this, imagine a map where each key has a corresponding value. 
                        // <base> represents the different values that a key can have, in the interval [0, base - 1]

    // Incomplete
    public Stack(int base){

        //...
        this.base = base;
    }

    // Incomplete
    public boolean isEmpty() {

        return true;
    }

    // Incomplete
    public boolean push(int value) {

        return true;
    }    

    // Incomplete
    public int peek() {
        
        return -1;
    }

    // Incomplete
    public int pop() {

        return -1;
    }

    // Do not modify
    public int getBase() {return this.base;}
    public int getStack() {return this.stack;}

}