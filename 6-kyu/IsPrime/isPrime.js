//Kata can be found at: https://www.codewars.com/kata/5262119038c0985a5b00029f

function isPrime(num) {
  
  if (num <= 1)  return false;
  else if(num <= 3)  return true;
  else  {
  
    for(var i = 2; i < num; i++)  {
    
      if(num % i == 0)  return false;
    
    }
  
  }
  return true;
  
}
