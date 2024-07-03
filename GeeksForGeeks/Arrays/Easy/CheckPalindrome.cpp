/*Given a Integer array A[] of n elements.
 Your task is to complete the function PalinArray. Which will return 1 
 if all the elements of
 the Array are palindrome otherwise it will return 0.*/

class Solution {
public:
    bool checkPalindrome(int num) {
        int cur = num;
        int rev = 0;
        while (num > 0) {
            int rem = num % 10;
            num = num / 10;
            rev = rev * 10 + rem;
        }

        return cur == rev;
    }

    int PalinArray(int a[], int n) {
        for (int i = 0; i < n; i++) {

            //Array ma true false check garna pare if(!true) loop vitra
            if (!checkPalindrome(a[i])) {
                return 0; 
            }
        }
        return 1; 
    }
};
