// Kata can be found at https://www.codewars.com/kata/54b42f9314d9229fd6000d9c
#include <string>
#include <unordered_map>
#include <sstream>
#include <iostream>

// "din"      =>  "((("
// "recede"   =>  "()()()"
// "Success"  =>  ")())())"
// "(( @"     =>  "))((" 

std::string duplicate_encoder(const std::string& word) {


    std::unordered_map<char,int> char_map;
    for(auto ch: word) {
        char_map[std::tolower(ch)]++;
    }

    std::stringstream result;
    for(auto ch: word) {
        if (char_map[std::tolower(ch)] > 1) {
            result << ")";
        } else {
            result << "(";
        }
    }
    std::string res = result.str();
    result.str(std::string()); // Flush contents
    result.clear();


    return res;    
}

int main() {
    std::cout << "Success -> " << duplicate_encoder("Success") << " ? Expected -> " << ")())())" << std::endl;
    std::cout << "CodeWarrior -> " << duplicate_encoder("CodeWarrior") << " ? Expected -> " << "()(((())())" << std::endl;
    std::cout << "Supralapsarian -> " << duplicate_encoder("Supralapsarian") << " ? Expected -> " << ")()))()))))()(" << std::endl;
    return 0;
}