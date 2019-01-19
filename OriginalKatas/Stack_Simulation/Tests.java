import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class Tests {

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
    public void constructorTest() {

        Stack stack = new Stack(4);
        assertEquals(stack.getStack(), 1);
        assertEquals(stack.getBase(), 4);
    }

    @Test
    public void pushTests() {

        Stack stack = new Stack(4);
        stack.push(2);
        assertEquals(6, stack.getStack());
    }

    @Test
    public void balanceTests() {
        
        assertEquals(true, Balance.isBalanced("asdasdasd"));
        assertEquals(true, Balance.isBalanced("[<<()>>]{[]}[{(<>())}]"));
        assertEquals(true, Balance.isBalanced("()[]{}<>Balanced"));
        assertEquals(true, Balance.isBalanced("<{[(h)]}><{[(e)]}><{[(y)]}><{[(!)]}>"));
        assertEquals(true, Balance.isBalanced("(<><><><><>)"));
        assertEquals(false, Balance.isBalanced("[{]}"));
        assertEquals(false, Balance.isBalanced("[[[[[[[[[[[]][]]]]]]]]]]]"));
        assertEquals(false, Balance.isBalanced("[<<>>(}})<)>{}{}I[]()b]"));
        assertEquals(false, Balance.isBalanced("()()()|()())("));
        assertEquals(false, Balance.isBalanced("[[[[{}]]]])()"));
    }
    // -------------------------------------------------------------	
    
}