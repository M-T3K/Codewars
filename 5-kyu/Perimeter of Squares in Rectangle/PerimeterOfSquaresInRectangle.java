//Kata found at: https://www.codewars.com/kata/559a28007caad2ac4e000083
import java.math.BigInteger;
public class SumFct {
	public static BigInteger perimeter(BigInteger n) {
  	
    BigInteger prev = new BigInteger("" + 1);
    BigInteger curr = new BigInteger("" + 1);
    BigInteger answr = (n.intValue() == 0) ? new BigInteger("" + 1): new BigInteger("" + 2);
    
    for ( int i = 2; i <= n.intValue(); ++i)	{
    
    	curr = prev.add(curr);
      prev = curr.subtract(prev);
      answr = answr.add(curr);
    
    }
    
    return answr.multiply(new BigInteger("" + 4));
    
	}
}
