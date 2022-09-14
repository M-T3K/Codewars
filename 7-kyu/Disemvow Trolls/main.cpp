// kata can be found at https://www.codewars.com/kata/52fba66badcd10859f00097e
#include <string>
#include <sstream>


std::string disemvowel(std::string str) {

    std::stringstream ss;
    for(auto ch: str) {
        char lower_case_char = std::tolower(ch);
        switch(lower_case_char) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            {
                continue;
            }
            default:
            {
                ss << ch;
            }
        }
    }
    std::string res = ss.str();
    // Free Memory
    ss.clear();
    ss.str(std::string()); // Flush contents
    return res;
}


int main() {
    return 0;
}