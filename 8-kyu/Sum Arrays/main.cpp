// Kata can be found at https://www.codewars.com/kata/53dc54212259ed3d4f00071c

#include <iostream>

#include <vector>
#include <numeric>

int sum(std::vector<int> nums) {
  return std::accumulate(nums.begin(), nums.end(), 0);
}

int main(void) {
    std::vector<int> nums = {0, 1, 2, 3, 4, 5, 5};
    std::cout << "{0, 1, 2, 3, 4, 5, 5} => " << sum(nums) << std::endl;
}