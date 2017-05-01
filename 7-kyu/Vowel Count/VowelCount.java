// Kata found at: https://www.codewars.com/kata/54ff3102c1bad923760001f3

public class Vowels {

  public static int getCount(String str) {
    int vowelsCount = 0;
    // your code here
    
    char[] a = str.toCharArray();
    
    for(char c : a)  {
    
      if(isVowel(c))
        vowelsCount++;
    
    }
    
    return vowelsCount;
  }
  
  private static boolean isVowel(char c)  {
  
    if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
      return true;
    else return false;
  }
}
