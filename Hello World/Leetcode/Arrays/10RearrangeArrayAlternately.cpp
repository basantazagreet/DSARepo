/*
GeeksforGeeks Q) Rearrange array alternately (Medium)
Given a sorted array of positive integers. Your task is to rearrange the
array elements alternatively. i.e. first element should be max value,
second should be min value, third should be second max, fourth should
be second min and soon.
Note: O(1) extra space is allowed. Also, try to modify the input array
as required.
*/
#include <iostream>
#include <string>
#include <vector>
#include <algorithm>

using namespace std;

class Solution{

void rearrange(long long int arr[], int n){
    int max_index = n-1;
    int min_index = 0;
    int max = arr[n-1]+1;

    for(int i=0; i<n; i++){
        if(i%2==0){
            arr[i] = (arr[max_index]%max )*max + arr[i];
            max_index--;
        }else{
            arr[i] = (arr[min_index]%max)*max + arr[i];
            min_index++;
        }
    }

    for(int i=0; i<n; i++){
        arr[i] /=max;
    }
}
};