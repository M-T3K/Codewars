// Kata found at: https://www.codewars.com/kata/5277c8a221e209d3f6000b56

import java.util.Stack;
public class BraceChecker {

  public boolean isValid(String braces) {
  // ()[]{}
  
  	Stack<Character> stack = new Stack<Character>();
  	for(int i = 0; i < braces.length(); ++i)	{
    
    	char c = braces.charAt(i);
      if(c == '(' || c == '[' || c == '{')	stack.push(c);
      else if(c == ')')	{
      	
        if(stack.isEmpty())	return false;
        else if(stack.peek() == '(')	stack.pop();
        else return false;
      
      }	else if(c == ']')	{
      
      	if(stack.isEmpty())	return false;
        else if(stack.peek() == '[')	stack.pop();
        else return false;
      
      }	else if(c == '}')	{
      
      	if(stack.isEmpty())	return false;
        else if(stack.peek() == '{')	stack.pop();
        else return false;
      
      }
      
    }
    
    return stack.isEmpty();
    
  }

}
