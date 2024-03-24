/*Q) Leetcode 1290. Convert binary number in a linked 
list to integer.
============Description===================================
Given head which is a reference node to a singly-linked list.
The value of each node in the linked list is either 0 or 1. The linked-
list holds the binary representation of a number
*/
#include <iostream>
#include <string>

using namespace std;

class ListNode {
public:
    int val;
    ListNode* next;
    ListNode(int value) : val(value), next(nullptr) {}
};


class Solution{
    public: 
    int binaryToDecimal(string s){
        int dec = 0;

        int base = 1;
        int n = (int)s.length();
        for (int i=n-1; i>=0; i--){
            if(s[i] == '1'){
                dec += base;
            }
            base *=2;
        }
        return dec;
    }

    int getDecimalValue(ListNode* head){
        string s;
        while(head!=NULL){
            int data = head->val;
            char x = (data==1) ? '1' : '0';
            s=s+x;
            head = head -> next;
        }
        int ans = binaryToDecimal(s);
        return ans;
    }
};