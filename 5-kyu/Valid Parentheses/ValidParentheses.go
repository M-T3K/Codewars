// Kata found at: https://www.codewars.com/kata/52774a314c2333f0a7000688

package kata
import "fmt"

func ValidParentheses(parens string) bool {
    
    if string(parens[0]) == ")" || string(parens[len(parens) - 1]) == "("	{
    
    	return false;
    
    }
    
    p1 := 0;
    p2 := 0;
    fmt.Print(parens + "\n");
    
    for _, r := range parens	{
    
    	char := string(r);
      if char == "("	{
      
      	p1++;
      
      }	else if char == ")"	{
      
      	p2++;
      
      }
    
    }
    
    if p1 != p2	{
    
    	return false;
    
    }
    return true;
    
}
