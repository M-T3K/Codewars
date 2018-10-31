
public class Tester {
    public static void main(String[] args) {

        String bal = "[<<>>(}})<)>{}{}I[]()b]";
        Balance B = new Balance();

        boolean b = B.isBalanced(bal, 1, 0);
        System.out.printf("isBalanced(\"%s\") => %b\n ", bal, b);
        bal = "[<<()>>]{[]}[{(<>())}]";
        boolean b2 = B.isBalanced(bal, 1, 0);
        System.out.printf("isBalanced(\"%s\") => %b\n ", bal, b2);

    }

}
