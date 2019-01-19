
public class Tester {
    public static void main(String[] args) {

        System.out.printf("PushTests() :: %b\n", pushTests());
        System.out.printf("PeekTests() :: %b\n", peekTests());
        System.out.printf("PopTests()  :: %b\n",  popTests());
        System.out.printf("BalanceTests() :: %b\n", balanceTests());
        
        


    }

    public static boolean balanceTests() {

        // @Info: Need to convert these into Unit Tests

        String bal = "[<<>>(}})<)>{}{}I[]()b]";
        Balance B = new Balance();

        boolean b = B.isBalanced(bal);
        System.out.printf("isBalanced(\"%s\") => %b\n", bal, b);
        bal = "[<<()>>]{[]}[{(<>())}]";
        b = B.isBalanced(bal);
        System.out.printf("isBalanced(\"%s\") => %b\n", bal, b);

        bal = "[[[[[[[[[[[]][]]]]]]]]]]]";
        b = B.isBalanced(bal);
        System.out.printf("isBalanced(\"%s\") => %b\n", bal, b);
        
        bal = "[{]}";
        b = B.isBalanced(bal);
        System.out.printf("isBalanced(\"%s\") => %b\n", bal, b);
        
        bal = "asdasdasd";
        b = B.isBalanced(bal);
        System.out.printf("isBalanced(\"%s\") => %b\n", bal, b);
        return true;
    }


    // @Info : Cant push numbers greater than the base - 1 (that will give errors.)
    // Sexy
    public static boolean pushTests() {

        Stack stack = new Stack(20);
        boolean b = true;
        // TODO Must also check if we can push an element greater than the base.
        
        for(int i = 2; i < 20 && b; ++i) {

            int val = stack.getBase() * stack.getStack() + i;
            if(!stack.push(i) && i == 9) {
                
                return true;
            }

            b = b? assertEquals(val, stack.getStack()) : false;
        }

        return b;
    }

    public static boolean peekTests() {

        Stack stack = new Stack(20);
        boolean b = true;
        
        for(int i = 2; i < 20 && b; ++i) {

            // The test should not get past this point. After this it will always be false.
            if(!stack.push(i) && i == 9) {
                
                return true;
            }

            // System.out.printf("Stack::(%d) => (base := %d, stack := %d) ", i, stack.getBase(), stack.getStack() );
            // Stack should become full at
            
            b = b? assertEquals(i, stack.peek()) : false;
        }

        return b;
    }

    public static boolean popTests() {

        Stack stack = new Stack(20);
        boolean b = true;
        
        for(int i = 2; i < 20 && b; ++i) {

            stack.push(i);
            b = b? assertEquals(i, stack.pop()) : false;
            
            // If everything has been pushed and popped, the end result should be 1, every time.
            // This means that the stack should be empty.
            b = b? stack.isEmpty() : false;
        }
        
        return b;
    }




    public static boolean assertEquals(int a, int b) {
        // System.out.printf("%d == %d :: %b\n", a, b, a == b);
        return a == b;
    }

    private static String generateRandomBracketString(int len) {
        
        String str = "";

        for(int i = 0; i < len; ++i) {

            int n = (int)(Math.random() * 8);
            int m = (int)(Math.random() * 2);
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

}
