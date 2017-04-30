// Kata located at: https://www.codewars.com/kata/5277c8a221e209d3f6000b56

bool valid_braces(std::string braces) 
{
  std::stack<int> s;
  for(int i = 0; i < braces.length(); ++i)	{
  
  	char c = braces[i];
    if(c == '(' || c == '[' || c == '{')	s.push(c);
    else if(c == ')')	{
    
    	if(s.empty())	return false;
      else if(s.top() == '(') s.pop();
      else return false;
    
    }	else if(c == ']')	{
    
    	if(s.empty())	return false;
      else if(s.top() == '[')	s.pop();
      else return false;
    
    }	else if(c == '}')	{
    
    	if(s.empty())	return false;
      else if(s.top() == '{')	s.pop();
      else return false;
    
    }
  
  }
  
  return s.empty();
  
}
