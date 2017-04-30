// Kata can be found at: https://www.codewars.com/kata/53907ac3cd51b69f790006c5

/* Should return ᐃ type:
  0 : if ᐃ cannot be made with given sides
  1 : acute ᐃ
  2 : right ᐃ
  3 : obtuse ᐃ
*/
function triangleType(a, b, c){



  if ( a > c && a > b)   {
  
    temp = c;
    c = a;
    a = temp;
  
  }  else if(b > c && a < b)  {
  
    temp = c;
    c = b;
    b = temp;
  
  }  
  if ( a == 0 || b == 0 || c == 0)  return 0;
  if (c >= a + b) return 0;
  if (c * c == a * a + b * b)  return 2;
  return (c * c < a * a + b * b) ? 1 : 3;

}
