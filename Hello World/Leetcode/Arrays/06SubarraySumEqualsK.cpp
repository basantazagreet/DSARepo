/*
Q 560 ) Subarray sum equals k (Medium)
Given an array of integers and an integer k, you need to find the total
number of continuous subarrays whose sum equals to k.
*/

#include <iostream>
#include <string>
#include <vector>
#include <algorithm>
#include <unordered_map>  

using namespace std;

//Prefix sum  array method used
class Solution{
    public:
    int subarraySum(vector<int>& nums, int k){
        int n = (int)nums.size();
        int count=0;
        unordered_map<int, int> prevSum;
        int sum=0;

        for(int i=0; i<n; i++){
            sum += nums[i];

            //1st condition ma simply sum aaye
            if(sum==k)
                count++;

            /*c.if (prevSum.find(sum - k) != prevSum.end()) 
            count += prevSum[sum - k];: 
            If there exists a prefix sum prevSum[sum - k], 
            add its frequency to the count.
             This implies that the subarray from that
              previous prefix sum to the current index has a sum equal to k.
            d. prevSum[sum]++;: Update the frequency of 
            the current prefix sum in the map.
            ======================
            This part checks if the iterator 
            returned by find is not equal to prevSum.end().
             If the key is found, it means that sum - k exists in the map,
             end() is used to 
             represent the position one past the last element in the map.
            ========================
            When you perform an operation like prevSum.find(key), 
            it returns an iterator pointing to the 
            element with the specified key if it exists, and end() 
            if the key is not found.
            */
            if(prevSum.find(sum-k) != prevSum.end())
                //
                count+=prevSum[sum-k];

            //both conditions apply navaye appearance++
            prevSum[sum]++;
        }
        return count;

    }
};