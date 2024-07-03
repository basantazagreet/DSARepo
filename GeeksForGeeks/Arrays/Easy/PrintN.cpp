#include <iostream>
using namespace std;

class Solution {
public:
    void printNos(int N) {
        if (N > 0) {
            
            printNos(N - 1);
            //Head recursion so last ma push vako execute hudai mathi tira aaucha
            cout << N << " ";
        }
    }
};

int main() {
    Solution solution;
    int N = 10;
    solution.printNos(N);
    return 0;
}
