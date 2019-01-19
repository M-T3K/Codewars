
public class Stack {

    private int stack;
    private int base;   // Base of the Stack, aka the amount of different data that the Stack
                       // can hold.

    // Constructor.
    public Stack(int base) {

        this.stack = 1;
        this.base = base;
    }
	// -------------------------------------------------------------

    public boolean isEmpty() {

        return this.stack == 1;
    }
    // --------------------------------------------------------------------

    public int peek() {

		return this.stack % this.base;
	}
	// -------------------------------------------------------------

	// Simulation of 'pop' behavior.
	public int pop() {
        
        int res = this.peek();
        this.stack = stack / base;
        return res;
	}
	// -------------------------------------------------------------

    // Simulation of 'push' behavior. Returns true if successfully pushed item, and false if 
    // it isn't able to.
	public boolean push(int value) {

        long val = (long)this.getBase() * (long)this.getStack() + (long)value;
        // System.out.printf("number := %d\n", val);
        
        // This checks for overflows. If the int > Integer.MAX_VALUE there will be a loss of data
        // which will mean that our Int Stack is full.
        if((long)(int)(val) != val || value > this.base) {

            return false;
        }
        
        this.stack = (int) val;
        return true;
	}
    // -------------------------------------------------------------
    
    // These are used internally by the tester.
    public int getStack() {return this.stack;}
    public int getBase() {return this.base;}
	// -------------------------------------------------------------

}