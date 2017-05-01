// Kata found at: https://www.codewars.com/kata/52774a314c2333f0a7000688

function validParentheses(parens){
  
  if(parens.charAt(0) == ')' || parens.charAt(parens.length - 1) == '(')	return false;
  
  var c = 0;
  
  for(var i = 0; i < parens.length; ++i)	{
  
  	if(parens.charAt(i) == '(')	c++;
    else	c--;
  
  }
  
  return c == 0;
  
}
