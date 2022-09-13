#include <iostream>
#include <vector>
#include <sstream>
#include <algorithm>

std::string reverse_words(std::string str)
{
    std::vector<std::string> strings;
    std::stringstream ss;
    for(auto ch : str) {
        if (ch == ' ')  {
            std::string word = ss.str();
            ss.str(std::string()); // Flush contents
            std::reverse(word.begin(), word.end());
            for(auto reversed_char : word) ss << reversed_char;
            ss << ch; // Include space
            strings.push_back(ss.str());
            ss.str(std::string()); // Flush contents
        }
        else {
            ss << ch;
        }            
    }
    std::string word = ss.str();
    ss.str(std::string()); // Flush contents
    std::reverse(word.begin(), word.end());
    for(auto reversed_char : word) ss << reversed_char;
    strings.push_back(ss.str());
    ss.str(std::string()); // Flush contents

    for(auto word : strings) {
        for(auto ch : word) ss << ch;
    }

    std::string res = ss.str();
    // Free Memory
    ss.clear();
    ss.str(std::string()); // Flush contents
    return res;
}

int main() {
    std::cout << "i hate everything huhuhu! -> " << "<" << reverse_words("i hate everything huhuhu!")<< ">" << std::endl;
    return 0;
}