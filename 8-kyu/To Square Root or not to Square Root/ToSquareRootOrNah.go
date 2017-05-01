// Kata located at: https://www.codewars.com/kata/57f6ad55cca6e045d2000627

package kata
import "math"

func SquareOrSquareRoot(arr []int) []int{

  array := make([]int, len(arr), 2*len(arr));
  
  for i := 0; i < len(arr); i++  {
      
      if(math.Sqrt(float64(arr[i])) == math.Trunc(math.Sqrt(float64(arr[i]))))  {
      
        array[i] = int(math.Sqrt(float64(arr[i])));
      
      }  else  {
      
        array[i] = arr[i] * arr[i];
      
      }
      
  
  }
  
  return array;
  
}
