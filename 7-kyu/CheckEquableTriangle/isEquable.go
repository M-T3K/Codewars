// Kata found at: https://www.codewars.com/kata/57d0089e05c186ccb600035e
package kata
import "math"

func EquableTriangle(a, b, c int) bool {
		p := (a + b + c) / 2;
    return a + b + c == int(math.Sqrt(float64(p*(p - a)*(p - b)*(p - c))));
    
}
