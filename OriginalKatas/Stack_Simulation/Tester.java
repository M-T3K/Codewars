
public class Tester {
    public static void main(String[] args) {

        String bal = "[<<>>(}})<)>{}{}I[]()b]";
        Balance B = new Balance();

        boolean b = B.isBalanced(bal);
        System.out.printf("isBalanced(\"%s\") => %b\n ", bal, b);
        bal = "[<<()>>]{[]}[{(<>())}]";
        boolean b2 = B.isBalanced(bal);
        System.out.printf("isBalanced(\"%s\") => %b\n ", bal, b2);

        bal = "[[[[[[[[[[[]][]]]]]]]]]]]";
        boolean b3 = B.isBalanced(bal);
        System.out.printf("isBalanced(\"%s\") => %b\n ", bal, b3);
        
        bal = "[{]}";
        boolean b4 = B.isBalanced(bal);
        System.out.printf("isBalanced(\"%s\") => %b\n ", bal, b4);
        
        bal = "asdasdasd";
        boolean b5 = B.isBalanced(bal);
        System.out.printf("isBalanced(\"%s\") => %b\n ", bal, b5);

        System.out.printf("Creating random stuff...\n");
       
        
        System.out.printf("Generating String => %s\n", generateRandomBracketString(2) );
        System.out.printf("Generating String => %s\n", generateRandomBracketString(3) );
        System.out.printf("Generating String => %s\n", generateRandomBracketString(4) );
        System.out.printf("Generating String => %s\n", generateRandomBracketString(5) );
        System.out.printf("Generating String => %s\n", generateRandomBracketString(6) );
        System.out.printf("Generating String => %s\n", generateRandomBracketString(7) );

    }


    private static String generateRandomBracketString(int len) {
        
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

}
