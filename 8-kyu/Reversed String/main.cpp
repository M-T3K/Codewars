// kata can be found at https://www.codewars.com/kata/5168bb5dfe9a00b126000018

#include <string>
#include <sstream>
using namespace std ; 

string reverseString (string str )
{
    std::reverse(str.cbegin(), str.cend())
    std::stringstream ss;
    for(auto ch: str) ss << ch;
    std::string res = ss.str();
    // Free Memory
    ss.clear();
    ss.str(std::string()); // Flush contents
    return res;
}

int main() {
    return 0;
}