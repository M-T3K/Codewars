// Kata can be found at https://www.codewars.com/kata/5263c6999e0f40dee200059d

#include <iostream>

// 2456 => (1, 2, 3, 5), (1, 4, 5, 7), (2, 4, 5, 6, 8), (3, 5, 6, 9)




#include <string>
#include <vector>
#include <unordered_map>


// @info Better Solution now that I have had some more time to think about it
std::vector<string> get_pins(const std::string &observed, const std::string &prefix = "")
{
    static const std::unordered_map<char, std::string> neighbors =
    {
        {'1', "124"},  {'2', "1235"},  {'3', "236"},
        {'4', "1457"}, {'5', "24568"}, {'6', "3569"},
        {'7', "478"},  {'8', "05789"}, {'9', "689"},
                       {'0', "08"}
    };
    if ( !observed.size() ) return {prefix};
    std::vector<string> pins;
    for (auto c : neighbors.at(observed[0]))
        for (auto pin : get_pins(observed.substr(1), prefix + c))
            pins.push_back(pin);
    return pins;
}


// ┌───┬───┬───┐
// │ 1 │ 2 │ 3 │
// ├───┼───┼───┤
// │ 4 │ 5 │ 6 │
// ├───┼───┼───┤
// │ 7 │ 8 │ 9 │
// └───┼───┼───┘
//     │ 0 │
//     └───┘


// @info Very Crappy Solution due to lack of time to figure out how to do recursion
std::vector<std::string> get_pins(std::string observed) {

    std::unordered_map<std::string, std::vector<std::string>> combs;
    combs["0"] = {"0", "8"};
    combs["1"] = {"1", "2", "4"};
    combs["2"] = {"2", "1", "3", "5"};
    combs["3"] = {"3", "2", "6"};
    combs["4"] = {"4", "1", "5", "7"};
    combs["5"] = {"5", "2", "4", "6", "8"};
    combs["6"] = {"6", "3", "5", "9"};
    combs["7"] = {"7", "4", "8"};
    combs["8"] = {"8", "5", "7", "9", "0"};
    combs["9"] = {"9", "6", "8"};

    std::vector<std::string> list_of_possible_pins = {};
    std::vector<std::vector<std::string>> list_of_possible_combinations = {};
    for(auto& c: observed) {
        std::vector<std::string> combination = combs[std::string(1, c)];
        list_of_possible_combinations.push_back(combination);
    }
    for(std::string& com1: list_of_possible_combinations.at(0)) {

        if(list_of_possible_combinations.size() == 1) {
            list_of_possible_pins.push_back(com1);
        } else {
            for(std::string& com2: list_of_possible_combinations.at(1)) {
                if(list_of_possible_combinations.size() == 2) {
                    list_of_possible_pins.push_back(com1 + com2);
                } else {
                    for(std::string& com3: list_of_possible_combinations.at(2)) {
                        if(list_of_possible_combinations.size() == 3) {
                            list_of_possible_pins.push_back(com1 + com2 + com3);
                        } else {
                            for(std::string& com4: list_of_possible_combinations.at(3)) {
                                // std::string combination_chars = com1 + com2 + com3 + com4;
                                if(list_of_possible_combinations.size() == 4) {
                                    list_of_possible_pins.push_back(com1 + com2 + com3 + com4);
                                } else {
                                    for(std::string& com5: list_of_possible_combinations.at(4)) {
                                        if(list_of_possible_combinations.size() == 5) {
                                            list_of_possible_pins.push_back(com1 + com2 + com3 + com4 + com5);
                                        } else {
                                            for(std::string& com6: list_of_possible_combinations.at(5)) {
                                                if(list_of_possible_combinations.size() == 6) {
                                                    list_of_possible_pins.push_back(com1 + com2 + com3 + com4 + com5 + com6);
                                                } else {
                                                    for(std::string& com7: list_of_possible_combinations.at(6)) {
                                                        if(list_of_possible_combinations.size() == 7) {
                                                            list_of_possible_pins.push_back(com1 + com2 + com3 + com4 + com5 + com6 + com7);
                                                        } else {
                                                            for(std::string& com8: list_of_possible_combinations.at(6)) {
                                                                // std::string combination_chars = com1 + com2 + com3 + com4;
                                                                list_of_possible_pins.push_back(com1 + com2 + com3 + com4 + com5 + com6 + com7 + com8);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

  return list_of_possible_pins;
}

std::string vec2str(std::vector<std::string> vec) {
    std::string s = "(";
    auto cont = 0;
    for (auto &e : vec) {
        s += e + " "; 
        ++cont;
    }
    s += ") -> ";
    s += std::to_string(cont);
    return s;
}

int main(void) {

    std::cout << "[ 2456 ] => " << vec2str(get_pins("2456")) << std::endl;
    // std::cout << "[ 8 ] => " << vec2str(get_pins("8")) << std::endl;
    return 0;
}