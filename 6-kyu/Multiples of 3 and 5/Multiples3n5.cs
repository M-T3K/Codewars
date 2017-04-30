// Kata found at: https://www.codewars.com/kata/514b92a657cdc65150000006

public static class Kata
{
  public static int Solution(int value)
  {
    int count = 0;
    for(int i = 3; i < value; i++)  {
    
      if(i % 3 == 0 || i % 5 == 0)  {
      
        count += i;
      
      }
    
    }
    return count;
  }
}
