/*
Q 75) Sort Colors (Medium)
Given an array nums with n objects colored red, white or blue, sort them
in-place so that objects of the same color are adjacent with the colors
in the order red, white and blue.
Here, we will use the integers 0,1 and 2 to represent the color red,
white and blue respectively.
Follow up:
Could you solve this problem without using the library's sort function?
Could you come up with a one-pass algorithm using only O(1) constant space?
*/


#include <iostream>
#include <string>
#include <vector>
#include <algorithm>

using namespace std;

class Solution{
    public:
        void sortColors(vector<int>& nums){
            int n = (int)nums.size();

            int f=0, s=0, t=0;

            for(int i=0; i<n; i++){
                if(nums[i] == 0)
                f++;
                else if(nums[i]==1)
                s++;
                else
                t++;
            }

            for(int i=0; i<f; i++){
                nums[i] = 0;
            }
            for(int i=f; i<f+s; i++){
                nums[i] = 1;
            }
            for(int i=f+s; i<f+s+t; i++){
                nums[i] = 2;
            }

        }

        //l,m,h. m ma 1, l aagadi 0 , h pachadi 2
        void sortColors2(vector<int>& nums){
            int n = (int)nums.size();
            int l=0;
            int m=0;
            int h = n-1;

            while(m<=h){
                int x = nums[m];
                if(x==0){
                    swap(nums[l],nums[m]);
                    l++;
                    m++;
                }else if(x==1){
                    m++;
                }else{
                    swap(nums[m], nums[h]);
                    h--;
                }
            }
        }
};