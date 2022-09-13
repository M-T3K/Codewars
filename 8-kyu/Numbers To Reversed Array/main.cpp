// Kata found at https://www.codewars.com/kata/5583090cbe83f4fd8c000051

#include <iostream>
#include <vector>
#include <sstream>
#include <string>

std::string vec_to_str(std::vector<int> vec) {
    std::stringstream ss;
    ss << "[";
    for(int val: vec) 
        ss << val;
    ss << "]";
    return ss.str();
}

std::vector<int> digitize(unsigned long n) 
{        
  std::vector<int> digits;
  unsigned long total_digits;
  for(total_digits = n; total_digits >= 10; total_digits /= 10) 
    digits.push_back(total_digits % 10);
  digits.push_back(total_digits);
  return digits;
}


int main() {
    // digitize(1234);
    // vec_to_str(digitize(1234));
    std::cout << "1234 -> " << vec_to_str(digitize(1234)) << std::endl;
    return 0;
}