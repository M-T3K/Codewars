//Kata located at: https://www.codewars.com/kata/54da5a58ea159efa38000836

using System;

namespace Solution
{
  class Kata
    {
    public static int find_it(int[] seq) 
      {
      
      int n = 0;
      foreach(int num in seq)  {n = n ^ num;}
      return n;
      
      }
       
    }
}
