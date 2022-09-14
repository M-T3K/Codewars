// kata can be found at https://www.codewars.com/kata/57f780909f7e8e3183000078
#include <vector>

// int grow(std::vector<int> nums) {
//     return std::accumulate(nums.cbegin(), nums.cend(), 1, std::multiplies<int>());
// }

int grow(std::vector<int> nums) {
    int val = 1;

    for(int i: nums) {
        val *= i;
    }
    return val;
}

int main() {
    return 0;
}