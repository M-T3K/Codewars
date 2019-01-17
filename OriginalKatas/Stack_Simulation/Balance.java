

public class Balance {

	private static boolean opens(char ch) {

		return "([{<".indexOf(ch) != -1;
	}
	// -------------------------------------------------------------	
	
	private static boolean closes(char ch) {
	
		return ")]}>".indexOf(ch) != -1;
	}
	// -------------------------------------------------------------	
	
	private static boolean matches(char ch1, char ch2) {

		return ((ch1 == '(' && ch2 == ')') || (ch2 == '(' && ch1 == ')'))
			|| ((ch1 == '[' && ch2 == ']') || (ch2 == '[' && ch1 == ']'))
			|| ((ch1 == '{' && ch2 == '}') || (ch2 == '{' && ch1 == '}'))
			|| ((ch1 == '<' && ch2 == '>') || (ch2 == '>' && ch1 == '<'));
	}
	// -------------------------------------------------------------	

	private static char getCharFromValue(int val) {

		if(val == 0) {

			return '(';
		}
		else if(val == 1) {

			return '[';
		}
		else if(val == 2) {

			return '{';
		}
		else {

			return '<';
		}

	} 
	// -------------------------------------------------------------

	private static int getValueFromChar(char ch) {

		return "([{<".indexOf(ch);
	}
	// -------------------------------------------------------------

	private static int peek(int stack, int base) {

		return stack % base;
	}
	// -------------------------------------------------------------

	// Simulation of 'pop' behavior.
	private static int pop(int stack, int base) {

		return stack / base;
	}
	// -------------------------------------------------------------

	// Simulation of 'push' behavior.
	private static int push(int stack, char ch, int base) {

		return stack * base + getValueFromChar(ch);
	}
	// -------------------------------------------------------------

	private static boolean isBalanced(String str, int stack, int idx) {
		
		if(idx >= str.length()) {
			
			return stack == 1;
		}
		
		char ch = str.charAt(idx);
		if(opens(ch)) {
			
			// if it is an open brace, we save it on the Stack in base 4
			stack = push(stack, ch, 4);
			// and we move on to the next element
			return isBalanced(str, stack, ++idx);
		}
		else if(closes(ch)) {
			
			// for the stack to be empty it has to be 1
			// if we are trying to close an empty stack
			// it means we dont have any matching open brace
			// so the expression cant be balanced
			if(stack == 1) {
				
				return false;
			}
			
			// We get the previous element from the stack to compare with the current one
			int prevElem = peek(stack, 4);
			// If it matches we pop the last item from the stack and move on to the next element
			if(matches(getCharFromValue(prevElem), ch)) {
				
				stack = pop(stack, 4);
				return isBalanced(str, stack, ++idx);
			}
			
			return false;
		}
		
		// In the event that the character found isnt in our brace alphabet
		// we simply ignore it, move on to the next character
		return isBalanced(str, stack, ++idx);
	}
	// -------------------------------------------------------------
	
	public static boolean isBalanced(String str) {

		return isBalanced(str, 1, 0);
	}
	// -------------------------------------------------------------
}
