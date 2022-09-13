// Kata found at https://www.codewars.com/kata/57f781872e3d8ca2a000007e

#include <vector>
#include <iostream>


std::vector<int> maps(const std::vector<int> & values) {
  std::vector<int> new_map;
  for ( int elem : values) 
    new_map.insert(new_map.end(), elem * 2);
  return new_map;
}

int main() {
    return 0;
}