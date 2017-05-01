// Kata can be found at: https://www.codewars.com/kata/53da3dbb4a5168369a0000fe

package kata
import "fmt"

func EvenOrOdd(number int) string {
  // your code here
  fmt.Printf("This is my first Go Program and I felt compelled to say so\n");
  if(number % 2 == 0)  {
  
    return "Even";
    
  }  else {
  
    return "Odd";
  
  }
  
}
