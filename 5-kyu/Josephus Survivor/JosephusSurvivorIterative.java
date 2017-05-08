// Kata can be found at: https://www.codewars.com/kata/555624b601231dc7a400017a

public class JosephusSurvivor {
  public static int josephusSurvivor(final int n, final int k) {
    int remaining = 0;
    for (int i = 2; i <= n; i++) {
      remaining = (remaining + k) % i;
    }
    
    return remaining + 1;
  }  
}
