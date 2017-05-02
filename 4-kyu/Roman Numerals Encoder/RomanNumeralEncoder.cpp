//This kata is located at: https://www.codewars.com/kata/51b62bf6a9c58071c600001b

std::string solution(int number){
  
  //Creating a Dictionary akin to that of JS Expr => var dict = {Value, RomanNumeral}
  struct Dictio { int val; char const* romanNumeral; };
  Dictio const dictionary[] = { 1000, "M", 900, "CM", 500, "D", 400, "CD", 100, "C", 90, "XC", 50, "L", 40, "XL", 10, "X", 9, "IX", 5, "V", 4, "IV", 1, "I", 0, NULL };
 
  std::string toRoman = "";
  for (Dictio const* curr = dictionary; curr -> val > 0; ++curr)  {
  
    while (number >= curr -> val)  {
    
      number -= curr -> val;
      toRoman += curr -> romanNumeral;
      
    }
    
  }
  
  return toRoman;
  
}
