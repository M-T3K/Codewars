// Kata found at: https://www.codewars.com/kata/559a28007caad2ac4e000083

#include <iostream>

typedef unsigned long long ull;

class SumFct	{

  public:
  static ull perimeter(int n)	{
  	
  	uint64_t f = fib(n + 3);
    std::cout <<"n) " <<  n << " - f) " << f << " - S) " << 4 * (f - 1) << "\n";
    return 4 * (f - 1);
  
  }
  static uint64_t fib(int n)	{

      uint64_t prev = 0;
      uint64_t curr = 1;
      int i = 2;
      while (i <= n)	{
      
      	uint64_t temp = prev + curr;
        prev = curr;
        curr = temp;
        i++;
      
      }
      return curr;
  
  }
};
