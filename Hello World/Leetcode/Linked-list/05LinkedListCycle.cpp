/*
Q 141) Linked List Cycle(Easy)
Given a linked list, determine if it has a cycle in it.
To represent a cycle in the given linked-list, we use an integer pos which
represents the position (0-indexed) in the linked list where the tail
connects to. If pos == -1, then there is no cycle in the linked-list.

can you solve it using o(1) (i.e constant) memory?
*/

#include <iostream>
#include <string>
#include <vector>
#include <algorithm>

using namespace std;
class ListNode {
public:
    int val;
    ListNode* next;
    ListNode(int value) : val(value), next(nullptr) {}
};

//One traverses linked list 2 step at a time and another 1 step at a time.
class Solution{
    public:
    bool hasCycle(ListNode *head){
        if(head==NULL || head->next==NULL){
            return false;
        }
        ListNode *slow;
        ListNode *fast;

        while(slow!=fast){
            if(fast == NULL || fast->next ==NULL){
                return false;
            }
            slow = slow->next;
            fast = fast->next->next;
        }
        return true;
    }
};