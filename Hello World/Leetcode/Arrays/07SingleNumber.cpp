/*
Q 136) Single Number (Easy)
Given a non-empty array of integers, every element appears twice
except for one. Find that single one.
Note: Your algorithm should have a linear runtime complexity. Could
you implement it without using extra memory?
*/

#include <iostream>
#include <vector>


using namespace std;

class Solution
{
public:
    int singleNumber(vector<int> &nums)
    {
        int n = (int)nums.size();
        int a = 0;
        for (int i = 0; i < n; i++)
            //XOR non repeated value bascha since 1^1=0 and 1^0=1
            a = a ^ nums[i]; 
        return a;
    }
};