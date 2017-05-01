// Kata can be found at: https://www.codewars.com/kata/5667e8f4e3f572a8f2000039

package kata
import "strings"
import "fmt"

func Accum(s string) string {
    // your code
    
    str := "";
    fmt.Printf("%v\n", s);
    
    for  i := 0; i < len(s); i++  {
    
      thang := s[i : i + 1];
      
      str += strings.ToUpper(thang);
      j := 0;
      
      for j < i  {
      
        str += strings.ToLower(thang);
        j++;
      
      }
      
      if(i < len(s) - 1)  {
      
        str += "-";
        
      }
    
    }
    fmt.Printf("%v\n", str);
    return str;
}
