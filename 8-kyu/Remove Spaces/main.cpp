// Kata can be found at https://www.codewars.com/kata/57eae20f5500ad98e50002c5/

#include <algorithm>
#include <string>

std::string no_space(std::string x)
{
    x.erase(std::remove(x.begin(), x.end(), ' '), x.end());
   return x;
}

int main() {
    return 0;
}