//Kata found at: https://www.codewars.com/kata/52f78966747862fc9a0009ae

import java.util.Stack;

public class Calc {
  
  public double evaluate(String expr) {
    
    if(expr.length() == 0)	return 0;
    
    String[] arr = expr.split(" ");
    
    Stack<Double> stack = new Stack<Double>();
    
    for(String str : arr)	{
    	
    	try	{
      
				stack.push(Double.parseDouble(str));
      
      }	catch(Exception ex)	{
      
      	if(str.equals("+"))	{
        
        	stack.push(stack.pop() + stack.pop());
        
        }	else if(str.equals("-"))	{
        	double temp = stack.pop();
        	stack.push(stack.pop() - temp);
          
        }	else if(str.equals("*"))	{
        
        	stack.push((double)(stack.pop() * stack.pop()));
        
        }	else if(str.equals("/"))	{
        
          double temp = stack.pop();
        	stack.push((double)( stack.pop() / temp));
        
        }
              
      }
     
    }
    
    
    
    return (stack.size() > 1) ? stack.get(stack.size() - 1) : stack.get(0);
  }
}
