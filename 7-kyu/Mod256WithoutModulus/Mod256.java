public class Mod256 {

    public static void main(String[] args) {

        int n = 1044;
        System.out.printf("%d => %d\n", n % 256, mod256WithoutMod(n)  );
        
    }
    public static int mod256WithoutMod(int n) {
        
        int div = n / 256;
        int mod = n - (div * 256);
        return mod;
    }

    
    
}