/*
Q 169) Majority element
Given an array of size n, find the majority element. The majority element is
the element that appears more than n/2 times.
You may assume that the array is non-empty and the majority element
always exists in the array.
*/



#include <iostream>
#include <string>
#include <vector>
#include <algorithm>

using namespace std;

class Solution{
    public:
    int majorityElement(vector <int>& nums){
        sort(nums.begin(), nums.end());
        return nums[(int)nums.size()/2];
    }
};