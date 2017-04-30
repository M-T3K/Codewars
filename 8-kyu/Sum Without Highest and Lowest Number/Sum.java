// Kata located at: https://www.codewars.com/kata/576b93db1129fcf2200001e6
import java.util.Arrays;
public class Kata
{
  public static int sum(int[] numbers)
  {
    try{
     int sum = 0;
     Arrays.sort(numbers);
     for(int i = 1; i < numbers.length - 1; i++)  sum += numbers[i];
     return sum;
     } catch(Exception e)  {return 0;}
  }
}
