// Kata can be found at https://www.codewars.com/kata/56269eb78ad2e4ced1000013

#include <cmath>
#include <iostream>


long int findNextSquare(long int sq) {
  // Return the next square if sq if a perfect square, -1 otherwise

    //   Prior Jump optimization
    int last_digit_hex = sq & 0xF;
    switch(last_digit_hex) {
        case 0:
        case 1:
        case 4:
        case 9:
        { // All cases above
        // @Opt This works perfectly without the switch, but the cases
        // allow for a fast jmp optimization, avoiding calculation, 
        // since perfect squares only end in 0, 1, 4, 9
            double root = std::sqrt(sq);
            if (root - std::floor(root) == 0 ) {
                // perfect square
                long int next_int = static_cast<long int>(root) + 1;
                long int next_square = next_int * next_int;
                return next_square;
            }
        }   
        default:
        {
            break;
        }
    }
  
  return -1;
}

// long int findNextSquare(long int sq) {
//   // Return the next square if sq if a perfect square, -1 otherwise
//   double root = std::sqrt(sq);

//   if (root - std::floor(root) == 0 ) {
//     // perfect square
//     long int next_int = static_cast<long int>(root) + 1;
//     long int next_square = next_int * next_int;
//     return next_square;
//   }
//   return -1;
// }

int main() {
    std::cout << "121 -> " << findNextSquare(121) << std::endl;
    std::cout << "625 -> " << findNextSquare(625) << std::endl;
    std::cout << "319225 -> " << findNextSquare(319225) << std::endl;
    std::cout << "155 -> " << findNextSquare(155) << std::endl;
    return 0;
}