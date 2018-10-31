

public class Balance {

	private boolean opens(char ch) {

		return "([{<".indexOf(ch) != -1;
	}
	// -------------------------------------------------------------	
	
	private boolean closes(char ch) {
	
		return ")]}>".indexOf(ch) != -1;
	}
	// -------------------------------------------------------------	
	
	private boolean matches(char ch1, char ch2) {

		return ((ch1 == '(' && ch2 == ')') || (ch2 == '(' && ch1 == ')'))
			|| ((ch1 == '[' && ch2 == ']') || (ch2 == '[' && ch1 == ']'))
			|| ((ch1 == '{' && ch2 == '}') || (ch2 == '{' && ch1 == '}'))
			|| ((ch1 == '<' && ch2 == '>') || (ch2 == '>' && ch1 == '<'));
	}
	// -------------------------------------------------------------	

	private char getCharFromValue(int val) {

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

	private int getValueFromChar(char ch) {

		return "([{<".indexOf(ch);
	}
	// -------------------------------------------------------------

	private int peek(int stack, int base) {

		return stack % base;
	}
	// -------------------------------------------------------------

	// This isnt actually a 'pop', as it doesnt return the element at the top
	// I do this to avoid having to create/use a class so that we can modify 
	// the contents of the stack.
	// And also, it wouldnt be useful for our purpose.
	private int pop(int stack, int base) {

		return stack / base;
	}
	// -------------------------------------------------------------

	public boolean isBalanced(String str, int stack, int idx) {
		
		if(idx >= str.length()) {

			return stack == 1;
		}
		
		char ch = str.charAt(idx);
		if(opens(ch)) {

			// if it is an open brace, we save it on the Stack in base 4
			stack = stack * 4 + getValueFromChar(ch);
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
			int prevElem = this.peek(stack, 4);
			// If it matches we pop the last item from the stack and move on to the next element
			if(matches(getCharFromValue(prevElem), ch)) {

				stack = this.pop(stack, 4);
				return isBalanced(str, stack, ++idx);
			}
			
			return false;
		}

		// In the event that the character found isnt in our brace alphabet
		// we simply ignore it, move on to the next character
		return isBalanced(str, stack, ++idx);
	}
	// -------------------------------------------------------------
	
}
