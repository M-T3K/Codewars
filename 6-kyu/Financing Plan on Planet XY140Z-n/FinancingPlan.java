// Kata located at: https://www.codewars.com/kata/559ce00b70041bc7b600013d

import java.math.BigInteger;

public class Finance {
	
	public static BigInteger  finance(int n) {
    
    BigInteger num = new BigInteger("" + n);
    
    return num.multiply(new BigInteger("" + (n + 1))).multiply(new BigInteger("" + (n + 2))).divide(new BigInteger("2"));
    
	}
}
