// Kata located at: https://www.codewars.com/kata/566be96bb3174e155300001b

package kata
import "fmt"

func MaxBall(v0 int) int {
    // h = vt - 1/2 gt^2 
    fmt.Print("-> ");
    fmt.Print(v0);
    fmt.Print("\n");
    c :=float32(10) / float32(36); // Conversion Factor
    fmt.Printf("C Factor -> %.5f\n", c);
    v := float32(float32(v0) * c); // Conversion
    // Derivative = 0 when t = -v0 / -9,81 = v0 / 9,81 
    //but function requires to multiply times
    //10 (As we are talking about tenths of second)
    tm := float32(v) / float32(9.81) * float32(10);
    fmt.Printf("v Float -> %.2f\n", v);
    fmt.Printf("tm Float -> %.2f\n", tm);
    
    return round(tm); 
    
}

func round(n float32)  int  {

  if float32(n) - float32(int(n)) > 0.5  {
    return int(n) + 1;
  }
  return int(n)

}

