/*
Q 189) Rotate Array (easy)

Given an array, rotate the array to the right by k steps, where k is non
-negative.

Follow up:
Try to come up as many solutions as you can, there are atleast 3 
different ways to solve this problem.
Could you do it in-place with O(1) extra space?
*/


#include <iostream>
#include <string>
#include <vector>
#include <algorithm>

using namespace std;

class Solution{
    public:
        void reverse(vector<int> &num, int low, int high){
            while(low<high){
                swap(num[low], num[high]);
                low++;
                high--;
            }
        }


        void rotate(vector<int>& nums, int k){
            int n = (int)nums.size();
            k = k%n;
            reverse(nums, 0, n-k-1);//first half reverse
            reverse(nums, n-k, n-1);//second half reverse
            reverse(nums, 0, n-1);//Full array reverse
        }
};

