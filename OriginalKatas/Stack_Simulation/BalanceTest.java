import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;


public class BalanceTest {

    // Solution for Random Tests

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

	private static int pop(int stack, int base) {

		return stack / base;
	}
	// -------------------------------------------------------------

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
			
			stack = push(stack, ch, 4);
			return isBalanced(str, stack, ++idx);
		}
		else if(closes(ch)) {
			
			if(stack == 1) {
				
				return false;
			}
			
			int prevElem = peek(stack, 4);
			if(matches(getCharFromValue(prevElem), ch)) {
				
				stack = pop(stack, 4);
				return isBalanced(str, stack, ++idx);
			}
			
			return false;
		}
		
		return isBalanced(str, stack, ++idx);
	}
	// -------------------------------------------------------------
	
	public static boolean isBalanced(String str) {

		return isBalanced(str, 1, 0);
	}
	// -------------------------------------------------------------

    // EoSolution




    private String generateRandomBracketString(int len) {
        
        String str = "";

        for(int i = 0; i < len; ++i) {

            int n = (int)(Math.random() * 8);
            switch(n) {
                case 0:
                    str += "(";
                    break;
                case 1:
                    str += ")";
                    break;
                case 2:
                    str += "[";
                    break;
                case 3:
                    str += "]";
                    break;
                case 4:
                    str += "{";
                    break;
                case 5:
                    str += "}";
                    break;
                case 6:
                    str += "<";
                    break;
                default:
                    str += ">";
            }

        }

        return str;
    }

    @Test
    public void exampleTests() {
        
        assertEquals(true, Balance.isBalanced("asdasdasd"));
        assertEquals(false, Balance.isBalanced("[{]}"));
        assertEquals(false, Balance.isBalanced("[[[[[[[[[[[]][]]]]]]]]]]]"));
        assertEquals(true, Balance.isBalanced("[<<()>>]{[]}[{(<>())}]"));
        assertEquals(false, Balance.isBalanced("[<<>>(}})<)>{}{}I[]()b]"));
    }
    // -------------------------------------------------------------	

    @Test
    public void randomTestLength2() {
        
        String str2 = this.generateRandomBracketString(2);
        assertEquals(isBalanced(str2), Balance.isBalanced(str2));
        str2 = this.generateRandomBracketString(2);
        assertEquals(isBalanced(str2), Balance.isBalanced(str2));
        str2 = this.generateRandomBracketString(2);
        assertEquals(isBalanced(str2), Balance.isBalanced(str2));
        str2 = this.generateRandomBracketString(2);
        assertEquals(isBalanced(str2), Balance.isBalanced(str2));
        str2 = this.generateRandomBracketString(2);
        assertEquals(isBalanced(str2), Balance.isBalanced(str2));
    }
    
    @Test
    public void randomTestLength3() {
        
        String str3 = this.generateRandomBracketString(3);
        assertEquals(isBalanced(str3), Balance.isBalanced(str3));
        str3 = this.generateRandomBracketString(3);
        assertEquals(isBalanced(str3), Balance.isBalanced(str3));
        str3 = this.generateRandomBracketString(3);
        assertEquals(isBalanced(str3), Balance.isBalanced(str3));
        str3 = this.generateRandomBracketString(3);
        assertEquals(isBalanced(str3), Balance.isBalanced(str3));
        str3 = this.generateRandomBracketString(3);
        assertEquals(isBalanced(str3), Balance.isBalanced(str3));
    }


    @Test
    public void randomTestLength4() {
        
        String str4 = this.generateRandomBracketString(4);
        assertEquals(isBalanced(str4), Balance.isBalanced(str4));
        str4 = this.generateRandomBracketString(4);
        assertEquals(isBalanced(str4), Balance.isBalanced(str4));
        str4 = this.generateRandomBracketString(4);
        assertEquals(isBalanced(str4), Balance.isBalanced(str4));
        str4 = this.generateRandomBracketString(4);
        assertEquals(isBalanced(str4), Balance.isBalanced(str4));
        str4 = this.generateRandomBracketString(4);
        assertEquals(isBalanced(str4), Balance.isBalanced(str4));
    }


    @Test
    public void randomTestLength5() {
        
        String str5 = this.generateRandomBracketString(5);
        assertEquals(isBalanced(str5), Balance.isBalanced(str5));
        str5 = this.generateRandomBracketString(5);
        assertEquals(isBalanced(str5), Balance.isBalanced(str5));
        str5 = this.generateRandomBracketString(5);
        assertEquals(isBalanced(str5), Balance.isBalanced(str5));
        str5 = this.generateRandomBracketString(5);
        assertEquals(isBalanced(str5), Balance.isBalanced(str5));
        str5 = this.generateRandomBracketString(5);
        assertEquals(isBalanced(str5), Balance.isBalanced(str5));
    }

    @Test
    public void randomTestLength6() {
        
        String str6 = this.generateRandomBracketString(6);
        assertEquals(isBalanced(str6), Balance.isBalanced(str6));
        str6 = this.generateRandomBracketString(6);
        assertEquals(isBalanced(str6), Balance.isBalanced(str6));
        str6 = this.generateRandomBracketString(6);
        assertEquals(isBalanced(str6), Balance.isBalanced(str6));
        str6 = this.generateRandomBracketString(6);
        assertEquals(isBalanced(str6), Balance.isBalanced(str6));
        str6 = this.generateRandomBracketString(6);
        assertEquals(isBalanced(str6), Balance.isBalanced(str6));
    }

    @Test
    public void randomTestLength7() {
        
        String str7 = this.generateRandomBracketString(7);
        assertEquals(isBalanced(str7), Balance.isBalanced(str7));
        str7 = this.generateRandomBracketString(7);
        assertEquals(isBalanced(str7), Balance.isBalanced(str7));
        str7 = this.generateRandomBracketString(7);
        assertEquals(isBalanced(str7), Balance.isBalanced(str7));
        str7 = this.generateRandomBracketString(7);
        assertEquals(isBalanced(str7), Balance.isBalanced(str7));
        str7 = this.generateRandomBracketString(7);
        assertEquals(isBalanced(str7), Balance.isBalanced(str7));
    }
    
    
}