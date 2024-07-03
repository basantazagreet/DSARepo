#include <iostream>

int main() {
    int n=3;

    for(int i=n; i>0; i--){
        //j iterates from n to n-i
        //Each iteration ma 
        for(int j=n; j>0; j--){
            for(int k=0; k<i; k++){
                std::cout << j << " ";
            }
        }
            std::cout << std::endl;
    }

    return 0;
}
