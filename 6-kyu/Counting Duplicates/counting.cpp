// Kata can be found at https://www.codewars.com/kata/54bf1c2cd5b56cc47f0007a1

#include <string.h>
#include <iostream>
#include <unordered_map>
#include <cassert>

size_t duplicateCount(const std::string& in); // helper for tests

size_t duplicateCount(const char* in)
{
    std::unordered_map<char, int> char_duplicate_count;
    auto count = 0;
    for (size_t i = 0; i < strlen(in); ++i) 
      char_duplicate_count[std::tolower(in[i])]++;
    for (auto &it: char_duplicate_count) {
      if (it.second > 1) {
        count++;
      }
    }

    return count;
}



int main() {
    std::cout << "aabbcde -> " <<  duplicateCount("aAbBcde") << std::endl;
    assert(duplicateCount("aAbBcde") == 2);
    return 0;
}