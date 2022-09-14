#include <vector>

std::vector<int> reverseSeq(int n) {
  

    std::vector<int> vec;
    for( int i = n; i > 0; --i) {
        vec.push_back(i);
    }

    return vec;
}

int main() {
    return 0;
}